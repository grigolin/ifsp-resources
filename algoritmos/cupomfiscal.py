print('1 - Açougue')
print('2 - Produto de limpeza')
print('3 - Padaria')
print('4 - Quitanda')

total_compra = 0.0
cupom_fiscal = ""

while True:
    escolha = int(input('Escolha o grupo de produtos (ou 0 para sair): '))

    if escolha == 0:
        break

    if escolha == 1:
        grupo_produto = 'Açougue'
        preco = 25.00
    elif escolha == 2:
        grupo_produto = 'Produto de limpeza'
        preco = 18.00
    elif escolha == 3:
        grupo_produto = 'Padaria'
        preco = 10.00
    elif escolha == 4:
        grupo_produto = 'Quitanda'
        preco = 12.00
    else:
        print('Escolha inválida. Por favor, tente novamente.')
        continue

    quantidade = int(input('Quantidade: '))

    if quantidade > 5:
        preco_final = preco * 0.95
    else:
        preco_final = preco

    valor_total = preco_final * quantidade
    total_compra += valor_total

    cupom_fiscal += f"\nDescrição do grupo do produto: {grupo_produto:<20} Quantidade comprada: {quantidade:<10} Valor total do grupo do produto: R$ {preco_final * quantidade:.2f}"

print("\nCupom Fiscal")
print(cupom_fiscal)
print("Valor total da compra: R$ {:.2f}".format(total_compra))
