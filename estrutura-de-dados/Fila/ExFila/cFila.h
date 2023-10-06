/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cFila.h
 * Author: veterano
 *
 * Created on 6 de outubro de 2023, 09:32
 */

#ifndef CFILA_H
#define CFILA_H

struct no{
    int valor;
    struct no *prox;
};

class cFila {
public:
    cFila();
    cFila(const cFila& orig);
    virtual ~cFila();
    
    no *inicio, *fim, *aux;
    void Inserir();
    void Menu();
    void Listar();
private:

};

#endif /* CFILA_H */

