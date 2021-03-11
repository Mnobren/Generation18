-- create database db;
use db;

create table tb (	id BigInt auto_increment,
					nome varchar(50),
					marca varchar (50),
					peso float,
					valor float,
                    
					primary key (id));

insert into tb(nome, marca, peso, valor) value("Achocolatado","Nescau",0.5,6.0);
insert into tb(nome, marca, peso, valor) value("Manteiga","Vigor",0.3,5.0);
insert into tb(nome, marca, peso, valor) value("Pao de Forma","Pullman",0.5,6.99);
insert into tb(nome, marca, peso, valor) value("Bolo","Panco",0.4,6.0);
insert into tb(nome, marca, peso, valor) value("Leite","Italac",0.5,4.0);

select * from tb where valor > 500;
select * from tb where valor < 500; 

update tb set valor = 7.0 where id = 3;

select * from tb;