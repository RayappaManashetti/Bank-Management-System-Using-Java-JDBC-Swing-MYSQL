CREATE DATABASE bankingSystem;
USE bankingSystem;

CREATE TABLE signup(
form_no VARCHAR(30),
name1 VARCHAR(50),
father_name VARCHAR(50),
DOB VARCHAR(30),
gender VARCHAR(30),
email VARCHAR(60),
marital_status VARCHAR(50),
address VARCHAR(60),
city VARCHAR(60),
pincode VARCHAR(30),
state VARCHAR(60)
);

CREATE TABLE signup2(
form_no VARCHAR(30),
religion VARCHAR(30),
category VARCHAR(30),
income VARCHAR(60),
education VARCHAR(60),
occupation VARCHAR(60),
pan VARCHAR(45),
adhar VARCHAR(30),
seniorcitizen VARCHAR(30),
existingaccount VARCHAR(60)
);

CREATE TABLE signup3(
form_no VARCHAR(30),
account_type VARCHAR(60),
card_no VARCHAR(60),
pin VARCHAR(60),
facility VARCHAR(300)
);

DESC signup2;

DESC signup;

SELECT * FROM signup2;

SELECT * FROM signup;

SELECT * FROM signup3;

CREATE TABLE login(
form_no VARCHAR(30),
card_no VARCHAR(60),
pin VARCHAR(30)
);

SELECT * FROM login;

CREATE TABLE bank(
pin_no VARCHAR(20), 
date1 VARCHAR(60),
type1 VARCHAR(50),
amount VARCHAR(60)
);

DESC bank;
SELECT * FROM bank;