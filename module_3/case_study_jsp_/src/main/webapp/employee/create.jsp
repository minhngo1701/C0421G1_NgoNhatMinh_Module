<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<h1>Create Employee</h1>
<p>
    <c:if test="${message != null}">
        <span class="text-success">${message}</span>
    </c:if>
</p>
<form action="/employee" method="post">
    <input type="hidden" name="action" value="create">
    <table>
        <tr>
            <td>ID:</td>
            <td>
                <input type="number" name="id">
            </td>
        </tr>
        <tr>
            <td>Position ID:</td>
            <td>
                <input type="number" name="positionId">
            </td>
        </tr>
        <tr>
            <td>Education ID:</td>
            <td>
                <input type="number" name="educationId">
            </td>
        </tr>
        <tr>
            <td>Division ID:</td>
            <td>
                <input type="number" name="divisionId">
            </td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>Date of birth:</td>
            <td>
                <input type="date" name="dateOfBirth">
            </td>
        </tr>
        <tr>
            <td>ID Card:</td>
            <td>
                <input type="text" name="idCard">
            </td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td>
                <input type="number" name="salary">
            </td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td>
                <input type="text" name="phone">
            </td>
        </tr>
        <tr>
            <td>Email:</td>
            <td>
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td>Address:</td>
            <td>
                <input type="text" name="address">
            </td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td>
                <input type="text" name="userName">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Create</button>
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
