USE quan_ly_sinh_vien;

SELECT * FROM student;

SELECT * FROM student
WHERE `status` = 1;

SELECT * FROM `subject`
WHERE credit < 10;

SELECT student.id_student, student.student_name, class.class_name 
FROM student INNER JOIN class 
ON student.id_student = class.id_class
WHERE class.class_name = 'A1';

SELECT student.id_student, student.student_name, `subject`.sub_name, Mark.mark
FROM student INNER JOIN Mark ON student.id_student = Mark.id_student
INNER JOIN `subject` ON Mark.id_sub = `subject`.id_sub 
WHERE `subject`.sub_name = 'CF';


