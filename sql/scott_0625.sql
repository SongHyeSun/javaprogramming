-- ���� ������ ��� table�� ��ȸ
SELECT * FROM tab;
-- dept table�� ���� ��ȸ
DESC dept;
-- dept TBL -> deptno, loc ������
Select deptno, loc From dept;

--�μ� ���̺��� �μ��̸�(dname)�� �μ���ȣ(deptno)�� ����Ͽ���
SELECT dname, deptno FROM dept;
--�л� ���̺��� �ߺ��Ǵ� �а� ��ȣ(deptno)�� �����ϰ� ����Ͽ��� --> distinct
SELECT distinct deptno FROM student;


--����(alias) �ο� ���
--Į�� �̸��� ���� ���̿� ������ �߰��ϴ� ���
--Į�� �̸��� ���� ���̿� AS Ű���带 �߰��ϴ� ���
--ū����ǥ�� ����ϴ� ���
--Į�� �̸��� ���� ���̿� ������ �߰��ϴ� ���
--Ư�����ڸ� �߰��ϰų� ��ҹ��ڸ� �����ϴ� ���

--ex �μ� ���̺��� �μ� �̸� Į���� ������ dept_name,
--   �μ� ��ȣ Į���� ������ DN���� �ο��Ͽ� ����Ͽ���
SELECT dname dept_name, deptno AS dn
FROM   department;


--�ռ�(concatenation)������ (||)
--�ϳ��� Į���� �ٸ� Į��,
--��� ǥ���� �Ǵ� ��� ���� �����Ͽ� �ϳ��� Į��ó�� ����� ��쿡 ���
--ex)�л� ���̺��� �й��� �̸� Į���� �����Ͽ�
--   ��StudentAli����� �������� �ϳ��� Į��ó�� �����Ͽ� ����Ͽ���
SELECT studno|| ' ' || name "StudentAli"
FROM   student;

-- cw1. �л��� �����Ը� pound�� ȯ���ϰ�
--      Į�� �̸��� 'weigh_pound'��� �������� ����Ͽ���.
--      ��� ������ �̸�, ������, weigh_pound
--      1kg�� 2.2pound
SELECT name, weight, weight*2.2 AS weigh_pound
From student;

--CHAR�� VARCHAR2�� �� ���� ����
-- �Ʒ� table����� ���� DDL�̶� �θ���.
CREATE TABLE ex_type
(c   CHAR(10),
 v   VARCHAR2(10)
 )
 -- DML�̶� �θ���.
 INSERT INTO ex_type
 VALUES('sql','sql');
 --DCL�� commit
 COMMIT;
 
 SELECT *
 FROM   ex_type
 WHERE  c = 'sql'
 ;
 
 SELECT *
 FROM   ex_type
 WHERE  v = 'sql'
 ;
 
 SELECT *
 FROM   ex_type
 WHERE  v = c
 ;
 
 --������ where��
 --ex) �л� ���̺��� 1�г� �л��� �˻��Ͽ� �й�, �̸�, �а� ��ȣ�� ����Ͽ��� (HW01)
 SELECT studno, name, deptno
 FROM student
 WHERE grade = '1'
 ;
 --'1'�� �ϸ� �ڵ����� To_number�� �ڹ��� ����ȯ ���� ���ش�.
 --(�ý��ۿ��� �ڵ����� ���ִµ� ��� �˾ƺ��� ���ؼ�)
 SELECT studno, name, deptno
 FROM student
 WHERE grade = TO_NUMBER('1')
 ;
 
 --ex) �л� ���̺��� �����԰� 70kg ������ �л��� �˻��Ͽ�
 --    �й�, �̸�, �г�, �а���ȣ, �����Ը� ����Ͽ���.
 SELECT studno, name, grade, deptno, weight
 FROM student
 WHERE weight <= 70
 ;
 --ex)�л� ���̺��� 1�г� �̸鼭 �����԰� 70kg �̻��� �л��� �˻��Ͽ�
 --   �̸�, �г�, ������, �а���ȣ�� ����Ͽ���
 SELECT name, grade, weight, deptno
 FROM student
 WHERE grade = 1
 AND   weight >=70
 ;
 
 --ex) �л� ���̺��� 1�г��̰ų� �����԰� 70kg �̻��� �л��� �˻��Ͽ�
 --    �̸�, �г�, ������, �а���ȣ�� ����Ͽ���.
 SELECT name, grade, weight, deptno
 FROM student
 WHERE grade = 1
 OR   weight >=70
 ;
 
 --ex) BETWEEN �����ڸ� ����Ͽ� �����԰� 50kg���� 70kg ������ �л���
 --    �й�, �̸�, �����Ը� ����Ͽ���
 SELECT studno, name, weight
 FROM student
 WHERE weight BETWEEN 50 AND 70
 ;
 
 --ex) �л����̺��� 81�⿡�� 83�⵵�� �¾ �л���
 --    �̸��� ��������� ����ض�
 SELECT name, birthdate
 FROM student
 --WHERE birthdate BETWEEN '81/01/01' AND '83/12/31'
 WHERE birthdate BETWEEN TO_DATE('810101') AND TO_DATE('831231')
 ;
 
 --ex) IN �����ڸ� ����Ͽ� 102�� �а��� 201�� �а� �л���
 --    �̸�, �г�, �а���ȣ�� ����Ͽ���
 SELECT name, grade, deptno
 FROM student
 WHERE deptno IN(102,201)
