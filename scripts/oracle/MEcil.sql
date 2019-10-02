DROP TABLE TRAINEERS;
DROP TABLE COURSES;
DROP SEQUENCE traineers_seq;
DROP SEQUENCE courses_seq;


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
    email VARCHAR2(40)
        constraint trainee_email unique,
    phone_number integer
        constraint trainee_phone unique,
    courses_id integer
        constraint traineer_course_id_fk references courses(courses_id) on delete set null,
    constraint traineers_name_uq unique(first_name, last_name));

create sequence traineers_seq START WITH 1000;
create sequence courses_seq START WITH 100;

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Birreristica', 'Pavia');

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Risottistica', 'Milano');

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Arancinistica', 'Palermo');

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Gondolieria', 'Venezia');

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Pizza', 'Napoli');

insert into courses(courses_id, name, city)
values (courses_seq.nextval,'Mozzarellistica', 'Salerno');

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Luciana', 'Uggetti', 'luciana.uggetti@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 103);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Zhanao', 'Wu', 'zhanao.wu@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 101);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Ilaria', 'Maggiolino', 'ilaria.maggiolino@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 103);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Chiara', 'Saporito', 'chiara.saporito@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval,  105);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Antonino', 'Scarfone',  'antonino.scarfone@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 102);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Marco', 'Blanco',  'marco.blanco@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 102);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Giovanni', 'Maggi',  'giovanni.maggi@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 100);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Sergio', 'Evangelista',  'sergio.evangelista@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 100);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Paolo', 'Riva',  'paolo.riva@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 101);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Edoardo', 'Errani',  'edoardo.errani@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 104);

insert into traineers
values (TRAINEERS_SEQ.nextval, 'Alessandro', 'Armato',  'alessandro.armato@accenture.it', 3920000000 + TRAINEERS_SEQ.nextval, 104);


Commit;


create or replace view phones_view as
    select first_name, last_name, phone_number
    from hr.employees
    where employee_id not in ( select manager_id from HR.employees where manager_id is not null)
    with read only;
    
select *
from phones_view;



drop view phone_view;