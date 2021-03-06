-- 存储函数
create or replace function getName_fun(
       id emp.empno%type
)
return varchar2
is
       v_name emp.ename%type;
begin
  select ename into v_name from emp where empno=id;
  return v_name;
end;

--

select getName_fun(9000) from dual;

--

declare
       v_name mep.ename%type;
begin
  v_name := getName_fun(9000);
  dbms_output.put_line(v_name);
end;

--

create or replace function add_dept(v_dept dept%rowtype)
return boolean
is 
begin
       insert into dept values(v_dept.deptno, v_dept.dname, v_dept.loc);
       return true;
end;

--
declare
       v_dept dept%rowtype;
begin
  v_dept.deptno := 50;
  v_dept.dname := 'dd';
  v_dept.loc := 'address';
  v_flag := add_dept(v_dept);
end;

--

create or replace function get_studentInfo_func(
       v_sno in t_student.sno%type,
       v_cno in t_scgrade.cno%type,
       v_grade out t_scgrade.grade%type
)
return varchar2
is
       v_sname t_student.sname%type;
begin
       select t1.sname, t2.grade 
       into v_sname, v_grade 
       from t_student t1, t_student, t2
       where t1.sno = t2.sno
       and t1.sno=v_sno and t2.cno=v_cno;
end;

--

create or replace procedure getHir(
       v_empno in emp.empno%type,
       v_hiredate out emp.hiredate%type
)
is
       v emp.hiredate%type;
begin
  select e.hiredate into v from emp e where e.empno = 7369;
  dbms_output.put_line(v);
end;

begin
getHir;
end;


------------------------


create or replace package dept_pkg is
       -- 增加部门
       function add_dept_fun(v_dept dept%rowtype) return boolean;
       -- 删除部门
       function del_dept_fun(v_deptno dept.deptno%type) return boolean;
       -- update
       procedure upd_dept_pro(v_deptno dept.deptno%type, v_dname dept.dname%type);
       -- select
       procedure get_depts_pro;
end dept_pkg;


create or replace package body dept_pkg is
 function add_dept_fun(v_dept dept%rowtype) return boolean is
 begin
   insert into dept values(v_dept.deptno,v_dept.dname,  v_dept.loc);
   return true;
 end add_dept_fun;
 
  function del_dept_fun(v_deptno dept.deptno%type) return boolean is
  begin
    delete from dept where deptno = v_deptno;
    return true;
  end del_dept_fun;
  
   procedure upd_dept_pro(v_deptno dept.deptno%type, v_dname dept.dname%type)
   is
   begin
   	update dept set dname = v_dname where deptno = v_deptno;
   end upd_dept_pro;
   
   procedure get_depts_pro
     is
     cursor dept_cursor is select * from dept;
     v_dept dept%rowtype;
     begin
       open dept_cursor;
       loop 
         fetch dept_cursor into v_dept;
         exit when dept_cursor%notfound;
         dbms_output.put_line(v_dept.deptno || '---' ||v_dept.dname);
       end loop;
       close dept_cursor;
     end get_depts_pro;
end dept_pkg;

---

declare
    v_dept dept%rowtype;
    v_flag boolean;
begin
    v_dept.deptno := 16;
    v_dept.dname := 'smalls';
    v_dept.loc := 'abcdefg';
    v_flag := dept_pkg.add_dept_fun(v_dept);
end;

select * from dept;


-----------------

create or replace procedure get_depts_pro(
       deptList out sys_refcursor
)
is 
begin
       open deptList for select * from dept;
end;

----

declare
       v_deptList sys_refcursor;
begin
  get_depts_pro(v_deptList);
       loop
                  fetch v_deptList into v_dept;
                  exit when v_deptList%notfound;
       end loop;
end;






















