
#include "cAluno.h"
#include <iostream>
using namespace std;

cAluno::cAluno() {
}

cAluno::cAluno(const cAluno& orig) {
}

cAluno::~cAluno() {
}

void cAluno::ReceberDados() {
    for (int i = 0; i < 2; i++) {
        cout << "Nome: ";
        cin >> this->Array[i].nome;
        cout << "Matricula: ";
        cin >> this->Array[i].matricula;
        for (int j = 0; j < 2; j++) {
            cout << "Nota " << j + 1 << ": ";
            cin >> this->Array[i].nota[j];
        }
    }
}

void cAluno::CalcularMedia() {
    float soma;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            soma += this->Array[i].nota[j];
        }
        this->Array[i].media = soma / 2;
    }
}

void cAluno::MostrarDados() {
    for (int i = 0; i < 2; i++) {
        cout << "-----------" << endl;
        cout << "Aluno " << i + 1 << endl;
        cout << "Nome ";
        cout << this->Array[i].nome << endl;
        cout << "Matricula ";
        cout << this->Array[i].matricula << endl;
        for (int j = 0; j < 2; j++) {
            cout << "Nota " << j + 1 << ": ";
            cout << this->Array[i].nota[j] << endl;
        }
        cout << "Media: ";
        this->CalcularMedia();
        cout << this->Array[i].media << endl;
    }
}