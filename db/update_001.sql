create table person (
    id serial primary key not null,
    login varchar(2000),
    password varchar(2000)
);

create table employee (
    id serial primary key not null,
    first_name varchar(255),
    lust_name varchar(255),
    inn int,
    date_hiring timestamp not null default now()
);

create table employee_persons(
    id serial primary key not null,
    employee_id int references employee(id),
    person_id int references person(id)
);

insert into person (login, password) values ('gnikolay', '123'), ('nick', '321');
insert into person (login, password) values ('ban', '123'), ('gur', '321');
insert into person (login, password) values ('ivan', '123'), ('ivanov', '321');

insert into employee(first_name, lust_name, inn, date_hiring) values
('Nikolay', 'Gorbunkov', 123), ('Ban', 'Gur', 563), ('Ivan', 'Ivanov', 765);

insert into employee_persons(employee_id, persons_id) values
(2, 1), (2, 2), (3, 3), (3, 4), (4, 5), (4, 6);
