#include "Pilha.h"
#include <iostream>
#include <cstdlib>

using namespace std;

Pilha::Pilha() {
}

Pilha::Pilha(const Pilha& orig) {
}

Pilha::~Pilha() {
}

bool Pilha::vazio(struct nodo *campo){
        return campo == NULL;
}

void Pilha::insere(void)
{
	int x;

        cout<<"\nEntre com o numero a inserir: ";
        cin>>x;
	
	this->aux = (struct nodo *) malloc(sizeof(aux));
	this->aux->elem = x;
	this->aux->anterior = this->inicio;
	this->inicio= this->aux;
        
	cout<< "\nInserção com sucesso!\n\n";
}

void Pilha::remover(void){
	if (!vazio(this->inicio)){
           cout << "\nValor [" << this->inicio->elem << "] ";
	   this->aux=this->inicio;
	   this->inicio=this->inicio->anterior;
	   free(this->aux);
	   cout<< "Removido com sucesso!\n";
	}
}

void Pilha::listar(void){
        
    if (!vazio(this->inicio)){
        nodo *p;
	
        p = this->inicio;
        
        cout << "\n[";
        
        while (!vazio(p->anterior)){
           cout<< p->elem << " , ";
           p = p->anterior;
        }
        
        cout<<""<< p->elem << "]\n\n";    
        return;
     } 
        cout << "Pilha vazia: [     ] ";
}

void Pilha::pesquisar(void){
    int valor;
    
    cout << "\nInforme o valor que deseja pesquisar: "; cin >> valor;

    nodo *p;

    p = this->inicio;

    int cont = 0;
    
    while (!this->vazio(p)) {
        if (p->elem == valor){
            cout << "\n\nO elemento [" << valor << "] foi encontrado! na posição " << cont << "\n\n";
            return;
        }
        cont++;
        p = p->anterior;
    }
    cout << "\n\nO elemento [" << valor << "] não foi encontrado!\n\n";
}

void Pilha::menu(void){
	char op;
	int sair=0;

	inicio=NULL;
	do {
		cout<< "\n[1] Insere na pilha\n[2] Remove da pilha\n";
		cout<< "[3] Listar pilha\n[4] Pesquisar na pilha\n";
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

