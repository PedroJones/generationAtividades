CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categorias(
 id bigint not null auto_increment,
 nome varchar(100) not null,
 ativa boolean,
 primary key (id)
);

INSERT INTO tb_categorias (nome, ativa) VALUES ("Medicamentos", true);
INSERT INTO tb_categorias (nome, ativa) VALUES ("Medicamentos controlados", true);
INSERT INTO tb_categorias (nome, ativa) VALUES ("Higiene", true);
INSERT INTO tb_categorias (nome, ativa) VALUES ("Beleza", true);
INSERT INTO tb_categorias (nome, ativa) VALUES ("Suplemento", true);

CREATE TABLE tb_produtos(
 id bigint not null auto_increment,
 nome varchar(100) not null,
 descricao varchar(255),
 quantidade bigint,
 preco decimal not null,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categorias(id)
);

INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Buscopan", "reduz cólicas", 140, 20, 1);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Paroxetina", "antidepressivo", 122, 50, 2);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Desodorante Dove", "banho", 190, 15, 3);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Esmalte Impala", "esmalte", 144, 5, 4);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Centrum", "vitamina", 111, 150, 5);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Dorflex", "relaxante muscular", 100, 20, 1);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Topiramato", "estabiliza humor", 177, 60, 2);
INSERT INTO tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Shampoo Pantene", "cabelos", 124, 20, 3);

SELECT * FROM tb_produtos;
SELECT * FROM tb_categorias;
SELECT * FROM tb_produtos WHERE preco > 50;
SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produtos WHERE nome LIKE "%B%";
SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE tb_categorias.id = 1;
