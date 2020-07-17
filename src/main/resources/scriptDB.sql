create table users
(
 id serial primary key,
 name VARCHAR(30),
 surname VARCHAR(30),
 role VARCHAR(30),
 login VARCHAR(30) UNIQUE ,
 password VARCHAR(255)
);

create table room
(
 id serial primary key,
 name_room VARCHAR(45),
 capacity INTEGER,
 description VARCHAR(255)
);

create table user_booking
(
 id serial primary key,
 id_user INTEGER,
 id_room INTEGER,
 start_booking TIMESTAMP,
 end_booking TIMESTAMP,
 FOREIGN KEY (id_user) REFERENCES users(id),
 FOREIGN KEY (id_room) REFERENCES room(id)
);