

#ifndef CMEDIA_H
#define CMEDIA_H

class cMedia {
public:
    void RecebeNotas();
    float MediaAritmetica();
    float MediaPonderada();
    float MediaHarmonica();
    
    cMedia();
    cMedia(const cMedia& orig);
    virtual ~cMedia();
private:

};

#endif /* CMEDIA_H */

