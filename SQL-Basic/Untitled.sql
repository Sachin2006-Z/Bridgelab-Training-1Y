Create database GLA;
use GLA;
Create table if not exists student(Id int, FirstName varchar(50), lastName varchar(50));
insert into student(Id,FirstName,lastName) value
(01,'Sachin','Yadav'),
(02,'Vey','ren'),
(03,'Zen','Ith');
Select *from student;


Create table if not exists Employee(Id int,Name varchar(50),Salary int);
insert into Employee(Id,Name,Salary) value
(01,'Vansh Naukar',50),
(02,'Utsav servent','40'),
(03,'Shivam',30);
Select *from Employee;
set SQL_SAFE_UPDATES=0;
Update Employee set Salary=40 where Id=03;
set SQL_SAFE_UPDATES=1;

select *from Employee;
