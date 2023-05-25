#include <iostream>
using namespace std;

int main(){
    int opcao;
    float a, b, total;
    cout << "Escolha uma das opções:" << endl;
    cout << "1 - SOMAR\n"
            "2 - SUBTRAIR\n"
            "3 - DIVIDIR\n"
            "4 - MULTIPLICAR\n"
            "5 - SAIR\n"
         << endl;
    cout << "Informe a opção: ";
    cin >> opcao;
    switch (opcao)
    {
    case 1: // soma
        cout << "Primeiro numero: " << endl;
        cin >> a;
        cout << "Segundo numero: " << endl;
        cin >> b;
        total = a + b;
        cout << "O resultado é: " << total;
        break;
    case 2:
        cout << "Primeiro numero: " << endl;
        cin >> a;
        cout << "Segundo numero: " << endl;
        cin >> b;
        total = a - b;
        cout << "O resultado é: " << total;
        break;
    case 3:
        cout << "Primeiro numero: " << endl;
        cin >> a;
        cout << "Segundo numero: " << endl;
        cin >> b;
        total = a / b;
        cout << "O resultado é: " << total;
        break;
    case 4:
        cout << "Primeiro numero: " << endl;
        cin >> a;
        cout << "Segundo numero: " << endl;
        cin >> b;
        total = a * b;
        cout << "O resultado é: " << total;
        break;
    case 5:
        cout << "Saindo...";
        break;
    default:
        cout << "Opção invalida";
        break;
    }
    return 0;
}