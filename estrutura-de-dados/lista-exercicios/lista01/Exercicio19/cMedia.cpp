

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
            "1 - Aritmética"
            "2 - Ponderada (3,3,4)"
            "3 - Harmônica";
    cin >> escolha;
    switch(escolha){
        case 1:
            cout << this->MediaAritmetica(n1, n2, n3);
            break;
        case 2:
            cout << this->MediaPonderada(n1, n2, n3);
            break;
        case 3:
            cout << this->MediaHarmonica(n1, n2, n3);
            break;
        default:
            cout << "Escolha uma opcao valida!" << endl;
    }
}

float cMedia::MediaAritmetica(int n1, int n2, int n3){
    return (n1 + n2 + n3) / 3;
}

float cMedia::MediaPonderada(int n1, int n2, int n3){
    return (n1 * 0.3 + n2 * 0.3 + n3 * 0.4); 
}

float cMedia::MediaHarmonica(int n1, int n2, int n3){
    return 3 / (1 / n1 + 1 / n2 + 1 / n3); 
}   