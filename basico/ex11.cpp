/*
Faça um programa usando FOR, para apresentar a tabuada do 6
de forma decrescente.
*/

#include <iostream>
using namespace std;

int main(){
    for(int i=10; i>=1; i--){
        cout << "6" << " x " << i << " = " << 6*i << "\n";
    }

    return 0;
}