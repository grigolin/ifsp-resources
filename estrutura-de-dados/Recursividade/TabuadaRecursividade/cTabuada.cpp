/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cTabuada.cpp
 * Author: veterano
 * 
 * Created on 15 de setembro de 2023, 09:22
 */

#include "cTabuada.h"
#include <iostream>
using namespace std;

cTabuada::cTabuada() {
}

cTabuada::cTabuada(const cTabuada& orig) {
}

cTabuada::~cTabuada() {
}

void cTabuada::ReceberDados(){
    int n;
    cout << "Valor: ";
    cin >> n;
    this->Tabuada(1, n);
}

void cTabuada::Tabuada(int i, int n){
    if(i <= 10){
        cout << i << " x " << n << " = " << i * n << endl;
        Tabuada(i+1, n);
    }
}

/*
 int cClasse::Fatorial(int a){
 if(a>1)
 return (a*fatorial(a-1));
  else
  return(1);
  }
 */