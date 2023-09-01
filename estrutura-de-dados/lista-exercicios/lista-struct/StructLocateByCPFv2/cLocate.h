/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cLocate.h
 * Author: Gui
 *
 * Created on 31 de Agosto de 2023, 23:53
 */

#ifndef CLOCATE_H
#define CLOCATE_H
#include <string>

struct sAluno{
    std::string nome;
    float altura, peso;
    int cpf;
};


class cLocate {
public:
    void ReceberDados();
    int Localizar(sAluno *vetor, int cpfDesejado, int qnt);
    float CalcularIMC(sAluno *vetor, int indexAluno);
    
    cLocate();
    cLocate(const cLocate& orig);
    virtual ~cLocate();
private:

};

#endif /* CLOCATE_H */

