-- Création de la table book
CREATE TABLE IF NOT EXISTS Book (
    id SERIAL PRIMARY KEY,
    book_name VARCHAR(250),
    id_author INT REFERENCES Author(id),
    page_number INT,
    topic VARCHAR(10) CHECK (topic IN ('COMEDY', 'ROMANCE', 'OTHER')),
    release_date DATE,
    status VARCHAR(10) CHECK (status IN ('emprunt', 'rendu'))
);

-- Insertion de données par défaut dans la table BOOK
INSERT INTO Book (book_name, id_author, page_number, topic, release_date, status) VALUES
    ('Book1', 1, 200, 'COMEDY', '2023-01-01', 'emprunt'),
    ('Book2', 2, 150, 'ROMANCE', '2023-02-01', 'rendu'),
    ('Book3', 3, 180, 'OTHER', '2023-03-01', 'emprunt');
