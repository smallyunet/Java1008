-- ´´½¨ÊÓÍ¼
create view v_emp 
as
select empno, ename, sal 
from emp;

select * from v_emp;

create view v_emp1
as
select e.empno, e.ename, e.sal, d.deptno, d.dname, grade
from emp e 
left join dept d on e.deptno = d.deptno
left join salgrade s on e.sal between s.losal and s.hisal;

select * from v_emp1;

select e.empno, e.ename, e.sal, d.deptno, d.dname, grade
from emp e, dept d, salgrade s
where e.deptno(+) = d.deptno 
and e.sal between s.losal and s.hisal;

insert into v_emp values('9004', 'aaaaaaaaaa', '6666');
select * from emp;

create view t_dept 
as
select deptno, loc
from dept;

select * from t_dept;

create view v_deptavgsal 
as
select d.dname, avg(e.sal) avgsal
from dept d, emp e
where d.deptno = e.deptno(+)
group by dname;

create view v_suibian2
as
select c.cname, s.grade, avg(s.grade) avggrade, max(s.grade) maxgrade
from t_course c join t_scgrade s on c.cno = s.cno
group by c.cname, s.grade;

select * from v_suibian2;

create view v_empppp
as
select empno, ename, sal from emp where sal > 1000
with check option;

select * from v_empppp;

create or replace view v_empppp
as 
select empno, ename, sal from emp;

