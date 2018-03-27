create table if not exists usuario
(
	id serial primary key,
	username varchar(30) not null unique,
	pass varchar(64) not null unique,
	nombre_apellido varchar(40) not null,
	rol int not null,
	telefono varchar(15)
);
create table if not exists animal
(
	id serial primary key,
	numero varchar(2) not null,
	nombre varchar(20) not null
);

create table if not exists sorteo
(
	id serial primary key,
	hora time not null,
	loteria varchar(15) not null
);

create table if not exists ticket
(
	id serial primary key,
	serial varchar(15) not null,
	usuario int not null references usuario(id),
	fecha date not null,
	hora time not null,
	ip varchar(15) not null,
	total numeric(10,2) default 0
);

create table if not exists jugada
(
	id serial primary key,
	sorteo int not null references sorteo(id),
	animal int not null references animal(id),
	ticket int not null references ticket(id),
	usuario int not null references usuario(id),
	monto numeric(10,2) not null
);

create table if not exists configuracion
(
	id serial primary key,
	clave varchar(15) not null unique,
	valor text not null
);