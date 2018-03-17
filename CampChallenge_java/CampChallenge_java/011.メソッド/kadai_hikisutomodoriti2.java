/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "kadai_hikisutomodoriti2", urlPatterns = {"/kadai_hikisutomodoriti2"})
public class kadai_hikisutomodoriti2 extends HttpServlet {
    
             
            String[] method(String data){
                    String[]profile1={"123","1990/3/29","埼玉県"};
                    String[]profile2={"456","1990/4/29","東京都"};
                    String[]profile3={"789","1990/5/29","null"};
                    
                       
                   if(data.equals(profile1[0])){
                       return profile1;
                   }else if(data.equals(profile2[0])){
                       return profile2;
                   }else if(data.equals(profile3[0])){
                       return profile3;
                   }
                       return null;
            }
                    

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
            
           
            
             String[]a=method("789");
             if(a!=null){
                 for(int i=0;i<a.length;i++){
                     if(a[2]=="null"){
                         continue;
                     }
                 out.print(a[i]+"<br>");
             }
             }
                 
              String[]b=method("123");
              if(b!=null){
                 for(int i=0;i<b.length;i++){
                     if(b[2]=="null"){
                         continue;
                     }
                 out.print(b[i]+"<br>");
             }
              }
               String[]c=method("456");
             if(c!=null){
                 for(int i=0;i<c.length;i++){
                     if(c[2]=="null"){
                         continue;
                     }
                 out.print(c[i]+"<br>");
             }
             }
                  
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai_hikisutomodoriti2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai_hikisutomodoriti2 at " + request.getContextPath() + "</h1>");
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


        
    