-- create table subscriber

CREATE TABLE IF NOT EXISTS  Subscribe(
    id INT PRIMARY KEY,
    name VARCHAR(255),
    first_name VARCHAR(255),
    email VARCHAR(255),
    genre VARCHAR(10),
    number VARCHAR(15)
);

-- insert to subcriber
INSERT INTO Subscribe(id, name, first_name, email, genre, number) VALUES
    (1, 'Doe', 'John', 'john.doe@example.com', 'Male', '123456789'),
    (2, 'Smith', 'Jane', 'jane.smith@example.com', 'Female', '987654321'),
    (3, 'Johnson', 'Bob', 'bob.johnson@example.com', 'Male', '555555555');

