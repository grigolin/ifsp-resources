// detector de palindromo
// poderia ter usado o strrev(), mas devido ao compilador,
// foi necessário utilizar o reverse()

#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int main(){
    string palavra, palavrareversa;
    cout << "Palavra: ";
    cin >> palavra;
    palavrareversa = palavra;

    reverse(palavrareversa.begin(), palavrareversa.end());

    if(palavra == palavrareversa){
        cout << "A palavra é um palíndromo!";
    }else{
        cout << "Não é palíndromo!";
    }

    return 0;
}