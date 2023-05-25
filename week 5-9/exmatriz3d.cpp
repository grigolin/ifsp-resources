#include <iostream>
using namespace std;

int main(){
    int cubo[6][3][3];
    int i, j, l;
    // preencher matriz de 6 lados, 3 linhas e 3 colunas (cubo)
    for(l=0; l < 6; l++){ // lado
        for(i=0; i<3; i++){ // linha
            for(j=0; j<3; j++){ // coluna
                cout << "Numero de posição " << l << i << j << endl;
                cin >> cubo[l][i][j];
            }
        }
    }

    // mostrar matriz
    for(l=0; l <6; l++){
        for(i=0;i<3;i++){
            for(j=0; j<3;j++){
                cout << cubo[l][i][j] << "\t";
            }
            cout << endl;
        }
        cout << endl;
    }

    return 0;
}