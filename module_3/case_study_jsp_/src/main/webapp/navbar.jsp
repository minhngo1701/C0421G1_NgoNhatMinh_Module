
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <nav class="navbar navbar-expand-lg navbar-dark bg-warning">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="padding-left: 70px">
                    <li class="nav-item ml-lg-2">
                        <a class="nav-link active" style="padding-left: 40px" aria-current="page"
                           href="/homepage">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/employee" style="padding-left: 70px">Employee</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/customer" style="padding-left: 70px">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/service" style="padding-left: 70px">Service</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contract" style="padding-left: 70px">Contract</a>
                    </li>

                </ul>
                <form action="" method="post" class="d-flex justify-content-end my-2">
                    <input type="hidden" name="action" value="search">
                    <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
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
</body>
</html>
