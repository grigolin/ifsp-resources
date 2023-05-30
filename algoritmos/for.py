'''
Construir um algoritmo que leia a idade de N pessoas.
O sistema deve calcular: a média das idades, a menor e a maior idade informada
'''
idademaior =0
idademenor =0
contador=0
soma=0
media=0
n = int(input("quantidade:"))

for i in range(1, n+1):
    idade = int(input(f"idade {i}:"))
    if(i<1):
        idademenor = idade
        idademaior = idade
    else:
        if(idade > idademaior):
            idademaior = idade
        if(idade < idademenor):
            idademenor = idade
    soma+= idade
media = soma / n
print(f"media: {media:.1f}")
print(f"idade maior:{idademaior}")
print(f"idade menor:{idademenor}")
