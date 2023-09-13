/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   Delta.cpp
 * Author: Gui
 * 
 * Created on 13 de Setembro de 2023, 00:02
 */

#include "Delta.h"
#include <iostream>
using namespace std;
Delta::Delta() {
}

Delta::Delta(const Delta& orig) {
}

Delta::~Delta() {
}

void Delta::Receba(){
    float a, b, c;
    cout << "Valor A: ";
    cin >> a;
    cout << "Valor B: ";
    cin >> b;
    cout << "Valor C: ";
    cin >> c;
    cout << this->Calcular(a, b, c);
}

float Delta::Calcular(float a, float b, float c){ // 'b² – 4ac'
    return (b*b) - 4 * a * c;
}