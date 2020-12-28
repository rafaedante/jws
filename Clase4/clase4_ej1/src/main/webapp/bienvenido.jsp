<%-- 
    Document   : bienvenido
    Created on : 10/11/2020, 19:31:06
    Author     : rafaeli
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Bienvenido <%=request.getAttribute("nombreCompleto")%>
        <hr>
        Son las <%=new Date()%>
        <br>
        <br>
        <br>
        <br>
        <form action="CategoriasMercadoLibreServlet" method="get">
            <input type="submit" value="Ver categorias mercado libre">
        </form>
    </body>
</html>
