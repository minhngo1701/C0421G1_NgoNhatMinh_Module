USE furama_management;
SET SQL_SAFE_UPDATES = 0;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *
FROM employee
WHERE (substring_index(employee_name, ' ', -1) LIKE 't%' or substring_index(employee_name, ' ', -1) LIKE 'h%' OR substring_index(employee_name, ' ', -1) LIKE 'k%') AND length(employee_name) <= 15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT *
FROM customer
WHERE ((year(curdate()) - year(date_of_birth)) >= 18 AND (year(curdate()) - year(date_of_birth)) <=50) AND (address = 'Da Nang' or address = 'Quang Tri');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.dd
SELECT c.customer_id, c.customer_name, count(ct.contract_id) as 'so_lan_dat'
FROM contract ct
INNER JOIN customer c ON ct.customer_id = c.customer_id
INNER JOIN type_of_customer tc ON tc.type_of_customer_id = c.type_of_customer_id
WHERE tc.type_of_customer_name = 'Diamond'
GROUP BY c.customer_id
ORDER BY so_lan_dat;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
SELECT c.customer_id, c.customer_name, tc.type_of_customer_name, ct.contract_id, s.service_name, ct.date_start_contract, ct.date_end_contract, 
sum(rent_cost + amount*price) as 'tong_tien'
FROM customer c
LEFT JOIN contract ct ON c.customer_id = ct.customer_id
LEFT JOIN type_of_customer tc ON tc.type_of_customer_id = c.type_of_customer_id
LEFT JOIN service s ON s.service_id = ct.service_id
LEFT JOIN contract_detail cd ON cd.contract_id = ct.contract_id
LEFT JOIN accompanied_service acs ON acs.accompanied_service_id = cd.accompanied_service_id
GROUP BY c.customer_id, c.customer_name;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
SELECT s.service_id, s.service_name, s.area, s.rent_cost, ts.type_of_service_name, ct.date_start_contract
FROM service s
INNER JOIN contract ct ON s.service_id = ct.service_id
INNER JOIN type_of_service ts ON ts.type_of_service_id = s.type_of_service_id
WHERE ct.date_start_contract not in (
	SELECT date_start_contract
    FROM contract
    WHERE (year(date_start_contract) = 2019 AND month(date_start_contract) IN (1, 2, 3))
);

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
SELECT s.service_id, s.service_name, s.area, s.amount_person_max, s.rent_cost, ts.type_of_service_name
FROM service s
INNER JOIN contract ct ON s.service_id = ct.service_id
INNER JOIN type_of_service ts ON ts.type_of_service_id = s.type_of_service_id
WHERE ct.date_start_contract IN (
	SELECT date_start_contract
    FROM contract
    WHERE (year(date_start_contract) = 2018))
AND ct.date_start_contract NOT IN (
	SELECT date_start_contract
    FROM contract
    WHERE (year(date_start_contract) = 2019)
);

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
SELECT DISTINCT customer_name
FROM customer;

SELECT customer_name
FROM customer
UNION
SELECT customer_name
FROM customer;

SELECT customer_name
FROM customer
GROUP BY customer_name;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
SELECT *, count(customer_id) AS 'so_lan_dat'
FROM contract
WHERE year(date_start_contract) = 2019
GROUP BY month(date_start_contract);

