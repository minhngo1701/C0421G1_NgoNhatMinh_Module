<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/22/2021
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary Simple</title>
</head>
<body>
<form action="/dictionary" method="post">
    <h4>Dictionary</h4>
    <input type="text" name="word">
    <input type="submit" value="Translate">
    <p>Result: ${trans}</p>
</form>
</body>
</html>
