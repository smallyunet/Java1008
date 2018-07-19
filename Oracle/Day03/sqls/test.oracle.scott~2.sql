create sequence t_stu increment by 1 start with 1 maxvalue 99999 nocycle nocache;
select t_stu.nextval from dual;
create table t_test1(
    id number(11),
    name varchar2(10),
    primary key(id) 
);
insert into t_test1(name) values ('name'||t_stu.currval);
select * from t_test1;


-------------------------------


select * from emp; 
select empno, ename from emp;

select sal, sal + 300 from emp;
select sal, sal * 0.9 * 12 + nvl(comm, 0) as yearsal from emp;
select ename, hiredate, hiredate + 30 from emp;


select * from all_users;




