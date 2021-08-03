
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>
        Discount Amount : <%=request.getAttribute("discountAmountServlet")%>
    </h2>
    <h2>
        Discount Price : <%=request.getAttribute("discountPriceServlet")%>
    </h2>
</body>
</html>
