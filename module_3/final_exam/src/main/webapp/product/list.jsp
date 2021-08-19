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
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-3 mb-2">
            <jsp:include page="/body.jsp"></jsp:include>
        </div>
        <div class="col-lg-9 border border-1">
            <h1>Customer list</h1>
            <a class="btn btn-success mb-2" href="/product?action=create" role="button">Create</a>
            <c:if test="${empty productList}">
                <h3 style="color: red">Student List Empty!</h3>
            </c:if>

            <c:if test="${not empty productList}">
                <table class="table table-striped" id="tableTest" style="overflow-x: scroll; width: 100%; display: inline-block">
                    <thead>
                    <tr>
                        <th>STT</th>
                        <th>Name Product</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Color</th>
                        <th>Descript</th>
                        <th>Category</th>
                        <th>Action</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${productList}" var="product">
                        <tr>
                            <td>${product.productId}</td>
                            <td>${product.productName}</td>
                            <td>${product.price}</td>
                            <td>${product.quantity}</td>
                            <td>${product.color}</td>
                            <td>${product.descript}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${product.categoryId == 1}">Iphone</c:when>
                                    <c:when test="${customer.categoryId == 2}">Tivi</c:when>
                                    <c:when test="${customer.categoryId == 3}">Tủ lạnh</c:when>
                                    <c:otherwise>Máy giặt</c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <a class="btn btn-success mb-2"
                                   href="/product?action=update&id=${product.getProductId()}" role="button">Edit</a>
                            </td>
                            <td>
                                <button onclick="onDelete('${product.getProductId()}', '${product.getProductName()}')" type="button"
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
            <form action="/product">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="" id="idProduct">
                <div class="modal-body">
                    Bạn muốn xóa <input style="border: none; outline: none; color: red"  id="idProductName">
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
        document.getElementById("idProduct").value = id;
        document.getElementById("idProductName").value = name;
    }
    $(document).ready(function() {
        $('#tableTest').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        } );
    } );
</script>
</body>
</html>
