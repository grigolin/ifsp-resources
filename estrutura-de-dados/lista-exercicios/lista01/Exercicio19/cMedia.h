

#ifndef CMEDIA_H
#define CMEDIA_H

class cMedia {
public:
    void RecebeNotas();
    float MediaAritmetica(int n1, int n2, int n3);
    float MediaPonderada(int n1, int n2, int n3);
    float MediaHarmonica(int n1, int n2, int n3);
    
    cMedia();
    cMedia(const cMedia& orig);
    virtual ~cMedia();
private:

};

#endif /* CMEDIA_H */

