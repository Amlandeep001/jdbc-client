DROP TABLE IF EXISTS book;

CREATE TABLE test.book (
  id int NOT NULL,
  name varchar(255) DEFAULT NULL,
  title varchar(255) DEFAULT NULL,
  CONSTRAINT book_pkey PRIMARY KEY (id)
);