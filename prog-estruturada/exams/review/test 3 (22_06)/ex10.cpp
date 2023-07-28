#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main() {
    int npets;
    
    cout << "Quantos PETS deseja cadastrar? ";
    cin >> npets;
    cin.ignore();

    struct StructPETs {
        string nomeAnimal, nomeDono, especie, raca, sexo;
        int telefoneDono, RGdono, idadePET;
    } StructPET[npets];

    for (int i = 0; i < npets; i++) {
        fflush(stdin);                         // this only works in netbeans (not portable)
        cout << "Nome PET: " << endl;          // fflush shouldn't be used, since it is undefined behavior.
        getline(cin, StructPET[i].nomeAnimal); // see: https://stackoverflow.com/questions/2979209/using-fflushstdin
        fflush(stdin);
        cout << "Especie PET: " << endl;
        getline(cin, StructPET[i].especie);
        fflush(stdin);
        cout << "Raça PET: " << endl;
        getline(cin, StructPET[i].raca);
        fflush(stdin);
        cout << "Sexo PET: " << endl;
        cin >> StructPET[i].sexo;
        fflush(stdin);
        cout << "Idade PET: " << endl;
        cin >> StructPET[i].idadePET;
        fflush(stdin);
        cout << "Nome Dono: " << endl;
        getline(cin, StructPET[i].nomeDono);
        fflush(stdin);
        cout << "RG Dono: " << endl;
        cin >> StructPET[i].RGdono;
        fflush(stdin);
        cout << "Telefone Dono: " << endl;
        cin >> StructPET[i].telefoneDono;
        fflush(stdin);
    }

    cout << "Cadastrado com sucesso! \n";

    ofstream file;
    file.open("arquivoPET.txt");
    if(file.is_open()){
        for (int i = 0; i < npets; i++) {
            file << "Nome PET: " << StructPET[i].nomeAnimal << endl;
            file << "Especie PET: " << StructPET[i].especie << endl;
            file << "Raça PET: " << StructPET[i].raca << endl;
            file << "Sexo PET: " << StructPET[i].sexo << endl;
            file << "Idade PET: " << StructPET[i].idadePET << endl;
            file << "Nome Dono: " << StructPET[i].nomeDono << endl;
            file << "RG PET: " << StructPET[i].RGdono << endl;
            file << "Telefone PET: " << StructPET[i].telefoneDono << endl;
        }
    }else{
        cout << "file didn't open";
    }
    file.close();
    return 0;
}
