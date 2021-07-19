DROP DATABASE IF EXISTS thuc_hanh;
CREATE DATABASE thuc_hanh;
USE thuc_hanh;
CREATE TABLE student (
	id INT PRIMARY KEY,
    `name` VARCHAR(50),
    age INT,
    country VARCHAR(50)
);
-- DROP TABLE student;student
CREATE TABLE class (
	id INT PRIMARY KEY,
    `name` VARCHAR(50)
);
INSERT INTO class
VALUES (
	1,
	"C0421G1"
);
INSERT INTO class
VALUES (
	2,
	"C0421G2"
);

CREATE TABLE teacher(
	id INT PRIMARY KEY,
    `name` VARCHAR(50),
    age INT,
    country VARCHAR(50)

);
INSERT INTO teacher
VALUES (
	1,
    "Minh",
    20,
    "Viet Nam"

);
INSERT INTO teacher
VALUES (
	2,
    "Quân trẩu",
    20,
    "Viet Nam"
);

DELETE FROM teacher
WHERE id = 2;

UPDATE teacher
SET `name` = 'Long'
WHERE id = 1;
