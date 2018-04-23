<%-- 
    Document   : DB_sentaku
    Created on : 2018/04/23, 14:39:06
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="./DB_touroku2.jsp" method="post">
        <input type="submit" name="btnSubmit" value="商品登録"/>
         </form>
        
        <form action="./DB_itiran3" method="post">
       <input type="submit" name="btnSubmit" value="商品一覧"/>
         </form>
        
        <!--<a href=\"./DB_touroku2.jsp\">商品登録</a><br>-->
          <!--<a href=\"./DB_itiran3\">商品一覧</a>-->
       
    </body>
</html>
