CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    salary numeric NOT NULL
);

CREATE TABLE car (
    id SERIAL PRIMARY KEY,
    model varchar(100) NOT NULL,
    year integer NOT NULL
);