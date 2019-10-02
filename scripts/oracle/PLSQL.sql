set serveroutput on
begin
    dbms_output.put_line('Hello PL/SQL');
end;
/

declare
    v_width integer;
    v_height integer := 6;
    v_area integer := 7;
begin
    v_width := v_area / v_height;
    dbms_output.put_line(
        'v_width = ' || v_width);
end;
/

declare
    v_a integer;
    begin
    v_a:=9999999;
    if v_a > 0 then
        dbms_output.put_line('v_a is positive');
    elsif v_a = 0 then
        dbms_output.put_line('v_a is zero');
    else
        dbms_output.put_line('v_a is negative');
    end if;
    exception
when others then
dbms_output.put_line('Exception!');
     
end;
/

set serveroutput on

declare
    cursor v_coder_cursor is
        select * from phones_view;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line(
        '[' || v_cur.last_name|| ',' ||v_cur.first_name|| ',' || v_cur.phone_number || ']');
    end loop;
end;
/

select first_name, last_name, phone_number
from phones_view
where regexp_like(last_name, '^[A].') or REGEXP_LIKE(first_name, '^[A].')
order by first_name;

declare
    cursor v_coder_cursor is
        select first_name, last_name, phone_number
            from phones_view
            where regexp_like(last_name, '^[A].') or REGEXP_LIKE(first_name, '^[A].')
            order by first_name;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line(
        '[' || v_cur.last_name|| ',' ||v_cur.first_name|| ',' || v_cur.phone_number || ']');
    end loop;
end;
/
