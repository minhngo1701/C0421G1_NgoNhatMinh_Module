CREATE DATABASE user_management;

USE user_management;

CREATE TABLE users (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(120),
    email VARCHAR(100),
    country VARCHAR(100)
);

INSERT INTO users (user_name, email, country)
VALUES ('Minh', 'minh@gmail.com', 'Viet Nam'),
		('Mason Mount', 'mount@gmail.com', 'England'),
		('Kante', 'kante@gmail.com', 'France'),
		('Jorginho', 'jorginho@gmail.com', 'Italy');
        
SELECT * FROM users
ORDER BY user_name;