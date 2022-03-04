create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
categoria varchar (255) not null,
preco decimal not null,
quantidade int,
disponivel boolean,
primary key (id)
);

insert into tb_produtos(nome, categoria, preco, quantidade, disponivel)  values ("Suor de Bufallo", "Perfume", 3400.00,1000,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel)  values ("Farofa de Banana", "Alimentos", 12.00,0,false);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel)  values ("Sangue de Tarantula", "Bebidas", 1.99,20000000,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel) values ("Maionese Réumãs", "Alimentos", 10.00,11,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel) values ("Cereal Sadia", "Alimentos", 20.00,2999,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel) values ("Aí Fone", "Tecnologia", 3999.99,5,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel) values ("Tênis Olímpica", "Esportivos", 59.99,6,true);
insert into tb_produtos(nome, categoria, preco, quantidade, disponivel) values ("Camiseta Naique", "Esportivos", 19.99,2,true);

select * from tb_produtos;
select * from tb_produtos where preco > 500.00;
select * from tb_produtos where preco < 500.00;
update tb_produtos set quantidade = 0 where id = 8;
update tb_produtos set disponivel = false where id = 8;
