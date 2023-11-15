-- Création de la table Author
CREATE TABLE IF NOT EXISTS Author (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    sex VARCHAR(10) CHECK (sex IN ('M','F'))
);

-- Insertion de données par défaut dans la table Author
INSERT INTO Author (name, first_name, sex) VALUES
    ('Doe', 'John', 'M'),
    ('Smith', 'Jane', 'F'),
    ('Johnson', 'Mark', 'M');
