set serveroutput on

create or replace procedure tomorrow (
    p_tomorrow out date) is
begin
    p_tomorrow := sysdate + 1;
end tomorrow;
/

declare
    v_tomorrow date;
begin
    tomorrow(v_tomorrow);
    DBMS_OUTPUT.put_line('Domani è : ' || v_tomorrow);
end;
/

commit;


create or replace procedure name_tomorrow (
    name in varchar2,
    p_tomorrow out date) is
begin
    p_tomorrow := sysdate + 1;
end name_tomorrow;
/

declare
    v_tomorrow date;
    v_name varchar2(20) := 'Luciana';
begin  
    name_tomorrow(v_name,v_tomorrow);
    DBMS_OUTPUT.put_line('Ciao ' || v_name || ', domani sarà : ' || v_tomorrow);
end;
/

commit;

create or replace procedure get_coder(
    p_coder_id in coders.coder_id%type,
    p_first_name out coders.first_name%type,
    p_last_name out coders.last_name%type) is
begin
    select first_name, last_name
    into p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
end get_coder;
/

declare
    v_coder_id integer :=105;
    v_first_name varchar2(20);
    v_last_name varchar2(20);
begin
    get_coder(v_coder_id, v_first_name, v_last_name);
    DBMS_OUTPUT.PUT_LINE(' Il coder_id ' || v_coder_id || ' corrisponde a ' || v_first_name || ' ' || v_last_name);
    
END;
/
