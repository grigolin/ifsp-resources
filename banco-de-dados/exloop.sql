-- 1
CREATE OR REPLACE FUNCTION verifica_imposto_renda()
RETURNS void AS $$
DECLARE
    empr RECORD;
BEGIN
    FOR empr IN SELECT * FROM empregado LOOP
        IF empr.salario <= 2259.20 THEN
            RAISE NOTICE 'Funcionário % não paga IR', empr.pNome;
        ELSE
            RAISE NOTICE 'Funcionário % paga IR', empr.pNome;
        END IF;
    END LOOP;
END;
$$ LANGUAGE plpgsql;

select verifica_imposto_renda()

-- 2 
CREATE OR REPLACE FUNCTION filmes_ator(id_ator integer)
returns setof record as $$
declare
	reg_ator_filme record;
begin
	FOR reg_ator_filme IN 
        SELECT f.nome, ator.nome
        FROM ator
		join atorEstrelaFilme aef on ator.idator = aef.idator
        JOIN filme f ON aef.codFilme = f.codFilme
        WHERE aef.idAtor = id_ator
    LOOP
        return next reg_ator_filme;
    END LOOP;
	
    RETURN;
end;
$$ language plpgsql;

-- 3

CREATE OR REPLACE FUNCTION get_filmes_por_ano(p_ano integer)
RETURNS setof RECORD AS $$
DECLARE
    regFilme RECORD;
BEGIN
    for 
		regFilme in select nome, extract(year from dtalanc)
		from filme 
		where extract(year from dtalanc) = p_ano
	loop
		return next regFilme;
	end loop;
	
    RETURN;
END;
$$ LANGUAGE plpgsql;

select * from get_filmes_por_ano(2002) as ("nome filme" varchar, "ano filme" numeric)