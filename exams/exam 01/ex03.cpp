#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    string nome;
    int idade, disciplinas, nasc, nasc2;
    float nota;
    cout << "Qual seu nome? " << endl;
    cin >> nome;
    cout << "Qual sua idade? " << endl;
    cin >> idade;
    cout << "Quantas disciplinas? " << endl;
    cin >> disciplinas;
    cout << "Nota que quer tirar nessa disciplina?" <<endl;
    cin >> nota;
    nasc2 = (2023 - idade);
    nasc = (2022 - idade);
    cout << "Entao voce se chama " << nome << ", nasceu em: " << nasc << " ou " << nasc2 << endl;
    cout << "esta cursando " << disciplinas << " disciplinas e pretende ficar com: " << nota << " em PES?" << endl;
    

    return 0;
}

