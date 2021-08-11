<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<h1>Edit employee</h1>
<p>
    <c:if test="${message != null}">
        <span class="text-success">${message}</span>
    </c:if>
</p>
<form method="post">
    <table border="1" cellpadding="5">
        <c:if test="${employee != null}">
            <input type="hidden" name="id" value="<c:out value='${employee.id}' />"/>
        </c:if>
        <tr>
            <th>Employee Name:</th>
            <td>
                <input type="text" name="name" size="45"
                       value="<c:out value='${employee.name}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Position Id:</th>
            <td>
                <input type="text" name="positionId" size="45"
                       value="<c:out value='${employee.positionId}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Education Id:</th>
            <td>
                <input type="text" name="educationId" size="45"
                       value="<c:out value='${employee.educationId}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Division Id:</th>
            <td>
                <input type="text" name="divisionId" size="45"
                       value="<c:out value='${employee.divisionId}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Date Of Birth:</th>
            <td>
                <input type="text" name="dateOfBirth" size="45"
                       value="<c:out value='${employee.dateOfBirth}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Id Card:</th>
            <td>
                <input type="text" name="idCard" size="45"
                       value="<c:out value='${employee.id_card}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Salary:</th>
            <td>
                <input type="text" name="salary" size="45"
                       value="<c:out value='${employee.salary}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td>
                <input type="text" name="phone" size="45"
                       value="<c:out value='${employee.phone}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Email:</th>
            <td>
                <input type="text" name="email" size="45"
                       value="<c:out value='${employee.email}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Address:</th>
            <td>
                <input type="text" name="address" size="20"
                       value="<c:out value='${employee.address}' />"
                />
            </td>
        </tr>
        <tr>
            <th>User Name:</th>
            <td>
                <input type="text" name="userName" size="45"
                       value="<c:out value='${employee.userName}' />"
                />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>
</form>
<script
        src="https://code.jquery.com/jquery-3.6.0.js"
        integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
        integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js"
        integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/"
        crossorigin="anonymous"></script>
</body>
</html>
