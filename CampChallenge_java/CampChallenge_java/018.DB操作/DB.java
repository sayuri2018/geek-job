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
           db_st = db_con.prepareStatement("select * from profiles where age = ?");
           db_st.setInt(1,30);
           
           db_data = db_st.executeQuery();
           while(db_data.next()){
               System.out.print("名前:"+db_data.getString("name")+"<br>");
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
