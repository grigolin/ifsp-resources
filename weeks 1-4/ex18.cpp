#include <iostream>
using namespace std;

int main(){
    float num;
    cout << "Valor: ";
    cin >> num;

    if(num < 0){
        cout << "O valor " << num << " é negativo!";
    }else{
        cout << "O valor " << num << " é positivo!";
    }

    return 0;
}