/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cAluno.cpp
 * Author: veterano
 * 
 * Created on 1 de setembro de 2023, 09:21
 */

#include "cAluno.h"
#include <iostream>
#include <string>
using namespace std;

cAluno::cAluno() {
}

cAluno::cAluno(const cAluno& orig) {
}

cAluno::~cAluno() {
}

void cAluno::lerDados(){
    int resp = 0;
    int qnt=0;
    string cpf;
    int i=0;
    float imc;
    
    cout<<"Nº de pessoas a serem cadastradas: ";
    cin>>qnt;
    sDadosImc vetPessoas[qnt];
    
    for(i=0; i<qnt; i++){
        cout << "Aluno: " << i+1 << endl;
        
        cout<<"Nome: ";
        cin>>vetPessoas[i].nome;
        
        cout<<"CPF: ";
        cin>>vetPessoas[i].cpf;
        
        cout<<"Altura: ";
        cin>>vetPessoas[i].altura;
        
        cout<<"Peso: ";
        cin>>vetPessoas[i].peso;   
    }
    
    cout<<"CPF da pessoa que deseja o IMC: ";
    cin>>cpf;
    
    cout<<"Qual o tipo da pesquisa? [1-Sequencial ; 2-Binaria]";
    cin>>resp;
    
    if(resp==1){
        imc = this->acharCPF_Sequencial(vetPessoas, cpf, qnt); 
        cout<<"O imc é: "<<imc;
    }
    else if(resp==2){
        this->Ordenador(vetPessoas, qnt);
        imc = this->acharCPF_Binaria(vetPessoas, cpf, qnt); 
        cout<<"O imc é: "<<imc;
    }
    else{
        cout<<"Método de pesquisa invalida!";
    }
    
    
}

float cAluno::acharCPF_Sequencial(sDadosImc *vetPessoas, string cpf, int qnt){ //para receber os valores no método eu especifico o tipo
    int i=0;
    float imc;

    for(i=0; i<qnt; i++){
        if(cpf == vetPessoas[i].cpf){
            imc = vetPessoas[i].peso / (vetPessoas[i].altura * vetPessoas[i].altura);
        }
    }
    
    return imc;
}

//ordenação método bolha, fiz por cpf pra binaria funcionar
void cAluno::Ordenador(sDadosImc *vetPessoas, int qnt){
    int i=0, j=0;
    sDadosImc temp;
    
    for (i = qnt -1; i>= 1; i--){
        for(j = 0; j < i; j++){
            if(vetPessoas[j].cpf>vetPessoas[j+1].cpf){
                temp = vetPessoas[j];
                vetPessoas[j] = vetPessoas[j+1];
                vetPessoas[j+1] = temp;
            }
        }
    }
}

float cAluno::acharCPF_Binaria(sDadosImc *vetPessoas, string cpf, int qnt){ //para receber os valores no método eu especifico o tipo
	//A pesquisa binaria depois da primeira rodada, recalcula o meio e testa se o numero desejado ta pra frente ou para tras do novo meio
	this->Ordenador(vetPessoas, qnt);
int inf,sup,meio;
    inf=0;
    sup=qnt-1;
    while (inf<=sup){
        meio=(inf+sup)/2;
        if (cpf==vetPessoas[meio].cpf)
            return vetPessoas[meio].peso / (vetPessoas[meio].altura * vetPessoas[meio].altura);
        else if (cpf<vetPessoas[meio].cpf)
            sup=meio-1;
        else
            inf=meio+1;
    }
    
    return -1; /* não encontrado */
    }