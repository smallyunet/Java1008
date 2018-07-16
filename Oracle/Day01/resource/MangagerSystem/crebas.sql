/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2018/7/16 ÐÇÆÚÒ» 20:59:55                       */
/*==============================================================*/


alter table COLLEGE
   drop constraint FK_COLLEGE_SCHOOL_CO_SCHOOL;

alter table "COMMENT"
   drop constraint FK_COMMENT_STUDENT_C_TRAINEE;

alter table DATA
   drop constraint FK_DATA_STUDENT_D_TRAINEE;

alter table LOG
   drop constraint FK_LOG_STUDENT_L_TRAINEE;

alter table MAJOR
   drop constraint FK_MAJOR_COLLEGE_M_COLLEGE;

alter table ROLE
   drop constraint FK_ROLE_STUDENT_R_USER;

alter table ROLE_AUTH
   drop constraint FK_ROLE_AUT_ROLE_AUTH_ROLE;

alter table ROLE_AUTH
   drop constraint FK_ROLE_AUT_ROLE_AUTH_AUTH;

alter table SCHOOL
   drop constraint FK_SCHOOL_STUDENT_S_TRAINEE;

alter table STUDENT_WEEKLY
   drop constraint FK_STUDENT__STUDENT_W_TRAINEE;

alter table STUDENT_WEEKLY
   drop constraint FK_STUDENT__STUDENT_W_WEEKLY;

alter table TRAINEE
   drop constraint FK_TRAINEE_STUDENT_C_CLASS;

alter table TRAINEE
   drop constraint FK_TRAINEE_STUDENT_C_COMMENT;

alter table TRAINEE
   drop constraint FK_TRAINEE_STUDENT_S_SCHOOL;

alter table TRAINEE
   drop constraint FK_TRAINEE_STUDENT_U_USER;

alter table "USER"
   drop constraint FK_USER_STUDENT_R_ROLE;

alter table "USER"
   drop constraint FK_USER_STUDENT_U_TRAINEE;

drop table AUTH cascade constraints;

drop table CLASS cascade constraints;

drop index SCHOOL_COLLEGE_FK;

drop table COLLEGE cascade constraints;

drop index STUDENT_COMMENT2_FK;

drop table "COMMENT" cascade constraints;

drop index STUDENT_DATA_FK;

drop table DATA cascade constraints;

drop index STUDENT_LOG_FK;

drop table LOG cascade constraints;

drop index COLLEGE_MAJOR_FK;

drop table MAJOR cascade constraints;

drop index STUDENT_ROLE2_FK;

drop table ROLE cascade constraints;

drop index ROLE_AUTH2_FK;

drop index ROLE_AUTH_FK;

drop table ROLE_AUTH cascade constraints;

drop index STUDENT_SCHOOL2_FK;

drop table SCHOOL cascade constraints;

drop index STUDENT_WEEKLY2_FK;

drop index STUDENT_WEEKLY_FK;

drop table STUDENT_WEEKLY cascade constraints;

drop index STUDENT_USER_FK;

drop index STUDENT_COMMENT_FK;

drop index STUDENT_SCHOOL_FK;

drop index STUDENT_CLASS_FK;

drop table TRAINEE cascade constraints;

drop index STUDENT_ROLE_FK;

drop index STUDENT_USER2_FK;

drop table "USER" cascade constraints;

drop table WEEKLY cascade constraints;

/*==============================================================*/
/* Table: AUTH                                                  */
/*==============================================================*/
create table AUTH 
(
   AUTH_ID              INTEGER              not null,
   AUTH_NAME            VARCHAR2(20),
   AUTH_URL             VARCHAR2(50),
   AUTH_MENU            NUMBER(4),
   constraint PK_AUTH primary key (AUTH_ID)
);

