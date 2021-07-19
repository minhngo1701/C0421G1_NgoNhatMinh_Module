CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;
CREATE TABLE class
(
    id_class INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME NOT NULL,
    `Status` BIT
);

CREATE TABLE student
(
    id_student INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(30) NOT NULL,
    address     VARCHAR(50),
    phone       VARCHAR(20),
    `Status`      BIT,
	id_class INT NOT NULL,
    FOREIGN KEY (id_class) REFERENCES class (id_class)
);

CREATE TABLE `subject`
(
    id_sub INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_name VARCHAR(30) NOT NULL,
    credit TINYINT NOT NULL DEFAULT 1 CHECK ( credit >= 1 ),
    `Status` BIT DEFAULT 1
);
CREATE TABLE Mark
(
    id_mark    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_sub     INT NOT NULL,
    id_student INT NOT NULL,
    mark      FLOAT   DEFAULT 0 CHECK ( mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1,
    UNIQUE (id_sub, id_student),
    FOREIGN KEY (id_sub) REFERENCES `subject` (id_sub),
    FOREIGN KEY (id_student) REFERENCES student (id_student)
);