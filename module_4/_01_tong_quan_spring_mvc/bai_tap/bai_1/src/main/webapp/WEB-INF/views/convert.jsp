
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/convert" method="post">
    <h4>USD</h4>
    <p><input type="text" name="usd"></p>
    <p><input type="submit" value="Convert"></p>
    <h4>Result : ${convertUSD}</h4>
</form>
</body>
</html>
