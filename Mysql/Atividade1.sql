CREATE DATABASE db_rh;

use db_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
cargo varchar(255),
contrato boolean,
salario double,
primary key(id)
);

insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Felipe","desenvolvedor",true,5700.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("João","desenvolvedor front-end",true,6000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Marcos","Assistente administrativo",true,1800.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Joana","Design",true,4500.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Ana","Coordenadora",true,12000.00);

select * from tb_funcionarios where salario>2000.00;
select * from tb_funcionarios where salario<2000.00;

update tb_funcionarios set cargo = "desenvolvedor javascript" where id=1;
