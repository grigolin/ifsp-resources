'''
Criar um algoritmo que receba 5 números inteiros,
armazene em um vetor e depois mostre o vetor na tela.
'''

vet=[0]*5
for i in range(0, 5):
    vet[i] = int(input(f"numero para posição {i}: "))

for i in range(0, 5):
    print(f"{vet[i]}", end=' ')