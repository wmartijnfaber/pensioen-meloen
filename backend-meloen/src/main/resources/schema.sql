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
    preferred_retire_age int(3),
    yearly_deposit number(10)
);
Create TABLE employment(
    id int AUTO_INCREMENT primary key,
    employer_name varchar(255) not null,
    salary int,
    current_value int,
    employment_type varchar(32) not null,
    deposit_bank_account varchar(24) not null,
    parttime_percentage DECIMAL default 1,
    holiday_pay boolean default true,
    number_of_additional_month int default 0,
    yearly_bonus number(10) default 0

);
commit;
