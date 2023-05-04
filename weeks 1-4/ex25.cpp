#include <iostream>
using namespace std;

int main(){
    int num, cont, soma, media;
    for(int i = 1; i <= 20; i++){
        cout << "Numero: " << endl;
        cin >> num;
        soma += num;
        cont++;
    }
    media = soma/cont;
    cout << "A media dos numeros e: " << media << endl;

    return 0;
}