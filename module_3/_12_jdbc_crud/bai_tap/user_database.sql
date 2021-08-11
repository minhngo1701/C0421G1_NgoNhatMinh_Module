DROP DATABASE IF EXISTS user_management;

CREATE DATABASE user_management;

USE user_management;

CREATE TABLE users (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(120),
    email VARCHAR(100),
    country VARCHAR(100)
);

delimiter //
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
	SELECT users.user_name, users.email, users.country
    FROM users
    WHERE users.id = user_id;
END;
// delimiter ;

delimiter //
CREATE PROCEDURE insert_user(
	IN name_user VARCHAR(50),
    IN user_email varchar(50),
	IN user_country varchar(50)
)
BEGIN
	INSERT INTO users(user_name, email, country) 
    VALUES (name_user, user_email, user_country);
END;
// delimiter ;

CREATE TABLE permision (
	id INT(11) PRIMARY KEY,
    `name` VARCHAR(50)
);

CREATE TABLE user_permision (
	permision_id INT,
	user_id INT
);


INSERT INTO permision(id, `name`)
VALUES (1, 'add'),
		(2, 'edit'),
		(3, 'delete'),
		(4, 'view');




INSERT INTO users (user_name, email, country)
VALUES ('Minh', 'minh@gmail.com', 'Viet Nam'),
		('Mason Mount', 'mount@gmail.com', 'England'),
		('Kante', 'kante@gmail.com', 'France'),
		('Jorginho', 'jorginho@gmail.com', 'Italy');
        
