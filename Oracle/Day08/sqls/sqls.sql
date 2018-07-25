/*
1. �����α�
2. ���α�
3. ץȡ����
4. �ر��α�
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

ʹ���α��дһ��PL/SQL����Ҫ����ݿγ̱���ڿ���̨��ʾ��Щѧ��ѡ���˸ÿγ̡�

���񣺴�֮ǰ�����õ�ѧ����t_student��ѡ�޳ɼ���t_scgrade��ʹ���α�ȡ��ѧ����ѧ���������γ̱�źͳɼ�����Ϣ����ʾ�ڿ���̨��
��ʹ��FOR���ѭ���α꣩

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


-- �쳣
begin
  dbms_output.put_line('�쳣ǰ');
  dbms_output.put_line(10/0);
  dbms_output.put_line('�쳣��');
exception
  when zero_divide then
    dbms_output.put_line('����Ϊ0');
  when others then
    dbms_output.put_line('δ֪�쳣');
end;


-- ��ϵͳ�쳣
declare
   e_del_dept exception;
   pragma exception_init(e_del_dept, -02292);
begin
  delete from dept;
exception
  when e_del_dept then
    dbms_output.put_line('Լ���쳣');
end;


-- �Զ����쳣
declare
   e_outofrange exception;
   pragma exception_init(e_outofrange, -20000);
   v_sum number(5) := 0;
begin
   for v_num in 1..50 loop
     v_sum := v_sum + v_num;
     if v_sum > 100 then
       -- raise_application_error(-20000, '���̫����');
       raise e_outofrange;
     end if;
   end loop;  
exception
  when e_outofrange then
    dbms_output.put_line('Խ���쳣');
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
    dbms_output.put_line('�쳣');
end;


-- ������
create or replace trigger t_emp_trigger
before insert or update or delete
on t_emp
begin
  if (to_number(to_char(sysdate, 'hh24')) > 9 
    and to_number(to_char(sysdate, 'hh24')) < 18)
    or to_char(sysdate, 'day') in ('������', '������') then
    dbms_output.put_line('�쳣');
    raise_application_error(-20003, '�����쳣');
  end if;
end;

insert into t_emp(ename) values('qwer') ;

select * from t_emp; 


-- �д�����
create or replace trigger t_emprow_trigger
before insert or update or delete
on t_emp
for each row
begin
    dbms_output.put_line('����');    
end;

--

create or replace trigger t_emprow_trigger
before insert or update or delete
on t_emp
for each row
begin
    dbms_output.put_line(:new.ename);    
end;


-- ��������
-- ��
create table t_test2 (
       id number(10) primary key,
       name varchar(20)
);
-- ����
create sequence t_test2_seq;
-- ������
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
















