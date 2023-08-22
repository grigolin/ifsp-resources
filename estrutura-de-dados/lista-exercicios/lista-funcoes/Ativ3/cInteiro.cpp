/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cInteiro.cpp
 * Author: veterano
 * 
 * Created on 22 de agosto de 2023, 08:23
 */

#include "cInteiro.h"
#include <iostream>
#include <string>

cInteiro::cInteiro() {
}

cInteiro::cInteiro(const cInteiro& orig) {
}

cInteiro::~cInteiro() {
}

std::string cInteiro::VerificaInt(){
    int n;
    std::string result;
    std::cout << "Valor Inteiro: ";
    std::cin >> n;
    if(n>0){
        result = "1";
    }else if(n == 0){
        result = "0";
    }else{
        result = "-1";
    }
    return result;
}