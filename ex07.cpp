/*
Faça um programa em C++ para calcular o valor que uma pessoa deve pagar de imposto de renda. O programa deve pedir o nome e o salário dessa pessoa.
    ◦ Se o salário for menor que R$ 2000,00, deve aparecer a mensagem:  (“Fulano”, você tem isenção de pagamento do IRPF);
    ◦ Se o salário for maior ou igual a R$ 2000,00, o imposto a ser pago será de 15% do salário.  (IRPF = salário * 0,15). O programa deverá mostrar a mensagem: (“Fulano”, você deverá pagar “$$$” de IRPF);  
    ◦ Se o salário for maior ou igual a R$ 3000,00, o imposto a ser pago será de 20% do salário.  (IRPF = salário * 0,20). O programa deverá mostrar a mensagem: (“Fulano”, você deverá pagar “$$$” de IRPF);  
    ◦ Se o salário for maior ou igual a R$ 5000,00, o imposto a ser pago será de 23% do salário.  (IRPF = salário * 0,23). O programa deverá mostrar a mensagem: (“Fulano”, você deverá pagar “$$$” de IRPF);  
    ◦ Se o salário for maior ou igual a R$ 10000,00, o imposto a ser pago será de 27% do salário.  (IRPF = salário * 0,27). O programa deverá mostrar a mensagem: (“Fulano”, você deverá pagar “$$$” de IRPF).
*/

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