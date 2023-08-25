/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cAluno.cpp
 * Author: veterano
 * 
 * Created on 25 de agosto de 2023, 09:06
 */

#include "cAluno.h"
#include <iostream>
using namespace std;

cAluno::cAluno() {
}

cAluno::cAluno(const cAluno& orig) {
}

cAluno::~cAluno() {
}

void cAluno::ReceberDados(){
    int qnt;
    int pesquisaCPF;
    
    cout << "qnt de alunos:";
    cin>> qnt;
    
    sAluno vetor[qnt];
    
    for(int i=0; i<qnt; i++){
        cout << "Nome: "<< endl;
        cin >> vetor[i].nome;
        cout << "Altura: "<< endl;
        cin >> vetor[i].altura;
        cout << "Peso: "<< endl;
        cin >> vetor[i].peso;
        cout << "CPF: "<< endl;
        cin >> vetor[i].cpf;
        cout << "Sexo: "<< endl;
        cin >> vetor[i].sexo;
        
        cout << "CPF a ser localizado: "<< endl;
        cin >> pesquisaCPF;
        cout << this->Calcular(vetor, this->Localizar(vetor, pesquisaCPF, qnt));
    }
}

int cAluno::Localizar(sAluno* vetor, int pesquisaCPF, int qnt){
    int i=0;
    while(i<qnt){
        if(pesquisaCPF == vetor[i].cpf){
            return i;
        }
        i++;
    }
}

float cAluno::Calcular(sAluno* vetor, int i){
    float imc = vetor[i].peso / (vetor[i].altura * vetor[i].altura);
    return imc;
}