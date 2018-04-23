<%-- 
    Document   : DB_touroku
    Created on : 2018/04/21, 13:29:24
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
        
         <form action="./DB_touroku" method="post">
        
        :商品登録
        :productsID
        <input type="text" name="txtID"/><br>
        :products name
        <input type="text" name="txtName"/><br>
        :color
        <input type="text" name="txtcolor"/><br>
        <input type="submit" name="btnSubmit" value="送信"/>
         </form>
       
        <form action="./DB_login1.jsp" method="post">
        <input type="submit" name="btnSubmit" value="ログアウト"/>
        </form>
    </body>
</html>
