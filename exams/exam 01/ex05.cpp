#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    string produto;
    float valor, desconto, vfinal, acrescimo;
    int escolha;
    cout << "produto: " << endl;
    cin >> produto;
    cout << "Valor: " << endl;
    cin >> valor;
    cout << "Escolha como quer pagar: " << endl;
    cout << "1 - a vista (10% de desconto): " << endl;
    cout << "2 - 30 dias de prazo (sem desconto): " << endl;
    cout << "3 - 10x no cartao (sem desconto ou acrescimos): " << endl;
    cout << "4 - Pagamento em 10x (Boleto - 10% acrescimos): " << endl;
    cin >> escolha;
    switch (escolha) {
        case 1:
            desconto = valor * 0.10;
            vfinal = valor - desconto;
            cout << "O valor do produto com desconto e de: " << vfinal << endl;
            break;
        case 2:
            cout << "O valor do produto com pagamento em 30 dias e: " << valor << endl;
            break;
        case 3:
            cout << "O valor do produto em 10x no cartao e: " << valor << endl;
            break;
        case 4:
            acrescimo = valor * 1.1;
            cout << "O valor do produto no boleto em 10x com acrescimo e de: " << acrescimo << endl;
            break;
        default:
            cout << "Opção invalida!";
            break;
    }
    return 0;
}

