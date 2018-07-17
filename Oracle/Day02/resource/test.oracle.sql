-- 查询用户
select * from dba_users;
-- 查询表空间
select * from dba_tablespaces;
-- 新建表空间
create tablespace test1 datafile 'E:\app\Administrator\oradata\test\test1.dbf' size 30M autoextend on next 5M maxsize 500M;
-- 新建用户
create user myuser identified by myuser default tablespace test1;
-- 用户授权/取消授权
grant create session to myuser;
grant resource,dba,connect to myuser; 