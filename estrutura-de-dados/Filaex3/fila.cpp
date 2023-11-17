
#include "fila.h"
#include <iostream>
using namespace std;

fila::fila() {
}

fila::fila(const fila& orig) {
}

fila::~fila() {
}

bool fila::vazio(struct nodo *campo) {
    return campo == NULL;
}

void fila::inserir() {//ok
    int x;
    cout << "Digite o elemento a inserir: ";
    cin>>x;
    
    if (!this->pesquisar(x)){
        this->aux = (struct nodo *) malloc(sizeof (this->aux));
        aux->elem = x;
        aux->prox = NULL;

        if (inicio == 0)
            inicio = aux;
        else {
            fim->prox = aux;
        }
        fim = aux;

        cout << this->aux->elem << " Inserido com sucesso!\n\n";
        return;
    }
    cout << "ELEMENTO JÁ EXISTE DESGRAÇA!\n\n";
}

bool fila::pesquisar(int elem) { //ok
    this->aux = this->inicio;
    
    while (this->aux != NULL) {
        if (this->aux->elem == elem) {
            return true;
        }
        this->aux = this->aux->prox;
    }
    return false;
}

void fila::listar() {//ok
    nodo *p;
    p = this->inicio;
    while (!vazio(p->prox)) {
        cout << "\nITEM" << p->elem;
        p = p->prox;
    }
    cout << "\nITEM"<< " " << p->elem << "\n\n";
}

void fila::remover(){//ok
    this->aux = this->inicio;
    if(aux ==NULL){
        return ;
    }
    this->inicio = this->aux->prox;
    free(this->aux);
}
void fila::menu() {//ok
    char op;
    int sair = 0;

    inicio = NULL;
    do{
        cout << "1 -> Insere na fila\n2 -> Remove da fila\n";
        cout << "3 -> Listar fila\n4 -> Sair da fila\n";
        cout << "\nDigite uma opção: ";
        cin>>op;
        switch (op) {
            case '1': 
                inserir();
                break;
            case '2': 
                remover();
                break;
            case '3': 
                listar();
                break;
            case '4': 
                sair = 1;
                break;
            default:
            {
                cout << "Opção invalida! \n";
                break;
            }
        }
    }while(sair!=1);

}