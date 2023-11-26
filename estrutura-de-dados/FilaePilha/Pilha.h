#ifndef PILHA_H
#define	PILHA_H

class Pilha {
public:
    Pilha();
    Pilha(const Pilha& orig);
    virtual ~Pilha();
    
    struct nodo {
	int elem;
	struct nodo *anterior;
    } *inicio, *aux;
    
    bool vazio(struct nodo *campo);
    void insere();
    void remover();
    void listar();
    void menu();
    void pesquisar();

    
private:

};

#endif	/* PILHA_H */

