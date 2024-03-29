CREATE TABLE EMPLOYEE
(
    EMPLOYEE_ID INT,
    EMPLOYEE_FIRSTNAME VARCHAR(20),
    EMPLOYEE_LASTNAME VARCHAR(20), 
    DEPARTMENT_ID INT,
    SALARY NUMBER (8,2),
    EMP_EMAIL VARCHAR2(30),
    
    CONSTRAINT EMPLOYEE_ID PRIMARY KEY (EMPLOYEE_ID)
);

CREATE SEQUENCE EMPLOYEESEQ;

CREATE SEQUENCE EMPLOYEESEQ;

CREATE OR REPLACE TRIGGER EMPLOYEE
BEFORE INSERT ON EMPLOYEE --SPECIFY OPERATION, BEFORE/AFTER, AND TABLE
FOR EACH ROW
BEGIN
    SELECT EMPLOYEESEQ.NEXTVAL INTO :NEW.EMPLOYEE FROM DUAL;
END;

/

-----------------------------------------


CREATE TABLE DEPARTMENT
(
    DEPARTMENT_ID INT,
    DEPARTMENT_NAME VARCHAR(20),
    
    CONSTRAINT DEPARTMENT_ID PRIMARY KEY (DEPARTMENT_ID)
);

CREATE SEQUENCE DEPARTMENTSEQ;

CREATE OR REPLACE TRIGGER DEPARTMENT
BEFORE INSERT ON BEAR_TYPE --SPECIFY OPERATION, BEFORE/AFTER, AND TABLE
FOR EACH ROW
BEGIN
    SELECT DEPARTMENTSEQ.NEXTVAL INTO :NEW.DEPARTMENT FROM DUAL;
END;

/

-- ! NOTE:employees and departments were added through my IDE. 