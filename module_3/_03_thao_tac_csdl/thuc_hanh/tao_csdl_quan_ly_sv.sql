DROP DATABASE IF EXISTS quan_ly_sinh_vien;
CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;
CREATE TABLE class
(
    id_class INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATE NOT NULL,
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

INSERT INTO class (id_class, class_name, start_date, `status`)
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO class (id_class, class_name, start_date, `status`)
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO class (id_class, class_name, start_date, `status`)
VALUES (3, 'B3', current_date, 0);

INSERT INTO Student (student_name, address, phone, `status`, id_class)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (student_name, address, `status`, id_class)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (student_name, address, phone, `status`, id_class)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO `subject`(id_sub, sub_name, credit, `status`)
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (id_sub, id_student, mark, exam_times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);