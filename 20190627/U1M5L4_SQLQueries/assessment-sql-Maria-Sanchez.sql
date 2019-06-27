--  SQL Queries:
--    *Develop and test all of your SQL queries in MySQL Workbench.
--    *Answer the following questions and run the requested queries against the
--     northwind and car_lot databases.

--  *** Northwind Database ***
--    1. What are the categories of products in the database?
SELECT category FROM northwind.products;

--    2. What products are made by Dell?
SELECT * FROM northwind.products WHERE product_name LIKE 'Dell%';

--    3. List all the orders shipped to Pennsylvania.
SELECT * FROM northwind.orders WHERE ship_state = 'Pennsylvania';

--    4. List the first name and last name of all employees with last names that start with w.
SELECT first_name, last_name FROM northwind.employees WHERE last_name LIKE 'W%';

--    5. List all customers from zipcodes that start with 55.
SELECT * FROM northwind.customers WHERE postal_code LIKE '55%';

--    6. List all customers from zipcodes that end with 0.
SELECT * FROM northwind.customers WHERE postal_code LIKE '%0';

--    7. List the first name, last name, and email for all customers with a .org email address.
SELECT first_name, last_name, email FROM northwind.customers WHERE email LIKE '%.org';

--    8. List the first name, last name, and phone number for all customers from the 202 area code.
SELECT first_name, last_name, phone FROM northwind.customers WHERE phone LIKE '%202%';

--    9. List the order id for each order placed by George Wilson.
SELECT orders.id "Order ID",
	orders.customer_id "Customer ID",
    customers.first_name,
    customers.last_name
FROM northwind.orders
INNER JOIN northwind.customers ON customers.id = orders.customer_id
WHERE customers.first_name = 'George' AND customers.last_name = 'Wilson';

--   10. List all the products and quantities associated with order 4003.
SELECT products.product_name "Product Name",
	order_details.order_id "Order ID",
    order_details.quantity "Quantity"
FROM northwind.order_details
INNER JOIN northwind.products ON products.id = order_details.product_id
WHERE order_details.order_id = 4003;

--  *** car_lot database ***
--    1. Add the following cars to inventory:
--        i. 2012 Red Honda Accord
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (1, 'Honda', 'Accord', 2012, 'Red');
--       ii. 2017 Black Chevy Impala
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (2, 'Chevy', 'Impala', 2017, 'Black');
--      iii. 2019 Silver Ford F-150
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (3, 'Ford', 'F-150', 2019, 'Silver');
--       iv. 2020 White Subaru Outback
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (4, 'Subaru', 'Outback', 2020, 'White');
--        v. 2015 Silver Ford Mustang
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (5, 'Ford', 'Mustang', 2015, 'Silver');
--       vi. 2018 Blue Honda Ridgeline
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (6, 'Honda', 'Ridgeline', 2018, 'Blue');
--      vii. 2017 Gray Chevy Silverado
INSERT INTO car_lot.car (id, make, model, model_year, color)
VALUES (7, 'Chevy', 'Silverado', 2017, 'Gray');

--    2. Make the following updates to the database:
--        i. Change all Hondas to Black
UPDATE car_lot.car SET color = 'Black' WHERE make = 'Honda';
--       ii. Change 'Chevy' to 'Chevrolet'
UPDATE car_lot.car SET make = 'Chevrolet' WHERE make = 'Chevy';
--      iii. Change all 2020 model years to 2019
UPDATE car_lot.car SET model_year = 2020 WHERE model_year = 2019;

--    3. Delete the following:
--        i. Delete all blue inventory
DELETE FROM car_lot.car WHERE color = 'Blue';
--       ii. Delete all Fords
DELETE FROM car_lot.car WHERE make = 'Ford';
--      iii. Delete all cars from 2012 and 2017
DELETE FROM car_lot.car WHERE model_year = 2012 OR model_year = 2017;

