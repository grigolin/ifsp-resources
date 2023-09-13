/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   Triangulo.h
 * Author: Gui
 *
 * Created on 13 de Setembro de 2023, 00:18
 */

#ifndef TRIANGULO_H
#define TRIANGULO_H
#include <string>

class Triangulo {
public:
    void Receba();
    std::string VerificarTriangulo(int x, int y, int z);
    std::string TipoTriangulo(int x, int y, int z);
    Triangulo();
    Triangulo(const Triangulo& orig);
    virtual ~Triangulo();
private:

};

#endif /* TRIANGULO_H */

