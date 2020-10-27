CREATE DATABASE db_RH2;

use db_RH;

create table tb_cargo(
id_cargo bigint auto_increment,
cargo varchar(255) not null,
departamento varchar(255),
primary key(id_cargo)
);

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
cargo varchar(255) not null,
contrato boolean,
salario double,
id_cargo bigint,
primary key(id),
foreign key(id_cargo) references tb_cargo(id_cargo)
);

insert into tb_cargo (cargo, contrato, departamento) values ("Gerente", RH);
insert into tb_cargo (cargo, contrato, departamento) values ("Assistente", RH);
insert into tb_cargo (cargo, contrato, departamento) values ("Analista", RH);

insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Felipe","Gerente",true,5700.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("João","Assistente",true,6000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Marcos","Assistente",true,1800.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Joana","Analista",true,4500.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Ana","Assistente",true,12000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Gilmar","Analista",true,12000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Juliana","Assistente",true,12000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Matheus","Analista",true,12000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Joaquim","Assistente",true,12000.00);
insert into tb_funcionarios (nome, cargo, contrato,salario) values ("Guilherme","Analista",true,12000.00);


select * from tb_funcionarios where salario>2000.00;
select * from tb_funcionarios where salario between 1000.00 AND 2000.00;
select * from tb_funcionarios where nome like "C%";
