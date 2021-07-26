USE furama_management;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *
FROM employee
WHERE (employee_name LIKE 't%' or employee_name LIKE 'h%' OR employee_name LIKE 'k%') AND length(employee_name) <= 15;

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
SET SQL_SAFE_UPDATES = 0;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
CREATE TEMPORARY TABLE temp1 (
	SELECT c.customer_id
	FROM customer c
	INNER JOIN contract ct ON c.customer_id = ct.customer_id
	INNER JOIN type_of_customer tc ON tc.type_of_customer_id = c.type_of_customer_id
    WHERE year(ct.date_start_contract) = 2019 AND ct.total_money > 10000000 AND type_of_customer_name = 'Platinium'
	
);
UPDATE customer c
SET c.type_of_customer_id = 1
WHERE c.customer_id in (
	SELECT * 
    FROM temp1
);

DROP TABLE temp1;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID 
-- (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
SELECT e.employee_id, e.employee_name, e.email, e.phone_number, e.date_of_birth, e.address , 
c.customer_id, c.customer_name, c.email, c.phone_number, c.date_of_birth, c.address
FROM employee e
LEFT JOIN customer c ON e.employee_id = c.customer_id
UNION ALL
SELECT e.employee_id, e.employee_name, e.email, e.phone_number, e.date_of_birth, e.address , 
c.customer_id, c.customer_name, c.email, c.phone_number, c.date_of_birth, c.address
FROM employee e
RIGHT JOIN customer c ON e.employee_id = c.customer_id;