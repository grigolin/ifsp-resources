#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char** argv) {
    fflush(stdin);

    struct EstruturaAluno {
        char nome[40];
        char matricula[10];
        int anoIngresso;
    } StructAluno[2];

    for (int i = 0; i < 2; i++) {
        cout << "Nome aluno " << i << endl;
        cin.getline(StructAluno[i].nome, 60);
        fflush(stdin);
        cout << "Matricula aluno " << i << endl;
        cin.getline(StructAluno[i].matricula, 10);
        fflush(stdin);
        cout << "Ano ingresso aluno " << i << endl;
        cin >> StructAluno[i].anoIngresso;
        fflush(stdin);
    }

    for (int i = 0; i < 2; i++) {
        cout << "nome aluno " << i << ": " << StructAluno[i].nome << endl;
        cout << "matricula aluno" << i << ": " << StructAluno[i].matricula << endl;
        cout << "ano ingresso aluno " << i << ": " << StructAluno[i].anoIngresso << endl;
    };
    return 0;
}

