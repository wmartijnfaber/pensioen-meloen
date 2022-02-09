Create TABLE user (
    id int AUTO_INCREMENT  primary key,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    email varchar(255) not null,
    date_of_birth  varchar(255),
    street varchar(255),
    city varchar(255),
    zip varchar(6),
    housenumber int,
    housenumber_addition varchar(2),
    preferred_retire_age int(3)
);
Create TABLE employment(
    id int AUTO_INCREMENT primary key,
    employer_name varchar(255) not null,
    salary int,
    current_value int,
    employment_type varchar(32) not null,
    deposit_bank_account varchar(24) not null

);
commit;
