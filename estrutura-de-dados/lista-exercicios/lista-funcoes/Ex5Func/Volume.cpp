/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   Volume.cpp
 * Author: Gui
 * 
 * Created on 13 de Setembro de 2023, 00:08
 */

#include "Volume.h"
#include <iostream>
#include <cmath>
#include <complex>
using namespace std;

Volume::Volume() {
}

Volume::Volume(const Volume& orig) {
}

Volume::~Volume() {
}

void Volume::Receba(){
    float r;
    cout << "raio: ";
    cin >> r;
    cout << this->Calcular(r);
}

float Volume::Calcular(float raio){ //  (v = 4/3 * PI * R^3)
    return (4 * M_PI * pow(raio, 3)) /3;
}