drop sequence coders_seq;
create sequence coders_seq start with 201;

insert into coders
values(coders_seq.nextval, 'Maria', 'Rossi', sysdate, 5000);

insert into coders
values(coders_seq.nextval, 'Franco', 'Bianchi', sysdate, 4500);


UPDATE coders
set first_name= 'Mariangela'
where coder_id=201;

UPDATE coders
set salary= salary + 500
where salary < 6000;

DELETE from coders where first_name='Franco' and last_name='Bianchi';

COMMIT;