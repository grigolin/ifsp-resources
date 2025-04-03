CREATE or replace FUNCTION area_quadrado(lado real, lado real) returns real
as $$
declare
	area real;
begin
	return area = base * (altura / 2);
end;
$$
language plpgsql

select area_triangulo_retangulo(4,5);


CREATE or replace FUNCTION area_triangulo_retangulo(base real, altura real) returns real
as $$
declare
	area real;
begin
	return area = base * (altura / 2);
end;
$$
language plpgsql

select area_triangulo_retangulo(4,5);


CREATE or replace FUNCTION area_circulo(raio real) returns real
as $$
declare
	pi real;
begin
	pi = 3,14;
	return pi*(raio*raio);
end;
$$
language plpgsql

select area_circulo(5);


