/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cInteiro.cpp
 * Author: veterano
 * 
 * Created on 22 de agosto de 2023, 07:25
 */

#include "cInteiro.h"
#include <iostream>
using namespace std;

cInteiro::cInteiro() {
}

cInteiro::cInteiro(const cInteiro& orig) {
}

cInteiro::~cInteiro() {
}

int cInteiro::MenorNumero(){
    int num1, num2, menor;
    cout << "Num 1: ";
    cin >> num1;
    cout << "Num 2: ";
    cin >> num2;
    if(num1 > num2){
        menor = num2;
    }else{
        menor = num1;
    }
    return menor;
}