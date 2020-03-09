CREATE TABLE species (
	id int,
    "name" varchar(255),
    species_id int,
    dexorder int
);

CREATE TABLE species_type (
	id int,
    type_id int,
    slot int
);

CREATE TABLE type_efficacy (
    damage_type_id int,
    target_type_id int,
    damage_factor int
);

CREATE TABLE "type" (
	id int,
    identifier varchar(255)
);
