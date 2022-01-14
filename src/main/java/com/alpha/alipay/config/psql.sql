# DECLARE
#  pi constant number := 3.14;
#  r number default 3;
#  area number ;
#  begin
#  area:=pi*r*r;
#  dbms_output.put_line(area);
#  end;
#  /
#
#
# DECLARE
#  sname varchar(20) default 'Alpha oumar';
#
#  begin
# SELECT ename into  sname from scott.emp where empno =7900;
#  dbms_output.put_line(sname);
#  end;
#  /
#
#
#
#  var emp_name varchar(20);
#
#  begin
# SELECT ename into  :emp_name from scott.emp where empno =7499;
#  end;
#  /
#
#
#
#
#
# DECLARE
#  myemp EMP%ROWTYPE;
#
# BEGIN
#   SELECT * into  myemp from scott.emp where empno =7934;
#  dbms_output.put_line(myemp.ename);
#  end;
#  /
#
#
#
#
#
#
# set serveroutput on
# declare
#
#  v_date Date := to_date('&sv_date','DD/MM/YYYY');
#  v_day varchar(15);
#
# BEGIN
#
#     y_day:=trim(to_char(v_date,'Day'));
#     if y_day in ('saturday','sunday') then
#  dbms_output.put_line(v_date|| 'weekend');
#  end if;
#  dbms_output.put_line('work day');
# end;
#  /
#
#
#
# DECLARE
# counter number(3) :=0;
# sumResult number :=0;
# BEGIN
#     while counter < 100 LOOP
#     counter :=counter+1;
#     sumResult := sumResult+1;
# end LOOP;
#  dbms_output.put_line('result' || sumResult);
#  end;
#  /
#
#
#
#
# DECLARE
# counter number(3) :=0;
# sumResult number :=0;
# BEGIN
#     for counter in 100 LOOP
#     sumResult := sumResult+counter;
# end LOOP;
#  dbms_output.put_line('result' || sumResult);
#  end;
#  /
#
#
#
#
# DECLARE
# CURSOR emp_cursor
# is
# select * from scott.emp order by empno desc;
# emprow emp%ROWTYPE;
# BEGIN
#     open emp_cursor;
#     loop
#     fetch emp_cursor into emprow;
#     EXIT when emp_cursor %notfound;
#  dbms_output.put_line('empno is ' ||emprow.empno);
#  end loop;
#  dbms_output.put_line(emp_cursor %rowcount);
# close emp_cursor;
# end;
#  /
#
#
#
#
# DECLARE
# TYPE empcurtyp is REF CURSOR
#     emp_cv  empcurtyp;
#     my_ename varchar(14);
#     my_sal number :=1000;
# BEGIN
#     open emp_cv for  'select ename, sal from scott.emp where sal >:s';
#     using my_sal;
# end;
#  /
#
