USE quan_ly_ban_hang;

SELECT orders.id_order, orders.order_date, orders.order_totalprice
FROM orders;

SELECT * FROM customer c 
INNER JOIN orders o ON c.id_customer = o.id_customer
INNER JOIN order_detail od ON o.id_order = od.id_order
INNER JOIN product p ON od.id_product = p.id_product;


SELECT * FROM customer c 
LEFT JOIN orders o ON c.id_customer = o.id_customer
WHERE o.id_customer IS NULL;

UPDATE orders
set order_detail.id_order, order_totalprice = sum(order_detail.price_product) 
 GROUP BY order_detail.id_order

