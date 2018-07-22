-- 实习生
create table TRAINEE(
	TRAINEE_ID Integer primary key,
	TRAINEE_NAME varchar2(5),
	TRAINEE_GENDER varchar2(3),
	TRAINEE_BIRTHDAY Number(11),
	TRAINEE_YEAR Integer,
	TRAINEE_CLASS Integer,
	TRAINEE_DIRECTION varchar2(10),
	TRAINEE_BIRTHPLACE Number (11),
	TRAINEE_NATIVEPLACE varchar2(20),
	TRAINEE_PHONENO Integer,
	TRAINEE_QQ Integer,
	TRAINEE_POSITION varchar2(20),
	TRAINEE_STATUS varchar2(50),
	TRAINEE_PROJECT varchar2(50),
	TRAINEE_AWARD varchar2(50),
	TRAINEE_PRATICE varchar2(50),
	TRAINEE_HOBBY varchar2(50),
	TRAINEE_GOAL varchar2(50),
	TRAINEE_CUSTOM_GOAL varchar2(50),
	TRAINEE_REMARKS varchar2(50)
);

-- 实习班级
create table CLASS(
	CLASS_ID Integer primary key,
	CLASS_DIRECTION varchar2(20),
	CLASS_START_TIME Number(20),
	CLASS_END_TIME Number(20),
	CLASS_TYEP varchar2(10),
	CLASS_NUMBER Number(10),
	CLASS_TEACHER varchar2(5),
	CLASS_MANAGER varchar2(5),
	CLASS_ADMIN varchar2(5),
	CLASS_REMARKS varchar2(50)
);

-- 学校
create table SCHOOL(
	SCHOOL_ID Integer primary key,
	SCHOOL_NAME varchar2(10)，
	SCHOOL_MANAGER varchar2(10)，
	SCHOOL_PHONENO Integer，
	SCHOOL_INFO varchar2(50)
);

-- 院校
create table COLLEGE(
	COLLEGE_ID Integer primary key,
	COLLEGE_NAME varchar2(10),
	COLLEGE_MANAGER varchar2(10)
);

-- 院系
create table DEPARTMENT(
	DEPARTMENT_ID Integer primary key,
	DEPARTMENT_NAME varchar2(10)
);

-- 专业
create table MAJOR(
	MAJOR_ID Integer primary key,
	MAJOR_NAME varchar2(10),
	MAJOR_INFO varchar2(50)
);

-- 实习日志
create table LOG(
	LOG_ID Integer primary key,
	LOG_TIME Number (20),
	LOG_CONTENT varchar2(500),
	LOG_PROBLEM varchar2(500)
);

-- 实习评价
create table COMMENTS(
	COMMENTS_ID Integer primary key,
	COMMENTS_CONTENT varchar2(500),
	COMMENTS_GRADE varchar2(50),
	COMMENTS_MANAGER varchar2(20),
	COMMENTS_TIME Number (20)
);

-- 实习资料
create table DATA(
	DATA_ID Integer primary key,
	DATA_CONTENT varchar2(500),
	DATA_PICTURE varchar2(500),
	DATA_UPLOADER varchar2(20)
);

-- 实习周报
create table WEEKLY(
	WEEKLY_ID Integer primary key,
	WEEKLY_CONTENT varchar2(500),
	WEEKLY_UPLOADER varchar2(20),
	WEEKLY_TIME Number(20)
);

-- 用户
create table USERS(
	USERS_ID	Integer primary key,
	USERS_REAL_NAME Number (20),
	USERS_NAME varchar2(10),
	USERS_PASSWARD varchar2(20),
	USERS_DEPARTMENT varchar2(20)
);

-- 大学班级
create table COLLEGE_CLASS(
	COLLEGE_CLASS_ID Integer primary key,
	COLLEGE_CLASS_TRAINEE_ID Integer
);

-- 角色
create table ROLE(
	ROLE_ID Integer primary key,
	ROLE_NAME varchar2(20)
);

-- 权限
create table AUTH(
	AUTH_ID Integer primary key,
	AUTH_NAME varchar2(20),
	AUTH_URL varchar2(50),
	AUTH_MENU Number (4)
);
