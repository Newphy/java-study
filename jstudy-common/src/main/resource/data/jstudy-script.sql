/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/3/13 11:19:03                           */
/*==============================================================*/


drop table if exists JS_PERSON;

/*==============================================================*/
/* Table: JS_PERSON                                             */
/*==============================================================*/
create table JS_PERSON
(
   id                   bigint not null auto_increment,
   name                 varchar(200) not null,
   age                  int,
   gender               smallint,
   telephone            varchar(200),
   email                varchar(255),
   address              varchar(255),
   primary key (id)
);

