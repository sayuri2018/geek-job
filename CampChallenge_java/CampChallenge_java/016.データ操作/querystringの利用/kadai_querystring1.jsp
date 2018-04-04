<%-- 
    Document   : kadai_querystring1
    Created on : 2018/04/04, 15:24:10
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%  
  //typeを受け取って文字型に変換する
 String num=request.getParameter("type");
 Integer kind=Integer.parseInt(num);
 
  if(kind==1){
      out.println("雑貨");
  }else if(kind==2){
      out.println("生鮮食品");
  }else{
      out.println("その他");
  }

 
 //商品の総額と量を受け取り、単価を求める
 String sougaku=request.getParameter("total");
 Integer num1=Integer.parseInt(sougaku);
 
 String kazu=request.getParameter("count");
 Integer num2=Integer.parseInt(kazu);
   
  Integer tanka=num1/num2;
   out.println("単価は"+tanka);
   
   if(num1>=5000){
       out.println(num1*0.05+"ポイント");
 }else if(3000<=num1&&num2<5000){
       out.println(num1*0.04+"ポイント");
}else if(3000>num1){
     out.print("ポイントなし");
 }
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
