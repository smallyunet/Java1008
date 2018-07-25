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

