
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Student</h1>
<form method="post">
    <input type="hidden" name="create" value="create">
    <table>
        <tr>
            <td>Name:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>
                <input type="number" name="gender">
            </td>
        </tr>
        <tr>
            <td>Point:</td>
            <td>
                <input type="number" name="point">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Create</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
