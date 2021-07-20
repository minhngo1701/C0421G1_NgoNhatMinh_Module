USE quan_ly_sinh_vien;

SELECT * FROM student
WHERE student.student_name LIKE 'h%';

SELECT * FROM class
WHERE class.start_date >= '2008-12-01' AND class.start_date <= '2008-12-31';

SELECT * FROM `subject` 
WHERE credit >= 3 AND credit <= 5;

UPDATE student
SET id_class = 2
WHERE student_name = 'Hung';

SELECT * FROM student;
SET SQL_SAFE_UPDATES = 0;

SELECT s.id_student, s.student_name, sb.sub_name, m.mark  
FROM student s INNER JOIN `subject` sb ON s.id_student = sb.id_sub
INNER JOIN Mark m ON m.id_student = sb.id_sub
ORDER BY m.mark DESC, s.student_name ASC;