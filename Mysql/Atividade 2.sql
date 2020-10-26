CREATE DATABASE db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco double,
disponibilidade boolean,
quantidade int,
primary key(id)
);

insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa básica amarela",29.90,true,5);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa Muscle Tee lisa",59.90,true,4);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Blusa Cropped",59.90,true,10);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Jaqueta Jeans Lisa",159.90,true,2);
insert into tb_produtos (nome, preco, disponibilidade, quantidade) values ("Cardigan tricô",99.90,true,8);

select * from tb_produtos where preco >500.00;
select * from tb_produtos where preco <500.00;

update tb_produtos set preco = 180.00 where id=1;