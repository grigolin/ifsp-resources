/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cMedia.cpp
 * Author: veterano
 * 
 * Created on 22 de agosto de 2023, 07:32
 */

#include "cMedia.h"
#include <iostream>
using namespace std;

cMedia::cMedia() {
}

cMedia::cMedia(const cMedia& orig) {
}

cMedia::~cMedia() {
}

void cMedia::Receber(){
    float nota1, nota2, nota3;
    char letra;
    cout << "Nota 1: ";
    cin >> nota1;
    cout << "Nota 2: ";
    cin >> nota2;
    cout << "Nota 3: ";
    cin >> nota3;
    cout << "Letra: ";
    cin >> letra;
    cout << this->Calcular(nota1, nota2, nota3, letra);
}

float cMedia::Calcular(float n1, float n2, float n3, char l){
    if(l == 'A'){
        return (n1+n2+n3) / 3;
    }else{
        return (n1*0.5 + n2*0.3 + n3*0.2);
    }
}