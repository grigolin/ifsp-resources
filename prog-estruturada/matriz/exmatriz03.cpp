// Elabore um algoritmo para gerar duas matrizes MxN.
// Calcule e imprima a matriz soma.

#include <iostream>
using namespace std;

int main(){
    int lin = 2, col = 2;
    int i, j;
    int matriz1[lin][col];
    for(i = 0; i < lin; i++){
        for(j = 0; j < col; j++){
            cout << "Digite um numero para a posição " << i << " " << j << " da matriz 1: ";
            cin >> matriz1[i][j];
        }
    }

    int matriz2[lin][col];
    for(i = 0; i < lin; i++){
        for(j = 0; j < col; j++){
            cout << "Digite um numero para a posição " << i << " " << j << " da matriz 2: ";
            cin >> matriz2[i][j];
        }
    }

    int matrizresult[lin][col];
    for(i = 0; i < lin; i++){
        for(j = 0; j < col;j++){
            matrizresult[i][j] = matriz1[i][j] + matriz2[i][j];
        }
        cout << endl;
    }

    for(i = 0; i < lin; i++){
        for(j = 0; j < col;j++){
            cout << matrizresult[i][j] << '\t';
        }
        cout << endl;
    }
    return 0;
}