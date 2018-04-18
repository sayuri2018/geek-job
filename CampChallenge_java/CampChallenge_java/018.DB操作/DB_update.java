
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DB_update {
             public static void main(String[]args)
              throws SQLException,ClassNotFoundException{
           
           Connection db_con = null;
           PreparedStatement db_st = null;
           ResultSet db_data = null;
           
       try{
           
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GEEKJOB_db","NAGUMO","password");
           db_st = db_con.prepareStatement("update profiles set name = ?,tel = ?,age = ?,birthday = ? WHERE profilesID =1");
      
           db_st.setString(1,"佐々木　実");
           db_st.setString(2,"888-8888-8888");
           db_st.setInt(3,25);
           db_st.setString(4,"1999-09-09");
          
           
            db_st.executeUpdate(); //ここまでで情報の更新が完了
            
            db_st=db_con.prepareStatement("select * from profiles");//全検索
//          
            db_data=db_st.executeQuery(); //ここで入力した中身を取得 
               
              while(db_data.next()){
               System.out.println(db_data.getInt("profilesID")+" "+db_data.getString("name")+" "
                       +db_data.getString("tel")+" "+db_data.getInt("age")+" "+db_data.getString("birthday"));
         
         }
           
           db_data.close();
           db_st.close();
           db_con.close();
           
              } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました:" + e_sql.toString());
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生しました:" + e.toString());
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                }

            }
        }
    }
}
