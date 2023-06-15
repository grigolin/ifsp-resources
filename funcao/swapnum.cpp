#include <iostream>
using namespace std;

void SwapNum(int &num1, int &num2){ // usando referência, sem ela a função SwapNum não pode trocar os numeros,
    int temp;                       // pois não sabe onde na memoria estas variaveis estão armazenadas.
    temp = num1;
    num1 = num2;
    num2= temp;
}

int main(){
    int x,y;
    cout << "Digite 2 numeros: ";
    cin >> x >> y;
    cout << "Voce digitou " << x << " e " << y << endl;

    SwapNum(x,y);
    cout << "Numeros trocados, agora: " << x << " e " << y << endl;
    return 0;
}