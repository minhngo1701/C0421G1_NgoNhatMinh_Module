
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/time" method="get">
      <h3>
        Time = <%=request.getAttribute("timeDate")%>
      </h3>
  </form>
  </body>
</html>
