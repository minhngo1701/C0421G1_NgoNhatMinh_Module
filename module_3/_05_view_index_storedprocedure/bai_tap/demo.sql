DROP DATABASE IF EXISTS demo;

CREATE DATABASE demo;
USE demo;
CREATE TABLE products (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_code VARCHAR(50),
	product_name VARCHAR(50),
	product_price DOUBLE,
	product_amount INT,
	product_description VARCHAR(50),
	product_status VARCHAR(50)
);

INSERT INTO products (product_code,product_name,product_price,product_amount,product_description,product_status)
VALUES ('TR', 'trứng', 3000, 2, 'trứng gà', 'còn hàng'),
		('TH', 'thịt', 10000, 0, 'thịt vai', 'hết hàng'),
        ('G', 'gạo', 40000, 10, 'st25', 'còn hàng'),
        ('S', 'sữa', 26000, 5, 'vinamilk', 'còn hàng');