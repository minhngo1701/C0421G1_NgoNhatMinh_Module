<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee management</title>
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
            <h1>Edit employee</h1>
            <p>
                <c:if test="${message != null}">
                    <span class="text-success">${message}</span>
                </c:if>
            </p>
            <form method="post">
                <div>
                    <c:if test="${employee != null}">
                        <input type="hidden" name="id" value="<c:out value='${employee.id}' />"/>
                    </c:if>
                </div>
                <div class="mb-3">
                    <label for="name" class="form-label">Employee Name:</label>
                    <input type="text" class="form-control" name="name" id="name"
                           value="<c:out value='${employee.name}' />">
                </div>
                <div class="mb-3">
                    <label for="positionId" class="form-label">Position:</label>
                    <select name="positionId" class="form-select" id="positionId">
                        <c:forEach var="positionObj" items="${positionList}">
                            <option value="${positionObj.getPositionId()}">${positionObj.getPositionName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="educationId" class="form-label">Education:</label>
                    <select name="educationId" class="form-select" id="educationId">
                        <c:forEach var="educationObj" items="${educationList}">
                            <option value="${educationObj.getEdudcationId()}">${educationObj.getEducationName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="divisionId" class="form-label">Division:</label>
                    <select name="divisionId" class="form-select" id="divisionId">
                        <c:forEach var="divisionObj" items="${divisionList}">
                            <option value="${divisionObj.getDivisionId()}">${divisionObj.getDivisionName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="dateOfBirth" class="form-label">Date Of Birth:</label>
                    <input type="date" class="form-control" name="dateOfBirth" id="dateOfBirth"
                           value="<c:out value='${employee.dateOfBirth}' />">
                </div>
                <div class="mb-3">
                    <label for="idCard" class="form-label">Id Card:</label>
                    <input type="text" class="form-control" name="idCard" id="idCard"
                           value="<c:out value='${employee.idCard}' />">
                </div>
                <div class="mb-3">
                    <label for="salary" class="form-label">Salary:</label>
                    <input type="number" class="form-control" name="salary" id="salary"
                           value="<c:out value='${employee.salary}' />">
                </div>

                <div class="mb-3">
                    <label for="phone" class="form-label">Phone:</label>
                    <input type="text" class="form-control" name="phone" id="phone"
                           value="<c:out value='${employee.phone}' />">
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" name="email" id="email"
                           value="<c:out value='${employee.email}' />">
                </div>
                <div class="mb-3">
                    <label for="address" class="form-label">Address:</label>
                    <input type="text" class="form-control" name="address" id="address"
                           value="<c:out value='${employee.address}' />">
                </div>
                <div class="mb-3">
                    <label for="userName" class="form-label">User Name:</label>
                    <input type="text" class="form-control" name="userName" id="userName"
                           value="<c:out value='${employee.userName}' />">
                </div>

                <button type="submit" class="btn btn-primary">Save</button>
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
