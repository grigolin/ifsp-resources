

#ifndef PILHA_H
#define	PILHA_H

struct nodo {
    int elem;
    struct nodo *ant;
};


class pilha {
public:
    pilha();
    pilha(const pilha& orig);
    virtual ~pilha();
  
    nodo *topo, *aux;
    
    bool vazio(struct nodo *campo);
    void inserir();
    void remover();
    void listar();
    void menu();
    nodo* encontrarMeio();
    void exibirValorMeio();
    
private:

};

#endif	/* PILHA_H */
