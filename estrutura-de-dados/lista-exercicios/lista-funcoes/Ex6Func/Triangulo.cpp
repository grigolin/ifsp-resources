/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   Triangulo.cpp
 * Author: Gui
 * 
 * Created on 13 de Setembro de 2023, 00:18
 */

#include "Triangulo.h"
#include <iostream>
#include <string>
using namespace std;

Triangulo::Triangulo() {
}

Triangulo::Triangulo(const Triangulo& orig) {
}

Triangulo::~Triangulo() {
}

void Triangulo::Receba(){
    int x, y, z;
    cout << "Lado X: ";
    cin >> x;
    cout << "Lado Y: ";
    cin >> y;
    cout << "Lado Z: ";
    cin >> z;
    cout << "Com estes valores, " << this->VerificarTriangulo(x, y, z) << " ser um triangulo! " << endl;
}

string Triangulo::VerificarTriangulo(int x, int y, int z){
    if((x + y) > z && (x + z) > y && (z + y) > x){
        cout << this->TipoTriangulo(x, y, z);
        return "pode";
    }else{
        return "nao pode";
    }
}

string Triangulo::TipoTriangulo(int x, int y, int z){
    string r;
    if(x == y && y == z){
        r= "equilatero! ";
    }else if(x != y && y != z && z != x){
        r= "escaleno! ";
    }else{
        r="isosceles! ";
    }
    return "O tipo do triangulo é " + r;
}