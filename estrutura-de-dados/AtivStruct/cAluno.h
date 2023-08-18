

#ifndef CALUNO_H
#define CALUNO_H
#include <string>

struct Dados{
    std::string nome;
    int idade;
    char sexo;
    float nota[3];
};

class cAluno {
public:
    Dados Array[2];
    void ReceberDados();
    void Mostrar();
    cAluno();
    cAluno(const cAluno& orig);
    virtual ~cAluno();
private:

};

#endif /* CALUNO_H */

