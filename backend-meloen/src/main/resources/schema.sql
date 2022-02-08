Create TABLE user (
    id int not null ,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    email varchar(255) not null,
    date_of_birth date not null,
    street varchar(255) not null,
    city varchar(255) not null,
    zip varchar(6) not null,
    housenumber int,
    housenumber_addition varchar(2),
    preferred_retire_age int(3),
    PRIMARY KEY (id)
);
Create TABLE employment(
    id int not null ,
    employer_name varchar(255) not null,
    salary int,
    current_value int,
    employment_type varchar(10) not null,
    deposit_bank_account varchar(24) not null,
    PRIMARY KEY (id)
);

