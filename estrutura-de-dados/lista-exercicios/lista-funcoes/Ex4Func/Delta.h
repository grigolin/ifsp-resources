/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   Delta.h
 * Author: Gui
 *
 * Created on 13 de Setembro de 2023, 00:02
 */

#ifndef DELTA_H
#define DELTA_H

class Delta {
public:
    void Receba();
    float Calcular(float a, float b, float c);
    
    Delta();
    Delta(const Delta& orig);
    virtual ~Delta();
private:

};

#endif /* DELTA_H */

