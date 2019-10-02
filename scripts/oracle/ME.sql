DROP TABLE TRAINEERS;
DROP TABLE COURSES;

create table COURSES (
    courses_id integer
        constraint courses_pk primary key,
    name varchar2(20)
        constraint detail_name_uq unique,
    city varchar2(20));


create table TRAINEERS (
    traineer_id integer
        constraint traineer_pk primary key,
    first_name varchar2(20),
    last_name varchar2(20),
    courses_id integer
        constraint traineer_course_id_fk references courses(courses_id) on delete set null,   
    constraint traineers_name_uq unique(first_name, last_name));


insert into courses(courses_id, name, city)
values (1,'Birreristica', 'Pavia');

insert into courses(courses_id, name, city)
values (2,'Risottistica', 'Milano');

insert into courses(courses_id, name, city)
values (3,'Arancinistica', 'Palermo');

insert into courses(courses_id, name, city)
values (4,'Gondolieria', 'Venezia');

insert into courses(courses_id, name, city)
values (5,'Pizza', 'Napoli');

insert into courses(courses_id, name, city)
values (6,'Mozzarellistica', 'Salerno');

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10001, 'Luciana', 'Uggetti', 4);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10002, 'Zhanao', 'Wu', 2);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10003, 'Ilaria', 'Maggiolino',4);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10004, 'Chiara', 'Saporito', 6);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10005, 'Antonino', 'Scarfone', 3);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10006, 'Marco', 'Blanco', 3);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10007, 'Giovanni', 'Maggi', 1);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10008, 'Sergio', 'Evangelista', 1);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10009, 'Paolo', 'Riva', 2);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10010, 'Edoardo', 'Errani', 5);

insert into traineers(traineer_id, first_name, last_name, courses_id)
values (10011, 'Alessandro', 'Armato', 5);


Commit;