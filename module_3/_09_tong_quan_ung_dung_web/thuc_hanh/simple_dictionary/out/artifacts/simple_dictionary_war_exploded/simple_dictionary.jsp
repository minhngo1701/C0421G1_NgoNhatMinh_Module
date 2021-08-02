<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/2/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>
        word : <%=request.getAttribute("searchServlet")%>
    </h2>
    <h2>
        result : <%=request.getAttribute("resultDictionary")%>
    </h2>
</body>
</html>
