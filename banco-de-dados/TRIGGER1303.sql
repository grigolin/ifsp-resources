-- ex 1
create table conta(
	idconta integer,
	nroconta varchar not null,
	saldo numeric(10,2),
	constraint pk_conta primary key (idconta)
)

create or replace function verificahorario()
returns trigger as $$
begin
	if extract (hour from current_time) not between 8 and 15 then
		raise 'operacao nao pode ser executada fora do horario bancario' 
		using ERRCODE = 'EH001';
	end if;
	return new;
end;
$$ language plpgsql;

create trigger trg_verificahor before insert or update on conta
for each row execute procedure verificahorario();

select * from conta

insert into conta values(1, 3247783240, 1000)

-- 2
create table ex_empregados(
idemp integer,
pnome varchar,
snome varchar,
dataDemissao date
)

CREATE OR REPLACE FUNCTION f_ExEmp()
returns trigger as $$
begin
	insert into ex_empregados values (old.idemp, old.pnome, old.snome, current_date);
	return old;
end;
$$ language plpgsql;

create trigger trg_exEmp before delete on empregado
for each row execute procedure f_ExEmp();

delete from empregado where idemp = 7;
select * from empregado
select * from ex_empregados

-- 3
CREATE TABLE log_op_emp(
idlog serial,
idemp integer,
op varchar,
dtahora timestamp,
constraint pk_log_op primary key (idlog)
)

create or replace function operacoesEmp()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
		insert into log_op_emp (idemp, op, dtahora) 
			values (new.idemp, 'foi inserido o empregado ' || new.pnome, 
				current_timestamp);
		return new;
	end if;
	if(TG_OP = 'UPDATE') then
		insert into log_op_emp (idemp, op, dtahora) 
			values (old.idemp, ' o empregado teve seus dados alterados de ' 
				|| old.* || ' para ' || new.*, current_timestamp);
		return new;
	end if;
	if(TG_OP = 'DELETE') then
		insert into log_op_emp (idemp, op, dtahora) 
			values (old.idemp, ' o empregado ' || old.pnome || ' foi excluido ', current_timestamp);
		return old;
	end if;
	return null;
end;
$$ language plpgsql;

create trigger trg_opemp before insert or update or delete on empregado
for each row execute procedure operacoesEmp();

select * from empregado
insert into empregado values (5, 'guilherme', 'g', 19, 9000, 'swe')
select * from log_op_emp
update empregado set salario = 5000 where idemp = 22;

