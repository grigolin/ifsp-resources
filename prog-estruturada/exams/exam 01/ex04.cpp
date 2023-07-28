#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    int quant;
    cout << "Digite um numero inteiro positivo para iniciar a musica: " << endl;
    cin >> quant;
    
    for(int i = quant; i > 0; i--){
    cout << i << " patinhos foram passear" << endl;
    cout << "Alem das montanhas para brincar." << endl;
    cout << "A mamae falou qua qua qua qua" << endl;
    cout << "Mas so " << i - 1 << " voltaram de la." << endl;
    cout << " " << endl;
    }
    cout << "**************" << endl;
    
    return 0;
}

