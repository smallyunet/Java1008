use mldn;
drop table if exists user;
create table user(
    userid varchar(30) primary key,
    name varchar(30) not null,
    password varchar(32) not null
);
insert into user (userid,name,password) values ('admin','administrator','admin');