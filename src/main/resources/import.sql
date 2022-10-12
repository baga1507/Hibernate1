DROP TABLE IF EXISTS products;
CREATE TABLE IF NOT EXISTS products (id bigserial primary key, title varchar(255), price int);
INSERT INTO products (title, price) VALUES ('Salt', 100000), ('Bread', 20), ('Alenka', 80);
