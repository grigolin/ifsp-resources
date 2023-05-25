#include <iostream>
using namespace std;

int main(){
    int ouro, prata, bronze, total;
    cout << "Digite o número de medalhas de OURO que o Brasil ganhou nas olimpiadas:" << endl;
    cin >> ouro;
    cout << endl;
    cout << "Digite o número de medalhas de PRATA que o Brasil ganhou nas olimpiadas:" << endl;
    cin >> prata;
    cout << endl;
    cout << "Digite o número de medalhas de BRONZE que o Brasil ganhou nas olimpiadas:" << endl;
    cin >> bronze;
    cout << endl;
    total = ouro + prata + bronze;
    cout << "o Brasil ganhou " << total << " medalhas nas Olimpiadas.";
    return 0;
}