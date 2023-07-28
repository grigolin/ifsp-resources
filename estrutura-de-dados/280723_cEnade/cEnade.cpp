
#include "cEnade.h"
#include <iostream>
cEnade::cEnade() {
}

cEnade::cEnade(const cEnade& orig) {
}

cEnade::~cEnade() {
}

void cEnade::fill(){
    int i =0, j=0, c=0;
    for(i =0; i < 3; i++){
        for(j=0; j < 4; j++){
            c++;
            matriz[i][j] = c;
        }
    }
    /*
    for(i=0; i < 3; i++){
        for(j=0; j < 4; j++){
            c = matriz[2-i][3-j];
            matriz[i][j] = c;
        }
    }*/
}

void cEnade::show(){
    for(int i = 0; i < 3; i++){
        for(int j =0; j < 4; j++){
            std::cout << matriz[i][j] << '\t';
        }
        std::cout << "\n";
    }
}