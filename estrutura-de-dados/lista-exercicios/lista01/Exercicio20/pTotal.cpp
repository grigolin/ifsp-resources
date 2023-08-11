

#include "pTotal.h"
#include <iostream>
using namespace std;
pTotal::pTotal() {
}

pTotal::pTotal(const pTotal& orig) {
}

pTotal::~pTotal() {
}

void pTotal::ReceberCodigo(){
    int cproduto, quant;
    float ptotal = 0;
    char opcao = 'c';
    do{
        cout << "Codigo do produto: " << endl;
        cin >> cproduto;
        cout << "Quantidade: " << endl;
        cin >> quant;
        ptotal += this->PrecoTotal(cproduto, quant);
        cout << "Pedido atualizado, valor total: " << ptotal << endl;
        cout << "\n";
        cout << "Deseja continuar? Digite 'c'." << endl;
        cin >> opcao;
    }while(opcao == 'c');
}

float pTotal::PrecoTotal(int cproduto, int quant){
    float ptotal=0.0;
    switch(cproduto){
        case 1001:
            ptotal += 5.32 * quant;
            break;
        case 1324:
            ptotal += 6.45 * quant;
            break;
        case 6548:
            ptotal += 2.37 * quant;
            break;
        case 987:
            ptotal += 5.32 * quant;
            break;
        case 7623:
            ptotal += 6.45 * quant;
            break;
        default:
            cout << "Codigo incorreto!";
    }
    return ptotal;
}
