/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   Fila.h
 * Author: veterano
 *
 * Created on 27 de outubro de 2023, 09:16
 */

#ifndef FILA_H
#define FILA_H


class Fila {
public:

    struct nodo {
        int valor;
        nodo *prox;
    } *inicio, *fim, *aux;

    bool vazio(struct nodo *campo);
    void insere();
    void remover();
    void listar();
    void menu();
    void pesquisar();

    
    Fila();
    Fila(const Fila& orig);
    virtual ~Fila();
private:

};

#endif /* FILA_H */

