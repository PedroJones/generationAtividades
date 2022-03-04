create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
pago boolean not null,
certificado boolean not null,
primary key (id)
);

insert into tb_categoria(tipo,pago, certificado) values ("Programação",true,true);
insert into tb_categoria(tipo,pago, certificado) values ("Web Deseign",true,true);
insert into tb_categoria(tipo,pago, certificado) values ("Marketing",false,false);
insert into tb_categoria(tipo,pago, certificado) values ("Administração",false,false);
insert into tb_categoria(tipo, pago,certificado) values ("Data Science",true,true);


select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
duracao varchar (255) not null,
avaliacao decimal(6,2) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Java",29.90,"6h", 4.7, 1);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Adobe XD",69.00,"5h", 4.8, 2);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Gestão & Inovação",00.00,"7h", 4.2, 4);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Marketing Digital",00.00,"6h", 4.9, 3);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Python",52.00,"6h", 5, 1);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Data Science",29.90,"5h", 4.9, 5);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Front-End",29.90,"4h", 4.4, 1);
insert into tb_produto (nome, preco, duracao, avaliacao, categoria_id) values ("Blender",61.90,"5h", "4.5", 2);


select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco > 3 and preco<60;
select * from tb_produto where nome Like "J%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.id = 1;