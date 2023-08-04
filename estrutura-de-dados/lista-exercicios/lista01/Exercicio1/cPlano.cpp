
#include "cPlano.h"
#include <iostream>
#include <cmath>
#include <complex>
using namespace std;
cPlano::cPlano() {
}

cPlano::cPlano(const cPlano& orig) {
}

cPlano::~cPlano() {
}

void cPlano::ReceberPontos(){
    cout << "Ponto x1: " << endl;
    cin >> this->x1;
    cout << "Ponto y1: " << endl;
    cin >> this->y1;
    cout << "Ponto x2: " << endl;
    cin >> this->x2;
    cout << "Ponto y2: " << endl;
    cin >> this->y2;
}

float cPlano::Calcular(){
    float distancia = sqrt((pow(this->x2 - this->x1, 2)) + (pow(this->y2 - this->y1, 2)));
    return distancia;
}