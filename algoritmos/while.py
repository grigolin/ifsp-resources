
'''
Faça um algoritmo que solicite N números inteiros
até que o número 0(zero) seja digitado.
Ao final o algoritmo deve informar o maior e
o menor número digitado.
OBS: O número 0(zero) não pode ser contado.
'''
num=0
nummaior = 0
nummenor = 0
contador=0

num = int(input("Digite um numero: "))
nummaior = num
nummenor = num
while(num != 0):
    if(num>nummaior):
        nummaior = num
    if(num < nummenor) and (num != 0):
        nummenor = num
    num = int(input("Digite um numero: "))
print(f"O maior número foi: {nummaior}")
print(f"O menor número foi: {nummenor}")