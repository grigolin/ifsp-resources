#include <iostream>
using namespace std;

float peso, altura;

void CalcularIMC(){
    float imc;
    imc = peso / (altura*altura);
    cout << "IMC: " << imc << endl;
}

int main(){
    cout << "Peso: ";
    cin >> peso;
    cout << "Altura: ";
    cin >> altura;
    CalcularIMC();
    return 0;
}

/* Usando parâmetros
void CalcularIMC(float &peso, float &altura){
    float imc;
    imc = peso / (altura*altura);
    cout << "IMC: " << imc << endl;
}

int main(){
    float peso, altura;
    cout << "Peso: ";
    cin >> peso;
    cout << "Altura: ";
    cin >> altura;
    CalcularIMC(peso, altura);
    return 0;
}
*/