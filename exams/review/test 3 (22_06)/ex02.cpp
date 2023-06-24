#include <iostream>
using namespace std;

int main(){
    int num[8];
    int cont;
    for(int i = 0; i <8; i++){
        cout << "Digite o numero " << i+1 << endl;
        cin >> num[i];
        if(num[i] % 3 == 0){
            cont++;
        }
    }
    cout << "Os numeros digitados foram: " << endl;
    for(int i = 0; i < 8; i++){
        cout << num[i] << " - ";
    }cout << endl;
    cout << "Foram digitados " << cont  << " multiplos de 3";
    return 0;
}