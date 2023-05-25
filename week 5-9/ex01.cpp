#include <iostream>
#include <cstring>
using namespace std;

int main(){
    char nome[20];
    cout << "Nome: ";
    cin >> nome;

    cout << "Seu nome tem " << strlen(nome) << " letras.";

    return 0;
}