-- 任务1：显示姓名中有“ %N%”的雇员
select * from emp where ename like ' %N%';
-- 任务2：显示姓名中没有'L'字的员工的详细信息或含有'SM'字的员工信息
select * from emp where ename like '%L%' or ename like '%SM%';
-- 任务3：查询姓名为“ALLEN”，或者工作为“ANALYST
select * from emp where ename = 'ALLEN' or ename = 'ANALYST';
-- 任务4  显示10 号部门的所有经理('MANAGER')和20号部门的所有职员('CLERK')的详细信息
select mgr, ename from emp where deptno in(10, 20);
-- 任务5: 检索部门号及其本部门的最低工资，并按着最低工资降序排序。
select deptno, min(sal) from emp group by deptno, sal order by sal desc;
-- 任务6:列出最高薪水大于2500的各个部门人数
select deptno, count(deptno) from (select * from emp where sal > 2500) group by deptno;
-- 任务7:查询成绩在70~80分之间的学生选课得分情况
-- 任务8 列出每门选修课的平均成绩。按着每门课平均成绩降序排列。
-- 任务9 统计每门课及格的人数