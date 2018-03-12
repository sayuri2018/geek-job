<%@page import ="java.util.*"%>
<%
    HashMap <String,String>data1=
            new HashMap<String,String>();
    data1.put("1","AAA");
    HashMap <String,String>data2=
            new HashMap<String,String>();
    data2.put("hello","world");
    HashMap <String,String>data3=
            new HashMap<String,String>();
    data3.put("soeda","33");
    HashMap <String,String>data4=
            new HashMap<String,String>();
    data4.put("20","20");
    out.print(data1.get("1"));
    out.print(data2.get("hello"));
    out.print(data3.get("soeda"));
    out.print(data4.get("20"));
    
       
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
