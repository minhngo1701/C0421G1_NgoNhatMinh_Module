DROP DATABASE IF EXISTS exam;

CREATE DATABASE exam;

CREATE TABLE employee (
	employee_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(50),
    position_id INT NOT NULL,
    education_id INT NOT NULL,
    part_id INT NOT NULL,
    date_of_birth DATE,
    identity_number VARCHAR(50),
    salary DOUBLE,
    phone_number VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(50),
    user_name VARCHAR(255),
	FOREIGN KEY (position_id) REFERENCES  `position`(position_id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (education_id) REFERENCES education(education_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (part_id) REFERENCES part(part_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (user_name) REFERENCES users(user_name) ON UPDATE CASCADE ON DELETE CASCADE
);

SET GLOBAL FOREIGN_KEY_CHECKS = 0;

INSERT INTO employee (employee_name ,position_id ,education_id ,part_id,date_of_birth,identity_number,salary,phone_number,email,address,user_name)
VALUES ('Nguyễn Văn Hải', 1, 1, 3, '2002-07-21', '201723929', 5000000, '0923747238', 'hai@gmail.com', 'Đà Nẵng', 'Hải'),
		('Nguyễn Tùng', 2, 1, 3, '2000-03-10', '201792837', 7000000, '0932372646', 'tung@gmail.com', 'Đà Nẵng', 'Tùng'),
		('Võ Trần Văn Khoa', 4, 3, 4, '1999-05-06', '201723984', 9000000,'0923762476', 'khoa@gmail.com', 'Quảng Trị', 'Khoa');
        
delimiter //
CREATE PROCEDURE edit_sp(
	a INT,
    b VARCHAR(50),
    c INT,
    d INT,
    e INT,
    f DATE,
    g VARCHAR(50),
    h DOUBLE,
    j VARCHAR(50),
    k VARCHAR(50),
    l VARCHAR(50),
    m VARCHAR(255)
)
BEGIN
	UPDATE employee
    SET employee_name = b,position_id = c,education_id = d,part_id = e,date_of_birth = f,identity_number = g,salary = h,phone_number = j,email = k,address = l,user_name = m
    WHERE employee_id = a;
END;
// delimiter ;