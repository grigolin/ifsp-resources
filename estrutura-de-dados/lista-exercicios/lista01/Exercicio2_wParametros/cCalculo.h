

#ifndef CCALCULO_H
#define CCALCULO_H

class cCalculo {
public:
    void ReceberDados();
    float Calcular(int a, int b, int c);
    
    cCalculo();
    cCalculo(const cCalculo& orig);
    virtual ~cCalculo();
private:

};

#endif /* CCALCULO_H */

