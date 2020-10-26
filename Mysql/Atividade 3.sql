CREATE DATABASE db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
turma varchar(255),
nota double,
professor varchar(255),
primary key(id)
);

insert into tb_alunos (nome, turma, nota, professor) values ("Felipe","A",7.9,"Alberto");
insert into tb_alunos (nome, turma, nota, professor) values ("Aline","A",5.5,"Alberto");
insert into tb_alunos (nome, turma, nota, professor) values ("Maria","A",9.5,"Alberto");
insert into tb_alunos (nome, turma, nota, professor) values ("Joana","A",4.0,"Alberto");
insert into tb_alunos (nome, turma, nota, professor) values ("Pedro","A",6.0,"Alberto");

select * from tb_alunos where nota>7.0;
select * from tb_alunos where nota<7.0;

update tb_alunos set nota = 8.0 where id=1;


