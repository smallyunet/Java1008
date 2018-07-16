/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2018/7/16 星期一 11:59:13                       */
/*==============================================================*/


alter table STUDENT
   drop constraint FK_STUDENT_CLASS_STU_CLASS;

alter table STUDENT_COURSE
   drop constraint FK_STUDENT__STUDENT_C_STUDENT;

alter table STUDENT_COURSE
   drop constraint FK_STUDENT__STUDENT_C_COURSE;

drop table CLASS cascade constraints;

drop table COURSE cascade constraints;

drop index CLASS_STUDENT_FK;

drop table STUDENT cascade constraints;

drop index STUDENT_COURSE2_FK;

drop index STUDENT_COURSE_FK;

drop table STUDENT_COURSE cascade constraints;

/*==============================================================*/
/* Table: CLASS                                                 */
/*==============================================================*/
create table CLASS 
(
   CNO                  VARCHAR2(32)         not null,
   constraint PK_CLASS primary key (CNO)
);

/*==============================================================*/
/* Table: COURSE                                                */
/*==============================================================*/
create table COURSE 
(
   CID                  VARCHAR2(12)         not null,
   CONAME               VARCHAR2(20),
   constraint PK_COURSE primary key (CID)
);

comment on table COURSE is
'课程实体';

/*==============================================================*/
/* Table: STUDENT                                               */
/*==============================================================*/
create table STUDENT 
(
   SNO                  NUMBER(20)           not null,
   CNO                  VARCHAR2(32)         not null,
   CNAME                VARCHAR2(32),
   SEX                  VARCHAR2(2),
   AGE                  NUMBER(3),
   constraint PK_STUDENT primary key (SNO)
);

/*==============================================================*/
/* Index: CLASS_STUDENT_FK                                      */
/*==============================================================*/
create index CLASS_STUDENT_FK on STUDENT (
   CNO ASC
);

/*==============================================================*/
/* Table: STUDENT_COURSE                                        */
/*==============================================================*/
create table STUDENT_COURSE 
(
   SNO                  NUMBER(20)           not null,
   CID                  VARCHAR2(12)         not null,
   constraint PK_STUDENT_COURSE primary key (SNO, CID)
);

/*==============================================================*/
/* Index: STUDENT_COURSE_FK                                     */
/*==============================================================*/
create index STUDENT_COURSE_FK on STUDENT_COURSE (
   SNO ASC
);

/*==============================================================*/
/* Index: STUDENT_COURSE2_FK                                    */
/*==============================================================*/
create index STUDENT_COURSE2_FK on STUDENT_COURSE (
   CID ASC
);

alter table STUDENT
   add constraint FK_STUDENT_CLASS_STU_CLASS foreign key (CNO)
      references CLASS (CNO);

alter table STUDENT_COURSE
   add constraint FK_STUDENT__STUDENT_C_STUDENT foreign key (SNO)
      references STUDENT (SNO);

alter table STUDENT_COURSE
   add constraint FK_STUDENT__STUDENT_C_COURSE foreign key (CID)
      references COURSE (CID);

