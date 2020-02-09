cd data;
psql -d pokemon -U pokemon -c "COPY species FROM '/psqlSetup/data/species.csv' DELIMITER ',' CSV HEADER;"
psql -d pokemon -U pokemon -c "COPY species_type FROM '/psqlSetup/data/species_type.csv' DELIMITER ',' CSV HEADER;"
psql -d pokemon -U pokemon -c "COPY type_efficacy FROM '/psqlSetup/data/type_efficacy.csv' DELIMITER ',' CSV HEADER;"
psql -d pokemon -U pokemon -c "COPY type FROM '/psqlSetup/data/type.csv' DELIMITER ',' CSV HEADER;"
