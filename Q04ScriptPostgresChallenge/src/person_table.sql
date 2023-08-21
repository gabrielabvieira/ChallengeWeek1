CREATE TABLE person (
    person_id SERIAL PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    age INT NOT NULL,
    phone VARCHAR(10) UNIQUE,
    height DECIMAL(5, 2),
    email VARCHAR(50) NOT NULL UNIQUE,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    birthday DATE,
    address_id INT REFERENCES address(address_id)
);