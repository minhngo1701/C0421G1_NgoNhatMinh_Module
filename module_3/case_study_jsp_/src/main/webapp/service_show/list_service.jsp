<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Service Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <style>
        @media only screen and (max-width: 768px) {
            [class*="col-lg-"] {
                width: 100%;
            }
        }
    </style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<jsp:include page="/navbar.jsp"></jsp:include>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-3 mb-2">
            <jsp:include page="/body.jsp"></jsp:include>
        </div>
        <div class="col-lg-9 border border-1">
            <h1>Service list</h1>
            <a class="btn btn-success mb-2" href="/service?action=create" role="button">Create</a>
            <c:if test="${empty serviceList}">
                <h3 style="color: red">Service List Empty!</h3>
            </c:if>

            <c:if test="${not empty serviceList}">
                <table class="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name Service</th>
                        <th>Area</th>
                        <th>Number of Floors</th>
                        <th>Max People</th>
                        <th>Cost</th>
                        <th>Stand Room</th>
                        <th>Description other Convenience</th>
                        <th>Service Type</th>
                        <th>Rent Type</th>
                        <th>Status</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${serviceList}" var="service">
                        <tr>
                            <td>${service.serviceId}</td>
                            <td>${service.serviceName}</td>
                            <td>${service.area}</td>
                            <td>${service.floor}</td>
                            <td>${service.amountPersonMax}</td>
                            <td>${service.rentCost}</td>
                            <td>${service.standardRoom}</td>
                            <td>${service.description}</td>
                            <td>
                                <c:choose>
                                <c:when test="${service.typeOfServiceId == 1}">villa</c:when>
                                <c:when test="${service.typeOfServiceId == 2}">house</c:when>
                                <c:otherwise>room</c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${service.typeOfRentId == 1}">ngày</c:when>
                                    <c:when test="${service.typeOfRentId == 2}">tháng</c:when>
                                    <c:otherwise>năm</c:otherwise>
                                </c:choose>
                            </td>
                            <td>${service.status}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<jsp:include page="/footer.jsp"></jsp:include>

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
<script>
    function onDelete(id) {
        document.getElementById("idEmployee").value = id;
    }
</script>
</body>
</html>
