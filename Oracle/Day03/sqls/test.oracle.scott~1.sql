insert into t_class values(100, '����һ��');
insert into t_class values(200, '���Ŷ���');
insert into t_class values(300, '��������');

select * from t_class;
select * from t_student;

insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (111, '����1', '��', 66, 1548645441, '131@.com', 21);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (101, '����1', '��', 66, 1594845144, '112@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (102, '����1', '��', '66', 1594645144, '114@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (103, '����1', '��', '66', 1594645144, '115@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (104, '����1', '��', '66', 1594845144, '116@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (105, '����1', '��', '66', 1594845144, '117@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (106, '����1', '��', '66', 1594645144, '118@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (107, '����1', '��', '66', 1594645144, '119@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (108, '����1', '��', 66, 1594864144, '120@.com', 100);
insert into t_student(sno, sname, sex, birthday, tel, email, cno) values (109, '����1', '��', '66', 1594845144, '121@.com', 100);

insert into t_course values (123, '��������', '555', 76, 'eqrqer');
insert into t_course values (124, '��������', '555', 76, 'eqrqer');
insert into t_course values (125, '��������', '555', 76, 'eqrqer');
insert into t_course values (126, '��������', '555', 76, 'eqrqer');
insert into t_course values (127, '��������', '555', 76, 'eqrqer');

-- ����һ��
alter table t_student add(birthday2 date);

insert into t_student values ('26', 'aasfds', 'ad', 56, 1548, 'saas', 21, sysdate);
insert into t_student values ('255', 'aasfds', 'ad', 56, 1548, 'sallas', 21, to_date('2018-7-11', 'yyyy-mm-dd'));



create table t_emp as select * from emp;

delete from t_emp;

select * from t_emp;

-- ��������
create sequence sec_t_emp2 increment by 1 start with 1 maxvalue 9 nocycle nocache;
-- ��ȡ��ǰֵ
select sec_t_emp2.currval from dual;
select sec_t_emp2.nextval from dual;

-- create primart key
select * from t_emp;
insert into t_emp(empno, ename) values(sec_t_emp2.nextval, 'aaa'||sec_t_emp2.nextval);




