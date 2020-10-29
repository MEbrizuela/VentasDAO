alter table productos 
add constraint fk_categoria
foreign key (categorias_id)
references categorias (id)
