BEGIN
    dbms_output.put_line('Hello World');
END;


-- 基本输出
BEGIN
  dbms_output.put('Hello, I am ccc');
  dbms_output.put_line('I am 10 years old');
END;


-- 定义变量
DECLARE
   -- v_name varchar2(20) := 'aaa';
   v_name varchar2(20);
   v_age number(3) := 30;
BEGIN
  v_name := 'aaa';
  dbms_output.put_line('姓名：'||v_name||'年龄'||v_age);
END;


-- 从键盘输入
declare
   v_name varchar2(20) := &name;
   v_age number(3) := &age;
begin
   dbms_output.put_line('姓名：'||v_name||'年龄'||v_age);
end;


declare
   v_age date := &age;
begin
   dbms_output.put_line(v_age);
end;


--
declare 
   v_name varchar2(10);
   v_sal number(7, 2);
begin
   select ename, sal into v_name, v_sal from emp where empno=7369;
   dbms_output.put_line(v_name || v_sal);
end;


--
declare
   v_deptno number(2) := 30;
   v_name varchar(20);
begin
  select dname into v_name from dept where deptno = v_deptno;
  dbms_output.put_line(v_name); 
end;


--
declare
  type stu_record_type is record(
       v_sno varchar2(32),
       v_name varchar2(20)
  );
  stu_record stu_record_type;
begin
  select sno, sname into stu_record.v_sno, stu_record.v_name from t_student where sno = 'yc003';
end;


--
declare
  v_emp emp%rowtype;
begin
  select * into v_emp from emp where empno=7369;
  dbms_output.put_line(v_emp.empno || ':' || v_emp.ename);
end;


--

declare
  v_num1 number(3) := 7;
  v_num2 number(3) := 8;
begin
  if v_num1 < v_num2 then
    啊哈
  end if;
end;


--

declare 
  age number := &age;
begin
  if age < 18 then
    dbms_output.put_line('未成年人');
  elsif age < 30 then
    dbms_output.put_line('青年人');
  elsif age < 50 then
    dbms_output.put_line('中年人');
  else
    dbms_output.put_line('未老年人');
  end if;
end;


declare 
  v_count number(3);
begin
  select count(*) into v_count from emp where deptno=20;
  case v_count
    when 0 then
      dbms_output.put_line('');
    when 1 then
      
    else
      
  end case;
end;


-- loop

declare
   v_first number(2) := 5;
   v_second number(2) := 9;
begin
  dbms_output.put_line(v_first);
  dbms_output.put_line(v_second);
   loop 
     if v_first < v_second then
       v_first := v_first + 1;
     elsif v_first > v_second then
       v_first := v_first - 1;
     else
       exit;
     end if;
   end loop;
  dbms_output.put_line(v_first);
  dbms_output.put_line(v_second);
end;



declare
   v_first number(2) := 5;
   v_second number(2) := 9;
begin
  dbms_output.put_line(v_first);
  dbms_output.put_line(v_second);
   loop 
     exit when v_first = v_second;
   end loop;
  dbms_output.put_line(v_first);
  dbms_output.put_line(v_second);
end;



declare
   v2 number(7) := 0;
begin
  for v in reverse 1..100 loop 
     dbms_output.put_line(v);
   end loop;
end;











