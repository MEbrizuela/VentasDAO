create table clientes (
	id serial not null,
	documento character varying (10),
	nombre character varying (30),
	apellido character varying (30),
	primary key (id)
)