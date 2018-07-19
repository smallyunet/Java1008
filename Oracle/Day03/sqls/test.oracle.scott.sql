-- 插入一条完整的记录
SELECT * FROM t_class;
SELECT * FROM t_student;
INSERT INTO t_class VALUES('002','电子一班');
INSERT INTO t_student VALUES('0023','张三', '男', 23, 1234568901, '123@.com', '002');
-- 插入一条不完整的记录
INSERT INTO t_student(SNO, SNAME, SEX, TEL, CNO) VALUES('0022','李四', '女',  2234568901, '002');

-- 插入默认值
CREATE TABLE T_TEMP(
    id number(3) DEFAULT 1
);
INSERT INTO T_TEMP VALUES(DEFAULT);
SELECT * FROM T_TEMP;

-- 更新数据
UPDATE t_student SET birthday = 20, email = null;

-- 学号是21的学生的邮箱更新为...
UPDATE t_student SET email = '666@.com' WHERE sno = 21;

-- 删除记录     
DELETE FROM t_student WHERE sno = 23;
DELETE FROM t_student;