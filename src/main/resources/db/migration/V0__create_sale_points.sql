
CREATE TABLE IF NOT EXISTS sale_points (
    id SERIAL PRIMARY KEY NOT NULL,
    field_code VARCHAR(50) NOT NULL,
    name varchar(50),
    geo_id int NOT NULL,
    cap varchar(10),
    comune varchar(50),
    province varchar(30),
    regione varchar(30),
    tel varchar(20),
    psw varchar(100),
    username varchar(100),
    coords varchar(100)
);
