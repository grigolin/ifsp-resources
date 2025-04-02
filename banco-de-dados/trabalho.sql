-- 1
CREATE TABLE carro (
    chassi VARCHAR(17),
    renavam VARCHAR(15),
    preco REAL,
    modelo VARCHAR(30),
    ano INTEGER,
    CONSTRAINT pk_carro PRIMARY KEY (chassi),
    CONSTRAINT un_carro UNIQUE (renavam),
    CONSTRAINT check_ano CHECK (ano > (extract(year from current_date) -15)));

-- 2
CREATE SEQUENCE sid_carro START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 10000;

--CLIENTE (idCli, nomeCli, rua, nro, cidade, CEP, dtaNasc)
--PEDIDO (idPed, dtaPed, totalPed, status, idCli (FK CLIENTE))
--PRODUTO (idProd, nomeProd, marcaProd, preco, avaliação)
--PEDIDOPRODUTO(idPed (FK PEDIDO), idProd (FK PRODUTO), qtdade)
--AVALIAPEDIDOPRODUTO(idCli (FK CLIENTE), idPed (FK PEDIDOPRODUTO), idProd(FK PEDIDOPRODUTO), nota, dtaAvaliacao)

-- 3
CREATE VIEW v_clientes_nuncacompraram AS
SELECT nomeCli from cliente where idCli not in (select idCli from pedido);

-- 4
CREATE OR REPLACE FUNCTION f_clientes_aniversario_mes(mes numeric)
RETURNS SETOF VARCHAR AS $$
declare
    reg record;
BEGIN
    for reg in SELECT nomeCli, EXTRACT(MONTH FROM dtaNasc) as mes_nasc FROM cliente WHERE 
	EXTRACT(MONTH FROM dtaNasc) = mes
        LOOP
            RETURN NEXT reg.nomeCli || ' faz aniversario no mes ' || reg.mes_nasc;
        END LOOP;
END;
$$ LANGUAGE plpgsql;

select * from f_clientes_aniversario_mes(10)

-- 5

CREATE OR REPLACE FUNCTION block_avaliacao()
RETURNS TRIGGER AS $$
BEGIN
    IF (SELECT status 
        FROM PEDIDO 
        WHERE idPed = NEW.idPed) <> 'Entregue' THEN
        RAISE EXCEPTION 'Não devem ser avaliados pedidos não entregues';
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER trg_block_avaliacao BEFORE INSERT ON AVALIAPEDIDOPRODUTO
FOR EACH ROW
EXECUTE PROCEDURE block_avaliacao();
END

-- 6

CREATE OR REPLACE FUNCTION att_avaliacao_produto()
RETURNS TRIGGER AS $$
BEGIN
    IF (SELECT status 
        FROM PEDIDO 
        WHERE idPed = NEW.idPed) <> 'Entregue' THEN
        RAISE EXCEPTION 'Não devem ser atualizadas avaliações de pedidos não entregues';
    END IF;

    UPDATE PRODUTO
    SET avaliacao = (
		SELECT AVG(nota)
        FROM avaliaPedidoProduto
        WHERE idProd = NEW.idProd)
    WHERE idProd = NEW.idProd;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER trg_update_avaliacao
AFTER INSERT ON avaliaPedidoProduto
FOR EACH ROW
EXECUTE PROCEDURE att_avaliacao_produto();

-- 7
-- A

-- 8
-- B

-- 9
-- E

-- 10
-- C