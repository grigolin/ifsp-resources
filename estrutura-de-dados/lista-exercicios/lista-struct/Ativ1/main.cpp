/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/main.cc to edit this template
 */

/* 
 * File:   main.cpp
 * Author: veterano
 *
 * Created on 18 de agosto de 2023, 11:33
 */

#include <cstdlib>

#include "cAluno.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cAluno obj;
    obj.ReceberDados();
    obj.MostrarDados();
    return 0;
}

