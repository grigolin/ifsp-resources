/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   fila.h
 * Author: veterano
 *
 * Created on 17 de novembro de 2023, 07:32
 */

#ifndef FILA_H
#define FILA_H

class fila {
public:
    fila();
    fila(const fila& orig);
    virtual ~fila();
    
    struct nodo{
        int elem;
        struct nodo *prox;
    }*inicio, *aux, *fim;
    
    bool vazio(struct nodo *campo);
    void inserir();//ok
    void remover();//ok
    bool pesquisar(int elem);//ok
    void listar();//ok
    void menu();//ok
private:

};

#endif /* FILA_H */

