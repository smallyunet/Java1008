select * from emp where ename like '_A%';
select * from emp where not comm is null;
select * from emp where deptno in(20, 30);
select * from emp where sal between 2000 and 3000;

select * from emp order by hiredate asc, deptno desc;
select * from emp order by sal * 12 + nvl(comm, 0) desc;
select * from emp where deptno = 20 and sal > 1200 order by sal * 12 + nvl(comm, 0) desc;

select avg(sal), max(sal) from emp group by deptno, job;
select avg(sal), max(sal) from emp group by deptno, job having avg(sal) < 2500;

select lower('HELLO WORLD') from dual;
select upper('HELLO WORLD') from dual;
select initcap('HELLO WORLD') from dual;
select length('HELLO WORLD') from dual;
select length('HELLO WORLD') from dual;
select substr('HELLO WORLD', 3, 8) from dual;
select trim('HELLO WORLD') from dual;

select lower(ename) from emp;
select first_name||' '||last_name from emp;

select round(3.5) from dual;
select mod(7, 3) from dual;
select trunc(7.3) from dual;

select * from emp;
select sal, trunc(sal), round(sal) from emp;
select mod(17, 3) from dual;

select next_day(sysdate, 4) from dual;

select ename, to_char(hiredate, 'mm') + 1 from emp;
select * from emp where to_char(sysdate, 'mm') = to_char(hiredate, 'mm') + 1;
select * from emp where to_char(add_months(sysdate, 2), 'mm') = to_char(hiredate, 'mm');

select empno,rowid, rownum from emp where rownum < 5;

select * from t_emp;
update t_emp set comm = 500 where comm is null;
select * from emp where rownum < 5;

select * from emp;
select to_char(hiredate, 'yyyy-mm-dd') from emp;
select to_char(max(hiredate), 'yyyy-mm-dd') from emp;
select to_char(min(hiredate), 'yyyy-mm-dd') from emp;

