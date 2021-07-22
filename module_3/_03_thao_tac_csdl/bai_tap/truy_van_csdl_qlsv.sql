USE quan_ly_sinh_vien;
SET SQL_SAFE_UPDATES = 0;
SELECT * 
FROM student
WHERE student.student_name LIKE 'h%';

SELECT *, month(start_date)
FROM class
GROUP BY class.id_class
HAVING month(start_date) >= ALL (
	SELECT month(start_date) 
	FROM  class 
    GROUP BY class.start_date
 );


SELECT * 
FROM `subject` 
WHERE credit >= 3 AND credit <= 5;

UPDATE student
SET id_class = 2
WHERE student_name = 'Hung';

SELECT * 
FROM student;


SELECT s.id_student, s.student_name, sb.sub_name, m.mark  
FROM student s INNER JOIN `subject` sb ON s.id_student = sb.id_sub
INNER JOIN Mark m ON m.id_student = sb.id_sub
ORDER BY m.mark DESC, s.student_name ASC;