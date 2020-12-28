<%-- 
    Document   : index
    Created on : 27/10/2020, 20:20:29
    Author     : rafaeli
--%>

<%@page import="org.tempuri.CalculatorSoap"%>
<%@page import="org.tempuri.Calculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            try {
                Calculator service = new Calculator();
                CalculatorSoap port = service.getCalculatorSoap();

                int i = 3;
                int j= 146;
                int result = port.add(i, j);
                out.println("add(" + 1 + ", " + j + ") Result= " + result);
            } catch (Exception ex) {
                out.println("Exception: " + ex);
            }
        %>
        
    </body>
</html>
