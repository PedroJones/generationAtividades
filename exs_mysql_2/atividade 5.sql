create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
disponivel boolean not null,
primary key (id)
);

insert into tb_categoria(tipo,disponivel) values ("Blocos e Tijolos",true);
insert into tb_categoria(tipo,disponivel) values ("Calhas e Rufos",true);
insert into tb_categoria(tipo,disponivel) values ("Ferramentas",true);
insert into tb_categoria(tipo,disponivel) values ("Telhas",true);


select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
tipo varchar (255) not null,
preco decimal(6,2) not null,
avaliacao decimal(6,2) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Bloco Cerâmico",1.99, 4.9, 1);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Rufo Pigadeira",44.96,4.0, 2);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Condutor Retangular",42.42,3.7, 2);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Desempanadeira",18.62,5.0, 3);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Martelo",11.67,4.6, 3);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Telha de PVC",106.16,4.2, 4);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Telha Ondulada",59.44,3.8, 4);
insert into tb_produto (tipo, preco, avaliacao, categoria_id) values ("Bloco de Vidro",14.99,5.0, 1);


select * from tb_produto;
update tb_produto set tipo = "Rufo Pingadeira" where id = 2;
select * from tb_produto where preco > 50;
select * from tb_produto where preco > 3 and preco<60;
select * from tb_produto where tipo Like "%c%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.id = 4;