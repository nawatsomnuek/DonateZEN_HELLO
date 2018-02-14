<%-- 
    Document   : ShowHello
    Created on : Feb 14, 2018, 8:27:16 PM
    Author     : Si
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <style type="text/css">
        body {
            background-color: skyblue;
            text-align: center;
            color: white;
            font-size: 350px;
        }

    </style>
    <body>
        <%=request.getAttribute("wordd")%>
    </body>
</html>
