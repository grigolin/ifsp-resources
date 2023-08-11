

#ifndef PTOTAL_H
#define PTOTAL_H

class pTotal {
public:
    void ReceberCodigo();
    float PrecoTotal(int cproduto, int quant);
    
    pTotal();
    pTotal(const pTotal& orig);
    virtual ~pTotal();
private:

};

#endif /* PTOTAL_H */