-- WHERE deptno = 102
-- OR    deptno = 201
 ;
 
-- LIKE ������
--?Į���� ����� ���ڿ��߿��� LIKE �����ڿ��� ������ ���� ���ϰ� �κ������� ��ġ�ϸ� ���� �Ǵ� ������
--ex) �л� ���̺��� ���� ���衯���� �л��� �̸�, �г�, �а� ��ȣ�� ����Ͽ���
SELECT name, grade, deptno
FROM student
WHERE name LIKE '��%'
;
--ex) �̸� �� '��'
SELECT name, grade, deptno
FROM student
WHERE name LIKE '%��%'
;
--ex) �̸� �� '��'
SELECT name, grade, deptno
FROM student
WHERE name LIKE '%��'
;
--ex)�л� ���̺��� �̸��� 3����, ���� ���衯����
--   ������ ���ڰ� ���������� ������ �л��� �̸�, �г�, �а� ��ȣ�� ����Ͽ���
SELECT name, grade, deptno
FROM student
WHERE name LIKE '��%��'
;
SELECT name, grade, deptno
FROM student
WHERE name LIKE '��_��'
;

--NULL�� ����
--NULL�� ��Ȯ�� ���̳� ���� ������� ���� ���� �ǹ�
 SELECT empno, sal, comm
 FROM emp;
 
 SELECT empno, sal, comm, sal + comm
 FROM emp;
  
 SELECT empno, sal, comm, sal + NVL(comm,0)
 FROM emp;
 
 
 --ex) ���� ���̺��� �̸�, ����, ���������� ����Ͽ���
 SELECT name, position, comm
 FROM professor
 ;
 
 --ex) ���� ���̺��� ���������� ���� ������ �̸�, ����, ���������� ����Ͽ���
 SELECT name, position, comm
 FROM professor
 WHERE comm IS null
 --WHERE comm = null ���� �ϸ� �ȵȴ�.
 ;
 
 --ex) ���� ���̺��� �޿��� ���������� ���� ���� sal_com�̶�� ��������
 --    ������ �̸�, ����, ��������, sal_com�� ����Ͽ���
 SELECT name, position, comm, sal+comm sal_com
 FROM professor
 ;
 
 --ex) ���� ���̺��� �޿��� ���������� ���� ���� sal_com�̶�� �������� ���
 --    ����: sal_com �׸��� comm�� Null�̸� 0���� ���
 SELECT name, position, comm, sal + NVL(comm,0) sal_com
 FROM professor
 ;
 
 --ex)102�� �а��� �л� �߿��� 1�г� �Ǵ� 4�г� �л���
