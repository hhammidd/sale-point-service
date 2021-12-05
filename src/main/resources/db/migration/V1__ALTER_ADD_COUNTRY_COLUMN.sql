ALTER TABLE sale_points ADD COLUMN country VARCHAR ;

UPDATE sale_points SET country = 'ITALY';