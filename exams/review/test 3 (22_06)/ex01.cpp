#include <iostream>
using namespace std;

int main(){
    int num[10];
    int soma;
    for(int i=0; i<10; i++){
        cout << "Digite o numero " << i+1 << endl;
        cin >> num[i];
        soma += num[i];
    }
    cout << "Os valores digitados foram: ";
    for(int i = 0; i < 10; i++){
        cout << num[i] << " - ";
    } cout << endl;
    cout << soma;
    return 0;
}