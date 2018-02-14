<%-- 
    Document   : index
    Created on : Feb 14, 2018, 8:18:16 PM
    Author     : Si
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<style type="text/css">
        body {
            text-align: center;
        }

        input[type=submit]{
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
            width: 80%;
            font-size: 50px;
        }

    </style>
    <body>
        <form action="ShowHello" method="get">
            <input type="submit" value="Click Me!">  
        </form>

    </body>
</html>
