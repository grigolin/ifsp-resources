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
--AVALIACAOPEDIDOPRODUTO(idCli (FK CLIENTE), idPed (FK PEDIDOPRODUTO), idProd(FK PEDIDOPRODUTO), nota, dtaAvaliacao)

-- 3
CREATE VIEW v_clientes_nuncacompraram AS
SELECT nomeCli from cliente where idCli not in (select idCli from pedido);

-- 4
CREATE OR REPLACE FUNCTION f_clientes_aniversario_mes(mes numeric)
RETURNS SETOF VARCHAR AS $$
declare
    reg record;
BEGIN
    for reg in SELECT nomeCli, EXTRACT(MONTH FROM dtaNasc) as mes_nasc FROM cliente WHERE EXTRACT(MONTH FROM dtaNasc) = mes
        LOOP
            RETURN NEXT reg.nomeCli || ' faz aniversario no mes ' || reg.mes_nasc;
        END LOOP;
END;
$$ LANGUAGE plpgsql;

-- 5
-- Crie uma trigger para bloquear inserções de avaliações na tabela avaliaPedidoProduto
--antes que o status do pedido seja alterado para Entregue. Deve ser criado um BEFORE
--INSERT na tabela avaliaPedidoProduto. Uma mensagem de “Não devem ser avaliados
--pedidos não entregues deve ser enviada em caso de tentativa de inserção de avaliação
--de pedidos não entregues.

CREATE OR REPLACE FUNCTION block_avaliacao()
RETURNS TRIGGER AS $$
BEGIN
    if new.status <> 'Entregue' then
        raise exception 'Não devem ser avaliados pedidos não entregues';
    end if;
    return new;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER trg_block_avaliacao BEFORE INSERT ON AVALIAPEDIDOPRODUTO
FOR EACH ROW
EXECUTE PROCEDURE block_avaliacao();
END
