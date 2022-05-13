create table employee (
    id serial primary key not null,
    first_name varchar(255),
    lust_name varchar(255),
    inn int,
    date_hiring timestamp not null default now()
);


create table person (
    id serial primary key not null,
    login varchar(2000),
    password varchar(2000),
    employee_id int
);


insert into person (login, password, employee_id) values ('gnikolay', '123', 1), ('nick', '321', 1);
insert into person (login, password, employee_id) values ('ban', '123', 2), ('gur', '321', 2);
insert into person (login, password, employee_id) values ('ivan', '123', 3), ('ivanov', '321', 3);

insert into employee(first_name, lust_name, inn) values
('Nikolay', 'Gorbunkov', 123), ('Ban', 'Gur', 563), ('Ivan', 'Ivanov', 765);

