-- ��ֵ����
select *
from emp e, dept d
where e.deptno = d.deptno;

select * from emp;
select * from dept;

select *
from emp e, dept d 
where e.deptno = d.deptno and e.deptno = 10;

select * from emp e, dept d where d.dname = 'SALES' and e.deptno = d.deptno;
select * from emp e, dept d where e.deptno = 20 and e.deptno = d.deptno;
select avg(sal) from emp e, dept d where e.deptno = 20 and e.deptno = d.deptno group by sal;

select * from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- ����1��  ��ѯ10�Ų��Ź���С��2000��Ա�������������ʼ����ʵȼ���
select * from emp e, salgrade s 
where e.sal < 2000 and e.sal between s.losal and s.hisal and e.deptno = 10; 

-- ����2����ѯ���ʵȼ����ڵ��ļ����Ա����������
select * from emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 4;

-- ������
select *
from emp e 
inner join dept d 
on e.deptno = d.deptno;

-- ����1 ����������CLERK������Ա�����������ڲ������ơ�
select * from emp e inner join dept d on e.deptno = d.deptno and e.job = 'CLERK';

-- �����źţ�deptno�� �� ���ʣ�sal�����������˾��Ա����Ϣ��Ҫ���źŴӴ�С �����ź���ͬ�İ������ɵ͵��ߣ�����ʾ���ֶ�Ϊ��Ա���š�Ա�����������ʡ��������ơ�

select * from emp e inner join dept d on e.deptno = d.deptno order by e.deptno desc, e.sal;

-- ������
select * from emp e1 inner join emp e2 on e1.mgr = e2.empno and e1.ename = 'BLAKE';

-- ��������
select * 
from emp e left outer join dept d on e.deptno = d.deptno;

select * from dept d left join emp e on e.deptno = d.deptno;

select * from emp e, dept d where e.deptno(+) = d.deptno;

select * from dept d right join emp e on d.deptno = e.deptno;

select * from dept d, emp e where d.deptno(+) = e.deptno;

select * from dept d full join emp e on d.deptno = e.deptno;

-- ����ͳ��ÿ�����ŵ�Ա������,��ʾ���źţ��������ƣ�Ա������
select d.deptno, d.dname, count(e.ename)
from emp e inner join dept d on e.deptno = d.deptno
group by d.deptno, d.dname;
-- ����ʹ����ȫ������ͳ��ÿ�����ŵ�Ա��������
select e.deptno, count(e.deptno) from emp e full join dept d on e.deptno = d.deptno group by e.deptno;
-- ����  ��ѯû��Ա���Ĳ�����Ϣ
select * from dept d left join emp e on d.deptno = e.deptno where e.deptno is null;

