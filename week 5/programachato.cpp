#include <iostream>
#include <cstring>
using namespace std;

int main(){
    string nomeproduto, nomeusuario;
    int codigo, quant, escolha1;
    float preco, pfinal;

    cout << "Qual seu nome? ";
    cin >> nomeusuario;
    cout << nomeusuario << "? Que nome legal." << endl;
    cout << "O que? Achou que eu ia dizer algo ruim?" << endl;
    cout << "Enfim... O que quer fazer? " << endl;
    cout << "Digite 1 para fazer compras " << endl;
    cout << "Digite 2 para ir embora " << endl;
    cin>> escolha1;

    if(escolha1==1){

    }else if(escolha1==2){
        
    }else {
        
    }


    cout << "Que coincidência. Veja as opções:" << endl;
    cout<<"Chinelo Havaianas - 20 reais - Codigo 1\n"
        "Tenis NIKE - 399 reais - Codigo 2\n"
        "Cartela de ovo - 90 reais - Codigo 3\n"
        "Hamburger - 50 reais - Codigo 4\n"
        "Teclado Multilaser - GRATIS - Codigo 5\n"
        "Agua - Codigo 6"<< endl;
    cout << "Codigo do produto: ";
    cin >> codigo;
    cout << "Quantidade do produto: ";
    cin >> quant;

    switch(codigo){
        case 1:
        nomeproduto = " Chinelo Havaianas:";
        preco = 20;
        pfinal = quant * preco;
        cout << "O valor a ser pago pelo " << quant << nomeproduto << " é de " << pfinal << endl;
        cout << "Lembre-se: Vai arrebentar em um mês, e sem garantia!";
        break;

        case 2:
        nomeproduto = " Tenis NIKE";
        preco = 399;
        pfinal = quant * preco;
        cout << "O valor a ser pago pelo " << quant << nomeproduto << " é de " << pfinal << endl;
        cout << "Eu sei que você nao tem dinheiro o suficiente pra comprar, pode devolver..";
        break;

        case 3:
        nomeproduto = " Cartela de ovo";
        preco = 90;
        pfinal = quant * preco;
        cout << "O valor a ser pago pela " << quant << nomeproduto << " é de " << pfinal << endl;
        cout << "Os ovos são de ouro, por isso o valor..";
        break;
        
        case 4:
        nomeproduto = " Hamburger";
        preco = 50;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nomeproduto << " é de " << pfinal << endl;
        cout << "Sim, 30 reais o hamburger. Achou ruim? Vai comprar em outro lugar!";
        break;

        case 5:
        nomeproduto = " Teclado Multilaser";
        preco = 0;
        pfinal = quant * preco;
        cout << "O valor a ser pago por " << quant << nomeproduto << " é de " << pfinal << endl;
        cout << "Nao tem nem como eu cobrar por isso, ruim demais! Fica de graça pra voce!";
        break;

        case 6:
        nomeproduto = " Agua";
        preco = 3;
        pfinal = quant * preco;
        cout << "O valor a ser pago pela " << quant << nomeproduto << " é de " << pfinal << endl;
        break;
        default:
        cout << "Voce é burro, em?! não consegue nem escreve um codigo que exista! Codigo invalido!";
    }

    

    return 0;
}