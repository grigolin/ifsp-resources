
#include "pilha.h"
#include <iostream>
#include <cstdlib>

using namespace std;

pilha::pilha() {
}

pilha::pilha(const pilha& orig) {
}

pilha::~pilha() {
}

bool pilha::vazio(struct nodo *campo) {
    return campo == NULL;
}

void pilha::inserir() {
    int x;

    cout << "\nEntre com o numero a inserir: ";
    cin>>x;

    this->aux = (struct nodo *) malloc(sizeof (aux));
    this->aux->elem = x;
    this->aux->ant = this->topo;
    this->topo = this->aux;

    cout << this->aux << "\n";
    cout << this->topo << "\n";
    cout << this->aux->ant << "\n";
    cout << this->topo << "\n";
    cout << "\nElemento inserido!\n\n";
}

void pilha::remover() {
    if (!vazio(this->topo)) {
        this->aux = this->topo;
        this->topo = this->topo->ant;
        free(this->aux);
        cout << "\nRemovido com sucesso!";
    }
}

void pilha::listar() {

    nodo *p;
    p = this->topo;
    while (!vazio(p->ant)) {
        cout << "\nITEM" << p->elem;
        p = p->ant;
    }
    cout << "\nITEM" << p->elem << "\n\n";

}

void pilha::exibirValorMeio() {
    cout << "\n\nO valor do meio da pilha é: " << this->encontrarMeio()->elem;
}

nodo* pilha::encontrarMeio() {
    int cont = 0;

    this->aux = this->topo;

    while (!this->vazio(this->aux)) {
        cont++;
        this->aux = this->aux->ant;
    }

    int meio = cont / 2;

    this->aux = this->topo;
    cont = 0;

    while (!this->vazio(this->aux)) {
        if (cont == meio) {
            return this->aux;
        }
        cont++;
        this->aux = this->aux->ant;
    }
    return NULL;
}

void pilha::menu() {
    char op;
    int sair = 0;

    topo = NULL;
    do {
        cout << "\n1 -> Insere na pilha\n2 -> Remove da pilha\n";
        cout << "3 -> Listar pilha\n4 -> Sair da pilha\n";
        cout << "5- Valor meio\n";
        cout << "Digite uma opção: ";
        cin>>op;
        switch (op) {
            case '1': inserir();
                break;
            case '2': remover();
                break;
            case '3': listar();
                break;
            case '4':
                sair = 1;
                break;
            case'5':
                exibirValorMeio();
                break;
            default:
            {
                cout << "Opção invalida! \n";
                break;
            }
        }
    } while (sair != 1);
}
