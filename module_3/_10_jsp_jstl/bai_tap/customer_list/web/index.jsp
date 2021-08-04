<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <h2 style="text-align: center">Danh sách khách hàng</h2>
      <table border="1">
          <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
          </tr>
          <c:forEach var="customerObj" items="${customerServlet}">
          <tr>
            <td><c:out  value="${customerObj.name}"/> </td>
            <td><c:out  value="${customerObj.dateOfBirth}"/></td>
            <td><c:out  value="${customerObj.address}"/></td>
            <td><img  src="${customerObj.image}"/></td>
          </tr>
          </c:forEach>
      </table>
  </body>
</html>
