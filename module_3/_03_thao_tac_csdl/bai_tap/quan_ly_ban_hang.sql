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
    product_price INT
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
VALUES ('Minh Quan', 10);
INSERT INTO customer(customer_name, customer_age) 
VALUES ('Ngoc Anh', 20);
INSERT INTO customer(customer_name, customer_age) 
VALUES ('Hong Ha', 50);

INSERT INTO product(product_name, product_price) 
VALUES ('May Giat', 3);
INSERT INTO product(product_name, product_price) 
VALUES ('Tu Lanh', 5);
INSERT INTO product(product_name, product_price) 
VALUES ('Dieu Hoa', 7);
INSERT INTO product(product_name, product_price) 
VALUES ('Quat', 1);
INSERT INTO product(product_name, product_price) 
VALUES ('Bep Dien', 2);

INSERT INTO orders(id_customer, order_date) 
VALUES (1, '2006-03-21');
INSERT INTO orders(id_customer, order_date) 
VALUES (2, '2006-03-23');
INSERT INTO orders(id_customer, order_date) 
VALUES (1, '2006-03-16');

INSERT INTO order_detail(id_order, id_product, order_detail_qty ) 
VALUES (1, 1, 3);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (1, 3, 7);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (1, 4, 2);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (2, 1, 1);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (3, 1, 8);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (2, 5, 4);
INSERT INTO order_detail(id_order, id_product, order_detail_qty) 
VALUES (2, 3, 3);

