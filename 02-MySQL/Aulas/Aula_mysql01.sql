create database aulaDB;
use aulaDB;
#criar tabela e utilizar elas.

SHOW TABLES;
#exibir as tabelas do banco

CREATE TABLE Pessoa(
	ID int not null auto_increment primary key,
    DS_Nome varchar(20),
    DS_Email varchar(50),
    DT_Nascimento date,
    NR_Matricula int unique) ;
#criar a tabela no banco
DESC Pessoa;
#ver descritivo da tabela
ALTER table Pessoa drop NR_Matricula;
#alterando a tabela
ALTER table Pessoa add DS_Cidade varchar(30);
#inserir o campo na tabela
INSERT INTO Pessoa VALUES(NULL,'Bernardo Viero','bernardo,viero@ufn.edu.br','2002-01-15','Santa Flora');
INSERT INTO Pessoa(DS_Nome,DT_Nascimento,DS_Cidade) VALUES('Carlos João','1963-02-2','Santa Rita');
INSERT INTO Pessoa VALUES(NULL,'Antonio Viero','antonio.viero@ufn.edu.br','1969-02-22','Santa Maria');
#inserir registro na tabela
SELECT * FROM Pessoa;
#exibir valores da TABELA
UPDATE Pessoa SET DS_Email = 'bernardo.viero@ufn.edu.br' WHERE ID = 1;
#editar dados da table
SELECT DS_Nome from Pessoa;
SELECT DS_Email from Pessoa where ID = 3;
#consulta customizada
