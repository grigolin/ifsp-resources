// Elabore um algoritmo que receba números e os armazene em uma matriz M x M.
// Imprima a matriz com apenas os números da diagonal principal.

#include <iostream>
using namespace std;

int main(){
    int lin = 3, col = 3;
    int i,j;
    int matriz[lin][col];

    for(i=0; i<lin; i++){
        for(j=0;j<col;j++){
            cout << "Num para posição " << i << j << ":";
            cin >> matriz[i][j];
        }
    }

    for(i=0; i<lin; i++){
        for(j=0; j<col;j++){
            if(i == j){ // se a linha for igual a coluna, mostrar
                cout << matriz[i][j] << "\t";
            }
        }
        cout << endl;
    }

    return 0;
}