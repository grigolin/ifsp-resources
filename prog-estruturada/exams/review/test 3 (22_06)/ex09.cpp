#include <iostream>
#include <string>
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
/* this works
#include <iostream>
#include <string>
using namespace std;

struct Pet {
    string nome;
    string especie;
    string raca;
    string sexo;
    int idade;
    string nomeDono;
    string rgDono;
    string telefoneDono;
};

void mostrarCadastro(const Pet& pet);

void cadastrarPet() {
    Pet pet;

    cout << "Nome do animal: ";
    getline(cin, pet.nome);
    cout << "Espécie: ";
    getline(cin, pet.especie);
    cout << "Raça: ";
    getline(cin, pet.raca);
    cout << "Sexo: ";
    getline(cin, pet.sexo);
    cout << "Idade: ";
    cin >> pet.idade;
    cin.ignore(); // Ignorar o caractere de nova linha deixado pelo cin
    cout << "Nome do dono: ";
    getline(cin, pet.nomeDono);
    cout << "RG do dono: ";
    getline(cin, pet.rgDono);
    cout << "Telefone do dono: ";
    getline(cin, pet.telefoneDono);

    cout << endl;

    cout << "Cadastro realizado:" << endl;
    cout << "-------------------" << endl;
    mostrarCadastro(pet);
}

void mostrarCadastro(const Pet& pet) {
    cout << "Nome do animal: " << pet.nome << endl;
    cout << "Espécie: " << pet.especie << endl;
    cout << "Raça: " << pet.raca << endl;
    cout << "Sexo: " << pet.sexo << endl;
    cout << "Idade: " << pet.idade << " anos" << endl;
    cout << "Nome do dono: " << pet.nomeDono << endl;
    cout << "RG do dono: " << pet.rgDono << endl;
    cout << "Telefone do dono: " << pet.telefoneDono << endl;
    cout << endl;
}

int main() {
    int numPets;
    cout << "Digite o número de pets a cadastrar: ";
    cin >> numPets;
    cin.ignore(); // Ignorar o caractere de nova linha deixado pelo cin

    for (int i = 0; i < numPets; i++) {
        cout << "Cadastro do PET " << i + 1 << ":" << endl;
        cadastrarPet();
    }

    return 0;
}

*/