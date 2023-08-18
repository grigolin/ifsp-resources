

#include "cAluno.h"
#include <iostream>
using namespace std;

cAluno::cAluno() {
}

cAluno::cAluno(const cAluno& orig) {
}

cAluno::~cAluno() {
}

void cAluno::ReceberDados(){
    for(int i=0; i < 2; i++){
        cout << "Nome: ";
        cin >> this->Array[i].nome;
        cout << "Idade: ";
        cin >> this->Array[i].idade;
        cout << "Sexo: ";
        cin >> this->Array[i].sexo;
        for(int j=0; j < 3; j++){
            cout << "Nota " << j+1 << ": ";
            cin >> this->Array[i].nota[j];
        }
    }
    for(int i=0; i < 2; i++){
        cout << "Aluno " << i+1 << endl;
        cout << "Nome: " << this->Array[i].nome << endl;
        cout << "Idade: " << this->Array[i].idade << endl;
        cout << this->Array[i].sexo << endl;
        for(int j=0; j < 3; j++){
            cout << this->Array[i].nota[j] << endl;
        }
    }
}
