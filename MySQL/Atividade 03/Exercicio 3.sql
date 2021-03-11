-- create database db;
use db;

create table tb (	id BigInt auto_increment,
					nome varchar(50),
					sala int,
					numero int,
					nota float,
                    
					primary key (id));

insert into tb(nome, sala, numero, nota) value("Aluno",1,1,6.5);
insert into tb(nome, sala, numero, nota) value("Bluno",2,4,5.9);
insert into tb(nome, sala, numero, nota) value("Cluno",3,3,9);
insert into tb(nome, sala, numero, nota) value("Dluno",4,7,7.1);
insert into tb(nome, sala, numero, nota) value("Eluno",5,9,4.0);

select * from tb where nota > 7;
select * from tb where nota < 7;

update tb set nota = 6.0 where id = 2;

select * from tb;