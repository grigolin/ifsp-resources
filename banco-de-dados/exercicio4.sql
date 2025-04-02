--1  
create or replace function f1 () returns varchar as $$
declare
	nomeempregado empregado.pnome%type;
	salarioempregado empregado.salario%type;
begin
	select pnome, salario into nomeempregado, salarioempregado from empregado
	where salario in (select max (salario) from empregado) limit 1;
	return nomeempregado || ' tem o maior, com ' || salarioempregado;
end;
$$ language plpgsql;

select f1()

--2
create or replace function novosalario (idempregado integer, salarioemp real)
returns varchar
as $$
declare 
	pnomeemp empregado.pnome%type;
	salemp empregado.salario%type;
begin
	select pnome, salario into pnomeemp, salemp from empregado
		where idemp = idempregado;
	if salemp > salarioemp then
	insert into histsalario values(nextval('sid_histsal'), idempregado, salemp);
	update empregado set salario = salarioemp
		where idemp = idempregado;
	end if;
	return pnomeemp || ' tinha salario ' || salemp || ' e foi atualizado para ' || salarioemp;
	
end;
$$
language plpgsql;

select novosalario (1, 3100)

--3