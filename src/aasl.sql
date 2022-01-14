 CREATE OR REPLACE TRIGGER del_ emp
BEFORE DELETE
ON scott. emp
FOR EACH ROW
BEGIN
hiredate)
INSERT INTO emp his ( deptno , empno, ename, job , mgr , sal , comm VALUES (
    :old.deptno, :old, empno, :old. ename.told.job,old.mgr, :old.sal, :old.comm, :old.hiredate ) :
END del emp;

Diallo💧:
SQL> CREATE OR REPLACE TRIGGER del_ emp
BEFORE DELETE
ON scott. emp
FOR EACH ROW
BEGIN
hiredate)
INSERT INTO emp his ( deptno , empno, ename, job , mgr , sal , comm
VALUES (:old.deptno, :old, empno, :old. ename.
told. job,
old.mgr, :old.sal, :old.comm, :old.hiredate ) :
END del emp;
IS
PROCEDURE append proc(t varchar2, a out varchar2) ;

SQL>CREATE or replace package body t package
IS
t varchar2 (30) ;
FUNCTION private fun (t varchar2) RETURN varchar2 IS
BEGIN
vt:-tllhello;
RETURN Vti
END;
PROCEDURE append proc(t varchar2,a out varchar2) is
--实现过程
10
BEGIN
11
a :a til hello;
12
END;
13
PROCEDURE append_proc (t number, a out varchar2) is
-过程的重载
114
BEGIN
15
tilhello;
END;
FUNCTION append fun (t varchar2)
RETURN varchar2 is
BEGIN
til'hello';
RETURN V t;
END;

SOL >CREATE OR REPLACE PROCEDURE autocomputer (step IN number)
IS
IsCursor SYS REFCURSOR;
commentArraymyPackage.myArray;
math number;

article number;
language number;
music number;
sport number;
total number;
average number;
stdId varchar (30) ;
record myPackage.stdInfo;
i number;
BEGIN
1：=1;
get comment (commentArray);
 OPEN rsCursor FOR SELECT stdId, math, article, language, music, sport
FROM student t WHERE t.step = step;
 LOOP
FETCH rsCursor into stdId, math, article, language, music, sport;
 EXIT WHEN rsCursor&NOTFOUND;
 total= math + article + language + music + sport;
FOR 1 IN 1. .commentArray. count LOOP
 record := commentArray (i);
 IF stdId = record.stdrd THEN
BEGIN
IF record.comment= &apos; Adapos; THEN
BEGIN
total := total + 20;
GO TO next;
END;
END IF:
END;
END IF;
END LOOP;
average := total / 5;
UPDATE student t SET t.total=total AND t.average
WHERE t.stdId = stdId;
- average
end LOOP:
end;
end autocomputer;
