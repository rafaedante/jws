<%-- 
    Document   : index
    Created on : 27/10/2020, 21:00:05
    Author     : rafaeli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr>
        <form action="CalculatorServlet" method="POST">
            Numero1: <input type="text" name="numero1"><br>
            Numero2: <input type="text" name="numero2"><br>
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
