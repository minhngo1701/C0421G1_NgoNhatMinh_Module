USE furama_management_module4;
INSERT INTO `position` (name_position)
VALUES ('lễ tân'),
		('phục vụ'),
        ('chuyên viên'),
        ('giám sát'),
        ('quản lý'),
        ('giám đốc');
   
INSERT INTO division (name_division)
VALUES ('Sale – Marketing'),
		('Hành Chính'),
		('Phục vụ'),
		('Quản lý');
        
INSERT INTO education_degree (name_education_degree)
VALUES ('Trung cấp'),
		('Cao đẳng'),
		('Đại học'),
		('sau đại học');
        
-- INSERT INTO `user`(username, `password`)
-- VALUES ('hai', '123456'),
-- 		('tung', '123456'),
-- 		('khoa', '123456');
--         
-- INSERT INTO `role`(`name`)
-- VALUES ('ROLE_ADMIN'),  
-- 		('ROLE_USER'),
--         ('ROLE_CUSTOMER');
--         
-- INSERT INTO user_role(user_id, role_id) 
-- VALUES (1, 1),
-- 		(2, 2),
--         (3, 3);
        
INSERT INTO customer_type (name_customer_type)
VALUES ('Diamond'),      
		('Platinium'), 
		('Gold'), 
		('Silver'), 
		('Member'); 
        
INSERT INTO service_type (name_service_type)
VALUES ('villa'),
		('house'),
		('room');

INSERT INTO rent_type (name_rent_type)
VALUES ('ngày'),
		('tháng'),
		('năm');

INSERT INTO attach_service ( name_attach_service,cost,unit,`status`)
VALUES ('massage', 200000, 1, 'khả dụng'),
		('karaoke', 50000, 2, 'khả dụng'),
		('thức ăn', 100000, 2, 'khả dụng'),
		('nước uống', 40000, 3, 'khả dụng'),
		('thuê xe di chuyển tham quan resort', 240000, 1, 'không khả dụng');
        
INSERT INTO employee (name_employee ,position_id ,education_degree_id ,division_id,date_of_birth,id_card,salary,phone,email,address)
VALUES ('Nguyễn Văn Hải', 1, 1, 3, '2002-07-21', '201723929', 5000000, '0923747238', 'hai@gmail.com', 'Đà Nẵng'),
		('Nguyễn Tùng', 2, 1, 3, '2000-03-10', '201792837', 7000000, '0932372646', 'tung@gmail.com', 'Đà Nẵng'),
		('Võ Trần Văn Khoa', 4, 3, 4, '1999-05-06', '201723984', 9000000,'0923762476', 'khoa@gmail.com', 'Quảng Trị');

INSERT INTO customer (customer_type_id,name_customer,date_of_birth,gender,id_card,phone,email,address,customer_code)
VALUES (1, 'Ngô Nhật Minh', '2001-08-19', 1, '201792384', '0923764293', 'minh@gmail.com', 'Da Nang', 'KH-1234'),
		(3, 'Trương Anh Quân', '2002-12-04', 1, '201792384', '0923764293', 'quan@gmail.com', 'Hue', 'KH-2341'),
        (4, 'Nguyễn Tiến Danh', '2003-11-11', 1, '201792384', '0923764293', 'danh@gmail.com', 'Quảng Bình', 'KH-3422'),
        (2, 'Nguyễn Thanh Lâm', '2002-03-12', 1, '201792384', '0923764293', 'lam@gmail.com', 'Quảng Ngãi', 'KH-3425');
        
INSERT INTO service (name_service,area,number_of_floors,max_people,cost,rent_type_id,service_type_id,pool_area, standard_room, description_other_convenience,service_code)
VALUES ('villa1', 240, 5, 12, 10000000, 1, 1, 15, 'Vip', 'rộng rãi, thoáng mát','DV-0001'),
		('villa2', 200, 5, 10, 9000000, 1, 1, 10, 'Vip', 'rộng rãi, thoáng mát','DV-0002'),
		('house1', 100, 5, 5, 5000000, 1, 2, 0, 'Normal', 'nhiều phòng','DV-0003'),
		('room1', 40, 5, 3, 3000000, 1, 3, 0, 'Normal', 'sạch sẽ','DV-0004');

INSERT INTO contract (employee_id,customer_id,service_id,start_date,end_date,deposit)
VALUES (2, 4, 2, '2020-03-09', '2020-03-12', 700000),
		(3, 3, 4, '2018-06-23', '2018-08-21', 1200000),
		(2, 1, 1, '2021-12-08', '2022-01-05', 500000),
		(1, 2, 3, '2019-11-06', '2019-11-15', 1400000);
		

INSERT INTO contract_detail (contract_id,attach_service_id,quantity)
VALUES (1, 2, 3),
		(2, 3, 2),
		(3, 4, 5),
		(4, 3, 10);