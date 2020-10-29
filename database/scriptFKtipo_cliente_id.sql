alter table clientes 
add column tipo_cliente_id integer;
alter table clientes
add constraint fk_tipo_cliente 
foreign key (tipo_cliente_id)
references tipo_cliente (id)