/*==============================================================*/
/* Table: CLASS                                                 */
/*==============================================================*/
create table CLASS 
(
   CLASS_ID             INTEGER              not null,
   CLASS_DIRECTION      VARCHAR2(20),
   CLASS_START_TIME     NUMBER(20),
   CLASS_END_TIME       NUMBER(20),
   CLASS_TYEP           VARCHAR2(10),
   CLASS_NUMBER         NUMBER(10),
   CLASS_TEACHER        VARCHAR2(5),
   CLASS_MANAGER        VARCHAR2(5),
   CLASS_ADMIN          VARCHAR2(5),
   CLASS_REMARKS        VARCHAR2(50),
   constraint PK_CLASS primary key (CLASS_ID)
);

/*==============================================================*/
/* Table: COLLEGE                                               */
/*==============================================================*/
create table COLLEGE 
(
   COLLEGE_ID           INTEGER              not null,
   SCHOOL_ID            INTEGER              not null,
   COLLEGE_NAME         VARCHAR2(10),
   COLLEGE_MANAGER      VARCHAR2(10),
   constraint PK_COLLEGE primary key (COLLEGE_ID)
);

/*==============================================================*/
/* Index: SCHOOL_COLLEGE_FK                                     */
/*==============================================================*/
create index SCHOOL_COLLEGE_FK on COLLEGE (
   SCHOOL_ID ASC
);

/*==============================================================*/
/* Table: "COMMENT"                                             */
/*==============================================================*/
create table "COMMENT" 
(
   COMMENT_ID           INTEGER              not null,
   STUDENT_ID           INTEGER              not null,
   COMMENT_CONTENT      VARCHAR2(500),
   COMMENT_GRADE        VARCHAR2(50),
   COMMENT_MANAGER      VARCHAR2(20),
   COMMENT_TIME         NUMBER(20),
   constraint PK_COMMENT primary key (COMMENT_ID)
);

