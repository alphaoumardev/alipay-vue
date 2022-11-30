create database ssm;
use ssm;
drop table if exists user;
create table user(
  id int(10) AUTO_INCREMENT not null primary key,
  username VARCHAR (20) not null,
  sex char(1) not NULL ,
  address VARCHAR (30) default null COMMENT "address"

);

