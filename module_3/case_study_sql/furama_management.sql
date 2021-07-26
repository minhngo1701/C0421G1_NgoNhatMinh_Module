DROP DATABASE IF EXISTS furama_management;

CREATE DATABASE furama_management;

USE furama_management;

CREATE TABLE position (
	position_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    position_name VARCHAR(50)
);

CREATE TABLE education (
	education_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    education_name VARCHAR(50)
);

CREATE TABLE type_of_customer (
	type_of_customer_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_of_customer_name VARCHAR(50)
);

CREATE TABLE type_of_rent (
	type_of_rent_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_of_rent_name VARCHAR(50)
);

CREATE TABLE type_of_service (
	type_of_service_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_of_service_name VARCHAR(50)
);

CREATE TABLE accompanied_service (
	accompanied_service_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    accompanied_service_name VARCHAR(50),
    price INT,
    unit INT,
    `status` VARCHAR(50)
);

CREATE TABLE part (
	part_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    part_name VARCHAR(50)
);

CREATE TABLE employee (
	employee_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(50),
    position_id INT NOT NULL,
    education_id INT NOT NULL,
    part_id INT NOT NULL,
    date_of_birth DATE,
    identity_number VARCHAR(20),
    salary DOUBLE,
    phone_number VARCHAR(20),
    email VARCHAR(50),
    address VARCHAR(50),
	FOREIGN KEY (position_id) REFERENCES position (position_id),
	FOREIGN KEY (education_id) REFERENCES education(education_id),
    FOREIGN KEY (part_id) REFERENCES part(part_id)
);

CREATE TABLE customer (
	customer_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_of_customer_id INT NOT NULL,
    customer_name VARCHAR(50),
    date_of_birth DATE,
	identity_number VARCHAR(20),
    phone_number VARCHAR(20),
    email VARCHAR(50),
    address VARCHAR(50),
    FOREIGN KEY (type_of_customer_id) REFERENCES type_of_customer(type_of_customer_id)
);

CREATE TABLE service (
	service_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    service_name VARCHAR(50),
    area INT,
    floor INT,
    amount_person_max INT,
    rent_cost INT,
    type_of_rent_id INT NOT NULL,
    type_of_service_id INT NOT NULL,
    `status` VARCHAR(50),
    FOREIGN KEY (type_of_rent_id) REFERENCES type_of_rent(type_of_rent_id),
    FOREIGN KEY (type_of_service_id) REFERENCES type_of_service(type_of_service_id)
);

CREATE TABLE contract (
	contract_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    employee_id INT NOT NULL,
    customer_id INT NOT NULL,
    service_id INT NOT NULL,
    date_start_contract DATE,
    date_end_contract DATE,
    money_deposit INT,
    total_money INT,
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (service_id) REFERENCES service(service_id) ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE contract_detail (
	contract_detail_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    contract_id INT NOT NULL,
    accompanied_service_id INT NOT NULL,
    amount INT,
    FOREIGN KEY (contract_id) REFERENCES contract(contract_id),
    FOREIGN KEY (accompanied_service_id) REFERENCES accompanied_service(accompanied_service_id)
    
);
