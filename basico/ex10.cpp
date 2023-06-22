/*
Programa que pergunta o numero da tabuada e até qual numero deve
ser mostrado.
*/

#include <iostream>
using namespace std;

int main(){
    int num, contador;
    cout << "Numero para tabuada: ";
    cin >> num;
    cout << "Ate que numero da tabuada? ";
    cin >> contador;
    for(int i=1; i<contador+1;i++){
        cout << num << " x " << i << " = " <<  i*num << "\n";
    }

    return 0;
}