create database db_escola;

use db_escola;

create table tb_estudantes(
id bigint auto_increment,
nome varchar(255) not null,
serie varchar (255) not null,
turma varchar (255) not null,
nota decimal not null,
aprovado boolean,
primary key (id)
);

insert into tb_estudantes(nome, serie, turma, nota, aprovado)  values ("Marcela", "5º ano", "noite",1.3,false);
insert into tb_estudantes(nome, serie, turma, nota, aprovado)   values ("Iara", "7º ano", "manhã",8.8,true);
insert into tb_estudantes(nome, serie, turma, nota, aprovado)   values ("Pedro", "9º ano", "tarde",10.0,true);
insert into tb_estudantes(nome, serie, turma, nota, aprovado) values ("Jhonatan", "6º ano", "manhã",7.1,true);
insert into tb_estudantes(nome, serie, turma, nota, aprovado)  values ("Erick", "7º ano", "tarde",5.5,false);
insert into tb_estudantes(nome, serie, turma, nota, aprovado)  values ("Kayque", "8º ano", "tarde",6.9,false);
insert into tb_estudantes(nome, serie, turma, nota, aprovado)  values ("Rafa", "7º ano", "manhã",7.0,true);
insert into tb_estudantes(nome, serie, turma, nota, aprovado) values ("Aimeé", "7º ano", "noite",7.0,true);

alter table tb_estudantes modify nota decimal(8,2);
select * from tb_estudantes;
select * from tb_estudantes where nota >= 7.00;
select * from tb_estudantes where nota < 7.00;
update tb_estudantes set serie = "8º ano" where id = 2;
update tb_estudantes set serie = "1º ano EM" where id = 3;
update tb_estudantes set serie = "7º ano" where id = 4;
update tb_estudantes set serie = "8º ano" where id = 7;
update tb_estudantes set serie = "8º ano" where id = 8;

