/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/main.cc to edit this template
 */

/* 
 * File:   main.cpp
 * Author: veterano
 *
 * Created on 6 de outubro de 2023, 09:32
 */

#include <cstdlib>

#include "cFila.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cFila obj;
    //obj.Menu();
    obj.Inserir(); // segmentation fault
    obj.Listar();
    return 0;
}

