-- create table subscriber

CREATE TABLE IF NOT EXISTS  Subscribe(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    first_name VARCHAR(255),
    email VARCHAR(255),
    genre VARCHAR(10) CHECK (genre IN ('M','F')),
    number VARCHAR(15)
);

-- insert to subcriber
INSERT INTO Subscribe(id, name, first_name, email, genre, number) VALUES
    (1, 'Doe', 'John', 'john.doe@example.com', 'M', '123456789'),
    (2, 'Smith', 'Jane', 'jane.smith@example.com', 'F', '987654321'),
    (3, 'Johnson', 'Bob', 'bob.johnson@example.com', 'M', '555555555');

