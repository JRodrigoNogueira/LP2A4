DROP DATABASE IF EXISTS LP2A4;

CREATE DATABASE IF NOT EXISTS LP2A4;

USE LP2A4;

CREATE TABLE IF NOT EXISTS Disciplina (
	idDisciplina INTEGER AUTO_INCREMENT,
    sigla VARCHAR(200) NOT NULL UNIQUE,
    nome VARCHAR(200) NOT NULL UNIQUE,
    semestre INTEGER NOT NULL,
    PRIMARY KEY (idDisciplina)
);

CREATE TABLE IF NOT EXISTS Aluno (
	matricula INTEGER,
    nome VARCHAR(200) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
	telefone VARCHAR(11) NOT NULL UNIQUE,
    responsavel VARCHAR(200) NOT NULL,
    semestre INTEGER NOT NULL,
    PRIMARY KEY (matricula)
);

CREATE TABLE IF NOT EXISTS Disciplina_Aluno (
	idDisciplinaAluno INTEGER AUTO_INCREMENT,
    matricula INTEGER NOT NULL,
    idDisciplina INTEGER NOT NULL,
    PRIMARY KEY (idDisciplinaAluno),
    FOREIGN KEY (matricula) REFERENCES Aluno(matricula),
    FOREIGN KEY (idDisciplina) REFERENCES Disciplina(idDisciplina)
);