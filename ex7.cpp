#include <iostream>
#include <string>
using namespace std;

int main()
{
    string nome;
    float salario, IRPF;

    cout << "Qual seu nome? \n";
    cin >> nome;
    cout << "Qual seu salário? \n";
    cin >> salario;

    if (salario < 2000)
    {
        cout << nome << " você tem isenção de pagamento do IRPF.";
    }
    else if (salario >= 2000)
    {
        IRPF = salario * 0.15;
        cout << nome << ", você deverá pagar " << IRPF << " de IRPF.";
    }
    else if (salario >= 3000)
    {
        IRPF = salario * 0.20;
        cout << nome << ", você deverá pagar " << IRPF << " de IRPF.";
    }
    else if (salario >= 5000)
    {
        IRPF = salario * 0.23;
        cout << nome << ", você deverá pagar " << IRPF << " de IRPF.";
    }
    else if (salario >= 10000)
    {
        IRPF = salario * 0.27;
        cout << nome << ", você deverá pagar " << IRPF << " de IRPF.";
    }
    return 0;
}