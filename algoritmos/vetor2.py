'''
faça um algoritmo que solicite ao usuário números e os armazene em um vetor de 6 posições. 
O usuário deverá inserir valores positivos e negativos. 
Substitua todas as ocorrência de valores positivos por 1 e todos os valores negativos por 0.
'''
vet=[0]*6

for i in range(0, 6):
    vet[i] = int(input(f"Numero na posicao {i}: "))

print ("Antes da troca: ", vet, end=' ')

for i in range(0, 6):
    if vet[i] >= 0:
        vet[i] = 1
    else:
        vet[i]= 0

print ("Após troca: " , vet, end=' ')