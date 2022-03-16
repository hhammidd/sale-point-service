
CREATE TABLE IF NOT EXISTS ev_statistic (
id SERIAL PRIMARY KEY NOT NULL,
country VARCHAR(50) NOT NULL,
ev_type varchar(50),
date_inserted timestamp ,
year INT,
month INT,
amount int
);
