USE quan_ly_sinh_vien;

-- Hiển thị số lượng sinh viên ở từng nơi
SELECT address, COUNT(id_student) AS 'Số lượng học viên'
FROM student
GROUP BY address;

-- Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
SELECT s.id_student,s.student_name, AVG(Mark)
FROM student s join Mark m on s.id_student = m.id_student
GROUP BY s.id_student,s.student_name;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
 SELECT s.id_student,s.student_name, AVG(Mark)
FROM student s join Mark m on s.id_student = m.id_student
GROUP BY s.id_student,s.student_name
HAVING AVG(Mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT s.id_student,s.student_name, AVG(Mark)
FROM student s join Mark m on s.id_student = m.id_student
GROUP BY s.id_student,s.student_name
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.id_student);