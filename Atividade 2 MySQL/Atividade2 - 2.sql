CREATE DATABASE db_ecommerce;

use db_ecommerce;

create table tb_categoria(
id_categoria bigint auto_increment,
nome varchar(255) not null,
disponibilidade boolean,
primary key(id_categoria)
);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco double,
disponibilidade boolean,
quantidade int,
id_categoria bigint,
primary key(id),
foreign key(id_categoria) references tb_categoria(id_categoria)
);

insert into tb_categoria (nome,disponibilidade) values ("Blusas",true);
insert into tb_categoria (nome,disponibilidade) values ("Calças",true);
insert into tb_categoria (nome,disponibilidade) values ("Casacos",true);
insert into tb_categoria (nome,disponibilidade) values ("Acessórios",true);
insert into tb_categoria (nome,disponibilidade) values ("Camisetas",true);

insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa básica amarela",29.90,true,5);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa Muscle Tee lisa",59.90,true,4);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa Cropped",59.90,true,10);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Jaqueta Jeans Lisa",159.90,true,2);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Cardigan tricô",200.90,true,8);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Calça amarela",69.90,true,5);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Casaco marrom",150.00,true,4);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa rosa",39.90,true,10);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Calça Jeans ",189.90,true,2);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa verde",99.90,true,8);

select * from tb_produtos where preco >2000.00;
select * from tb_produtos where preco between 1000.00 and 2000.00;
select * from tb_funcionarios where nome like "C%";