<%-- 
    Document   : kadai_nyuuryoku
    Created on : 2018/04/02, 15:10:03
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
    
   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <% 
    String name=request.getParameter("txtName");
    out.println("名前は"+name);
    String rdo=request.getParameter("rdoSample");
    out.println("性別は"+rdo);
    String mul=request.getParameter("mulText");
    out.println("趣味は"+mul);
        %>
    </body>
</html>
