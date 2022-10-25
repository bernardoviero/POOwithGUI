/*
     Criar um sistema de agendamento para reuniões/compromissos, entre os colaboradores.
     Em que eles possam reservar salas, em determinado dia e hora; para realização de reuniões internas.
     
     Nome tabelas: Funcionarios & Agendamento
     Funcionarios: (ID,Nome,email,cargo)
     Agendamento; (ID,FK_FUCNIONARIO,data,hora,local,tipo(reuniao,comemoração...))
*/

CREATE DATABASE Aula03_agendamento;

use Aula03_agendamento;
show TABLES;

create table Funcionarios(
	ID int not null auto_increment primary key,
    DS_Nome varchar(40),
    DS_Email varchar(50),
    DS_Cargo varchar(30)
);

DESC Funcionarios;

create table Agendamento(
	ID int not null auto_increment primary key,
    ID_fkFuncionario int,
    DT_Data date,
    HR_Hora time,
    local varchar(30),
    foreign key (ID) references Funcionarios(ID)
);

INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)
values('Joao Carlos','jc@gmail.com','Diretor de TI');
INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)
values('Pedro João','ppj@gmail.com','Coordenador de TI');
INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)
values('Bernardo Viero','bviero@gmail.com','Desenvolvedor');
INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)
values('Carlos Rodrigues','cgremio1093@gmail.com','Estagiario TI');
INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)
values('Pedro Guilherme','pgamer@gmail.com','Auxiliar Administrativo');

SELECT * FROM Funcionarios;

INSERT INTO Agendamento(ID_fkFuncionario,DT_Data,HR_Hora,local)
values(1,'2022-10-20','08:30','cantina');
INSERT INTO Agendamento(ID_fkFuncionario,DT_Data,HR_Hora,local)
values(1,'2022-11-10','09:30','sala 204');
INSERT INTO Agendamento(ID_fkFuncionario,DT_Data,HR_Hora,local)
values(2,'2022-11-20','12:10','sala 315');
INSERT INTO Agendamento(ID_fkFuncionario,DT_Data,HR_Hora,local)
values(3,'2022-11-22','09:20','sala 205');
INSERT INTO Agendamento(ID_fkFuncionario,DT_Data,HR_Hora,local)
values(4,'2022-12-31','16:30','salao azul');

SELECT * FROM Agendamento;

SELECT
DISTINCT
DS_Nome, DS_Cargo, DT_Data, HR_Hora
FROM Funcionarios, Agendamento
WHERE Agendamento.ID_fkFuncionario is not null;
#sala 204
SELECT
DS_Nome
FROM Funcionarios, Agendamento
WHERE local = 'sala 204';
#possuem reserva no horario das 16h

SELECT
DS_Nome
FROM Funcionarios, Agendamento
WHERE HR_Hora = '16:30';

#Nome funcionarios, q tem reserva no dia 31/12
SELECT
DS_Nome
FROM Funcionarios, Agendamento
WHERE DT_Data = '2022-12-31';



#exercicio:
    #utilizar o banco de dados e as tabelas criadas para responder as seguintes perguntas:
    
    #1- qual o nome e email dos funcionarios que reservaram a sala 203:
    SELECT
	DS_Nome, DS_Email
	FROM Funcionarios, Agendamento
	WHERE local = 'sala 203';
	#2- qual o cargo dos funcionarios que possuem reserva para reuniao
    
    #3- qual nome e cargo dos funcionarios que possuem reserva em algum dia apos as 16:00
    
    #4- quais sao os funcionarios que possuem reservar da sala 206 apos as 18h?
    
    #5- quais funcionarios reservaram salas antes das 18h por motivo de comemoração/festa?
    
    #6- tem algum dirtero que reservou a sala para comemoração
    
    #7- quais sao os funcionario que possuem reserva para festa asntes das 23h




