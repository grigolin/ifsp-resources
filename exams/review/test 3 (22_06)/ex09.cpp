#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
    fflush(stdin);
    int npets;
    
    cout << "Quantos PETS deseja cadastrar? ";
    cin >> npets;

    struct StructPETs {
        char nomeAnimal[40], nomeDono[40], especie[40], raca[40], sexo[15];
        int telefoneDono, RGdono, idadePET;
    } StructPET[npets];

    for (int i = 0; i < npets; i++) {
        fflush(stdin);
        cout << "Nome PET: " << endl;
        cin.getline(StructPET[i].nomeAnimal, 40);
        fflush(stdin);
        cout << "Especie PET: " << endl;
        cin.getline(StructPET[i].especie, 40);
        fflush(stdin);
        cout << "Raça PET: " << endl;
        cin.getline(StructPET[i].raca, 40);
        fflush(stdin);
        cout << "Sexo PET: " << endl;
        cin.getline(StructPET[i].sexo, 40);
        fflush(stdin);
        cout << "Idade PET: " << endl;
        cin >> StructPET[i].idadePET;
        fflush(stdin);
        cout << "Nome Dono: " << endl;
        cin.getline(StructPET[i].nomeDono, 40);
        fflush(stdin);
        cout << "RG PET: " << endl;
        cin >> StructPET[i].RGdono;
        fflush(stdin);
        cout << "Telefone PET: " << endl;
        cin >> StructPET[i].telefoneDono;
        fflush(stdin);
    }

    cout << "Cadastrado com sucesso! \n";

    for (int i = 0; i < npets; i++) {
        cout << "Nome PET: " << StructPET[i].nomeAnimal << endl;
        cout << "Especie PET: " << StructPET[i].especie << endl;
        cout << "Raça PET: " << StructPET[i].raca << endl;
        cout << "Sexo PET: " << StructPET[i].sexo << endl;
        cout << "Idade PET: " << StructPET[i].idadePET << endl;
        cout << "Nome Dono: " << StructPET[i].nomeDono << endl;
        cout << "RG PET: " << StructPET[i].RGdono << endl;
        cout << "Telefone PET: " << StructPET[i].telefoneDono << endl;
        cout << "\n";
    };
    return 0;
}
