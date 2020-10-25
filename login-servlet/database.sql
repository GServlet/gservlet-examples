CREATE DATABASE gservlet_examples;

use gservlet_examples;

CREATE TABLE users (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(40) NOT NULL,
	last_name VARCHAR(40) NOT NULL,
	email VARCHAR(50),
	registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	user_name VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL
);

INSERT INTO users(first_name, last_name, user_name, password) values("John", "Doe", "john", "changeit");