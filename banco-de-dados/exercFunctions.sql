--1
CREATE OR REPLACE FUNCTION f_maiorSalario()
RETURNS VARCHAR AS
$$
DECLARE 
    nomeEmpregado empregado.pnome%TYPE;
    salarioEmpregado empregado.salario%TYPE;
BEGIN 
    SELECT pnome, salario 
    INTO nomeEmpregado, salarioEmpregado
    FROM empregado 
    WHERE salario = (SELECT MAX(salario) FROM empregado);

    RETURN nomeEmpregado || ' tem o maior salário, ganhando: ' || salarioEmpregado;
END
$$ LANGUAGE plpgsql;

SELECT f_maiorSalario();

--2
CREATE OR REPLACE FUNCTION f_atorEmFilmes(atorId INTEGER)
RETURNS VARCHAR AS 
$$
DECLARE 
    nomeAtor ator.nome%TYPE;
    qtdFilmes INTEGER;
BEGIN 
    SELECT ator.nome, COUNT(aef.codfilme)
    INTO nomeAtor, qtdFilmes
    FROM ator 
    INNER JOIN atorestrelafilme aef ON aef.idator = ator.idator
    WHERE ator.idator = atorId
    GROUP BY ator.nome;
    
    RETURN nomeAtor || ' participou de ' || qtdFilmes || ' filme(s).';
END
$$ LANGUAGE plpgsql;

SELECT f_atorEmFilmes(3);

--3
CREATE OR REPLACE FUNCTION f_insereEmp(
    id INTEGER, pnomeEmp VARCHAR, snomeEmp VARCHAR,
    idadeEmp INTEGER, salarioEmp REAL, cargoEmp VARCHAR)
RETURNS VARCHAR AS
$$
DECLARE
    result VARCHAR;
    checkId INTEGER;
BEGIN
    SELECT idEmp INTO checkId FROM empregado WHERE idEmp = id;
    
    IF checkId IS NOT NULL THEN
        RAISE NOTICE 'Chave duplicada %', id USING ERRCODE = 'unique_violation';
        RETURN 'Erro: ID já existe';
    END IF;
    
    INSERT INTO empregado(idEmp, pnome, snome, idade, salario, cargo)
    VALUES(id, pnomeEmp, snomeEmp, idadeEmp, salarioEmp, cargoEmp);
    
    result := id || ' ' || pnomeEmp || ' ' || snomeEmp || ' ' || idadeEmp || ' ' || salarioEmp || ' ' || cargoEmp;
              
    RETURN result;
END;
$$ LANGUAGE plpgsql;

SELECT f_insereEmp(26, 'Gabriel', 'Soares', 30, 2500, 'Tecnico');

--4
CREATE SEQUENCE sid_histSal;

CREATE TABLE histSalario(
    idHisSal INTEGER PRIMARY KEY,
    idEmp INTEGER,
    salario REAL,
    CONSTRAINT fk_empregado FOREIGN KEY(idEmp) REFERENCES empregado
);

CREATE OR REPLACE FUNCTION f_atualizaSalarioEmpregado(idEmpregado INTEGER, salarioEmp REAL)
RETURNS VARCHAR AS
$$
DECLARE 
    pnomeEmp empregado.pnome%TYPE;
    salEmp empregado.salario%TYPE;
BEGIN
    SELECT pnome, salario INTO pnomeEmp, salEmp FROM empregado WHERE idEmp = idEmpregado;
    
    IF salarioEmp <= salEmp THEN
        RETURN 'Erro: O novo salário deve ser maior que o salário atual (' || salEmp || ')';
    END IF;
    
    INSERT INTO histSalario VALUES(nextval('sid_histSal'), idEmpregado, salEmp);
    
    UPDATE empregado SET salario = salarioEmp WHERE idEmp = idEmpregado;
           
    RETURN pnomeEmp || ' tinha salário ' || salEmp || ' que foi atualizado para ' || salarioEmp;
END;
$$ LANGUAGE plpgsql;

SELECT f_atualizaSalarioEmpregado(1, 3300);

--5
CREATE OR REPLACE FUNCTION f_verificaEmpregadoESalario(idEmpregado INTEGER, salarioEmp REAL)
RETURNS VARCHAR AS
$$
DECLARE 
    pnomeEmp empregado.pnome%TYPE;
    salEmp empregado.salario%TYPE;
BEGIN
    SELECT pnome, salario INTO pnomeEmp, salEmp FROM empregado WHERE idEmp = idEmpregado;
    
    IF NOT FOUND THEN
        RAISE NOTICE 'O empregado não existe %', idEmpregado USING ERRCODE = 'ERR01';
        RETURN 'Erro: O empregado não existe';
    END IF; 
    
    IF salarioEmp <= salEmp THEN
        RETURN 'Erro: O novo salário deve ser maior que o salário atual (' || salEmp || ')';
    END IF;
    
    INSERT INTO histSalario VALUES(nextval('sid_histSal'), idEmpregado, salEmp);
    
    UPDATE empregado SET salario = salarioEmp WHERE idEmp = idEmpregado;
           
    RETURN pnomeEmp || ' tinha salário ' || salEmp || ' e foi atualizado para ' || salarioEmp;
END;
$$ LANGUAGE plpgsql;

SELECT f_verificaEmpregadoESalario(999, 4000);

--6
CREATE OR REPLACE FUNCTION f_insereFilme(codFilme INTEGER, titulo VARCHAR, anoLancamento INTEGER)
RETURNS VARCHAR AS
$$
DECLARE
    checkId filme.codfilme%TYPE;
BEGIN
    SELECT codfilme INTO checkId FROM filme WHERE codfilme = codFilme;

    IF checkId IS NOT NULL THEN
        RAISE NOTICE 'Código do filme já existe: %', codFilme USING ERRCODE = 'unique_violation';
        RETURN 'Erro: O código do filme já existe';
    END IF;

    INSERT INTO filme (codfilme, titulo, ano)
    VALUES (codFilme, titulo, anoLancamento);

    RETURN 'Filme inserido com sucesso: ' || titulo;
END;
$$ LANGUAGE plpgsql;

SELECT f_insereFilme(101, 'American Psycho', 2000);

CREATE OR REPLACE FUNCTION f_insereAtor(idAtor INTEGER, nome VARCHAR)
RETURNS VARCHAR AS
$$
DECLARE
    checkId ator.idator%TYPE;
BEGIN
    SELECT idator INTO checkId FROM ator WHERE idator = idAtor;

    IF checkId IS NOT NULL THEN
        RAISE NOTICE 'ID do ator já existe: %', idAtor USING ERRCODE = 'unique_violation';
        RETURN 'Erro: O ID do ator já existe';
    END IF;

    INSERT INTO ator (idator, nome)
    VALUES (idAtor, nome);

    RETURN 'Ator inserido com sucesso: ' || nome;
END;
$$ LANGUAGE plpgsql;

SELECT f_insereAtor(5, 'Cristiano Bale');
