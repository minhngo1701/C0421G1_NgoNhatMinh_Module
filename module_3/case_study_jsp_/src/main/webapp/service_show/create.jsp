<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
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
            <h1>Create Service</h1>
            <p>
                <c:if test="${message != null}">
                    <span class="text-success">${message}</span>
                </c:if>
            </p>
            <form action="/service" method="post">
                <input type="hidden" name="action" value="create">
                <div class="mb-3">
                    <label for="name" class="form-label">Name Service:</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="mb-3">
                    <label for="area" class="form-label">Area:</label>
                    <input type="number" class="form-control" name="area" id="area">
                </div>
                <div class="mb-3">
                    <label for="floor" class="form-label">Number of Floors:</label>
                    <input type="number" class="form-control" name="floor" id="floor">
                </div>
                <div class="mb-3">
                    <label for="amountPeople" class="form-label">Max People:</label>
                    <input type="number" class="form-control" name="amountPeople" id="amountPeople">
                </div>
                <div class="mb-3">
                    <label for="cost" class="form-label">Cost:</label>
                    <input type="number" class="form-control" name="cost" id="cost">
                </div>
                <div class="mb-3">
                    <label for="standardRoom" class="form-label">Stand Room:</label>
                    <input type="text" class="form-control" name="standardRoom" id="standardRoom">
                </div>
                <div class="mb-3">
                    <label for="description" class="form-label">Description other Convenience:</label>
                    <input type="text" class="form-control" name="description" id="description">
                </div>
                <div class="mb-3">
                    <label for="typeId" class="form-label">Service Type:</label>
                    <select name="typeId" class="form-select" id="typeId">
                        <c:forEach var="serviceType" items="${serviceTypeList}">
                            <option value="${serviceType.getServiceTypeId()}">${serviceType.getServiceTypeName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="rentTypeId" class="form-label">Rent Type:</label>
                    <select name="rentTypeId" class="form-select" id="rentTypeId">
                        <c:forEach var="rentType" items="${rentTypeList}">
                            <option value="${rentType.getRentTypeId()}">${rentType.getRentTypeName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="status" class="form-label">Status:</label>
                    <input type="text" class="form-control" name="status" id="status">
                </div>

                <button type="submit" class="btn btn-primary">Create</button>
            </form>
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
</body>
</html>
