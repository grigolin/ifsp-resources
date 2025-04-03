-- =============================================
-- RESPOSTAS DAS QUESTÕES SOBRE POSTGRESQL
-- =============================================

/*
Questão sobre TRIGGERs no PostgreSQL:
Uma TRIGGER pode ser criada para executar antes (BEFORE) ou após (AFTER) as
consultas INSERT, UPDATE ou DELETE. Quanto aos conceitos de TRIGGERs no
PostgreSQL, é correto afirmar que:

RESPOSTA CORRETA: a

Justificativas:
a) CORRETA - A função de gatilho deve ser declarada como uma FUNCTION que retorna TRIGGER
b) ERRADA - Triggers não são invocadas diretamente, são acionadas automaticamente por eventos DML
c) ERRADA - A trigger é criada imediatamente, não apenas após comandos DML
d) ERRADA - FOR EACH ROW é parte da criação da trigger, não da função
*/

-- Exemplo prático de trigger correta:
CREATE OR REPLACE FUNCTION registra_auditoria() 
RETURNS TRIGGER AS $$
BEGIN
    -- Corpo da função
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

/*
Questão sobre sentenças PL/pgSQL:
I – Uma variável pode ser declarada como tabela%rowtype
II – O comando RAISE NOTICE
III – Uma variável do tipo RECORD pode ser utilizada em FOR

RESPOSTA CORRETA: b (I e III corretas)

Justificativas:
I) CORRETA - %rowtype captura a estrutura completa de uma linha da tabela
II) ERRADA - Falta referência à variável no RAISE NOTICE (deveria ser reg.nome, não tabela.nome)
III) CORRETA - RECORD é flexível e pode armazenar resultados de consultas para uso em loops
*/

-- Exemplo prático:
CREATE OR REPLACE FUNCTION exemplo_record() RETURNS VOID AS $$
DECLARE
    reg_emp empregado%rowtype;  -- I está correta
    reg_query RECORD;           -- III está correta
BEGIN
    -- II estaria correta se fosse: RAISE NOTICE 'Pessoa %', reg_emp.nome;
    FOR reg_query IN SELECT * FROM empregado LOOP  -- III está correta
        -- Processamento
    END LOOP;
END;
$$ LANGUAGE plpgsql;

/*
Questão sobre a VIEW BIOLOGO_VW:
I – Seleciona nome, endereco, telefone
II – É materializada
III – Alterações na tabela são refletidas

RESPOSTA CORRETA: e (apenas III correta)

Justificativas:
I) ERRADA - Seleciona apenas funcionários com codigo_biologo=674, não "todos os biólogos"
II) ERRADA - É uma view normal (materialized usa CREATE MATERIALIZED VIEW)
III) CORRETA - Views normais refletem alterações nas tabelas base quando executadas
*/

-- Exemplo complementar:
CREATE VIEW exemplo_view AS 
SELECT nome FROM funcionario WHERE departamento = 'TI';  -- View normal (não materializada)

/*
Questão sobre sentenças diversas:
I – DROP TRIGGER
II – REFRESH MATERIALIZED VIEW
III – Trigger em várias tabelas

RESPOSTA CORRETA: c (apenas II correta)

Justificativas:
I) ERRADA - O comando correto é DROP TRIGGER nome ON tabela
II) CORRETA - Este é o comando para atualizar views materializadas
III) ERRADA - Uma trigger está associada a uma única tabela
*/

-- Exemplo correto de DROP TRIGGER:
-- DROP TRIGGER trg_logCliente ON cliente;

/*
Questão sobre inserções na tabela CARRO:
Considerando restrições de unicidade não especificadas, mas analisando os valores:

RESPOSTA CORRETA: d (apenas duas linhas com id_carro 1 e 2)

Justificativas:
- A sequência começa em 1 (I: id=1, II: id=2, III: id=3, IV: id=4)
- Se houver restrição UNIQUE na placa ('AAA-1100' e 'AAB-1100'), apenas I e III seriam inseridas
- Como não há informações sobre constraints, assume-se que todas são inseridas (resposta a)
- PORÉM, a questão sugere que apenas duas linhas são inseridas, então provavelmente há UNIQUE na placa
*/

-- Exemplo da estrutura provável:
CREATE TABLE carro (
    id_carro INTEGER PRIMARY KEY DEFAULT nextval('sid_carro'),
    placa VARCHAR(10) UNIQUE,  -- Supondo esta restrição
    -- outros campos
);

/*
Questão sobre a função f_listaCargo:
I – Erro devido ao tipo RECORD
II – Executa sem erros
III – Não é possível armazenar resultado

RESPOSTA CORRETA: b (apenas II correta)

Justificativas:
I) ERRADA - RECORD é um tipo válido em PL/pgSQL
II) CORRETA - A sintaxe está correta (FOR var IN query LOOP)
III) ERRADA - É exatamente para isso que serve o RECORD em loops
*/

-- Correção do código (já está correto):
CREATE OR REPLACE FUNCTION f_listaCargo(cargoEmp VARCHAR) RETURNS VOID AS $$
DECLARE
    regEmp RECORD;
BEGIN
    FOR regEmp IN SELECT pnome, cargo, salario, idade FROM empregado
                 WHERE cargo = cargoEmp  -- Note a ausência do ; aqui
    LOOP
        RAISE NOTICE '%', regEmp;
    END LOOP;
END;
$$ LANGUAGE plpgsql;

/*
Questão sobre comandos SQL:
I – CREATE VIEW
II – CREATE TRIGGER

RESPOSTA CORRETA: e (é possível selecionar colunas específicas da view)

Justificativas:
a) ERRADA - A trigger T é criada na tabela R, não o contrário
b) ERRADA - Pode-se selecionar colunas específicas (SELECT marca, modelo FROM v_Carro)
c) ERRADA - É uma view normal, não materializada
d) ERRADA - O comando II está sintaticamente correto
e) CORRETA - Views permitem selecionar subconjuntos de colunas
*/

-- =============================================
-- RESUMO DOS TÓPICOS PRINCIPAIS
-- =============================================

/*
1. TRIGGERS:
- São funções especiais (RETURNS TRIGGER) acionadas por eventos DML
- Podem ser BEFORE/AFTER INSERT/UPDATE/DELETE
- Acessam dados via OLD (valores antigos) e NEW (valores novos)
- Sintaxe: CREATE TRIGGER nome ON tabela FOR EACH ROW EXECUTE FUNCTION fn()

2. VIEWS:
- "Tabelas virtuais" baseadas em consultas SQL
- Views normais: sempre refletem os dados atuais das tabelas base
- Materialized Views: armazenam resultados fisicamente (necessitam de REFRESH)
- Podem ser usadas para simplificar consultas complexas ou controlar acesso

3. SEQUÊNCIAS:
- Geram valores numéricos sequenciais (ex: para PKs)
- Comandos: nextval(), currval()
- Podem ser usadas como DEFAULT em colunas

4. PL/pgSQL:
- Linguagem procedural para funções no PostgreSQL
- Tipos especiais: %rowtype (estrutura de tabela) e RECORD (flexível)
- Estruturas de controle: IF/THEN/ELSE, LOOP, WHILE, FOR
- RAISE NOTICE para mensagens de depuração

5. RESTRIÇÕES:
- PRIMARY KEY: identifica unicamente cada linha
- FOREIGN KEY: mantém integridade referencial
- UNIQUE: valores únicos em colunas não-PK
- CHECK: validações customizadas (ex: valor > 100)
- NOT NULL: impede valores nulos
*/

-- =============================================
-- FIM DO ARQUIVO
-- =============================================