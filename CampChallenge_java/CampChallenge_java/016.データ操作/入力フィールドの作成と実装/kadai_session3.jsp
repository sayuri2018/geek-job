<%-- 
    Document   : kadai_session2
    Created on : 2018/04/07, 14:05:58
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
    <%
        //セッションの取得
        HttpSession session2=request.getSession();
        //セッションのデータを取得
        String data1=(String)session2.getAttribute("Username");
        String data2=(String)session2.getAttribute("seibetu");
        String data3=(String)session2.getAttribute("shumi");
        
       if(data1==null){
           data1="";
       }
       if(data3==null){
           data3="";
       }

       //取得したデータを表示
            out.print(data1+"<br>");
            out.print(data2+"<br>");
            out.print(data3+"<br>");

       
         
          
         
         
    %>
     
        <form action="kadai_session3" method="post">;
         :名前   
         <input type="text" name="txtName" value=<%=data1%>>    
         :性別
         <input type="radio" name="rdoSample" value="1"<%if(data2.equals("1")){out.print("checked");}%>> 男性
        <input type="radio" name="rdoSample" value="2"<%if(data2.equals("2")){out.print("checked");}%>>女性
        :趣味
        <textarea name="mulText" ><%=data3%></textarea>
        
        <input type="submit" name="btnSubmit" value="送信"/>
        </form>


    </body>
</html>
