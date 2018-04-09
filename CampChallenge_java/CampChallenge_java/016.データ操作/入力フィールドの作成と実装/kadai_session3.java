/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/kadai_session3"})
public class kadai_session3 extends HttpServlet {

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
//            
//             HttpSession session=request.getSession();
//             String name=(String)session.getAttribute("Username");
//             out.print(name);
//             String gender=(String)session.getAttribute("seibetu");
//             out.print(gender);
//             String hobby=(String)session.getAttribute("shumi");
//             out.print(hobby);
//            

            //文字コード指定
            request.setCharacterEncoding("UTF-8");
            
            //フォームから送られた情報の取り出し（名前、性別とか）
            //変数に格納する！
            String name=request.getParameter("txtName");
            String gender=request.getParameter("rdoSample");
            String hobby=request.getParameter("mulText");
            
            
            //取り出した値を表示
            out.print(name+"<br>");
            out.print(gender+"<br>");
            out.print(hobby+"<br>");
            
            //セッションの取得
             HttpSession session2=request.getSession();
            
            //セッションへデータの保存する
            //名前、性別、趣味の３つを保存
            session2.setAttribute("Username",name);
           session2.setAttribute("seibetu",gender);
           session2.setAttribute("shumi", hobby);
          
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai_session2</title>");            
            out.println("</head>");
            out.println("<body>");
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
