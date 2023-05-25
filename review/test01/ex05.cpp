#include <iostream>
using namespace std;

int main(){
    int senha = 1234;
    int cont = 0;
    int tent;

    while(cont < 3){
        cout << "Digite a senha:" << endl;
        cin >> tent;
        cont++;
        if(tent == senha){
            cout << "Senha correta.";
            break;
        }else{
            cout << "Senha incorreta." << endl;
        }
    }
    return 0;
}