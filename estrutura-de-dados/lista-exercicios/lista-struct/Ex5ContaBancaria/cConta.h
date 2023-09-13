/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cConta.h
 * Author: Gui
 *
 * Created on 12 de Setembro de 2023, 22:28
 */

#ifndef CCONTA_H
#define CCONTA_H
#include <string>

struct Conta{
    std::string nome;
    int cpf;
    float saldo;
};

class cConta {
public:
    void ReceberDados();
    void FazerOperacoes(Conta *vetor);
    void Sacar(Conta *vetor);
    void Depositar(Conta *vetor);
    void ImprimirDados(Conta *vetor, int i);
    cConta();
    cConta(const cConta& orig);
    virtual ~cConta();
private:

};

#endif /* CCONTA_H */

