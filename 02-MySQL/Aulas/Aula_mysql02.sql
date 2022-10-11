/* Criar um bancoDados: AULA02
Com uma tabela Computador, com os dados:
id,modelo,fabricante, tipo(netbook, notbook, desktop, gamer), preço e data fabricacao
*/
CREATE DATABASE aula02;

USE aula02;
CREATE TABLE Computador(
	ID int not null auto_increment primary key,
    DS_Modelo varchar(20),
    DS_Fabricante varchar(30),
    DS_Tipo varchar(20),
    DT_DataFabricacao date,
    NR_Valor real);

DESC Computador;

INSERT INTO Computador values (NULL,'Aspire 3','Acer','Notbook','2020-06-01',3200.00);
INSERT INTO Computador values (NULL,'Aspire 5','Acer','Notbook','2018-06-01',2600.00);
INSERT INTO Computador values (NULL,'Nitro 5','Acer','Notbook','2020-06-01',3000.00);
INSERT INTO Computador values (NULL,'320i','Lenovo','Notbook','2018-05-15',2500.00);
INSERT INTO Computador values (NULL,'MacbookAR 15','Apple','Notbook','2022-02-20',4000.00);

SHOW TABLES;

SELECT * FROM Computador;
SELECT DS_Modelo, NR_Valor FROM Computador WHERE DS_Fabricante = 'Acer';

SELECT DS_Modelo, NR_Valor FROM Computador WHERE DS_Fabricante LIKE '%A%';

UPDATE Computador SET NR_Valor = '15000.00' WHERE ID = 5;
UPDATE Computador SET DS_Fabricante = 'Positivo' WHERE ID = 4;

SELECT * FROM Computador;

DELETE FROM Computador WHERE id = 5;

INSERT INTO Computador values (NULL,'Aspire 8','HP','DESKTOP','2022-08-20',3800.00);

DELETE FROM Computador WHERE DS_Modelo = 'Notbook';

SELECT * FROM Computador;
