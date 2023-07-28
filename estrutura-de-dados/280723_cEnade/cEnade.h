

#ifndef CENADE_H
#define CENADE_H

class cEnade {
public:
    cEnade();
    cEnade(const cEnade& orig);
    virtual ~cEnade();
    
    int matriz[3][4];

    void fill();
    void show();
private:

};

#endif /* CENADE_H */

