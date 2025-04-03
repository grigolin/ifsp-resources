create or replace function nomefunc() returns varchar
as $$
declare 
	nomeEmp empregado.pnome%type;
	regEmp empregado%rowtype;
begin
	nomeEmp := 'rafael miani';
	raise notice 'nome = %' , nomeEmp;
	
	regEmp.pnome := 'andre';
	regEmp.snome := 'gobbi';
	regEmp.cargo := 'prof';
	return 'nome ' || regEmp.pnome || ' ' || regEmp.snome || ', ' || regEmp.cargo;
end;
$$
language plpgsql;

select nomefunc()


-- if else
create or replace function faprovado (nota REAL)
returns varchar
as $$
begin
	if (nota > 10 OR nota <0) then
		return 'nota invalida';
		elseif (nota >=6) then
			return 'aluno aprovado';
		elseif (nota >= 4 and nota < 6) then
			return 'aluno ifa';
		else
			return 'aluno reprovado';
	end if;
end;
$$
language plpgsql;

select faprovado(3)

create or replace function calc (n1 real, n2 real, op char)
returns varchar
as $$
declare
	resultado real;
begin
	if (op = '+') then
	resultado = n1 + n2;
	return 'a soma de ' || n1 || ' + ' || n2 || ' é ' || resultado;
	end if;
	return 'operador invalido';
end;
$$
language plpgsql;

select calc(2, 2, '+')

-- exemplo 3

create sequence sid_histsal start with 1

create table histsalario(
	idhissal integer,
	idemp integer,
	salario real,
	constraint pk_idhissal primary key (idhissal),
	constraint fk_empregado foreign key (idemp) references empregado
);


create or replace function novosalario (idempregado integer, salarioemp real)
returns varchar
as $$
declare 
	pnomeemp empregado.pnome%type;
	salemp empregado.salario%type;
begin
	select pnome, salario into pnomeemp, salemp from empregado
		where idemp = idempregado;
	insert into histsalario values(nextval('sid_histsal'), idempregado, salemp);
	update empregado set salario = salarioemp
		where idemp = idempregado;
	return pnomeemp || ' tinha salario ' || salemp || ' e foi atualizado para ' || salarioemp;
end;
$$
language plpgsql;

select novosalario (1, 3000)