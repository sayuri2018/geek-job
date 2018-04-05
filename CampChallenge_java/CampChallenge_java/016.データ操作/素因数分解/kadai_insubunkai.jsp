<%-- 
    Document   : kadai_insubunkai
    Created on : 2018/04/05, 10:09:10
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%
 String num=request.getParameter("txtName");
 Integer n =Integer.parseInt(num);
   
   while(n%2==0){
     
        out.println(2);
        n/=2;
        
       }
   
   for(int i=3;i<11;i+=2){
   while(n%i==0){
      
           out.println(i+"");
           n/=i;
       }
      }
   if(n>1)out.println("あまり"+n);
   

 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
