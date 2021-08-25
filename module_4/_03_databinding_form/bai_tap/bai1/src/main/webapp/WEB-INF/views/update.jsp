<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
<strong style="color: green">${message}</strong>
<form:form action="/update" method="post" modelAttribute="mail">
    <table>
        <tr>
            <td><strong>Language</strong></td>
            <td>
                <form:select path="language" items="${languageList}" multiple="false"/>

            </td>
        </tr>
        <tr>
            <td><strong>Size Page</strong></td>
            <td>
                Show
                <form:select path="size" items="${sizeList}" multiple="false"/>
                emails per page
            </td>
        </tr>
        <tr>
            <td><strong>Spam Fillter</strong></td>

            <td>
                <form:checkbox path="spamFillter" value="false" label="Enable spams fillter"/>
            </td>
        </tr>
        <tr>
            <td><strong>Signature:</strong></td>
            <td>
                <form:textarea cols="40" rows="10" path="signature"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Edit">
                <input type="button" value="Cancel">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
