'''
Foi feita uma pesquisa de audiência de canal de TV
em várias casas de uma certa cidade, num determinado dia.
    Para cada casa visitada, é fornecido o número do
canal (9, 12, 23 ou 40).
    Fazer um algoritmo que:
       - leia um número indeterminado de dados,
         até que seja digitado o canal 0(zero);
       - Calcule e mostre a porcentagem de
         audiência de cada emissora;
       - Caso seja digitado algum canal fora dos
         apresentado acima, informar como outros canais;
       - O número 0(zero) não pode ser considerado um canal.
'''
canal = 1
canal9 = 0
canal12= 0
contador = 0
canal23 = 0
canal40 = 0
outros =0

while(canal != 0):
    canal = int(input(" Informe o canal 9 , 12 , 23 , 40): "))

    if(canal == 9):
        canal9 += 1
        contador += 1
    elif(canal == 12):
        canal12 += 1
        contador += 1
    elif(canal == 23):
        canal23 += 1
        contador += 1
    elif(canal == 40):
        canal40 += 1
        contador += 1
    elif(canal != 0):
        outros += 1
        contador +=1

if contador != 0:
    pcanal9 = (canal9 * 100)/contador
    pcanal12 = (canal12 * 100)/contador
    pcanal23 = (canal23 * 100)/contador
    pcanal40 = (canal40 * 100)/contador
    poutros = (outros * 100)/contador

print(f"Porcentagem do Canal 09 é: {pcanal9:.2f}%")
print(f"Porcentagem do Canal 12 é: {pcanal12:.2f}%")
print(f"Porcentagem do Canal 23 é: {pcanal23:.2f}%")
print(f"Porcentagem do Canal 40 é: {pcanal40:.2f}%")
print(f"Porcentagem dos outros canais é: {poutros:.2f}%")