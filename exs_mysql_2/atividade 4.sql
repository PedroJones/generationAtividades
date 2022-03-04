create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
disponivel boolean not null,
primary key (id)
);

insert into tb_categoria(tipo,disponivel) values ("Ácida",true);
insert into tb_categoria(tipo,disponivel) values ("Semiácida",true);
insert into tb_categoria(tipo,disponivel) values ("Doce",true);
insert into tb_categoria(tipo,disponivel) values ("Hiper-hídrica",true);
insert into tb_categoria(tipo,disponivel) values ("Oleoaginosa",true);


select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
tipo varchar (255) not null,
preco decimal(6,2) not null,
validade date not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produto (tipo, preco, validade, categoria_id) values ("Banana",10.00,"2021-12-03", 3);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Laranja",5.99,"2021-12-04", 1);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Manga",6.99,"2021-12-05", 2);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Melancia",8.99,"2021-12-11", 4);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Abacate",11.99,"2021-12-10", 5);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Maçã",10.90,"2021-12-03", 2);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Pêssego",9.99,"2021-12-06", 2);
insert into tb_produto (tipo, preco, validade, categoria_id) values ("Abacaxi",10.99,"2021-12-07", 1);


select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco > 3 and preco<60;
select * from tb_produto where tipo Like "%c%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.id = 2;