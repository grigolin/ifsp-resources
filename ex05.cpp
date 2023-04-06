#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int num1, num2, num3;
    
    cout << "Numero 1: ";
    cin >> num1;
    cout << "Numero 2: ";
    cin >> num2;
    cout << "Numero 3: ";
    cin >> num3;
    
    if(num1 > num2 && num1 > num3){
        cout << num1 << " e o maior!";
    }else if(num2 > num1 && num2 > num3){
        cout << num2 << " e o maior!";
    }else if(num3 > num1 && num3 > num2){
        cout << num3 << " e o maior!";
    }else{
        cout << "os numeros sao iguais!";
    }
    
    return 0;
}