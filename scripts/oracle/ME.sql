create table items( --tabella di nome items con:
item_id integer primary key, --item_id che ha dentro integer ed è la PK
status char, --status e ha dentro UN SOLO carattere
name varchar2(20), --name una stringa lunga al massimo 20
coder_id integer); -- coder_id con integer


create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

insert into items (item_id, status, name, coder_id) values(21,'P','Luci',50);

select*
from items;

alter table items add constraint items_status_ck check(status in ('A', 'B', 'K', 'X'));