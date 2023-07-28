#include <iostream>
#include <fstream>
using namespace std;

struct Pessoa {
    string nome;
    double peso;
    double altura;
};

double calcularIMC(const Pessoa& pessoa) {
    return pessoa.peso / (pessoa.altura * pessoa.altura);
}

void lerDadosPessoa(Pessoa& pessoa) {
    cout << "Nome: ";
    getline(cin, pessoa.nome);
    cout << "Peso (kg): ";
    cin >> pessoa.peso;
    cout << "Altura (m): ";
    cin >> pessoa.altura;
    cin.ignore();  // Ignorar o caractere de nova linha deixado pelo cin
}

void exibirResultadoIMC(const Pessoa& pessoa, double imc) {
    cout << "Nome: " << pessoa.nome << endl;
    cout << "Peso: " << pessoa.peso << " kg" << endl;
    cout << "Altura: " << pessoa.altura << " m" << endl;
    cout << "IMC: " << imc << endl;
    cout << endl;
}

void salvarDadosIMC(const Pessoa& pessoa, double imc) {
    ofstream arquivo("imc.txt", ios::app);  // Abre o arquivo em modo de escrita (append)
    if (arquivo.is_open()) {
        arquivo << "Nome: " << pessoa.nome << endl;
        arquivo << "Peso: " << pessoa.peso << " kg" << endl;
        arquivo << "Altura: " << pessoa.altura << " m" << endl;
        arquivo << "IMC: " << imc << endl;
        arquivo << endl;
        arquivo.close();  // Fecha o arquivo
    } else {
        cout << "Erro ao abrir arquivo." << endl;
    }
}

int main() {
    int numPessoas;
    cout << "Digite o número de pessoas: ";
    cin >> numPessoas;
    cin.ignore();  // Ignorar o caractere de nova linha deixado pelo cin

    Pessoa pessoas[numPessoas];

    for (int i = 0; i < numPessoas; i++) {
        cout << "Pessoa " << i + 1 << ":" << endl;
        lerDadosPessoa(pessoas[i]);
        double imc = calcularIMC(pessoas[i]);
        exibirResultadoIMC(pessoas[i], imc);
        salvarDadosIMC(pessoas[i], imc);
    }

    return 0;
}
