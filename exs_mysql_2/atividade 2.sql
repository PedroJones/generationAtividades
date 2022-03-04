create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tamanho varchar (255) not null ,
primary key (id)
);

insert into tb_categoria(tamanho) values ("Mini");
insert into tb_categoria(tamanho) values ("Pequena");
insert into tb_categoria(tamanho) values ("Média");
insert into tb_categoria(tamanho) values ("Grande");



select * from tb_categoria;

create table tb_pizza (
id bigint auto_increment,
sabor varchar (255) not null,
preco decimal(6,2) not null,
salgada boolean not null,
vegetariana boolean not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Toscana",29.50,true, true,3);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Calabresa",29.50,true,false, 3);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Quatro Queijos",35.50,true, true, 4);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Portuguesa",32.50,true, false, 3);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Beringela",27.50,true,true, 2);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Mussarella",19.90,true, true, 1);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Chocolate",51.00,false, true, 4);
insert into tb_pizza (sabor, preco, salgada, vegetariana, categoria_id) values ("Sushi",60.00,true,false, 4);


select * from tb_pizza;
update tb_pizza set sabor = "Beringela" where id = 5;

select * from tb_pizza where preco > 45;
select * from tb_pizza where preco >= 29 and preco<=60;
select * from tb_pizza where sabor Like "%c%";
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where tb_categoria.id = 3;