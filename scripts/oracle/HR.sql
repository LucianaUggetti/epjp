describe regions;
-- stampa commissione annuale solo per chi ce l'ha

SELECT 12 * salary * commission_pct as "annual commission "
FROM employees
where employee_id=145;

SELECT 12 * salary * commission_pct as "annual commission"
FROM employees
WHERE first_name= 'John' and last_name='Russell';
--così trovo quanti dipendenti ho
select COUNT(rowid)
FROM EMPLOYEES;
--voglio sapere quanti manager ho=>
SELECT COUNT (DISTINCT manager_id) --Non conta il null perchè è quello "falso"
FROM employees;
-- mi stampa le righe con tutti i manager contando anche il null
SELECT DISTINCT manager_id 
FROM employees;
--DISTINCT elimina i duplicati
SELECT COUNT (DISTINCT FIRST_NAME)
FROM employees;

select *
from regions
where region_id > all(1, 2, 3);
--selezionami tutti i cognomi degli impiegati che hanno dentro un carattere(_) e poi ul e poi una sfilza di caratteri(%)
--per avere quelli con 3 lettere '___';
select last_name
from employees
where last_name like 'Sm%';
--seleziona tutte le regioni che non hanno come region_id 2 e 3
select *
from regions
where region_id not in (2, 3);
--es1 pag 22
select first_name, last_name, email, phone_number, hire_date
from employees
order by last_name, first_name;
--es2 pag 22
select first_name, last_name
from employees
where first_name ='David' or first_name='Peter';
--pag 22 es 3
select*
from employees
where department_id=60;
-- pag 22 es 3.1
select*
from employees
where department_id=50 or department_id=30;
--pag22 es 4
SELECT
    *
FROM employees
WHERE salary > 10000;
--pag 22 es 4.1
SELECT
    *
FROM employees
WHERE salary < 4000 or salary> 15000;
--pag22 es 4.2
SELECT
    *
FROM employees
WHERE  department_id=50 or department_id=80 and ( salary < 4000 or salary> 15000);

--pag 23 es1.1 potevo trattarlo anche con il like
SELECT *
FROM employees
WHERE hire_date BETWEEN '01-GEN-05' and '01-GEN-06';

--pag 23 es 1.2
SELECT *
from employees
order by job_id asc;

--pag 23 es 1.3
SELECT *
FROM employees
WHERE commission_pct is not null;

--pag 23 es 1.4 BISOGNA DISTINGUERE LE MAISCOLE 
SELECT *
FROM employees
WHERE first_name like '%a%' or first_name like '%A%' or last_name like '%a%' or last_name like '%A%';

--pag 23 2
SELECT *
FROM departments
order by department_name;

--pag 23 es 3
SELECT street_address
FROM locations
where country_id= 'IT';

--ES in jobs, title con clerk e return job id
SELECT job_id
FROM jobs
where job_title like '%Clerk';

-- es location tutti gli indirizzi che non hanno un postal code che iniziano per 0
select *
from locations
where  postal_code not like '0%' or postal_code is null; -- non mi prende = null

select e.last_name, e.salary, j.min_salary
from employees e join jobs j
on(e.salary between j.min_salary and j.min_salary + 100)
where(e.job_id = j.job_id);

select first_name, department_name --senza left outer non avrei visto kimberely perchè è null e poi il left mi dice tienila perchè stava sulla tabella di sin
from departments  right outer join employees
using(department_id)
where last_name = 'Grant';

--pag 37 es 1
select first_name, last_name, department_name
from employees join departments
using (department_id);

--pag 37 es2
select first_name, last_name, job_title
from employees join jobs
using (job_id);

--pag 37 es3
select first_name, last_name, salary, min_salary, max_salary
from employees e join jobs j
using (job_id)
where e.salary = j.min_salary or e.salary=j.max_salary;

--pag 37 es4 EMP JOIN DEP JOIN LOC
--quando uso USING non posso usare gli alias dentro le ()
select first_name, last_name
from employees e join departments d
using (d.department_id) join locations l using (l.location_id)
where l.country_id ='UK';

--pag 37 es5
select e.first_name, e.last_name, d.department_name
from departments d join employees e on d.manager_id=e.employee_id;

--pag 38 es1
select e.first_name, e.last_name, d.department_name
from departments d right join employees e on d.manager_id=e.employee_id;

--pag 38 es2
select d.department_name
from departments d left join employees e on d.manager_id=e.employee_id
where e.first_name is null or e.last_name is null;

--pag38 es3
select e.first_name, e.last_name, m.first_name, m.last_name
from employees e join employees m on e.manager_id = m.employee_id
order by 2;

--pag38 es4
select e.first_name, e.last_name, e.employee_id
from employees e full outer join departments d on(e.employee_id != d.manager_id);
--where e.employee_id != d.manager_id;

--TRUNC USATO COME FUNZIONE. E LO METTO UGUALE ALLA DATA
select *
from employees 
where trunc(hire_date,'year') = '01-GEN-05';

--pag46 es2
select last_name, first_name
from employees
where regexp_like(last_name, '^[A].*') or regexp_like(last_name, '[a].*') or regexp_like(first_name, '^[A].*') or regexp_like(first_name, '[a].*');


--pag 46 es1
select first_name, last_name, salary, (salary + (salary*8.5/100)) as con_incremento, ABS(salary - (salary + (salary*8.5/100))) as delta
from employees;U


pag 46 es 3
select first_name, last_name, TRUNC((ABS(months_between(hire_date, '30-SET-2019')))) as delta_mesi
from employees;


