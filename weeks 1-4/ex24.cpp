#include <iostream>
using namespace std;

int main(){
    int num, cont;
    for(int i = 1; i <= 15; i++){
        cout << "Numero: " << endl;
        cin >> num;
        if(num < 0){
            cont++;
        }
    }
    cout << "O numero de numeros negativos digitados foi: " << cont;


    return 0;
}