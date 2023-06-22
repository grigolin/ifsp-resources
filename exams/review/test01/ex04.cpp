#include <iostream>
using namespace std;

int main(){
    int idade;
    cout << "Digite sua idade:" << endl;
    cin >> idade;
    if(idade >= 65){
        cout << "Você pode ser atendido em fila preferencial" << endl;
        cout << endl;
        cout << "Dirija-se ao caixa 1";

    }else{
    cout << "Voce sera atendido nos caixas convencionais\n"
            "Dirija-se a um dos caixas:\n"
            "Caixa 2;\n"
            "Caixa 3;\n"
            "Caixa 4;\n"
         << endl;
    }
    return 0;
}