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
            <h1>Create Customer</h1>
            <p>
                <c:if test="${message != null}">
                    <span class="text-success">${message}</span>
                </c:if>
            </p>
            <form action="/product" method="post">
                <input type="hidden" name="action" value="create">

                <div class="mb-3">
                    <label for="nameProduct" class="form-label">Name Product:</label>
                    <input type="text" class="form-control" name="nameProduct" id="nameProduct">
<%--                    <c:if test="${map.get('name') != null}">--%>
<%--                            <span class="text-danger">${map.get('name')}</span>--%>
<%--                    </c:if>--%>
                </div>
                <div class="mb-3">
                    <label for="price" class="form-label">Price:</label>
                    <input type="number" class="form-control" name="price" id="price">
                </div>

                <div class="mb-3">
                    <label for="quantity" class="form-label">Quantity:</label>
                    <input type="number" class="form-control" name="quantity" id="quantity">
                </div>

                <div class="mb-3">
                    <label for="color" class="form-label">Color:</label>
                    <input type="text" class="form-control" name="color" id="color" >
<%--                    <c:if test="${map.get('idCard') != null}">--%>
<%--                        <span class="text-danger">${map.get('idCard')}</span>--%>
<%--                    </c:if>--%>
                </div>
                <div class="mb-3">
                    <label for="descript" class="form-label">Descript:</label>
                    <input type="text" class="form-control" name="descript" id="descript">
<%--                    <c:if test="${map.get('phone') != null}">--%>
<%--                        <span class="text-danger">${map.get('phone')}</span>--%>
<%--                    </c:if>--%>
                </div>
                <div class="mb-3">
                    <label for="categoryId" class="form-label">Category:</label>
                    <select name="categoryId" class="form-select" id="categoryId">
                        <c:forEach var="category" items="${categoryList}">
                            <option value="${category.getCategoryId()}">${category.getCategoryName()}</option>
                        </c:forEach>
                    </select>
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
