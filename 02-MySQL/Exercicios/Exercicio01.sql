/*Exercicios
Crie um banco AULA01, com tabela chamada Veículo, com campos: 
ID, marca, modelo, ano fabric. e valor;

1. Inserir 5 veiculos
2. Consultar veiculo com ID 3
3. Consultar as marcas
4. Consultas os valores
5. Quais veiculos sao GM;
*/
CREATE database Aula01;

USE Aula01;

CREATE table Veiculos(

	ID int not null auto_increment primary key,
	DS_Marca varchar(20),
    DS_Modelo varchar(50),
    NR_Fabricacao integer,
    NR_Valor real);
INSERT INTO Veiculos VALUES(NULL,'GM','Corsa',2020,12000.00);
INSERT INTO Veiculos VALUES(NULL,'GM','Celta',2008,800.00);
INSERT INTO Veiculos VALUES(NULL,'BMW','320i',2018,15000.00);
INSERT INTO Veiculos VALUES(NULL,'AUDI','A5',2008,1600.00);
INSERT INTO Veiculos VALUES(NULL,'Mistubish','L200',2015,3500.00);

SELECT * from Veiculos;
SELECT * from Veiculos where ID = 3;
SELECT DS_Marca from Veiculos;
SELECT NR_Valor from Veiculos;
SELECT * from Veiculos where DS_Marca = 'GM';