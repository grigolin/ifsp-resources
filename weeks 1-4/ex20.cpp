#include <iostream>
#include <cstring>
using namespace std;

int main(){
    string nome;
    int codigo, quant;
    float preco, pfinal;

    cout << "Codigo do produto: ";
    cin >> codigo;
    cout << "Quantidade do produto: ";
    cin >> quant;

    switch(codigo){
        case 100:
        nome = " cachorro quente";
        preco = 9.20;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;

        case 101:
        nome = " bauru simples";
        preco = 12;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;

        case 102:
        nome = " Bauru com ovo";
        preco = 13;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;
        
        case 103:
        nome = " Hamburger";
        preco = 10;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;

        case 104:
        nome = " Cheeseburguer";
        preco = 12;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;

        case 105:
        nome = " Refrigerante Lata";
        preco = 5;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;

        case 106:
        nome = " agua";
        preco = 3;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nome << " é de " << pfinal;
        break;
        default:
        cout << "Codigo invalido!";
    }

    return 0;
}