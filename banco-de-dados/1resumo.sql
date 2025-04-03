-- =============================================
-- ADMINISTRAÇÃO DE BANCO DE DADOS - EXEMPLOS PRÁTICOS
-- Baseado na aula de revisão do Prof. Dr. Rafael Garcia Leonel Miani
-- =============================================

-- 1. RESTRIÇÕES (CONSTRAINTS)
-- =============================================

-- Exemplo 1: CHECK (valor mínimo para empréstimo)
CREATE TABLE emprestimo (
    id SERIAL PRIMARY KEY,
    valor NUMERIC(10,2) CONSTRAINT ck_valor CHECK (valor > 100)
);

-- Inserções válidas/inválidas
INSERT INTO emprestimo (valor) VALUES (150); -- OK
-- INSERT INTO emprestimo (valor) VALUES (50);  -- ERRO (viola CHECK)

-- Exemplo 2: UNIQUE (email único)
CREATE TABLE pessoa (
    id SERIAL PRIMARY KEY,
    email VARCHAR(100) UNIQUE
);

INSERT INTO pessoa (email) VALUES ('joao@email.com'); -- OK
-- INSERT INTO pessoa (email) VALUES ('joao@email.com'); -- ERRO (duplicado)

-- Exemplo 3: CHECK com estados permitidos
CREATE TABLE cliente (
    codigo SERIAL PRIMARY KEY,
    estado CHAR(2) CONSTRAINT ck_estado CHECK (estado IN ('SP', 'MG', 'RJ'))
);

-- 2. SEQUÊNCIAS
-- =============================================

-- Criando sequência para IDs de clientes
CREATE SEQUENCE sid_cliente 
START WITH 100 
INCREMENT BY 2;

-- Usando em uma tabela
CREATE TABLE cliente_sequencia (
    id INTEGER PRIMARY KEY DEFAULT nextval('sid_cliente'),
    nome VARCHAR(50)
);

-- Inserções (a sequência gera os IDs)
INSERT INTO cliente_sequencia (nome) VALUES ('Ana');
INSERT INTO cliente_sequencia (nome) VALUES ('Pedro');

-- Consultando valor atual
SELECT currval('sid_cliente');

-- 3. VIEWS
-- =============================================

-- Criando tabela base para exemplos
CREATE TABLE aluno (
    prontuario VARCHAR(10) PRIMARY KEY,
    nome VARCHAR(100),
    sexo CHAR(1),
    curso VARCHAR(50)
);

INSERT INTO aluno VALUES ('A123', 'Maria', 'F', 'Medicina');
INSERT INTO aluno VALUES ('A124', 'João', 'M', 'Engenharia');

-- View simples (alunas mulheres)
CREATE OR REPLACE VIEW v_alunas AS
SELECT * FROM aluno WHERE sexo = 'F';

-- Materialized View (contagem por curso)
CREATE MATERIALIZED VIEW mv_cursos_count AS
SELECT curso, COUNT(*) AS total
FROM aluno
GROUP BY curso;

-- Atualizando materialized view
REFRESH MATERIALIZED VIEW mv_cursos_count;

-- 4. FUNÇÕES (PL/pgSQL)
-- =============================================

-- Função básica (saudação)
CREATE OR REPLACE FUNCTION saudacao(nome VARCHAR) 
RETURNS VARCHAR AS $$
BEGIN
    RETURN 'Olá, ' || nome || '!';
END;
$$ LANGUAGE plpgsql;

-- Função com condicional (classificação)
CREATE OR REPLACE FUNCTION classifica_idade(idade INTEGER) 
RETURNS VARCHAR AS $$
BEGIN
    IF idade < 12 THEN RETURN 'Criança';
    ELSIF idade < 18 THEN RETURN 'Adolescente';
    ELSIF idade < 60 THEN RETURN 'Adulto';
    ELSE RETURN 'Idoso';
    END IF;
END;
$$ LANGUAGE plpgsql;

-- Função com SELECT INTO
CREATE TABLE empregado (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    salario NUMERIC(10,2)
);

INSERT INTO empregado (nome, salario) VALUES ('Carlos', 5000);

CREATE OR REPLACE FUNCTION get_salario(id_emp INTEGER)
RETURNS NUMERIC AS $$
DECLARE
    sal NUMERIC;
BEGIN
    SELECT salario INTO sal FROM empregado WHERE id = id_emp;
    RETURN sal;
END;
$$ LANGUAGE plpgsql;

-- 5. LOOPS
-- =============================================

-- WHILE (popular tabela)
CREATE OR REPLACE FUNCTION popula_empregados(qtd INTEGER)
RETURNS VOID AS $$
DECLARE
    i INTEGER := 1;
BEGIN
    WHILE i <= qtd LOOP
        INSERT INTO empregado (nome, salario)
        VALUES ('Empregado ' || i, 1000 + (i * 100));
        i := i + 1;
    END LOOP;
END;
$$ LANGUAGE plpgsql;

-- FOR (somatório)
CREATE OR REPLACE FUNCTION somatorio(n INTEGER)
RETURNS INTEGER AS $$
DECLARE
    total INTEGER := 0;
BEGIN
    FOR i IN 1..n LOOP
        total := total + i;
    END LOOP;
    RETURN total;
END;
$$ LANGUAGE plpgsql;

-- 6. TRIGGERS
-- =============================================

-- Tabela de auditoria
CREATE TABLE auditoria_salarios (
    id SERIAL PRIMARY KEY,
    id_emp INTEGER,
    salario_antigo NUMERIC,
    salario_novo NUMERIC,
    data_alteracao TIMESTAMP
);

-- Função da trigger
CREATE OR REPLACE FUNCTION registra_alteracao_salario()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.salario <> OLD.salario THEN
        INSERT INTO auditoria_salarios (id_emp, salario_antigo, salario_novo, data_alteracao)
        VALUES (OLD.id, OLD.salario, NEW.salario, NOW());
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Criando a trigger
CREATE TRIGGER tg_auditoria_salario
AFTER UPDATE ON empregado
FOR EACH ROW
EXECUTE FUNCTION registra_alteracao_salario();

-- Testando a trigger
UPDATE empregado SET salario = 6000 WHERE id = 1;

-- =============================================
-- FIM DO ARQUIVO
-- =============================================