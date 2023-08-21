CREATE TABLE address (
    address_id SERIAL PRIMARY KEY,
    zip VARCHAR(10),
    street VARCHAR(100),
    complement VARCHAR(100),
    neighborhood VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(50),
    country VARCHAR(50)
);
