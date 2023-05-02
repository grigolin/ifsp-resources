#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Numero: ";
    cin >> num;
    if (num % 2 == 0){
        cout << "É par";
    }else{
        cout << "É impar";
    }

    return 0;
}