/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cLocate.cpp
 * Author: Gui
 * 
 * Created on 31 de Agosto de 2023, 23:53
 */

#include "cLocate.h"
#include <iostream>
using namespace std;

cLocate::cLocate() {
}

cLocate::cLocate(const cLocate& orig) {
}

cLocate::~cLocate() {
}

void cLocate::ReceberDados(){
    int qnt, cpf;
    cout << "Quantidade de Alunos: ";
    cin >> qnt;
    sAluno vetor[qnt];
    
    for(int i=0; i < qnt; i++){
        cout << "Nome: " << endl;
        cin >> vetor[i].nome;
        cout << "Altura: " << endl;
        cin >> vetor[i].altura;
        cout << "Peso: " << endl;
        cin >> vetor[i].peso;
        cout << "CPF: "<< endl;
        cin >> vetor[i].cpf;
    }
    
    cout << "CPF a ser pesquisado: " << endl;
    cin >> cpf;
    cout << CalcularIMC(vetor, this->Localizar(vetor, cpf, qnt));
}

int cLocate::Localizar(sAluno* vetor, int cpfDesejado, int qnt){
    int i = 0;
    while(i<qnt){
        if(cpfDesejado == vetor[i].cpf){
            return i;
        }
        i++;
    }
}

float cLocate::CalcularIMC(sAluno* vetor, int indexAluno){
    return vetor[indexAluno].peso / (vetor[indexAluno].altura * vetor[indexAluno].altura);
}