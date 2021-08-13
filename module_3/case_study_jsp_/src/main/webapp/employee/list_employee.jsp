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
            <h1>Employee list</h1>
            <a class="btn btn-success mb-2" href="/employee?action=create" role="button">Create</a>
            <c:if test="${empty employeeList}">
                <h3 style="color: red">Student List Empty!</h3>
            </c:if>

            <c:if test="${not empty employeeList}">
                <table class="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Position Id</th>
                        <th>Education Id</th>
                        <th>Division Id</th>
                        <th>Date Of Birth</th>
                        <th>Id Card</th>
                        <th>Salary</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>User Name</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${employeeList}" var="employee">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.name}</td>
                            <td>${employee.positionId}</td>
                            <td>${employee.educationId}</td>
                            <td>${employee.divisionId}</td>
                            <td>${employee.dateOfBirth}</td>
                            <td>${employee.idCard}</td>
                            <td>${employee.salary}</td>
                            <td>${employee.phone}</td>
                            <td>${employee.email}</td>
                            <td>${employee.address}</td>
                            <td>${employee.userName}</td>
                            <td>
                                <a class="btn btn-success mb-2" href="/employee?action=update&id=${employee.getId()}"
                                   role="button">Edit</a>
                            </td>
                            <td>
                                <button onclick="onDelete(${employee.getId()})" type="button" class="btn btn-primary"
                                        data-bs-toggle="modal" data-bs-target="#delModal">
                                    Delete
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<jsp:include page="/footer.jsp"></jsp:include>
<div class="modal fade" id="delModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete employee</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/employee">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="" id="idEmployee">
                <div class="modal-body">
                    Bạn muốn xóa
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>

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
