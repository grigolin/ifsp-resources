#include <iostream>
#include <string>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main()
{
    string nome;
    double nota1, nota2, nota3, media;
    
    cout << "Qual seu nome? ";
    cin >> nome;
    cout << "Nota 1: ";
    cin >> nota1;
    cout << "Nota 2: ";
    cin >> nota2;
    cout << "Nota 3: ";
    cin >> nota3;
    
    media = (nota1 + nota2 + nota3) / 3;
    cout << "Aluno " << nome << " possui media " << setprecision(2) << media;
    
    return 0;
}