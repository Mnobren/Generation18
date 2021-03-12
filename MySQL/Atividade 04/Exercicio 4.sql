create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria (	id BigInt auto_increment,
							nome varchar(30),
							tipo varchar(30),
							fornecedor varchar(30),
							primary key (id));

create table tb_produto (	id BigInt auto_increment,
							nome varchar(50),
							preco float,
							peso float,
							promocao float,
							disponivel boolean,
							categoria BigInt,
							primary key (id),
							foreign key (categoria) references tb_categoria(id));

insert into tb_categoria(nome, tipo, fornecedor) values ("bovina", "vermelha", "Fazenda Faznada");
insert into tb_categoria(nome, tipo, fornecedor) values ("suína", "vermelha", "Pork In Shop");
insert into tb_categoria(nome, tipo, fornecedor) values ("ave", "branca", "Aves Javes");
insert into tb_categoria(nome, tipo, fornecedor) values ("peixe", "branca", "Tubarinho e cia");
insert into tb_categoria(nome, tipo, fornecedor) values ("embustidos", "indefinido", "Life's Rolling m.e.");

insert into tb_produto(nome, preco, categoria) values ("Costela", 40, 1);
insert into tb_produto(nome, preco, categoria) values ("T-Bone", 70, 1);
insert into tb_produto(nome, preco, categoria) values ("Bacon", 39, 2);
insert into tb_produto(nome, preco, categoria) values ("Pernil", 50, 2);
insert into tb_produto(nome, preco, categoria) values ("Peru", 60, 3);
insert into tb_produto(nome, preco, categoria) values ("Frango", 28, 3);
insert into tb_produto(nome, preco, categoria) values ("Cação", 45, 4);
insert into tb_produto(nome, preco, categoria) values ("Salsicha", 10, 5);

select * from tb_produto where preco > 50;
select * from tb_produto where 3 < preco and preco < 60;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_produto.categoria = tb_categoria.id;

select * from tb_produto where categoria = 1;