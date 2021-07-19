DROP DATABASE IF EXISTS quan_ly_ban_hang;
CREATE DATABASE quan_ly_ban_hang;
USE quan_ly_ban_hang;
CREATE TABLE customer
(
	id_customer INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(50) NOT NULL,
	customer_age INT
);
CREATE TABLE orders 
(
	id_order INT NOT NULL PRIMARY KEY AUTO_INCREMENT ,
    id_customer INT NOT NULL,
    order_date DATE NOT NULL,
    order_totalprice DOUBLE,
    FOREIGN KEY (id_customer) REFERENCES customer (id_customer)
);
CREATE TABLE product
(
	id_product INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(50) NOT NULL,
    product_price DOUBLE
);
CREATE TABLE order_detail
(
	id_order INT NOT NULL,
    id_product INT NOT NULL,
    order_detail_qty INT,
    PRIMARY KEY (id_order, id_product),
    FOREIGN KEY (id_order) REFERENCES orders (id_order),
	FOREIGN KEY (id_product) REFERENCES product (id_product)
);
INSERT INTO customer(customer_name, customer_age) 
VALUES ('Hazard', 20);
INSERT INTO customer(customer_name, customer_age) 
VALUES ('Kante', 25);
INSERT INTO customer(customer_name, customer_age) 
VALUES ('Torres', 30);
INSERT INTO product(product_name, product_price) 
VALUES ('Iphone 12', 21000000);
INSERT INTO product(product_name, product_price) 
VALUES ('Laptop', 17200000);
INSERT INTO product(product_name, product_price) 
VALUES ('Tv LCD', 7500000);
INSERT INTO orders(id_customer, order_date) 
VALUES (1, '2021-07-01');
INSERT INTO orders(id_customer, order_date) 
VALUES (1, '2021-07-02');
INSERT INTO orders(id_customer, order_date) 
VALUES (1, '2021-07-03');
INSERT INTO orders(id_customer, order_date) 
VALUES (2, '2021-07-04');
INSERT INTO orders(id_customer, order_date) 
VALUES (3, '2021-07-05');
INSERT INTO orders(id_customer, order_date) 
VALUES (3, '2021-07-06');
INSERT INTO order_detail(id_order, id_product, order_detail_qty ) 
VALUES (1, 1, 2);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (1, 2, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (2, 3, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (3, 1, 3);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (3, 3, 2);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (4, 2, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (4, 3, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (5, 1, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (6, 3, 2);