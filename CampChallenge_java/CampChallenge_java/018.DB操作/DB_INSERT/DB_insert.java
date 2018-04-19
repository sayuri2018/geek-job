/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/DB_insert"})
public class DB_insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            request.setCharacterEncoding("UTF-8");


            String id = request.getParameter("txtID");
            Integer pid=Integer.parseInt(id);
            String name = request.getParameter("txtName");
            String tel = request.getParameter("txtTel");
            String age = request.getParameter("txtAge");
            String birthday = request.getParameter("txtBirthday");


            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try {

                Class.forName("com.mysql.jdbc.Driver").newInstance();

                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GEEKJOB_db", "NAGUMO", "password");
                db_st = db_con.prepareStatement("insert into profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
                db_st.setInt(1, pid);
                db_st.setString(2, name);
                db_st.setString(3,tel);
                db_st.setString(4,age);
                db_st.setString(5,birthday);
                        
                 db_st.executeUpdate();//ここまでで新しい情報入れ終わる
                 
                 db_st=db_con.prepareStatement("select * from profiles");
                 db_data=db_st.executeQuery();//全検索をかける

                while (db_data.next()) {
                  out.println(db_data.getInt("profilesID") + " " + db_data.getString("name") + " "
                            + db_data.getString("tel") + " " + db_data.getInt("age") + " " + db_data.getString("birthday")+"<br>");
                }

                db_data.close();
                db_st.close();
                db_con.close();
                
                 } catch (SQLException e_sql) {
                out.println("接続時にエラーが発生しました:" + e_sql.toString());
            } catch (Exception e) {
                out.println("接続時にエラーが発生しました:" + e.toString());
            } finally {
                if (db_con != null) {
                    try {
                        db_con.close();
                    } catch (Exception e_con) {
                        out.println(e_con.getMessage());
                    }

                }
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DB_insert</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DB_insert at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
