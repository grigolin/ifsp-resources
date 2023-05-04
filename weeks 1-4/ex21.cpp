#include <iostream>
#include <cctype>
using namespace std;

int main(){
    float altura;
    char sexo;
    float pesoideal;

    cout << "Qual sua altura? Ex.:1.80" << "\n";
    cin >> altura;
    cout << "Qual seu sexo? (M ou F)";
    cin >> sexo;
    sexo = toupper(sexo);
    
    switch (sexo)
    {
    case 'M':
        pesoideal = (72.7*altura)- 58;
        cout << "Seu peso ideal é: " << pesoideal;
        break;
    case 'F':
        pesoideal = (62.1*altura)- 44.7;
        cout << "Seu peso ideal é: " << pesoideal;
        break;
    default:
    cout << "Sexo não identificado!";
        break;
    }
    return 0;
}