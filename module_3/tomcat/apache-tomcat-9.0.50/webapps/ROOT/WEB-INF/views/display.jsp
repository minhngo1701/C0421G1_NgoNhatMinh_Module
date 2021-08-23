<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/24/2021
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal Calculator</title>
</head>
<body>
<form action="/calculator" method="post">
    <h1>Calculator Simple</h1>
    <input type="text" name="number1">
    <input type="text" name="number2"> <br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(X)">
    <input type="submit" name="operator" value="Division(/)">
    <h3>Result ${nameOperator}: ${resultCalculator}</h3>
</form>
</body>
</html>
