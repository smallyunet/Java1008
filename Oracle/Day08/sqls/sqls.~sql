/*
1. 声明游标
2. 打开游标
3. 抓取数据
4. 关闭游标
*/
declare
   cursor emp_cursor is select * from emp;
   v_emp emp%rowtype;
begin
  open emp_cursor;
  loop
    fetch emp_cursor into v_emp;
    exit when emp_cursor%notfound;
    dbms_output.put_line(v_emp.ename || ' ----- ' ||v_emp.empno);
  end loop;
  close emp_cursor;
end;

--
declare
   cursor dept_cursor is select * from dept;
   v_dept dept%rowtype;
begin
  open dept_cursor;
  loop
    fetch dept_cursor into v_dept;
    exit when dept_cursor%notfound;
    dbms_output.put_line(v_dept.dname || ' ----- ' ||v_dept.deptno);
  end loop;
  close dept_cursor;
end;

--

declare
  cursor emp_cursor(v_deptno emp.deptno%type) is select ename, sal from emp where deptno = v_deptno;
  v_emp emp_cursor%rowtype;
begin
  open emp_cursor(10);
  loop
    fetch emp_cursor into v_emp;
    exit when emp_cursor%notfound;
    dbms_output.put_line(v_emp.ename || '---' || v_emp.sal);
  end loop;
  close emp_cursor;
end;


--
/*

使用游标编写一个PL/SQL程序，要求根据课程编号在控制台显示哪些学生选修了该课程。

任务：从之前创建好的学生表t_student和选修成绩表t_scgrade中使用游标取出学生的学生姓名，课程编号和成绩的信息，显示在控制台。
（使用FOR语句循环游标）

*/

--

declare
  cursor c is select * from emp;
begin
  for v in c
  loop
     dbms_output.put_line(v.ename);  
  end loop;
end;


-- 异常
begin
  dbms_output.put_line('异常前');
  dbms_output.put_line(10/0);
  dbms_output.put_line('异常后');
exception
  when zero_divide then
    dbms_output.put_line('除数为0');
  when others then
    dbms_output.put_line('未知异常');
end;


-- 非系统异常
declare
   e_del_dept exception;
   pragma exception_init(e_del_dept, -02292);
begin
  delete from dept;
exception
  when e_del_dept then
    dbms_output.put_line('约束异常');
end;


-- 自定义异常
declare
   e_outofrange exception;
   pragma exception_init(e_outofrange, -20000);
   v_sum number(5) := 0;
begin
   for v_num in 1..50 loop
     v_sum := v_sum + v_num;
     if v_sum > 100 then
       -- raise_application_error(-20000, '结果太大了');
       raise e_outofrange;
     end if;
   end loop;  
exception
  when e_outofrange then
    dbms_output.put_line('越界异常');
end;


-- 
declare
    v_name varchar2(20);
    e_delmsg exception;
    pragma exception_init(e_delmsg, -20001);
begin
    select username into v_name from user_users;
    if v_name != 'SYS' then
      raise e_delmsg;
    else
      execute immediate 'drop user myuser1 cascade';
    end if;
exception
  when e_delmsg then
    dbms_output.put_line('异常');
end;


-- 触发器
create or replace trigger t_emp_trigger
before insert or update or delete
on t_emp
begin
  if (to_number(to_char(sysdate, 'hh24')) > 9 
    and to_number(to_char(sysdate, 'hh24')) < 18)
    or to_char(sysdate, 'day') in ('星期六', '星期日') then
    dbms_output.put_line('异常');
    raise_application_error(-20003, '日期异常');
  end if;
end;

insert into t_emp(ename) values('qwer') ;

select * from t_emp; 


-- 行触发器
create or replace trigger t_emprow_trigger
before insert or update or delete
on t_emp
for each row
begin
    dbms_output.put_line('测试');    
end;

--

create or replace trigger t_emprow_trigger
before insert or update or delete
on t_emp
for each row
begin
    dbms_output.put_line(:new.ename);    
end;


-- 主键自增
-- 表
create table t_test2 (
       id number(10) primary key,
       name varchar(20)
);
-- 序列
create sequence t_test2_seq;
-- 触发器
create or replace trigger t_test2_trigger
before insert
on t_test2
for each row
begin
  if :new.id is null then
    :new.id := t_test2_seq.nextval;
  end if;
end;

insert into t_test2(name) values('aaa');
select * from t_test2;
















