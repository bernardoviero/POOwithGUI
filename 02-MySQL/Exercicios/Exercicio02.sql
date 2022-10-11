#Exercício 02
/*
1)A adoção de animais de estimação é um gesto humano solidário e Franciscano. Assim também
pensa um ONG ficticia chamada vetCenter. Essa ONG precisa de um banco de dados para 
gerenciar/catalogar os mascotes que ela recolheu mas ruas e que serão encaminhados para a 
adoção.
Dessa forma, voce foi designado para criar essa base de dados e fornecer (via consultas SQL)
todas as informações que o diretor e os funcionário dessa ONG lhe solicitarem
1.1- Crie o banco vetCenter
1.2- Crie uma tabela Mascotes contendo (id, nome, tipo (cão, gato), sexo, raca, 
idade, data que foi encontrado, data que foi inserido na base de dados, 
estado de saude (ótimo, razoável, necessita cuidados)
1.3- Cadastre 10 bichinhos
Após o cadastro, responda as seguintes perguntas:
2.1-Qual o nome de todos os bichinhos cadastrados na base de dados?
2.2-Quais mascotes possuem mais do que 5 anos de idade?
2.3-Quais são as raças que necessitam cuidados?
2.4-Qual o sexo dos mascotes que estão ótimos de saúde?
2.5-Tem algum gato que necessite de cuidados?
2.6-Quais cães que estão razoáveis de saúde?
2.7-Quais os dias que foram encontrados os bichos de seo feminino?
2.8-Quais os dias que foram cadastrados no sistema os bichos da raça vira-latas?
2.9-Qual tipo de mascote cujo nome é Rex?
2.10- Qual a raça e a idade da cachorrinha Cindy?

3- Alterações 
3.1-Altere a raça de todos os cães para SRD (sem raça definida)
3.2-Altere para ótimo o estado de todos os gatos;

4-Eclusões
4.1 Exclua do banco de daos todos os bichinhos de estimação menores de 2 anos.
4.2 Exclua do banco de dados todos os gatos do sexo masculino.
*/

CREATE DATABASE vetCenter;

USE vetCenter;

CREATE TABLE Mascotes(
	ID int not null auto_increment primary key,
    DS_Nome varchar(20),
    DS_Sexo varchar(20),
    DS_Raca varchar(20),
	NR_Idade int,
    DT_DataEncontrado date,
    DT_InseridoNaDB date,
    DS_EstadoSaude varchar(20),
    DS_Tipo varchar(20)
);

INSERT INTO Mascotes values(NULL,'Pedroca','Masculino','Vira-lata',3,'2022-02-25','2022-10-11','necessita cuidados','cão');
INSERT INTO Mascotes values(NULL,'Buddy','Masculino','Pintier',6,'2021-02-25','2022-10-11','razoável','cão');
INSERT INTO Mascotes values(NULL,'Mafalda','Feminino','Vira-lata',3,'2021-05-30','2022-10-11','ótimo','gato');
INSERT INTO Mascotes values(NULL,'Megui','Feminino','Shiuaua',9,'2021-08-20','2022-10-11','ótimo','cão');
INSERT INTO Mascotes values(NULL,'Cindy','Masculino','Vira-lata',3,'2020-05-25','2022-10-11','ótimo','gato');
INSERT INTO Mascotes values(NULL,'Twelves','Masculino','Prego',2,'2020-01-25','2022-10-11','necessita cuidados','gato');
INSERT INTO Mascotes values(NULL,'Rex','Feminino','Vira-lata',5,'2022-01-10','2022-10-11','necessita cuidados','gato');
INSERT INTO Mascotes values(NULL,'Theo','Masculino','Vira-lata',9,'2019-05-30','2022-10-11','razoável','cão');
INSERT INTO Mascotes values(NULL,'Recruta','Feminino','Rei',2,'2020-01-22','2022-10-11','ótimo','Pinguim');
INSERT INTO Mascotes values(NULL,'Julian','Masculino','Lêmure',10,'2018-02-25','2022-10-11','ótimo','Primata');

# QTD MASCOTES
SELECT COUNT(*) FROM Mascotes;
# NOMES
SELECT DS_Nome from Mascotes;
# IDADE > 5 ANOS
SELECT * FROM Mascotes WHERE NR_Idade > 5;
# RAÇAM QUE NECESSITAM CUIDADOS
SELECT DS_Raca FROM Mascotes WHERE DS_EstadoSaude = 'necessita cuidados';
# SEXO ANIMAIS ÓTIMOS
SELECT DS_Sexo FROM Mascotes WHERE DS_EstadoSaude = 'ótimo';
# GATO COM NECESSIDADE CUIDADOS 
SELECT * FROM Mascotes WHERE DS_Tipo = 'gato' AND DS_EstadoSaude = 'necessita cuidados';
# NOME CAES COM SAUDE RAZOÁVEL
SELECT DS_Nome FROM Mascotes WHERE DS_EstadoSaude = 'razoável';
# DIAS ENCONTRATOS DOS BIXOS FEMININO
SELECT DAY(DT_DataEncontrado) FROM Mascotes WHERE DS_Sexo = 'feminino';
# DIAS CADASTRADOS NO SISTEMA OS VIRA-LATA
SELECT day(DT_InseridoNaDB) FROM Mascotes WHERE DS_Raca = 'Vira-lata';
# ANIMAL COM NOME REX
SELECT DS_Tipo from Mascotes WHERE DS_Nome = 'Rex';
# IDADE E RAÇA Cindy
SELECT NR_Idade, DS_Raca FROM Mascotes WHERE DS_Nome = 'Cindy';
# ALTERA A RAÇA DE TODOS OS CÃES PARA SRD
UPDATE Mascotes SET DS_Raca = 'SRD';
SELECT * FROM Mascotes;
# ESTADO OTIMO DE TODOS OS GATOS
UPDATE Mascotes SET DS_EstadoSaude = 'ótimo' WHERE DS_Tipo = 'gato';
SELECT * FROM Mascotes;
# Excluir bixo com idade < 2 anos
DELETE FROM Mascotes WHERE NR_Idade < 2;
SELECT * FROM Mascotes;
# Excluir os gatos masculinos
DELETE FROM Mascotes WHERE DS_Tipo = 'gato' and DS_Sexo = 'masculino';
SELECT * FROM Mascotes;
