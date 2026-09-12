-- Address records (must be inserted first — agreements now has a foreign key to this table)
INSERT INTO address (id, street_name, city, country) SELECT * FROM CSVREAD('classpath:address.csv');

-- Agreement records (one-to-one to address here, since no address is reused; each agreement points to its own address_id)
INSERT INTO agreements (id, owner_id, policy_number, address_id) SELECT * FROM CSVREAD('classpath:agreements.csv');