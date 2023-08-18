

#ifndef CALUNO_H
#define CALUNO_H
#include <string>

struct DadosAluno{
    std::string nome;
    int matricula;
    float nota[2];
    float media;
};

class cAluno {
public:
    DadosAluno Array[2];
    void ReceberDados();
    void CalcularMedia();
    void MostrarDados();
    cAluno();
    cAluno(const cAluno& orig);
    virtual ~cAluno();
private:

};

#endif /* CALUNO_H */

