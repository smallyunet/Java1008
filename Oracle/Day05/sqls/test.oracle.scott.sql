-- 等值连接
select *
from emp e, dept d
where e.deptno = d.deptno;

select * from emp;
select * from dept;

select *
from emp e, dept d 
where e.deptno = d.deptno and e.deptno = 10;

select * from emp e, dept d where d.dname = 'SALES' and e.deptno = d.deptno;
select * from emp e, dept d where e.deptno = 20 and e.deptno = d.deptno;
select avg(sal) from emp e, dept d where e.deptno = 20 and e.deptno = d.deptno group by sal;

select * from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- 任务1：  查询10号部门工资小于2000的员工的姓名，工资及工资等级。
select * from emp e, salgrade s 
where e.sal < 2000 and e.sal between s.losal and s.hisal and e.deptno = 10; 

-- 任务2：查询工资等级处于第四级别的员工的姓名。
select * from emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 4;

-- 内连接
select *
from emp e 
inner join dept d 
on e.deptno = d.deptno;

-- 任务1 ：检索从事CLERK工作的员工姓名和所在部门名称。
select * from emp e inner join dept d on e.deptno = d.deptno and e.job = 'CLERK';

-- 按部门号（deptno） 及 工资（sal）排序检索公司的员工信息（要求部门号从大到小 ，部门号相同的按工资由低到高），显示的字段为：员工号、员工姓名、工资、部门名称。

select * from emp e inner join dept d on e.deptno = d.deptno order by e.deptno desc, e.sal;

-- 自连接
select * from emp e1 inner join emp e2 on e1.mgr = e2.empno and e1.ename = 'BLAKE';

-- 左外连接
select * 
from emp e left outer join dept d on e.deptno = d.deptno;

select * from dept d left join emp e on e.deptno = d.deptno;

select * from emp e, dept d where e.deptno(+) = d.deptno;

select * from dept d right join emp e on d.deptno = e.deptno;

select * from dept d, emp e where d.deptno(+) = e.deptno;

select * from dept d full join emp e on d.deptno = e.deptno;

-- 任务：统计每个部门的员工人数,显示部门号，部门名称，员工人数
select d.deptno, d.dname, count(e.ename)
from emp e inner join dept d on e.deptno = d.deptno
group by d.deptno, d.dname;
-- 任务：使用完全外连接统计每个部门的员工人数。
select e.deptno, count(e.deptno) from emp e full join dept d on e.deptno = d.deptno group by e.deptno;
-- 任务  查询没有员工的部门信息
select * from dept d left join emp e on d.deptno = e.deptno where e.deptno is null;

