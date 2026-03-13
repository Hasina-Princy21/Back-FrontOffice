CREATE TABLE IF NOT EXISTS type_carburant(
    int SERIAL PRIMARY KEY,
    type VARCHAR(2)
);

CREATE TABLE IF NOT EXISTS vehicule(
    id SERIAL PRIMARY KEY,
    reference VARCHAR(10),
    nbr_place INT,
    type_carburant INT
);