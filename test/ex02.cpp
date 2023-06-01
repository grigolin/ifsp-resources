#include <cstdlib>
#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char** argv) {
    string nome, nomemes;
    int mes;
    cout << "Qual seu nome?" << endl;
    cin >> nome;
    cout << "Digite o numero do mes do seu aniversario:" << endl;
    cin >> mes;
    switch (mes) {
        case 1:
            nomemes = "Janeiro";
            break;
        case 2:
            nomemes = "Feveiro";
            break;
        case 3:
            nomemes = "Março";
            break;
        case 4:
            nomemes = "Abril";
            break;
        case 5:
            nomemes = "Maio";
            break;
        case 6:
            nomemes = "Junho";
            break;
        case 7:
            nomemes = "Julho";
            break;
        case 8:
            nomemes = "Agosto";
            break;
        case 9:
            nomemes = "Setembro";
            break;
        case 10:
            nomemes = "Outubro";
            break;
        case 11:
            nomemes = "Novembro";
            break;
        case 12:
            nomemes = "Dezembro";
            break;
        default:
            cout << "Esse mes nao existe!";
            break;
    };
    cout << "Oi " << nome << ", voce nasceu em " << nomemes << endl;
    return 0;
}

