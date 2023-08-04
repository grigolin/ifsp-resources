
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
    cout << "Numero inteiro positivo A " << endl;
    cin >> this->a;
    cout << "Numero inteiro positivo B " << endl;
    cin >> this->b;
    cout << "Numero inteiro positivo C " << endl;
    cin >> this->c;
}

float cCalculo::Calcular(){
    float r = pow(this->a + this->b, 2);
    float s = pow(this->b + this->c, 2);
    float d = (r+s) / 2;
    return d;
}