-- 10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
SELECT ct.contract_id, ct.date_start_contract,ct.date_end_contract,ct.money_deposit, count(cd.accompanied_service_id) as 'so_luong_dich_vu_di_kem'
FROM contract_detail cd
INNER JOIN accompanied_service acs on acs.accompanied_service_id = cd.accompanied_service_id
INNER JOIN contract ct on ct.contract_id = cd.contract_id
GROUP BY cd.contract_id;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
SELECT acs.accompanied_service_id, acs.accompanied_service_name
FROM accompanied_service acs
INNER JOIN contract_detail cd ON cd.accompanied_service_id = acs.accompanied_service_id
INNER JOIN contract ct ON ct.contract_id = cd.contract_id
INNER JOIN customer c ON c.customer_id = ct.customer_id
INNER JOIN type_of_customer tc ON c.type_of_customer_id = tc.type_of_customer_id
WHERE tc.type_of_customer_name = 'Diamond' AND (c.address = 'Vinh' or c.address = 'Quang Ngai');

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), 
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
SELECT ct.contract_id, e.employee_name, c.customer_name, c.phone_number, s.service_name, count(cd.contract_detail_id) as 'so_luong_dvdk', ct.money_deposit
FROM contract_detail cd
INNER JOIN contract ct ON cd.contract_id = ct.contract_id
INNER JOIN employee e ON ct.employee_id = e.employee_id
INNER JOIN customer c ON ct.customer_id = c.customer_id
INNER JOIN service s ON ct.service_id = s.service_id
INNER JOIN accompanied_service acs ON cd.accompanied_service_id = acs.accompanied_service_id
WHERE ct.date_start_contract IN (
	SELECT date_start_contract
    FROM contract
    WHERE (month(date_start_contract) IN (10, 11, 12)) AND (year(date_start_contract) = 2019)
)
AND ct.date_start_contract NOT IN (
	SELECT date_start_contract
    FROM contract
    WHERE (month(date_start_contract) IN (1, 2, 3, 4, 5, 6)) AND (year(date_start_contract) = 2019)
)
GROUP BY acs.accompanied_service_id;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
SELECT acs.accompanied_service_id, acs.accompanied_service_name, count(cd.contract_detail_id) as 'so_lan_su_dung_nhieu_nhat'
FROM accompanied_service acs
INNER JOIN contract_detail cd ON acs.accompanied_service_id = cd.accompanied_service_id
GROUP BY cd.accompanied_service_id
HAVING so_lan_su_dung_nhieu_nhat >= ALL (
	SELECT count(cd.contract_detail_id) FROM contract_detail cd GROUP BY cd.accompanied_service_id
);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
SELECT ct.contract_id, s.service_name, acs.accompanied_service_name, count(cd.contract_detail_id) as 'so_lan_su_dung'
FROM accompanied_service acs
INNER JOIN contract_detail cd ON acs.accompanied_service_id = cd.accompanied_service_id
INNER JOIN contract ct ON ct.contract_id = cd.contract_id
INNER JOIN service s ON s.service_id = ct.service_id
GROUP BY cd.accompanied_service_id
HAVING so_lan_su_dung = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
SELECT e.employee_id, e.employee_name, ed.education_name, p.part_name, e.phone_number, e.address, count(ct.contract_id) as 'so_luong_hop_dong'
FROM employee e
INNER JOIN education ed ON ed.education_id = e.education_id
INNER JOIN part p ON p.part_id = e.part_id
INNER JOIN contract ct ON ct.employee_id = e.employee_id
WHERE (year(ct.date_start_contract) >= 2018) AND (year(ct.date_start_contract) <= 2019)
GROUP BY ct.employee_id
HAVING so_luong_hop_dong <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
CREATE TEMPORARY TABLE temp (
	SELECT e.employee_id
    FROM contract ct
    RIGHT JOIN employee e ON e.employee_id = ct.employee_id
    WHERE (year(ct.date_start_contract) >= 2017) AND (year(ct.date_start_contract) <= 2019)
);
DELETE FROM employee
WHERE employee_id not IN (
	SELECT *
    FROM temp
);
SELECT *
FROM temp;
DROP TABLE temp;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
CREATE TEMPORARY TABLE temp1 (
	SELECT sum(rent_cost + amount*price) as 'tong_tien', c.customer_id as 'customer_id'
	FROM customer c
	LEFT JOIN contract ct ON c.customer_id = ct.customer_id
	LEFT JOIN type_of_customer tc ON tc.type_of_customer_id = c.type_of_customer_id
	LEFT JOIN service s ON s.service_id = ct.service_id
	LEFT JOIN contract_detail cd ON cd.contract_id = ct.contract_id
	LEFT JOIN accompanied_service acs ON acs.accompanied_service_id = cd.accompanied_service_id
    WHERE year(ct.date_start_contract) = 2019 AND type_of_customer_name = 'Platinium'
	GROUP BY ct.customer_id
    HAVING tong_tien > 10000000
);
UPDATE customer c
SET c.type_of_customer_id = 'Diamond'
WHERE customer_id in (
	SELECT customer_id
    FROM temp1
);