--    �̸�, �г�, �а� ��ȣ�� ����Ͽ���
 SELECT name, grade, deptno
 FROM student
 WHERE deptno = 102
 AND (grade = 1 OR grade = 4)
 ;
 
 --���տ�����: ���̺��� �����ϴ� �����տ� ���� ���̺��� �κ� ������ ����� ��ȯ�ϴ� ������
 --����
 --UNION: �� ���տ� ���� �ߺ��Ǵ� ���� ������ ������
 --UNION ALL: �� ���տ� ���� �ߺ��Ǵ� ���� ������ ������
 --MINUS: �� ���հ��� ������
 --INTERSECT: �� ���հ��� ������
 --ex) 1�г� �̸鼭 �����԰� 70kg �̻��� �л��� ���� --> Table  stud_heavy
 CREATE TABLE stud_heavy
 AS
    SELECT *
    FROM student
    WHERE grade = 1
    AND   weight >= 70
 ;
 
 --ex) 1�г� �̸鼭 101�� �а��� �Ҽӵ� �л�(stud_101)
 CREATE TABLE stud_101
 AS
    SELECT *
    FROM student
    WHERE grade = 1
    AND deptno = 101
    ;
    
--UNION--> Error�� ����: ���� �÷��� �� X
SELECT studno, name, userid
FROM   stud_heavy
UNION
SELECT studno, name
FROM stud_101
;
SELECT studno, name
FROM   stud_heavy
UNION
SELECT studno, name
FROM stud_101
;
-- Union  �ߺ� ����   (�ڵ��� , ������) + (�ڹ̰� , ������)
SELECT studno, name
FROM   stud_heavy
UNION ALL
SELECT studno, name
FROM stud_101
;

-- Intersect --> ����
SELECT studno, name
FROM   stud_heavy
INTERSECT
SELECT studno, name
FROM stud_101
;

--Minus (�ڵ���, ������) - (�ڹ̰�, ������)
SELECT studno, name
FROM   stud_heavy
MINUS
SELECT studno, name
FROM stud_101
;

--����(sorting)
--SQL ��ɹ����� �˻��� ����� ���̺� �����Ͱ� �Էµ� ������� ���
--������, �������� ��� ������ Ư�� �÷��� �������� �������� �Ǵ� ������������ �����ϴ� ��찡 ���� �߻�
--���� ���� Į���� ���� ���� ������ ���ϴ� ��쵵 �߻�
--ORDER BY : Į���̳� ǥ������ �������� ��� ����� ������ �� ���
--ASC : ������������ ����, �⺻ ��
--DESC : ������������ �����ϴ� ��쿡 ���, ���� �Ұ���
--ex) �л� ���̺��� �̸��� �����ټ����� �����Ͽ� �̸�, �г�, ��ȭ��ȣ�� ����Ͽ���
SELECT   name, grade, tel
FROM     student
--ORDER BY name
--ORDER BY name ASC
ORDER BY name DESC
;

--ex) �л� ���̺��� �г��� ������������ �����Ͽ� �̸�, �г�, ��ȭ��ȣ�� ����Ͽ���
SELECT name, grade, tel
FROM student
ORDER BY grade DESC
;

--ex) ��� ����� �̸��� �޿� �� �μ���ȣ�� ����ϴµ�,
--    �μ� ��ȣ�� ����� ������ ���� �޿��� ���ؼ��� ������������ �����϶�.
SELECT ename, job, deptno, sal
FROM emp
ORDER BY deptno, sal DESC
;

--������� ���� Work -->(HW)
--Q1) �μ� 10�� 30�� ���ϴ� ��� ����� �̸��� �μ���ȣ��
--    �̸��� ���ĺ� ������ ���ĵǵ��� ���ǹ��� �����϶�.
SELECT ename, deptno
FROM   emp
ORDER BY ename ASC
;
--Q2) 1982�⿡ �Ի��� ��� ����� �̸��� �Ի����� ���ϴ� ���ǹ�
SELECT ename, hiredate
FROM emp
WHERE hiredate BETWEEN '82/01/01' AND '82/12/31'
;
--Q3) ���ʽ��� �޴� ��� ����� ���ؼ� �̸�, �޿� �׸��� ���ʽ��� ����ϴ�
--    ���ǹ��� �����϶�. �� �޿��� ���ʽ��� ���ؼ� �������� ����
SELECT ename, sal, comm, sal + NVL(comm,0) sal_com
FROM emp
ORDER BY sal_com DESC
;
--Q4) ���ʽ��� �޿��� 20% �̻��̰� �μ���ȣ�� 30�� ��� ����� ���ؼ�
--    �̸�, �޿� �׸��� ���ʽ��� ����ϴ� ���ǹ��� �����϶�
SELECT ename, sal, comm
FROM emp
WHERE comm >= sal*0.2
AND deptno = 30
;