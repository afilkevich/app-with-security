DROP table if exists contacts;
CREATE TABLE contacts(
id int primary key auto_increment,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(50),
phone_number VARCHAR(50)
);