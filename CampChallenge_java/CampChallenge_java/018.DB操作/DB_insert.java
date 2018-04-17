/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author User
 */
public class DB {
       public static void main(String[]args)
              throws SQLException,ClassNotFoundException{
           
           Connection db_con = null;
           PreparedStatement db_st = null;
           ResultSet db_data = null;
           
       try{
           
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GEEKJOB_db","NAGUMO","password");
           db_st = db_con.prepareStatement("insert into profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
           db_st.setInt(1,6);
           db_st.setString(2,"田中　茂");
           db_st.setString(3,"999-999-999");
           db_st.setInt(4,20);
           db_st.setString(5,"2000-01-01");
           
            db_st.executeUpdate(); //ここまでで新規情報の入力が完了
            
            db_st=db_con.prepareStatement("select * from profiles where age = ?");
            db_st.setInt(1, 20);
            db_data=db_st.executeQuery(); //ここで入力した中身を取得 
               
              while(db_data.next()){
               System.out.print(db_data.getString("name"));
         }
           
           db_data.close();
           db_st.close();
           db_con.close();
          
       }catch(SQLException e_sql){
               System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
       }catch(Exception e){
               System.out.println("接続時にエラーが発生しました:"+e.toString());
       }finally{
           if (db_con != null){
           try{
               db_con.close();
           }catch(Exception e_con){
               System.out.println(e_con.getMessage());
           }
       }
       }
       }
}
