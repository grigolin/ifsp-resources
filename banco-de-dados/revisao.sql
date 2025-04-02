-- 1
create sequence sid_carros start with 1;

-- 2
create table carro(
	id_carro integer,
	chassi varchar,
	placa varchar,
	modelo varchar,
	marca varchar,
	ano integer,
	preco real,
	constraint pk_carro primary key (id_carro),
	constraint ck_marca check (marca in ('toyota', 'honda', 'chevrolet', 'hyundai')),
	constraint un_chassi unique (chassi),
	constraint un_placa unique (placa)
);

-- 3 
insert into carro values (nextval('sid_carros'), 'abc1', 'kd2jk3', 'modelo', 'honda', 2000, '10000');
insert into carro values (nextval('sid_carros'), 'lcj2', '8hu2l3', 'modelo1', 'toyota', 1999, '1000');

-- 4 - C

-- 5
create or replace view vclprod as 
select c.nome_cliente, pr.descricao, ip.quantidade from cliente c 
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join item_pedido ip on ip.num_pedido = p.num_pedido
inner join produto pr on pr.codigo_produto = ip.codigo_produto

-- 6
create or replace function fvend()
returns setof record as $$
declare 
	reg record;
begin
	for reg in select nome_vendedor, salario_fixo, faixa_comissao from vendedor
	loop
	return next reg;
	end loop;
	return;
end;
$$ language plpgsql;

SELECT * from fvend() AS 
    (nome VARCHAR, salario NUMERIC, Comissao CHAR)

-- 7
CREATE OR REPLACE FUNCTION f_atualizaVendaIP()
RETURNS VOID
AS $$
DECLARE 
    regProd RECORD;
BEGIN
    FOR regProd IN SELECT codigo_produto, valor_venda FROM produto
    LOOP
        UPDATE item_pedido SET valor_venda = regProd.valor_venda
            WHERE codigo_produto = regProd.codigo_produto;
    END LOOP;
END;
$$ LANGUAGE plpgsql;

-- 8
CREATE OR REPLACE FUNCTION fatuvend()
returns void as $$
declare
	reg record;
begin
	for reg in select p.num_pedido, quantidade, valor_venda
		from pedido p inner join item_pedido ip
		on p.num_pedido = ip.num_pedido
	loop 
		update pedido set total_pedido = total_pedido + reg.quantidade * reg.valor_venda
			where num_pedido = reg.num_pedido;
	end loop;
end;
$$ language plpgsql;

select * from fatuvend()

-- 9

