<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management</title>
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
        <div class="col-lg-9 border = 1">
            <h1>Create Contract</h1>
            <p>
                <c:if test="${message != null}">
                    <span class="text-success">${message}</span>
                </c:if>
            </p>
            <form action="/contract" method="post">
                <input type="hidden" name="action" value="create">
                <div class="mb-3">
                    <label for="idEmployee" class="form-label">Employee Name:</label>
                    <select name="idEmployee" class="form-select" id="idEmployee">
                        <c:forEach var="employee" items="${employeeList}">
                            <option value="${employee.getId()}">${employee.getName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="idCustomer" class="form-label">Customer Name:</label>
                    <select name="idCustomer" class="form-select" id="idCustomer">
                        <c:forEach var="customer" items="${customerList}">
                            <option value="${customer.getCustomerId()}">${customer.getCustomerName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="idService" class="form-label">Service name:</label>
                    <select name="idService" class="form-select" id="idService">
                        <c:forEach var="service" items="${serviceList}">
                            <option value="${service.getServiceId()}">${service.getServiceName()}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="start" class="form-label">Date start:</label>
                    <input type="date" class="form-control" name="start" id="start">
                </div>
                <div class="mb-3">
                    <label for="end" class="form-label">Date end:</label>
                    <input type="date" class="form-control" name="end" id="end">
                </div>

                <div class="mb-3">
                    <label for="total" class="form-label">Total:</label>
                    <input type="number" class="form-control" name="total" id="total">
                </div>
                <div class="mb-3">
                    <label for="deposit" class="form-label">Deposit:</label>
                    <input type="number" class="form-control" name="deposit" id="deposit">
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
