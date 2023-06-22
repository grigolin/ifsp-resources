#include <iostream>
#include <string>
using namespace std;

int main(){
    int matricula;
    float mediaap, nota1, nota2, nota3;
    char conceito;
    string mensagem;

    cout << "Numero da matricula: ";
    cin >> matricula;
    cout << "Nota 1: ";
    cin >> nota1;
    cout << "Nota 2: ";
    cin >> nota2;
    cout << "Nota 3: ";
    cin >> nota3;
    mediaap = (nota1 + (nota2 * 2) + (nota3 * 3)) / 6;

    if(mediaap >= 9){
        conceito = 'A';
    }else if(mediaap >= 7.5 && mediaap < 9){
        conceito = 'B';
    }else if(mediaap >= 6 && mediaap < 7.5){
        conceito = 'C';
    }else if(mediaap >= 4 && mediaap < 6){
        conceito = 'D';
    }else if(mediaap < 4){
        conceito = 'E';
    }

    if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
        mensagem = "Aprovado!";
    }else{
        mensagem = "Reprovado!";
    }

    cout << "Aluno de matricula: " << matricula << endl;
    cout << "Com notas 1: " << nota1 << endl;
    cout << "Com notas 2: " << nota2 << endl;
    cout << "Com notas 3: " << nota3 << endl;
    cout << "Media de aproveitamento: " << mediaap << endl;
    cout << "Conceito: " << conceito << endl;
    cout << "Está: " << mensagem;
    

    return 0;
}