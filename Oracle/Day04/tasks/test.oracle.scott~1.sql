-- ����1����ʾ�������С� %N%���Ĺ�Ա
select * from emp where ename like ' %N%';
-- ����2����ʾ������û��'L'�ֵ�Ա������ϸ��Ϣ����'SM'�ֵ�Ա����Ϣ
select * from emp where ename like '%L%' or ename like '%SM%';
-- ����3����ѯ����Ϊ��ALLEN�������߹���Ϊ��ANALYST
select * from emp where ename = 'ALLEN' or ename = 'ANALYST';
-- ����4  ��ʾ10 �Ų��ŵ����о���('MANAGER')��20�Ų��ŵ�����ְԱ('CLERK')����ϸ��Ϣ
select mgr, ename from emp where deptno in(10, 20);
-- ����5: �������źż��䱾���ŵ���͹��ʣ���������͹��ʽ�������
select deptno, min(sal) from emp group by deptno, sal order by sal desc;
-- ����6:�г����нˮ����2500�ĸ�����������
select deptno, count(deptno) from (select * from emp where sal > 2500) group by deptno;
-- ����7:��ѯ�ɼ���70~80��֮���ѧ��ѡ�ε÷����
-- ����8 �г�ÿ��ѡ�޿ε�ƽ���ɼ�������ÿ�ſ�ƽ���ɼ��������С�
-- ����9 ͳ��ÿ�ſμ��������