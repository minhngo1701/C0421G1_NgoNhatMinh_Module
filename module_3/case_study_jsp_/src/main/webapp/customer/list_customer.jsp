<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css">
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
<div class="container-fluid" style="min-height: 100vh">
    <div class="row">
        <div class="col-lg-3 mb-2">
            <jsp:include page="/body.jsp"></jsp:include>
        </div>
        <div class="col-lg-9 border border-1" >
            <h1>Customer list</h1>
            <a class="btn btn-success mb-2" href="/customer?action=create&id=${customer.getCustomerId()}" role="button">Create</a>
            <c:if test="${empty customerList}">
                <h3 style="color: red">Student List Empty!</h3>
            </c:if>

            <c:if test="${not empty customerList}">
                <table class="table table-striped" id="tableStudent" style="overflow-x: scroll; width: 100%; display: inline-block">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Type Of Customer Id</th>
                        <th>Type Of Customer Name</th>
                        <th>Date Of Birth</th>
                        <th>Gender</th>
                        <th>Id Card</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Customer Code</th>
                        <th>Action</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customerList}" var="customer">
                        <tr>
                            <td>${customer.customerId}</td>
                            <td>${customer.customerName}</td>
                            <td>${customer.typeOfCustomerId}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${customer.typeOfCustomerId == 1}">Diamond</c:when>
                                    <c:when test="${customer.typeOfCustomerId == 2}">Platinium</c:when>
                                    <c:when test="${customer.typeOfCustomerId == 3}">Gold</c:when>
                                    <c:when test="${customer.typeOfCustomerId == 4}">Silver</c:when>
                                    <c:otherwise>Member</c:otherwise>
                                </c:choose>
                            </td>
                            <td>${customer.dateOfBirth}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${customer.gender == false}">Female</c:when>
                                    <c:otherwise>Male</c:otherwise>
                                </c:choose>
                            </td>
                            <td>${customer.cardId}</td>
                            <td>${customer.phoneCus}</td>
                            <td>${customer.emailCus}</td>
                            <td>${customer.addressCus}</td>
                            <td>${customer.customerCode}</td>
                            <td>
                                <a class="btn btn-success mb-2"
                                   href="/customer?action=update&id=${customer.getCustomerId()}" role="button">Edit</a>
                            </td>
                            <td>
                                <button onclick="onDelete('${customer.getCustomerId()}', '${customer.getCustomerName()}')" type="button"
                                        class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#delModal">
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
            <form action="/customer">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="" id="idCustomer">
                <div class="modal-body">
                    Bạn muốn xóa <input style="border: none; outline: none; color: red"  id="idCustomerName">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap5.min.js"></script>

<script>
    function onDelete(id, name) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("idCustomerName").value = name;
    }

    $(document).ready(function() {
        $('#tableStudent').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 1
        } );
    } );
</script>
</body>
</html>
