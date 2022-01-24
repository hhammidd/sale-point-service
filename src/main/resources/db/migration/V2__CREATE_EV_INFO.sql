
CREATE TABLE IF NOT EXISTS ev_info (
id SERIAL PRIMARY KEY NOT NULL,
country VARCHAR(50) NOT NULL,
ev_type varchar(50),
date_inserted timestamp ,
date_info timestamp ,
amount int not null
);