/*==============================================================*/
/* Index: STUDENT_COMMENT2_FK                                   */
/*==============================================================*/
create index STUDENT_COMMENT2_FK on "COMMENT" (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Table: DATA                                                  */
/*==============================================================*/
create table DATA 
(
   DATA_ID              INTEGER              not null,
   STUDENT_ID           INTEGER              not null,
   DATA_CONTENT         VARCHAR2(500),
   DATA_PICTURE         VARCHAR2(500),
   DATA_UPLOADER        VARCHAR2(20),
   constraint PK_DATA primary key (DATA_ID)
);

/*==============================================================*/
/* Index: STUDENT_DATA_FK                                       */
/*==============================================================*/
create index STUDENT_DATA_FK on DATA (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Table: LOG                                                   */
/*==============================================================*/
create table LOG 
(
   LOG_ID               INTEGER              not null,
   STUDENT_ID           INTEGER              not null,
   LOG_TIME             NUMBER(20),
   LOG_CONTENT          VARCHAR2(500),
   LOG_PROBLEM          VARCHAR2(500),
   constraint PK_LOG primary key (LOG_ID)
);

/*==============================================================*/
/* Index: STUDENT_LOG_FK                                        */
/*==============================================================*/
create index STUDENT_LOG_FK on LOG (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Table: MAJOR                                                 */
/*==============================================================*/
create table MAJOR 
(
   MAJOR_ID             INTEGER              not null,
   COLLEGE_ID           INTEGER              not null,
   MAJOR_NAME           VARCHAR2(10),
   MAJOR_INFO           VARCHAR2(50),
   constraint PK_MAJOR primary key (MAJOR_ID)
);

/*==============================================================*/
/* Index: COLLEGE_MAJOR_FK                                      */
/*==============================================================*/
create index COLLEGE_MAJOR_FK on MAJOR (
   COLLEGE_ID ASC
);

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE 
(
   ROLE_ID              INTEGER              not null,
   USER_ID              INTEGER              not null,
   ROLE_NAME            VARCHAR2(20),
   constraint PK_ROLE primary key (ROLE_ID)
);

/*==============================================================*/
/* Index: STUDENT_ROLE2_FK                                      */
/*==============================================================*/
create index STUDENT_ROLE2_FK on ROLE (
   USER_ID ASC
);

/*==============================================================*/
/* Table: ROLE_AUTH                                             */
/*==============================================================*/
create table ROLE_AUTH 
(
   ROLE_ID              INTEGER              not null,
   AUTH_ID              INTEGER              not null,
   constraint PK_ROLE_AUTH primary key (ROLE_ID, AUTH_ID)
);

/*==============================================================*/
/* Index: ROLE_AUTH_FK                                          */
/*==============================================================*/
create index ROLE_AUTH_FK on ROLE_AUTH (
   ROLE_ID ASC
);

/*==============================================================*/
/* Index: ROLE_AUTH2_FK                                         */
/*==============================================================*/
create index ROLE_AUTH2_FK on ROLE_AUTH (
   AUTH_ID ASC
);

/*==============================================================*/
/* Table: SCHOOL                                                */
/*==============================================================*/
create table SCHOOL 
(
   SCHOOL_ID            INTEGER              not null,
   STUDENT_ID           INTEGER              not null,
   SCHOOL_NAME          VARCHAR2(10),
   SCHOOL_MANAGER       VARCHAR2(10),
   SCHOOL_PHONENO       INTEGER,
   SCHOOL_INFO          VARCHAR2(50),
   constraint PK_SCHOOL primary key (SCHOOL_ID)
);

/*==============================================================*/
/* Index: STUDENT_SCHOOL2_FK                                    */
/*==============================================================*/
create index STUDENT_SCHOOL2_FK on SCHOOL (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Table: STUDENT_WEEKLY                                        */
/*==============================================================*/
create table STUDENT_WEEKLY 
(
   STUDENT_ID           INTEGER              not null,
   WEEKLY_ID            INTEGER              not null,
   constraint PK_STUDENT_WEEKLY primary key (STUDENT_ID, WEEKLY_ID)
);

/*==============================================================*/
/* Index: STUDENT_WEEKLY_FK                                     */
/*==============================================================*/
create index STUDENT_WEEKLY_FK on STUDENT_WEEKLY (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Index: STUDENT_WEEKLY2_FK                                    */
/*==============================================================*/
create index STUDENT_WEEKLY2_FK on STUDENT_WEEKLY (
   WEEKLY_ID ASC
);

/*==============================================================*/
/* Table: TRAINEE                                               */
/*==============================================================*/
create table TRAINEE 
(
   STUDENT_ID           INTEGER              not null,
   COMMENT_ID           INTEGER,
   SCHOOL_ID            INTEGER,
   CLASS_ID             INTEGER              not null,
   USER_ID              INTEGER,
   STUDENT_NAME         VARCHAR2(5),
   STUDENT_GENDER       VARCHAR2(3),
   STUDENT_BIRTHDAY     NUMBER(11),
   STUDENT_YEAR         INTEGER,
   STUDENT_CLASS        INTEGER,
   STUDENT_DIRECTION    VARCHAR2(10),
   STUDENT_BIRTHPLACE   NUMBER(11),
   STUDENT_NATIVEPLACE  VARCHAR2(20),
   STUDENT_PHONENO      INTEGER,
   STUDENT_QQ           INTEGER,
   STUDENT_POSITION     VARCHAR2(20),
   STUDENT_STATUS       VARCHAR2(50),
   STUDENT_PROJECT      VARCHAR2(50),
   STUDENT_AWARD        VARCHAR2(50),
   STUDENT_PRATICE      VARCHAR2(50),
   STUDENT_HOBBY        VARCHAR2(50),
   STUDENT_GOAL         VARCHAR2(50),
   STUDENT_CUSTOM_GOAL  VARCHAR2(50),
   STUDENT_REMARKS      VARCHAR2(50),
   constraint PK_TRAINEE primary key (STUDENT_ID)
);

/*==============================================================*/
/* Index: STUDENT_CLASS_FK                                      */
/*==============================================================*/
create index STUDENT_CLASS_FK on TRAINEE (
   CLASS_ID ASC
);

/*==============================================================*/
/* Index: STUDENT_SCHOOL_FK                                     */
/*==============================================================*/
create index STUDENT_SCHOOL_FK on TRAINEE (
   SCHOOL_ID ASC
);

/*==============================================================*/
/* Index: STUDENT_COMMENT_FK                                    */
/*==============================================================*/
create index STUDENT_COMMENT_FK on TRAINEE (
   COMMENT_ID ASC
);

/*==============================================================*/
/* Index: STUDENT_USER_FK                                       */
/*==============================================================*/
create index STUDENT_USER_FK on TRAINEE (
   USER_ID ASC
);

/*==============================================================*/
/* Table: "USER"                                                */
/*==============================================================*/
create table "USER" 
(
   USER_ID              INTEGER              not null,
   ROLE_ID              INTEGER,
   STUDENT_ID           INTEGER              not null,
   USER_REAL_NAME       NUMBER(20),
   USER_NAME            VARCHAR2(10),
   USER_PASSWARD        VARCHAR2(20),
   USER_DEPARTMENT      VARCHAR2(20),
   constraint PK_USER primary key (USER_ID)
);

/*==============================================================*/
/* Index: STUDENT_USER2_FK                                      */
/*==============================================================*/
create index STUDENT_USER2_FK on "USER" (
   STUDENT_ID ASC
);

/*==============================================================*/
/* Index: STUDENT_ROLE_FK                                       */
/*==============================================================*/
create index STUDENT_ROLE_FK on "USER" (
   ROLE_ID ASC
);

/*==============================================================*/
/* Table: WEEKLY                                                */
/*==============================================================*/
create table WEEKLY 
(
   WEEKLY_ID            INTEGER              not null,
   WEEKLY_CONTENT       VARCHAR2(500),
   WEEKLY_UPLOADER      VARCHAR2(20),
   WEEKLY_TIME          NUMBER(20),
   constraint PK_WEEKLY primary key (WEEKLY_ID)
);

alter table COLLEGE
   add constraint FK_COLLEGE_SCHOOL_CO_SCHOOL foreign key (SCHOOL_ID)
      references SCHOOL (SCHOOL_ID);

alter table "COMMENT"
   add constraint FK_COMMENT_STUDENT_C_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

alter table DATA
   add constraint FK_DATA_STUDENT_D_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

alter table LOG
   add constraint FK_LOG_STUDENT_L_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

alter table MAJOR
   add constraint FK_MAJOR_COLLEGE_M_COLLEGE foreign key (COLLEGE_ID)
      references COLLEGE (COLLEGE_ID);

alter table ROLE
   add constraint FK_ROLE_STUDENT_R_USER foreign key (USER_ID)
      references "USER" (USER_ID);

alter table ROLE_AUTH
   add constraint FK_ROLE_AUT_ROLE_AUTH_ROLE foreign key (ROLE_ID)
      references ROLE (ROLE_ID);

alter table ROLE_AUTH
   add constraint FK_ROLE_AUT_ROLE_AUTH_AUTH foreign key (AUTH_ID)
      references AUTH (AUTH_ID);

alter table SCHOOL
   add constraint FK_SCHOOL_STUDENT_S_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

alter table STUDENT_WEEKLY
   add constraint FK_STUDENT__STUDENT_W_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

alter table STUDENT_WEEKLY
   add constraint FK_STUDENT__STUDENT_W_WEEKLY foreign key (WEEKLY_ID)
      references WEEKLY (WEEKLY_ID);

alter table TRAINEE
   add constraint FK_TRAINEE_STUDENT_C_CLASS foreign key (CLASS_ID)
      references CLASS (CLASS_ID);

alter table TRAINEE
   add constraint FK_TRAINEE_STUDENT_C_COMMENT foreign key (COMMENT_ID)
      references "COMMENT" (COMMENT_ID);

alter table TRAINEE
   add constraint FK_TRAINEE_STUDENT_S_SCHOOL foreign key (SCHOOL_ID)
      references SCHOOL (SCHOOL_ID);

alter table TRAINEE
   add constraint FK_TRAINEE_STUDENT_U_USER foreign key (USER_ID)
      references "USER" (USER_ID);

alter table "USER"
   add constraint FK_USER_STUDENT_R_ROLE foreign key (ROLE_ID)
      references ROLE (ROLE_ID);

alter table "USER"
   add constraint FK_USER_STUDENT_U_TRAINEE foreign key (STUDENT_ID)
      references TRAINEE (STUDENT_ID);

