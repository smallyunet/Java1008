-- 子 查寻
select * from emp
where deptno = (
    select deptno
    from emp where ename = 'SCOTT'
);

select empno, ename, job from emp 
where deptno = (
    select deptno
    from dept
    where dname = 'RESEARCH'
);

-- 任务一：检索与SCOTT从事相同工作的员工信息。
select * from emp;
select * from dept;

select * from emp
where job = (
    select job from emp where ename = 'SCOTT'
);

-- 任务二：检索和名叫SCOTT的员工相同工资的员工信息，但不显示SCOTT。显示字段：员工号、员工名、工资。
select * from emp 
where sal = (
    select sal from emp where ename = 'SCOTT'
) and ename != 'SCOTT';

-- 任务三：在emp表中，查询出既不是最高工资，也不是最低工资的员工信息
select * from emp 
where sal between (
    select min(sal) from emp
) and (
    select max(sal) from emp
);

-- 任务四：查询出工资低于所有员工平均工资的员工姓名和工资，按照工资高低降序排序。
select ename, sal from emp
where sal < (
    select avg(sal) from emp
) order by sal desc;

-- 
select deptno, avg(sal) avgsal
from emp
group by deptno
having avg(sal)<(
    select max(avg(sal)) from emp group by deptno
    );

-- 任务一：从学生选修成绩表t_scgrade查询出课程平均成绩低于课程最高平均值的课程编号和平均成绩。
select no, avg(grade) from t_scgrade 
where (
    select avg(grade) from t_scgrade
) < (
    select max(avg(grade)) from t_scgrade
) group by no, grade;

-- 任务二：在HR用户模式下查询显示部门内最低工资比100号部门最低工资要高的部门编号以及部门内最低工资
select no, avg(sal) from emp
where (
    select min(sal) from emp
) > (
    select min(sal) from emp where dpt = 100
) group by no, sal;

-- 
select ename, sal from emp where sal in(
    select 
    from emp
    where deptno = (
        select deptno from dept where dname = 'SALES'
    )
);

-- 任务一： 列出至少有两个员工的所有部门信息
-- 每个部门有几个员工
select e.deptno, d.dname, count(e.ename) from dept d join emp e on d.deptno = e.deptno
group by e.deptno, d.dname
having count(e.ename) > 3;

-- 任务二：在HR用户模式下查询工资与任何一个部门最低工资相等的雇员姓名,工资

select * from emp where sal in (
    select min(sal) from emp
    group by deptno
);

-- 任务三：使用SQL标准嵌套子查询查询选修了课程名称为“Oracle”的学生学号和姓名。

select ename, sal from emp where sal > all(
select avg(sal)
from emp
group by deptno);

--

select * from emp
where sal > all(
    select sal from emp where deptno = 20
);

select e.*
from emp e
where exists (
    select deptno
    from dept d
    where e.deptno = d.deptno and d.dname = 'SALES'
);

select * from emp;
select * from dept;

-- other

select * from (
    select a.*, rownum rn from (
        select e.* from emp e order by sal desc
    ) a
) b where b.rn > 5 and b.rn <= 10;

-- (页数 - 1) * count     页数*count

-- 集合
select ename, sal, job from emp where sal > 2500
union
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
union all
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
intersect
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
minus
select ename, sal, job from emp where job = 'MANAGER';













