#include <stddef.h>
#include "Fila.h"
#include "Pilha.h"
#include <iostream>

using namespace std;

Fila::Fila() {
    this->aux = NULL;
    this->fim = NULL;
    this->inicio = NULL;
}

Fila::Fila(const Fila& orig) {
}

Fila::~Fila() {
}

void Fila::insere(void)
{
	int x;

        cout<<"\nEntre com o numero a inserir: "; cin>>x;
	
	this->aux = (struct nodo *) malloc(sizeof(aux));
	this->aux->valor = x;
        
        if (vazio(this->inicio)){
            this->inicio = this->aux;
        } else {
            this->fim->prox = this->aux;
        }

        this->fim = this->aux;
        
	cout<< "\nInserção com sucesso!\n\n";
}

void Fila::listar(){
    nodo *p = this->inicio;
        
    if (!this->vazio(p)){
        cout << "[";

        do {
            cout << p->valor << " , ";
            p = p->prox;
        } while (p != this->fim);
        
        cout << p->valor << "]\n\n";
        return;
    }   
    cout << "\n\nFila vazia: [     ] \n\n";
}

void Fila::remover(void){
	if (!vazio(this->inicio)){
           cout << "\nValor [" << this->fim->valor << "] ";
           
	   this->aux=this->inicio;

           this->inicio = this->aux->prox;
           
	   free(this->aux);
           
	   cout<< "Removido com sucesso!\n";
	}
}


void Fila::menu(void){
	char op;
	int sair=0;

	inicio= NULL;
	do {
		cout<< "\n[1] Insere na fila\n[2] Remove da fila\n";
		cout<< "[3] Listar fila\n[4] Pesquisar na fila\n";
                cout<< "[5] Sair do programa\n\n";
		cout<< "Informe a opção: ";
		cin>> op;
		switch (op)
		{
			case '1': 
                            this->insere(); 
                              break;
    		  	case '2': 
                            this->remover(); 
                            break;
			case '3': 
                            this->listar(); 
                            break;
			case '4': 
                            this->pesquisar();
                            break;
                    case '5':
                            sair=1; 
                            break;
                    default:
                            cout<<"Opção invalida! \n";
                            break;
		}
	} while(sair != 1);
}

void Fila::pesquisar(){
    int valor;

    cout << "\nInforme o valor que deseja pesquisar: "; cin >> valor;

    nodo *p;

    p = this->inicio;

    int cont = 0;
    
    while (!this->vazio(p)) {
        if (p->valor == valor){
            cout << "\n\nO elemento [" << valor << "] foi encontrado! na posição " << cont << "\n\n";
            return;
        }
        cont++;
        p = p->prox;
    }
    cout << "\n\nO elemento [" << valor << "] não foi encontrado!\n\n";
}

bool Fila::vazio(struct nodo *nodo){
    return nodo == NULL;
}
