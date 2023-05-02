#include <iostream>
#include <cstring>
using namespace std;

int main(){
    string nome;
    float valor, desconto, valfinal;

    cout << "Nome do produto: ";
    cin >> nome;
    cout << "Valor do produto: ";
    cin >> valor;

    desconto = 13;
    valfinal = valor - (valor * desconto / 100);

    cout << "Produto: " << nome << "\n";
    cout << "Valor: " << valor << "\n";
    cout << "Desconto: " << desconto << "% " "\n";
    cout << "Valor final: " << valfinal << "\n";

    return 0;
}