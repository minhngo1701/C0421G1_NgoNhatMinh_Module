USE quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT *, MAX(credit) FROM `subject`
WHERE credit = MAX(credit);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT sb.id_sub, sb.sub_name, max(m.mark) 
FROM `subject` sb INNER JOIN Mark m ON sb.id_sub = m.id_sub
GROUP BY sb.id_sub, sb.sub_name
HAVING max(m.mark) >= ALL (SELECT max(m.mark) FROM Mark GROUP BY Mark.id_sub);
