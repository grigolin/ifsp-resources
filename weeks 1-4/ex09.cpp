/*
Faça um programa para ler N números inteiros – informe um de cada vez.
A repetição será encerrada quando o usuário digitar o número 0.
O programa deve informar quantos números foram digitados. Nâo contar o 0
*/

#include <iostream>
using namespace std;

int main()
{
    int num = 1;
    int escolha = 0;

    while (num != 0)
    {
        cout << "DIgite um número: \n";
        cin >> num;
        escolha++;
    }
    cout << "A quantidade de números digitados foi: " << escolha - 1;
    return 0;
}