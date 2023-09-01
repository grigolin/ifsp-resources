/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cCadastro.cpp
 * Author: veterano
 * 
 * Created on 1 de setembro de 2023, 11:07
 */

#include "cCadastro.h"
using namespace std;
#include <iostream>
cCadastro::cCadastro() {
}

cCadastro::cCadastro(const cCadastro& orig) {
}

cCadastro::~cCadastro() {
}

void cCadastro::Receba(){
    int qnt;
    cout << "Qnt de produtos: ";
    cin >> qnt;
    
    sProdutos vetor[qnt];
    
    for(int i=0; i < qnt; i++){
        cout << "Produto " << i+1 << endl;
        cout << endl;
        cout << "Nome: " << endl;
        cin >> vetor[i].nome;
        cout << "Codigo: " << endl;
        cin>> vetor[i].cod;
        cout << "Preco: " << endl;
        cin >> vetor[i].preco;
    }
    
    this->Mostra(vetor, qnt);
    this->Consulta(vetor, qnt);
}

void cCadastro::Mostra(sProdutos* vetor, int qnt){
    cout << endl;
    cout << "PRODUTOS CADASTRADOS: " << endl;
    for(int i = 0; i < qnt; i++){
        cout << "Produto: " << vetor[i].nome << ", Codigo: " << vetor[i].cod << ", Preco: " << vetor[i].preco << endl;
        cout << "-----" << endl;
    }
}

void cCadastro::Consulta(sProdutos* vetor, int qnt){
    int codigo;
    int i=0;
    cout << "Codigo do produto que deseja consultar: " << endl;
    cin >> codigo;
    while(i < qnt){
        if(codigo == vetor[i].cod){
            cout << "Produto: " << vetor[i].nome << ", Codigo: " << vetor[i].cod << ", Preco: " << vetor[i].preco << endl;
        }
        i++;
    }
}