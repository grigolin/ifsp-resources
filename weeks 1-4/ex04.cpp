/*
Escreva um programa que recebe dois números e retorna o maior deles.
*/

#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int num1, num2;
    cout << "Numero 1: ";
    cin >> num1;
    cout << "Numero 2: ";
    cin >> num2;
    
    if(num1 > num2){
        cout << num1 << " e maior que " << num2;
    }else if(num2 > num1){
        cout << num2 << " e maior que " << num1;
    }else{
        cout << num1 << " e igual a " << num2;
    };
    
    return 0;
}