-- ����һ�������ļ�¼
SELECT * FROM t_class;
SELECT * FROM t_student;
INSERT INTO t_class VALUES('002','����һ��');
INSERT INTO t_student VALUES('0023','����', '��', 23, 1234568901, '123@.com', '002');
-- ����һ���������ļ�¼
INSERT INTO t_student(SNO, SNAME, SEX, TEL, CNO) VALUES('0022','����', 'Ů',  2234568901, '002');

-- ����Ĭ��ֵ
CREATE TABLE T_TEMP(
    id number(3) DEFAULT 1
);
INSERT INTO T_TEMP VALUES(DEFAULT);
SELECT * FROM T_TEMP;

-- ��������
UPDATE t_student SET birthday = 20, email = null;

-- ѧ����21��ѧ�����������Ϊ...
UPDATE t_student SET email = '666@.com' WHERE sno = 21;

-- ɾ����¼     
DELETE FROM t_student WHERE sno = 23;
DELETE FROM t_student;