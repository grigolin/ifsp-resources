/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cCadastro.h
 * Author: veterano
 *
 * Created on 1 de setembro de 2023, 11:07
 */
#ifndef CCADASTRO_H
#define CCADASTRO_H
#include <string>

struct sProdutos{
    std::string nome;
    int cod;
    float preco;
};

class cCadastro {
public:
    void Receba();
    void Mostra(sProdutos *vetor, int qnt);
    void Consulta(sProdutos *vetor, int qnt);
    
    cCadastro();
    cCadastro(const cCadastro& orig);
    virtual ~cCadastro();
private:

};

#endif /* CCADASTRO_H */

