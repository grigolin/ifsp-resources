/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cTabuada.h
 * Author: veterano
 *
 * Created on 15 de setembro de 2023, 09:22
 */

#ifndef CTABUADA_H
#define CTABUADA_H

class cTabuada {
public:
    void ReceberDados();
    void Tabuada(int i, int n);
    
    cTabuada();
    cTabuada(const cTabuada& orig);
    virtual ~cTabuada();
private:

};

#endif /* CTABUADA_H */

