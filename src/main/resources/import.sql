DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE IF NOT EXISTS products (id bigserial primary key, title varchar(255), price int);
INSERT INTO products (title, price) VALUES ('Salt', 100000), ('Bread', 20), ('Alenka', 80);

DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE IF NOT EXISTS customers (id bigserial primary key, name varchar(255));
INSERT INTO customers (name) VALUES ('Igor'), ('Elena'), ('Andrey');

DROP TABLE IF EXISTS products_customers CASCADE;
CREATE TABLE IF NOT EXISTS products_customers (product_id bigserial, customer_id bigserial, FOREIGN KEY (product_id) REFERENCES products, FOREIGN KEY (customer_id) REFERENCES customers);
INSERT INTO products_customers (product_id, customer_id) VALUES (3, 1), (2, 3), (3, 2), (2, 1), (1, 3), (2, 1), (1, 1)