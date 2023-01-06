CREATE DATABASE customers;
USE customers;

CREATE TABLE crm (
id INT(5) auto_increment,
first_name VARCHAR(25),
last_name VARCHAR(25),
email VARCHAR(50),
PRIMARY KEY (id)

)engine=InnoDB;

INSERT INTO crm(first_name, last_name, email) VALUES ("Lucas", "Costa", "lucascosta@gmail.com");
INSERT INTO crm(first_name, last_name, email) VALUES ("Armando", "Paredes", "elalbañil@hotmail.com");
INSERT INTO crm(first_name, last_name, email) VALUES ("Ester", "Ovejeros", "esteronline@gmail.com");
INSERT INTO crm(first_name, last_name, email) VALUES ("Mario", "Kempes", "amorporelfutbol@gmail.com");
INSERT INTO crm(first_name, last_name, email) VALUES ("Luna", "Blaise", "actingfirstlifesecond@gmail.com");