-- �� ��Ѱ
select * from emp
where deptno = (
    select deptno
    from emp where ename = 'SCOTT'
);

select empno, ename, job from emp 
where deptno = (
    select deptno
    from dept
    where dname = 'RESEARCH'
);

-- ����һ��������SCOTT������ͬ������Ա����Ϣ��
select * from emp;
select * from dept;

select * from emp
where job = (
    select job from emp where ename = 'SCOTT'
);

-- �����������������SCOTT��Ա����ͬ���ʵ�Ա����Ϣ��������ʾSCOTT����ʾ�ֶΣ�Ա���š�Ա���������ʡ�
select * from emp 
where sal = (
    select sal from emp where ename = 'SCOTT'
) and ename != 'SCOTT';

-- ����������emp���У���ѯ���Ȳ�����߹��ʣ�Ҳ������͹��ʵ�Ա����Ϣ
select * from emp 
where sal between (
    select min(sal) from emp
) and (
    select max(sal) from emp
);

-- �����ģ���ѯ�����ʵ�������Ա��ƽ�����ʵ�Ա�������͹��ʣ����չ��ʸߵͽ�������
select ename, sal from emp
where sal < (
    select avg(sal) from emp
) order by sal desc;

-- 
select deptno, avg(sal) avgsal
from emp
group by deptno
having avg(sal)<(
    select max(avg(sal)) from emp group by deptno
    );

-- ����һ����ѧ��ѡ�޳ɼ���t_scgrade��ѯ���γ�ƽ���ɼ����ڿγ����ƽ��ֵ�Ŀγ̱�ź�ƽ���ɼ���
select no, avg(grade) from t_scgrade 
where (
    select avg(grade) from t_scgrade
) < (
    select max(avg(grade)) from t_scgrade
) group by no, grade;

-- ���������HR�û�ģʽ�²�ѯ��ʾ��������͹��ʱ�100�Ų�����͹���Ҫ�ߵĲ��ű���Լ���������͹���
select no, avg(sal) from emp
where (
    select min(sal) from emp
) > (
    select min(sal) from emp where dpt = 100
) group by no, sal;

-- 
select ename, sal from emp where sal in(
    select 
    from emp
    where deptno = (
        select deptno from dept where dname = 'SALES'
    )
);

-- ����һ�� �г�����������Ա�������в�����Ϣ
-- ÿ�������м���Ա��
select e.deptno, d.dname, count(e.ename) from dept d join emp e on d.deptno = e.deptno
group by e.deptno, d.dname
having count(e.ename) > 3;

-- ���������HR�û�ģʽ�²�ѯ�������κ�һ��������͹�����ȵĹ�Ա����,����

select * from emp where sal in (
    select min(sal) from emp
    group by deptno
);

-- ��������ʹ��SQL��׼Ƕ���Ӳ�ѯ��ѯѡ���˿γ�����Ϊ��Oracle����ѧ��ѧ�ź�������

select ename, sal from emp where sal > all(
select avg(sal)
from emp
group by deptno);

--

select * from emp
where sal > all(
    select sal from emp where deptno = 20
);

select e.*
from emp e
where exists (
    select deptno
    from dept d
    where e.deptno = d.deptno and d.dname = 'SALES'
);

select * from emp;
select * from dept;

-- other

select * from (
    select a.*, rownum rn from (
        select e.* from emp e order by sal desc
    ) a
) b where b.rn > 5 and b.rn <= 10;

-- (ҳ�� - 1) * count     ҳ��*count

-- ����
select ename, sal, job from emp where sal > 2500
union
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
union all
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
intersect
select ename, sal, job from emp where job = 'MANAGER';

select ename, sal, job from emp where sal > 2500
minus
select ename, sal, job from emp where job = 'MANAGER';













