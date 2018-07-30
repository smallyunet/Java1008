-- 1.
SELECT empno, ename, sal, sal * 12, sal * 12 + NVL(comm, 0) FROM emp;
-- 2.
SELECT avg(sal), max(sal) FROM emp GROUP BY deptno, job;
-- 3.
SELECT ename, sal, deptno FROM emp WHERE ename like '_S%';
-- 4.
SELECT deptno FROM emp GROUP BY deptno HAVING count(*) >= 3;
-- 5.
 SELECT ename, sal ,deptno FROM emp WHERE deptno = 20 AND job = 'MANAGER' OR sal > 3000;
-- 6.
SELECT * FROM emp WHERE comm = 0 OR comm IS NULL;
-- 7.
SELECT ename FROM emp e, salgrade s WHERE e.sal BETWEEN s.losal AND s.hisal AND s.grade = 3;
-- 8.
SElECT e.ename, d.dname FROM emp e, dept d WHERE e.deptno = d.deptno AND e.job = 'MANAGER';
-- 9.
SELECT * FROM emp e1 WHERE e1.empno = (
    SELECT e.mgr FROM emp e WHERE e.ename = 'FORD'
);

SELECT e1.ename FROM emp e1, emp e2 WHERE e1.empno = e2.mgr AND e2.ename = 'FORD';
-- 10.
SELECT emp e, dept d WHERE e.deptno = d.deptno;
-- 11.
SELECT d.deptno, count(*) FROM emp e, dept d WHERE e.deptno(+) = d.deptno GROUP BY d.deptno;
-- 12. 
SELECT * FROM emp WHERE job = (
    SELECT job FROM emp WHERE ename = 'SCOTT'
) AND ename != 'SCOTT';
-- 13.
SELECT * FROM emp WHERE (deptno, job) = (
    SELECT deptno, job FROM emp WHERE ename = 'ADAMS';
);
-- 14.
SELECT ename, sal FROM emp e1 WHERE e1.sal > (
    SELECT avg(e2.sal) FROM emp e2 WHERE e2.deptno = e1.deptno
);
-- 15.
SELECT * 
FROM emp e, (SELECT deptno, avg(sal) avgsal FROM emp GROUP BY deptno) a 
WHERE e.deptno = a.deptno AND e.sal > a.avgSal;
-- 16.
SELECT * FROM (
    SELECT e.*, rownum rn FROM (
        SELECT * FROM emp ORDER BY sal DESC
    ) e
) e1 WHERE e1.rn >= 4 AND e1.rn < = 7;
-- 17
SELECT * FROM emp WHERE sal > all(
    SELECT max(avg(sal)) FROM emp GROUP BY deptno
);

--

CREATE TABLE S(
    sno number(11),
    sname varchar2(15)
);

CREATE TABLE C(
    cno number(11),
    cname varchar2(15),
    cteacher varchar2(15)
);

CREATE TABLE SC(
    sno number(11),
    cno number(11),
    scgrade varchar2(15)
);

-- 1.
SELECT * FROM s WHERE s.sno != All(
    SELECT sname FROM s, c, sc WHERE s.sno = sc.cno(+) AND sc.cno = c.cno(+) AND c.cteacher != 'ÀîÃ÷'
);

-- 2.
SELECT s.sname, avg(sc.scgrade) FROM s, sc, (
    SELECT sc.sno FROM sc WHERE sc.scgrade < 60 GROUP BY sc.sno HAVING count(*) >= 2
) a WHERE s.sno = sc.sno AND s.sno = a.sno GROUP BY s.sname;

-- 3.
SELECT s.sname FROM s WHERE s.sno IN (
    SELECT sno FROM sc WHERE cno = 1
    INTERSECT
    SELECT sno FROM sc WHERE cno = 1
);

SELECT s.sno, s.sname 
FROM s, sc 
WHERE s.sno = sc.sno AND (sc.cno = 1 OR sc.cno = 2)
GROUP BY s.sno, s.sname HAVING count(s.sno) > 1;

-- 4.

SELECT sc.sno FROM sc WHERE sc.scgrade > (
    SELECT sc.scgrade FROM sc WHERE sc.sno = 2 AND sc.cno = 1
);

-- 5.
SELECT a.sno, a.scgrade, b.scgrade FROM 
(SELECT sc.scgrade, sc.sno FROM sc WHERE sc.cno = 1) a,
(SELECT sc.scgrade, sc.sno FROM sc WHERE sc.cno = 2) b
WHERE a.sno = b.sno AND a.scgrade > b.scgrade;

SELECT a.sno, a.scgrade, b.scgrade FROM sc a, sc b WHERE a.sno = b.sno AND a.cno = 1 AND b.cno = 2 AND a.scgrade > b.scgrade;

-- 6.

SELECT s.sno, s.sname FROM s WHERE s.sno in(
    SELECT sc.cno FROM sc WHERE sc.cno = (
        SELECT cno FROM c WHERE cname = 'Oracle'
    )
);

-- 7.

SELECT count(DISTINCT sno) FROM sc;

-- 8.

SELECT sname FROM s WHERE s.sno IN(
    SELECT sno FROM sc GROUP BY sno HAVING count(sno) > 5
);

-- 9

CREATE VIEW v_sc AS
SELECT s.sname, c.cname, sc.scgrade FROM s,c,sc
WHERE s.sno = sc.sno AND sc.cno = c.cno
WITH READ ONLY;

-- 10

CREATE INDEX emp_index ON s(sname);

--

--

DECLARE
    cursor c is select e.empno, e.sal, e.job, d.loc from emp e, dept d where e.deptno = d.deptno;
    v c%rowtype;
BEGIN
    for v in c loop
        if v.job = 'MANAGER' AND v.loc = 'DALLS' then
            update emp set sal = sal * 1.15 where empno = v.empno
        end if;
    end loop;
END;

--

create or replace procedure p(
    deptno dept.deptno%type
) is
begin
    cursor c is select e.ename, e.sal, d.dname from emp e, dept d where e.deptno = d.deptno;
    for v in c loop
        dbms_output.put_line(v.ename || v.sal || v.dname);
    end loop;
end p;
