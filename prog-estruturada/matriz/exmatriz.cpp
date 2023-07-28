#include <iostream>
using namespace std;

int main(){
    int matriz [2][3];
    int i, j;
    // Preencher matriz
    for(i = 0; i < 2; i++){
        for(j = 0; j < 3; j++){
            cout << "Digite um numero para a posição " << i << " " << j << " da matriz: ";
            cin >> matriz[i][j];
        }
    }

    // Mostrar matriz
    for(i = 0; i < 2; i++){
        for(j = 0; j < 3; j++){
            cout << matriz[i][j] << "\t";
        }
        cout << endl;
    }

    return 0;
}