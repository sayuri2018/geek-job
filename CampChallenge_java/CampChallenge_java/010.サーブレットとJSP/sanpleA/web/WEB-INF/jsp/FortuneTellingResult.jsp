<%@page import="org.camp.servlet2.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% 
            ResultData data = (ResultData)request.getAttribute("DATA");
         %>
         <meta http-equiv="contentType"content="text/html:charset=UTF-8">
         <title>JSP page</title>
    </head>
    <body>
        <%
            if(data != null){
               out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getLuck()+"です！</h1>");
              }
        %>
        
    </body>
</html>
