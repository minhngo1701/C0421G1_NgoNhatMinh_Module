<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TỜ KHAI Y TẾ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<center>
    <h3>TỜ KHAI Y TẾ</h3>
    <h3>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ
        PHÒNG CHÓNG DỊCH</h3>
</center>
<h6 class="text-danger" style="text-align: center">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật</h6>
<h3 class="text-success"><c:if test="${message!=null}">
    ${message}
</c:if></h3>
<div class="container-fluid col-lg-12">
    <form:form modelAttribute="health" cssClass="row g-3" method="post" action="/save">
        <div class="col-12">
            <label for="inputEmail1" class="form-label">Họ và tên</label>
            <form:input path="name" id="inputEmail1" cssClass="form-control"/>
        </div>
        <div class="col-md-4">
            <label for="inputEmail4" class="form-label">Năm sinh</label>
            <form:input path="year" id="inputEmail4" cssClass="form-control"/>
        </div>
        <div class="col-md-4">
            <label for="inputPassword4" class="form-label">Giới tính</label>
            <form:select path="gender" id="inputPassword4" cssClass="form-control">
                <form:option value="true">Nam</form:option>
                <form:option value="false">Nữ</form:option>
            </form:select>
        </div>
        <div class="col-md-4">
            <label for="inputAddress" class="form-label">Quốc tịch</label>
            <form:select path="nationality" id="inputAddress" cssClass="form-control">
                <form:option value="Việt Nam">Việt Nam</form:option>
                <form:option value="Lào">Lào</form:option>
                <form:option value="Campuchia">Campuchia</form:option>
            </form:select>
        </div>
        <div class="col-12">
            <label for="inputAddress2" class="form-label">Số hộ chiếu hoặc CMND</label>
            <form:input path="idCard" id="inputAddress2" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <label class="form-label">Thông tin đi lại</label>
            <br>
            <form:radiobutton path="transporter" value="Tàu bay" label="Tàu bay"/>
            <form:radiobutton path="transporter" value="Tàu thuyền" label="Tàu thuyền"/>
            <form:radiobutton path="transporter" value="Ô tô" label="Ô tô"/>
            <form:radiobutton path="transporter" value="Khác" label="Khác"/>
        </div>
        <div class="col-md-6">
            <label for="inputState" class="form-label">Số hiệu phương tiện </label>
            <form:input path="idTransport" id="inputState" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="inputZip" class="form-label">Số ghế</label>
            <form:input path="seatNumber" id="inputZip" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <div class="form-check">
                <label for="date" class="form-label">Ngày khởi hành</label>
                <form:input path="startDay" id="date" cssClass="form-control"/>
            </div>
        </div>
        <div class="col-md-6">
            <label for="end" class="form-label">Ngày kết thúc </label>
            <form:input path="endDay" id="end" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <label for="info" class="form-label">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố
                nào? </label><br>
            <form:textarea path="information" id="info" rows="3" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <h4>Địa chỉ liên lạc</h4>
        </div>
        <div class="col-md-6">
            <label for="city" class="form-label">Quốc tịch</label>
            <form:select path="city" id="city" cssClass="form-control">
                <form:option value="Đà Nẵng"/>
                <form:option value="Hà Nội"/>
                <form:option value="TP.Hồ CHí Minh"/>
            </form:select>
        </div>
        <div class="col-md-6">
            <label for="district" class="form-label">Quận / huyện</label>
            <form:select path="district" id="district" cssClass="form-control">
                <form:option value="Hải Châu"/>
                <form:option value="Thanh Khê"/>
                <form:option value="Cẩm lệ"/>
                <form:option value="Sơn Trà"/>

            </form:select>
        </div>
        <div class="col-12">
            <label for="address" class="form-label">Địa chỉ nơi ở</label>
            <form:input path="address" id="address" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="phone" class="form-label">Điện thoại</label>
            <form:input path="phoneNumber" id="phone" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="email" class="form-label">Email</label>
            <form:input path="email" id="email" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <strong>Trong vòng 14 ngày qua, Anh/chị có thấy xuất hiện dấu hiệu nào sau đây không</strong>
        </div>
        <div class="col-md-6">
            <table class="table">
                <thead class="table-light">
                <tr>
                    <th>Triệu chứng</th>
                    <th>Có</th>
                    <th>Không</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Sốt</td>
                    <td><form:radiobutton path="symptom" value="Sốt"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Ho</td>
                    <td><form:radiobutton path="symptom" value="Ho"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Khó thở</td>
                    <td><form:radiobutton path="symptom" value="Khó thở"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Đau họng</td>
                    <td><form:radiobutton path="symptom" value="Đau họng"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-6">
            <table class="table">
                <thead class="table-light">
                <tr>
                    <th>Triệu chứng</th>
                    <th>Có</th>
                    <th>Không</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Nôn/Buồn nôn</td>
                    <td><form:radiobutton path="symptom" value="Nôn/Buồn nôn"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Tiêu chảy</td>
                    <td><form:radiobutton path="symptom" value="Tiêu chảy"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Xuất huyết ngoài da</td>
                    <td><form:radiobutton path="symptom" value="Xuất huyết ngoài da"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                <tr>
                    <td>Nổi ban ngoài da</td>
                    <td><form:radiobutton path="symptom" value="Nổi ban ngoài da"/></td>
                    <td><form:radiobutton path="symptom" value="1"/></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-12">
            <strong>Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/chị có</strong>
        </div>
        <div class="col-12">
            <table class="table">
                <thead class="table-light">
                <th></th>
                <th>Có</th>
                <th>Không</th>
                </thead>
                <tbody>
                <tr>
                    <td>Đến trang trại chăn nuôi/ Chợ mua bán động vật sống/ cơ sở giết mổ động vật/ tiếp xúc động vật</td>
                    <td><form:radiobutton path="history" value="Có" /></td>
                    <td><form:radiobutton path="history" value="không" /></td>
                </tr>
                <tr>
                    <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm dường hô hấp do nCoV</td>
                    <td><form:radiobutton path="history" value="Có" /></td>
                    <td><form:radiobutton path="history" value="không" /></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-12 text-danger">Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch,
            thuộc quản lý của Ban chỉ đạo Quốc gia về Phòng chống dịch Covid-19. Khi bạn nhấn nút "gửi" là bạn đã hiểu và đồng ý.
        </div>
        <div class="col-12">
            <center><button class="btn btn-success" type="submit">Gửi tờ khai</button></center>
        </div>
    </form:form>
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
