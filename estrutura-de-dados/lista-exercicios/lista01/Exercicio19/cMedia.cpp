

#include "cMedia.h"
#include <iostream>
using namespace std;
cMedia::cMedia() {
}

cMedia::cMedia(const cMedia& orig) {
}

cMedia::~cMedia() {
}

void cMedia::RecebeNotas(){
    float n1, n2, n3 = 0;
    int escolha;
    cout << "Nota 1: " << endl;
    cin >> n1;
    cout << "Nota 2: " << endl;
    cin >> n2;
    cout << "Nota 3: " << endl;
    cin >> n3;
    cout << "Escolha uma média para ser calculada: "
            "1 -aritmética"
            "2 -ponderada (3,3,4)"
            "3 -harmônica";
    cin >> escolha;
    switch(escolha){
        case 1:
            break;
            
    }
}