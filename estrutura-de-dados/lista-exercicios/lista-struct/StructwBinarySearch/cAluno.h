/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cAluno.h
 * Author: veterano
 *
 * Created on 1 de setembro de 2023, 09:21
 */

#ifndef CALUNO_H
#define CALUNO_H
#include <string>

struct sDadosImc{
    std::string nome;
    float altura, peso;
    std::string cpf;
};


class cAluno {
public:
    void lerDados();
    float acharCPF_Sequencial(sDadosImc *vetPessoas, std::string cpf, int qnt);
    void Ordenador (sDadosImc *vetPessoas, int qnt);
    float acharCPF_Binaria(sDadosImc *vetPessoas, std::string cpf, int qnt);
    
    cAluno();
    cAluno(const cAluno& orig);
    virtual ~cAluno();
private:

};

#endif /* CALUNO_H */