DROP TABLE temp1;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
CREATE TEMPORARY TABLE temp2 (
	SELECT c.customer_id
    FROM customer c
    INNER JOIN contract ct ON c.customer_id = ct.customer_id
    WHERE year(ct.date_start_contract) < 2016
);
DELETE FROM customer
WHERE customer_id IN (
	SELECT *
    FROM temp2
);
DROP TABLE temp2;

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
CREATE TEMPORARY TABLE temp3 (
	SELECT count(cd.contract_detail_id), acs.accompanied_service_id as 'accompanied_service_id'
    FROM contract_detail cd
    INNER JOIN contract ct ON cd.contract_id = ct.contract_id
    INNER JOIN accompanied_service acs ON acs.accompanied_service_id = cd.accompanied_service_id
    WHERE year(ct.date_start_contract) = 2019
    GROUP BY acs.accompanied_service_id
    HAVING count(cd.contract_detail_id) > 10
);
UPDATE accompanied_service
SET price = price*2
WHERE accompanied_service_id IN (
  SELECT accompanied_service_id
  FROM temp3
);
DROP TABLE temp3;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID 
-- (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
SELECT e.employee_id, e.employee_name, e.email, e.phone_number, e.date_of_birth, e.address 
FROM employee e
UNION ALL
SELECT c.customer_id, c.customer_name, c.email, c.phone_number, c.date_of_birth, c.address
FROM customer c;

-- 21. Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”
CREATE VIEW v_employee 
AS
SELECT e.employee_id, e.employee_name, e.address, ct.date_start_contract
FROM employee e
INNER JOIN contract ct ON ct.employee_id = e.employee_id
WHERE e.address = 'Hải Châu' AND year(ct.date_start_contract) = '2019-12-12';

-- 22. Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
UPDATE v_employee
SET address = 'Liên Chiểu';


-- 23. Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với Id Khách hàng được truyền vào như là 1 tham số của Sp_1
delimiter //
create procedure sp_1(p_keyword INT)
begin
	DELETE FROM customer c
    WHERE c.customer_id = p_keyword;
end;
// delimiter ;

call sp_1(1);

-- 24. Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
delimiter //
CREATE PROCEDURE sp_2 (
p_employee_id INT,
p_customer_id INT,
p_service_id INT,
p_date_start_contract DATE,
p_date_end_contract DATE,
p_money_deposit INT
)
BEGIN
	IF (p_employee_id IN (SELECT employee_id FROM employee) 
    AND p_customer_id IN (SELECT customer_id FROM customer)
    AND p_service_id IN (SELECT service_id FROM service)) 
    THEN 
    INSERT INTO contract (employee_id, customer_id, service_id, date_start_contract, date_end_contract, money_deposit)
    VALUES (p_employee_id, p_customer_id, p_service_id, p_date_start_contract, p_date_end_contract, p_money_deposit);
    else
    select 'sai r';
    end if;
END;
// delimiter ;
CALL sp_2(1,1,1, '2015-09-24', '2015-10-02', 200000);
-- 25. Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong 
-- thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database

delimiter //
CREATE TRIGGER tr_1	
BEFORE DELETE 
ON contract FOR EACH ROW
BEGIN
	SET @display = (SELECT count(contract_id) FROM contract);
END;
// delimiter ;
DELETE 
FROM contract
WHERE contract_id = 2;

-- 26.	Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng, cần kiểm tra xem thời gian cập nhật có phù hợp hay không, với quy tắc sau: 
-- Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày. 
-- Nếu dữ liệu hợp lệ thì cho phép cập nhật, 
-- nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database
delimiter //
CREATE TRIGGER tr_2
BEFORE UPDATE
ON contract FOR EACH ROW
BEGIN
	DECLARE check_date VARCHAR(255);
    SET check_date = 'Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
    IF (datediff(new.date_end_contract, old.date_start_contract) < 2) 
    THEN
    SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = check_date;
    END IF;
END;
// delimiter ;
UPDATE contract
SET date_end_contract = '2020-03-12'
WHERE contract_id = 4;

