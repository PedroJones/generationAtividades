create database db_funcionares;

use db_funcionares;

create table tb_funcionares(
id bigint auto_increment,
nome varchar(255) not null,
cargo varchar (255) not null,
salario decimal not null,
conta int,
lugar varchar (255) not null,
primary key (id)
);

insert into tb_funcionares(nome, cargo, salario, conta, lugar)  values ("Josef", "Estagiário", 1358.00,33421,"São Paulo");
insert into tb_funcionares(nome, cargo, salario, conta, lugar)  values ("Ygor", "Cientista de Dados", 5876.00,123456,"Rio de Janeiro");
insert into tb_funcionares(nome, cargo, salario, conta, lugar)  values ("Carlorina", "Gerente de Vendas", 5900.00,99292,"Paquistão");
insert into tb_funcionares(nome, cargo, salario, conta, lugar) values ("Gabriela", "Estagiária", 1358.00,23414,"Dubai");
insert into tb_funcionares(nome, cargo, salario, conta, lugar) values ("Antonio Estarque", "Metalurgico", 1999.00,887772,"Carapicuiba");

select * from tb_funcionares where salario > 2000.00;
select * from tb_funcionares where salario < 2000.00;
update tb_funcionares set cargo = "Ferreiro" where id = 5;
select * from tb_funcionares;





