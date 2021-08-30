select user(), database();

show tables;

insert into title values(1, '사장');
insert into title values(2, '부장');

update title set tname = "과장" where tno = 2;
delete from title where tno = 2;

select * from title;

insert into department values(1, '기획', 10);
insert into department values(2, '영업', 20);
insert into employee values(4377, '이성래', 1, null, 4500000, 1);

desc title;
select tno, tname from title;
select tno, tname from title where tno = 2;

select deptno, deptname, floor from department;
select empno, empname, title, manager, salary, dno from employee;

-- department
select deptno, deptname, floor from department;
select deptno, deptname, floor from department WHERE deptno = 2;

insert into department values(3, '개발', 21);
update department set deptname = '인사' where deptno = 4;
delete from department where deptno = 4;

-- employee
insert into employee values(1004, '석주명', 2, 4377, 4000000, 2);
insert into employee values(1005, '장준화', null, null, 2000000, null);
insert into employee values(1006, '김혜인', 1, 4377, 2000000, null);

1004
update employee 
   set empname = '권민성', title = 1, manager = null, salary = 3000000, dno = 1
 where empno = 1004;
select empno, empname, title, manager, salary, dno from employee;
select empno, empname, title, manager, salary, dno from employee where empno = 4377;




