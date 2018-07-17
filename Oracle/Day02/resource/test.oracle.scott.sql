create table t_stu(
    sino varchar2(32),
    sname varchar2(20),
    sex char(2),
    age number(3),
    telephone number(13),
    email varchar2(20),
    cno varchar2(32)
);

-- 约束
create table t_stu2(
    sino varchar2(32) primary key,
    sname varchar2(20),
    sex char(2),
    age number(3),
    telephone number(13),
    email varchar2(20),
    cno varchar2(32)
);

insert into t_stu2(sino) values ('1');


-- 约束
create table t_class(
    sto varchar2(32) primary key,
    sname varchar2(20)
);

create table t_student(
    sto varchar2(32) primary key,
    sname varchar2(20),
    cno varchar2(32) references t_class(sto)
);

--------

create table t_student2(
    sno varchar2(32) primary key,
    sname varchar2(20) not null,
    sex char(2) check(sex in('男', '女')),
    age number(3),
    telephone number(13) check(lengh(telephone) <= 1),
    email varchar2(20) unique,
    cno varchar2(32) references t_class(sto)
);


---------

create table t_student3(
    sno varchar2(32),
    sname varchar(20) not null,
    sex char(2),
    age number(3),
    telephone number(13),
    email varchar2(20),
    cno varchar2(32),
    constraint pk_stu2_sno3 primary key(sno),
    constraint ck_stu2_phone check(length(telephone) <= 11),
    constraint uk_stu2_email unique(email),
    constraint fk_stu2_cno foreign key(cno) references t_class(sto)
);

-- 添加约束
alter table t_student2 add constraint pk_stu3_sno primary key(sno)
-- 添加非空约束
alter table t_student2 modify(sname not null)

alter table t_student2 add conostraint fk_sto3_cno foreign key(cno) references references t_class(cno);

-- 查看约束
select * from user_constraints where table_name='T_STUDENT3';

-- 删除约束
alter table table_name drop constaint fk_stu2_cno;


