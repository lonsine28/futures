

drop database futures;


--�������ݿ�
create database futures;
use futures;
--1.�û���
DROP TABLE IF EXISTS usertest;
CREATE TABLE usertest(
uno int NOT NULL auto_increment,
emial varchar(100) NOT NULL,
pwd char(6) NOT NULL ,
PRIMARY KEY  (uno)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into usertest (emial,pwd) values('bmd_longteng@163.com','123456');