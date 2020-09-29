
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <header>
            <h1>Arithmetic Calculator</h1>
        </header>
        
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="firstNumber" value="${firstNum}">
            <label>Second: </label>
            <input type="text" name="secondNumber" value="${secondNum}">
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%"> 
        </form>
        <p>Result: ${result}</p>
        <a href="age" title="Age Calculator">Age Calculator</a>    
    </body>
</html>
