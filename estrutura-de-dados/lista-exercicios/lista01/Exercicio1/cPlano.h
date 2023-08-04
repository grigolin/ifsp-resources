

#ifndef CPLANO_H
#define CPLANO_H

class cPlano {
public:
    int x1, x2, y1, y2;
    
    void ReceberPontos();
    float Calcular();
    
    cPlano();
    cPlano(const cPlano& orig);
    virtual ~cPlano();
private:

};

#endif /* CPLANO_H */

