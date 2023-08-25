

#ifndef CALUNO_H
#define CALUNO_H
#include <string>

struct sAluno{
    std::string nome;
    float altura, peso;
    int cpf;
    char sexo;
};


class cAluno {
public:
    void ReceberDados();
    float Calcular(sAluno *vetor, int i);
    int Localizar(sAluno *vetor, int pesquisaCPF, int qnt);
    void Bolha(sAluno VetAlunos[], int qnt);
    void ImprimirLista(sAluno *vetor, int qnt);
    cAluno();
    cAluno(const cAluno& orig);
    virtual ~cAluno();
private:

};

#endif /* CALUNO_H */

