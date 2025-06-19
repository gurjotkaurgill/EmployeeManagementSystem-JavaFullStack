create database employeemanagementsystem;

use employeemanagementsystem;

create table login(username varchar(20), password varchar(20));

insert into login values('admin', '12345');

create table employee(name varchar(20), residency varchar(20), dob varchar(30), salary varchar(20), address varchar(100), phone varchar(20), email varchar(40), education varchar(20), title varchar(30), sin varchar(25), empId varchar(15));





show databases;

select * from employee;