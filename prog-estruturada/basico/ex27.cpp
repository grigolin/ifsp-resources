#include <iostream>
#include <climits>

using namespace std;

int main(){
    int filhos, cont;
    float salario, somafilhos, somasalario, mediafilhos, mediasalario, maiorsalario = INT_MIN;
    for(int i = 1; i <= 3; i++){
        cout << "Salario: " << endl;
        cin >> salario;
        cout << "Quant. de filhos: " << endl;
        cin >> filhos;

        if(salario > maiorsalario){
            maiorsalario = salario;
        }

        somafilhos += filhos;
        somasalario += salario;
        cont++;
    }
    mediafilhos = somafilhos/cont;
    mediasalario = somasalario/cont;
    cout << "Média do salário da população: " << mediasalario << endl;
    cout << "Média do número de filhos: " << mediafilhos << endl;
    cout << "Maior salario: " << maiorsalario << endl;


    return 0;
}