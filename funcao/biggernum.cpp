#include <iostream>
using namespace std;

int num1, num2, num3;

void VerificarMaior(){
    int maior;
    if (num1>num2 && num1>num3){
        maior = num1;
    }else if(num2>num1 && num2>num3){
        maior = num2;
    }else if(num3>num1 && num3 > num2){
        maior = num3;
    }else{
        maior = 0;
    }
    if(maior > 0){
        cout << "O maior é: " << maior << endl;
    }else{
        cout << "Os números são iguais";
    }
    
}

int main(){
    cout << "Digite numero 1: ";
    cin >> num1;
    cout << "Digite numero 2: ";
    cin >> num2;
    cout << "Digite numero 3: ";
    cin >> num3;
    VerificarMaior();
    return 0;
}