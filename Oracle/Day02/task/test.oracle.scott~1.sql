-- 任务一：创建学生表t_student（学号sno，姓名sname，性别sex，出生日期birthday，电话号码tel，电子邮箱email, 班号cno） 
-- 添加约束：学号为主键，姓名：不为空， 电话号码长度要检查约束，电子邮箱唯一约束

create table t_student(
    sno number(11) primary key,
    sname varchar2(15) not null,
    sex varchar(2),
    birthday number(20),
    tel number(20),
    email varchar(20),
    cno number(20),
    constraint ck_stu_tel check(length(tel)<11),
    constraint uk_stu_email unique(email)
);

-- 任务二：创建课程表t_course（课程编号cno，课程名称cname，学分credit，学时hours,授课老师teacher）

create table t_course(
    cno number(11) primary key,
    cname varchar2(15) not null,
    credit number(11),
    hours number(11),
    teacher varchar2(15)
);

-- 任务三：创建学生选课成绩表t_scgrade（学号sno，课程编号cno，成绩grade）
-- 学号和课程编号是联合主键，学号和课程表都是外键

create table t_scgrade(
    sno number(11),
    cno  number(11),
    grade  number(11),
    constraint pk_stu_sno_cno primary key(sno, cno),
    constraint fk_stu_sno foreign key(sno) references t_student(sno),
    constraint fk_stu_cno foreign key(cno) references t_course(cno)
);

-- 任务四：创建班级表t_class（班号cno，班级名称cname），给上面建好的学生表的列cno添加外键约束。

create table t_class(
    cno number(11) primary key,
    cname varchar2(15),
    constraint fk_cls_cno foreign key(cno) references t_student(sno)
);
