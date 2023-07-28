/*
Programa para apresentar a média de 10 notas
*/
#include <iostream>
using namespace std;

int main(){
    float nota, soma;
    for(int i=1; i<=10; i++){
        cout << "Nota " << i << ": " "\n";
        cin >> nota;
        soma += nota;
    }
    cout << "Média: " << (soma/10) << "\n";
    return 0;
}