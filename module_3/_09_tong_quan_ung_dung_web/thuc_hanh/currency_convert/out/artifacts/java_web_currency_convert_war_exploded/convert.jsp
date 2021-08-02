
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>
        Rate : <%=request.getAttribute("rateCurrency")%>
    </h3>
    <h3>
        Usd : <%=request.getAttribute("usdCurrency")%>
    </h3>
    <h3>
        vnd : <%=request.getAttribute("vndCurrency")%>
    </h3>
</body>
</html>
