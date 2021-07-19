DROP DATABASE IF EXISTS quan_ly_diem_thi;
CREATE DATABASE quan_ly_diem_thi;
USE quan_ly_diem_thi;
CREATE TABLE hoc_sinh(
	code_hocsinh VARCHAR(20) PRIMARY KEY NOT NULL,
	name_hocsinh VARCHAR(50),
    date_of_birth DATE,
    class VARCHAR(25),
    gender VARCHAR(20)
);

CREATE TABLE mon_hoc(
	code_monhoc VARCHAR(20) PRIMARY KEY,
    name_monhoc VARCHAR(50)
);

CREATE TABLE bang_diem(
	code_hocsinh VARCHAR(20), 
    code_monhoc VARCHAR(20),
    diem_thi INT,
    ngay_kt DATE,
    PRIMARY KEY (code_hocsinh, code_monhoc),
    FOREIGN KEY (code_hocsinh) REFERENCES hoc_sinh (code_hocsinh),
    FOREIGN KEY (code_monhoc) REFERENCES mon_hoc (code_monhoc)
    );
    CREATE TABLE giao_vien (
		code_giaovien VARCHAR(20) PRIMARY KEY,
        name_giaovien VARCHAR(50),
        phone VARCHAR(10)
    );
ALTER TABLE mon_hoc
ADD code_giaovien VARCHAR(20);

ALTER TABLE mon_hoc
ADD CONSTRAINT code_giaovien FOREIGN KEY (code_giaovien) REFERENCES giao_vien(code_giaovien);