
#include "cCalculo.h"
#include <iostream>
#include <cmath>
using namespace std;
cCalculo::cCalculo() {
}

cCalculo::cCalculo(const cCalculo& orig) {
}

cCalculo::~cCalculo() {
}

void cCalculo::ReceberDados(){
    int a, b, c = 0;
    cout << "Numero inteiro positivo A " << endl;
    cin >> a;
    cout << "Numero inteiro positivo B " << endl;
    cin >> b;
    cout << "Numero inteiro positivo C " << endl;
    cin >> c;
    cout << this->Calcular(a, b, c);
}

float cCalculo::Calcular(int a, int b, int c){
    float r = pow(a + b, 2);
    float s = pow(b + c, 2);
    float d = (r+s) / 2;
    return d;
}