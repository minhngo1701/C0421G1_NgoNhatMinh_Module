USE quan_ly_ban_hang;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT orders.id_order, orders.order_date, orders.order_totalprice
FROM orders;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT * FROM customer c 
INNER JOIN orders o ON c.id_customer = o.id_customer
INNER JOIN order_detail od ON o.id_order = od.id_order
INNER JOIN product p ON od.id_product = p.id_product;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT c.customer_name FROM customer c 
LEFT JOIN orders o ON c.id_customer = o.id_customer
WHERE o.id_customer IS NULL;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
SELECT o.id_order, o.order_date, sum(product_price*order_detail_qty) as 'giá tiền hóa đơn'
FROM orders o INNER JOIN order_detail od ON o.id_order = od.id_order
INNER JOIN product p ON od.id_product = p.id_product
GROUP BY o.id_order;



