<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2020, 5:21:04 PM
    Author     : 431948
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <h1>Age Calculator</h1>
        </header>
        
        <!-- TODO update action -->
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age}">
            <input type="submit" value="Age Next Birthday">
            <p>${message}</p>
            <p>${nextBday}</p>
        </form>
        <a href="arithmetic" title="Arithmetic Calculator">Arithmetic Calculator</a>

        
    </body>
</html>
