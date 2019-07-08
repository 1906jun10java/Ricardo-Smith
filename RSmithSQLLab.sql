--2.1 SELECT
-- Task – Select all records from the Employee table.
SELECT * FROM employee;

-- Task – Select all records from the Employee table where last name is King.
SELECT * FROM employee WHERE LASTNAME = 'King';

-- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM employee WHERE FIRSTNAME = 'Andrew' AND REPORTSTO IS NULL;

--2.2 ORDER BY
-- Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM ALBUM ORDER BY TITLE DESC;

-- Task – Select first name from Customer and sort result set in ascending order by city
SELECT FIRSTNAME FROM CUSTOMERORDER BY CITY ASC;

--2.3 INSERT INTO
-- Task – Insert two new records into Genre table 
SELECT * FROM GENRE

--1.
INSERT INTO GENRE (GENREID, NAME) VALUES(100, 'Roots Reggae');

INSERT INTO GENRE (GENREID, NAME)VALUES(101, 'Soca');



-- Task – Insert two new records into Employee table
INSERT INTO EMPLOYEE VALUES (23, 'Ricardo', 'Smith', 'CEO', 1, TO_DATE('1989/08/23', 'yyyy/mm/dd'), TO_DATE('2019/06/15', 'yyyy/mm/dd'), 'Boss Lane', 'Tampa', 'FL', 'United States', 11111, '+1 (202)697-6574', '+1 (202) 854-3267', 'RICKY@REVATURE.COM.com');

INSERT INTO EMPLOYEE VALUES (24, 'John', 'Amos', 'Welder', 23, TO_DATE('1999/09/03', 'yyyy/mm/dd'), TO_DATE('2019/06/15', 'yyyy/mm/dd'), 'Swerving On Ya Blvd', 'Tampa', 'FL', 'United States', 11111, '+1 (202)697-6574', '+1 (202) 854-3267', 'john@REVATURE.COM.com');


-- Task – Insert two new records into Customer table
INSERT INTO CUSTOMER VALUES(200,'Bill', 'Moses', 'Carpenters of America', 'Woodchip lane', 'Tampa', 'FL', 'United States', 20000, '+1(985)259-9875','+1(156)157-0123','biteme@gmail.com',4);

INSERT INTO CUSTOMER VALUES(2001,'Sam', 'Cow', 'Masons of America', '2343 Driver Ln', 'Tampa', 'FL', 'United States', 30000, '+1(452)668-5489','+1(458)588-3258','yourmums@gmail.com',3);


--2.4 UPDATE
-- Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE CUSTOMERSET FIRSTNAME = 'Robert', LASTNAME = 'Walter'WHERE CUSTOMERID = 32;

UPDATE ARTISTSET NAME = 'CCR' WHERE ARTISTID = 76;


--2.5 LIKE
Task – Select all invoices with a billing address like “T%” 
SELECT * FROM INVOICE WHERE BILLINGADDRESS LIKE 'T%';

--2.6 BETWEEN
-- Task – Select all invoices that have a total between 15 and 50
SELECT * FROM INVOICE WHERE TOTAL BETWEEN 15 AND 50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM employeeWHERE HIREDATE BETWEEN '01-JUN-2003' and '01-MAR-2004';

--2.7 DELETE
-- Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

ALTER TABLE INVOICE DROP CONSTRAINT FK_INVOICECUSTOMERID;
DELETE FROM CUSTOMER WHERE CUSTOMERID = 32;

--3.1 SYSTEM DEFINED FUNCTIONS
-- Task – Create a function that returns the current time.
SELECT CURRENT_TIMESTAMPFROM;

-- Task – create a function that returns the length of name in MEDIATYPE table
SELECT LENGTH(NAME)FROM MEDIATYPE;

--3.2 SYSTEM DEFINED AGGREGATE FUNCTIONS
-- Task – Create a function that returns the average total of all invoices 
SELECT AVG(TOTAL) FROM INVOICE;

--Task – Create a function that returns the most expensive track
SELECT MAX(UNITPRICE)FROM TRACK;

--3.3 USER DEFINED SCALAR FUNCTIONS
CREATE OR REPLACE FUNCTION AVG_PRICERETURN NUMBER IS X NUMBER;

