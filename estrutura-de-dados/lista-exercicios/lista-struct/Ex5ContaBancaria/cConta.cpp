/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.cc to edit this template
 */

/* 
 * File:   cConta.cpp
 * Author: Gui
 * 
 * Created on 12 de Setembro de 2023, 22:28
 */

#include "cConta.h"
#include <iostream>
using namespace std;

cConta::cConta() {
}

cConta::cConta(const cConta& orig) {
}

cConta::~cConta() {
}

void cConta::ReceberDados(){
    int i=0;
    Conta vetor[3];
    while(i<3){
        cout << "Nome: ";
        cin>>vetor[i].nome;
        cout << "CPF: ";
        cin>>vetor[i].cpf;
        cout << "Deposito Inicial: ";
        cin>>vetor[i].saldo;
        i++;
    }
    this->FazerOperacoes(vetor);
}

void cConta::FazerOperacoes(Conta* vetor){
    int escolha=0;
    cout << "Deseja fazer qual operação: \n"
            "1 - Deposito \n"
            "2 - Saque \n"
            "3 - Terminar" << endl;
    cin >> escolha;
    if(escolha == 1){
        this->Depositar(vetor);
    }else if(escolha == 2){
        this->Sacar(vetor);
    }else if(escolha == 3){
        cout << "Saindo...";
    }else{
        cout << "Escolha invalida!";
    }
}

void cConta::Depositar(Conta* vetor){
    int cpf, i=0;
    float valor;
    cout << "Numero do CPF para depositar: ";
    cin >> cpf;
    while(i<3){
        if(cpf == vetor[i].cpf){
            cout << "Valor a ser depositado: ";
            cin >> valor;
            vetor[i].saldo += valor;
            this->ImprimirDados(vetor, i);
        }
        i++;
    }
}

void cConta::Sacar(Conta* vetor){
    int cpf, i=0;
    float valor;
    cout << "Numero do CPF para depositar: ";
    cin >> cpf;
    while(i<3){
        if(cpf == vetor[i].cpf){
            cout << "Valor a ser sacado: ";
            cin >> valor;
            vetor[i].saldo -= valor;
            this->ImprimirDados(vetor, i);
        }
        i++;
    }
}

void cConta::ImprimirDados(Conta* vetor, int i){
    cout << "Olá, " <<  vetor[i].nome << ", seu saldo é de: " << vetor[i].saldo << endl;
    this->FazerOperacoes(vetor);
}