/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cFila.cpp
 * Author: veterano
 * 
 * Created on 6 de outubro de 2023, 09:32
 */

#include <cstdlib>
#include <iostream>
#include "cFila.h"

cFila::cFila() {
}

cFila::cFila(const cFila& orig) {
}

cFila::~cFila() {
}

void cFila::Menu() {
    int op;
    std::cout << "Operacao: " << std::endl << 
    "1 - Inserir" << std::endl << 
    "2 - Remover" << std::endl << 
    "3 - Pesquisar" << std::endl <<
    "4 - Listar" << std::endl;
    switch (op) {
        case 1:
            Inserir();
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            Listar();
            break;
        default:
            std::cout << "Essa opcao nao existe!";
            break;
    }
}

void cFila::Inserir() {
    std::cout << "Valor";
    this->aux = (struct no*) malloc(sizeof (this->aux));
    std::cin >> this->aux->valor;

    if (this->inicio == NULL) {
        this->inicio = this->aux;
    } else {
        fim->prox = aux;
    }
    fim = aux;
    fim->prox = NULL;
}

void cFila::Listar(){
    for(this->aux = this->inicio; this->aux->prox == NULL; this->aux = this->aux->prox){
        std::cout << this->aux->valor;
    }
}