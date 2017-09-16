
/**
 * Напишите запрос, удаляющий из платежей, все платежи по величине меньше 100.
 */

create database listexpenses;
create table expenses(
num int not null primary key,
paydate date not null,
receiver int not null,
value dec not null
);
create table receivers(
num int not null,
name varchar(255) not null,
primary key (num)
);

insert into expenses (num,paydate,receiver,value) values (1,'2015-5-10',1,100);
insert into expenses (num,paydate,receiver,value) values (2,'2015-6-11',2,125);
insert into expenses (num,paydate,receiver,value) values (3,'2016-7-12',3,300);
insert into expenses (num,paydate,receiver,value) values (4,'2017-8-13',2,50);
insert into expenses (num,paydate,receiver,value) values (5,'2017-5-25',1,75);
insert into expenses (num,paydate,receiver,value) values (6,'2017-6-27',1,200);
insert into expenses (num,paydate,receiver,value) values (7,'2017-7-30',4,300);
insert into expenses (num,paydate,receiver,value) values (8,'2017-8-31',2,50);
insert into expenses (num,paydate,receiver,value) values (9,'2017-10-12',4,80);
insert into expenses (num,paydate,receiver,value) values (10,'2017-11-13',3,150);


insert into receivers (num,name) values (1,'Galileo Mall');
insert into receivers (num,name) values (2,'Galleria Minsk');
insert into receivers (num,name) values (3,'Korona');
insert into receivers (num,name) values (4,'Evroopt')


select expenses.num,paydate,value,name from  expenses,receivers where receiver=receivers.num order by value
delete from expenses where value<100