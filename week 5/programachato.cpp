#include <iostream>
#include <cstring>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
    string nomeproduto, nomeusuario, result;
    int codigo, quant, escolha1, tentasairuser, time;
    float preco, pfinal;

    cout << "Qual seu nome? ";
    cin >> nomeusuario;
    cout << nomeusuario << "? Que nome legal." << endl;
    cout << "O que? Achou que eu ia dizer algo ruim?" << endl;
    cout << "Bom... Que time você torce?" << endl;
    cout << "Corinthians - 1\n"
            "Palmeiras - Codigo 2\n"
            "São Paulo - Codigo 3\n"
            "Santos - Codigo 4\n"
            "Qualquer time do RJ - Codigo 5\n"
         << endl;
    cin >> time;
    switch (time)
    {
    case 1:
        cout << "Simplesmente o maior do Brasil. Você entende muito de futebol" << endl;
        break;

    case 2:
        cout << "Se não fosse a Crefisa e o Abel Ferreira.." << endl;
        break;

    case 3:
        int lembra;
        cout << "Você se lembra do ultimo título de expressão do São Paulo? " << endl;
        cout << "Sim - 1" << endl;
        cout << "Não - 2" << endl;
        cin >> lembra;
        result = (lembra == 1) ? "Caramba, que memória boa. Faz tanto tempo.. " : "Pois é.. Faz tempo mesmo..";
        cout << result << endl;
        break;

    case 4:
        int anos;
        cout << "Quantos anos você tem? " << endl;
        cin >> anos;
        result = (anos > 50) ? "Imaginei. Bença" : "Acho que você errou sua idade, senhor.";
        cout << result << endl;
        break;

    case 5:
        int morarj;
        cout << "Você mora no estado do Rio de Janeiro? " << endl;
        cout << "Sim - 1" << endl;
        cout << "Não - 2" << endl;
        cin >> morarj;
        result = (morarj == 1) ? "Bom, torce pra time pequeno do mesmo jeito. " : "E torce pra time do Rio? Piada..";
        cout << result << endl;
        break;

    default:
        cout << "Rapaz.. Seu time é tão bom que nem tem na opção!" << endl;
        break;
    }

    cout << "Enfim... Vamos fazer compras. " << endl;
    cout << "Tenho uma loja. Veja as opções:" << endl;
    cout << "Chinelo Havaianas - 20 reais - Codigo 1\n"
            "Tenis NIKE - 399 reais - Codigo 2\n"
            "Cartela de ovo - 90 reais - Codigo 3\n"
            "Hamburger - 50 reais - Codigo 4\n"
            "Teclado Multilaser - GRATIS - Codigo 5\n"
            "Agua - Codigo 6"
         << endl;
    cout << "Codigo do produto: ";
    cin >> codigo;
    cout << "Quantidade do produto: ";
    cin >> quant;
    switch (codigo)
    {
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
        cout << "Voce é meio burro, em?! não consegue nem escrever um codigo que exista! Codigo invalido!" << endl;
    }

    int respostauser, escolhauser2;
    cout << " Enfim. Chega de compras." << endl;
    cout << "Primeiro, você sabe o que é um palíndromo?" << endl;
    cout << "(Digite 1 para sim" << endl;
    cout << "Digite 2 para não)" << endl;
    cin >> respostauser;

    if (respostauser == 1)
    {
        string palavra, palavrareversa;
        cout << "Aham.. Sei..." << endl;
        cout << "Enfim. Digite uma palavra que é palíndromo para testar: " << endl;
        cin >> palavra;
        // eu poderia ter usado o toupper para verificar, mas ele simplesmente não funciona no meu editor.
        palavrareversa = palavra;

        reverse(palavrareversa.begin(), palavrareversa.end());

        if (palavra == palavrareversa)
        {
            cout << "A palavra é um palíndromo!";
        }
        else
        {
            cout << "Não é palíndromo! Pesquisou mesmo?";
        }
    }
    else if (respostauser == 2)
    {
        cout << "Que pena. Não vou te contar." << endl;
        cout << "Quer saber? Pesquisa você!" << endl;
        cout << "(Digite 1 para sim" << endl;
        cout << "Digite 2 para não)" << endl;
        while (escolhauser2 != 1)
        {
            cout << "Já pesquisou?"
                 << "\n";
            cin >> escolhauser2;
        }
        string palavra, palavrareversa;
        cout << "Beleza.. Vou acreditar. " << endl;
        cout << "Digite uma palavra palindromo: " << endl;
        cin >> palavra;
        // eu poderia ter usado o toupper para verificar, mas ele simplesmente não funciona no meu editor.
        palavrareversa = palavra;

        reverse(palavrareversa.begin(), palavrareversa.end());

        if (palavra == palavrareversa)
        {
            cout << "A palavra é um palíndromo!";
        }
        else
        {
            cout << "Não é palíndromo! Pesquisou mesmo?";
        }
    }
    else
    {
        cout << "Você tá me testando?" << endl;
    }

    int cidade;
    cout << "Qual cidade é mais legal? " << endl;
    cout << "Fernandópolis - 1\n"
            "Votuporanga - 2\n"
            "Rio Preto - 3\n"
            "Outra cidade - 4\n";
    cin >> cidade;
    while (cidade != 1)
    {
        cout << "Essa não é a cidade mais legal! Tente de novo!" << endl;
        cin >> cidade;
    }
    cout << "Agora sim! A mais legal que tem!";

    cout << " Quer saber? Já chega. Você nem pergunta nada, por que só eu pergunto tudo? " << endl;
    cout << "Quer sair?" << endl;
    cout << "Digite 1 para sim" << endl;
    cout << "Digite 2 para não" << endl;
    cin >> tentasairuser;
    while (tentasairuser != 2)
    {
        cout << "Tem certeza mesmo? " << endl;
        cin >> tentasairuser;
    }
    cout << "Não quero saber! Pode sair!";

    return 0;
}