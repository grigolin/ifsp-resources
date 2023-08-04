

#ifndef CCALCULO_H
#define CCALCULO_H

class cCalculo {
public:
    int a, b, c;
    void ReceberDados();
    float Calcular();
    
    cCalculo();
    cCalculo(const cCalculo& orig);
    virtual ~cCalculo();
private:

};

#endif /* CCALCULO_H */

