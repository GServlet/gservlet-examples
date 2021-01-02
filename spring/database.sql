CREATE DATABASE gservlet_examples;

use gservlet_examples;

CREATE TABLE books (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	author VARCHAR(200) NOT NULL
);

INSERT INTO books(name, author) values("Groovy in action", "Manning");
INSERT INTO books(name, author) values("JSF in action", "Manning");
INSERT INTO books(name, author) values("Spring in action", "Manning");