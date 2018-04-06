DROP DATABASE IF EXISTS mldn;
CREATE DATABASE mldn;
USE mldn;
DROP TABLE IF EXISTS emp;
CREATE TABLE emp(
    empno int(4) PRIMARY KEY,
    ename VARCHAR(10),
    job VARCHAR(9),
    hiredate DATE,
    sal FLOAT(7,2)
);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6060,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6040,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6060,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6220,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6160,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (4060,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (5060,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6960,'smallyu','major','2009-05-16',1995.30);
INSERT INTO emp (empno,ename,job,hiredate,sal) VALUES (6660,'smallyu','major','2009-05-16',1995.30);