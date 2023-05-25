// Elabore um algoritmo que receba números e os armazene em uma matriz M x M.
// Imprima a matriz sem os números da diagonal principal.

#include <iostream>
using namespace std;

int main(){
    int lin = 3, col = 3;
    int i, j;
    int matriz[lin][col];
    // Preencher matriz
    for(i = 0; i < lin; i++){
        for(j = 0; j < col; j++){
            cout << "Digite um numero para a posição " << i << " " << j << " da matriz: ";
            cin >> matriz[i][j];
        }
    }

    // Mostrar a matriz sem os numeros da diagonal principal (0 0, 1 1, 2 2)
    for(i = 0; i < lin; i++){
        for(j=0; j<col;j++){
            if(i != j){
                cout << matriz[i][j] << "\t" ;
            }
        }
        cout << endl;
    }

    return 0;
}