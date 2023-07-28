/*
Faça um programa que deve perguntar ao usuário se ele deseja somar, subtrair, dividir, multiplicar ou sair do programa. 
    ◦ Caso ele queira somar (+), deverá informar dois números e o computador informará o resultado da soma. 
    ◦ Caso ele queira subtrair (-), deverá informar dois números e o computador informará o resultado da subtração. 
    ◦ Caso ele queira dividir (/), deverá informar dois números e o computador informará o resultado da divisão. 
    ◦ Caso ele queira multiplicar (*), deverá informar dois números e o computador informará o resultado da multiplicação. 
    ◦ Se o usuário quiser sair do programa informará tal opção (S).
    ◦ Para qualquer outro caso o computador deverá informar (Opção inválida).
*/

#include <iostream> 
#include <cctype>
using namespace std;

int main(){
    char escolha;
    int num1, num2, soma, subtracao, divisao, mult;

    cout << "----- CALCULADORA -----\n";
    cout << "Para somar, digite 1\n";
    cout << "Para subtrair, digite 2\n";
    cout << "Para dividir, digite 3\n";
    cout << "Para multiplicar, digite 4\n";
    cout << "Para sair do programa, digite S\n";

    cin >> escolha;
    escolha = toupper(escolha);

    switch(escolha){
        case 'S':
            cout << "Saindo do programa...";
            break;

        case '1':
            cout << "Digite o primeiro número para somar: ";
            cin >> num1;
            cout << "Digite o segundo número para somar: ";
            cin >> num2;

            soma = num1 + num2;
            cout << num1 << " + " << num2 << " = " << soma;
            break;

        case '2':
            cout << "Digite o primeiro número para subtrair: ";
            cin >> num1;
            cout << "Digite o segundo número para subtrair: ";
            cin >> num2;

            subtracao = num1 - num2;

            cout << num1 << " - " << num2 << " = " << subtracao;
            break;

        case '3':
            cout << "Digite o primeiro número para dividir: ";
            cin >> num1;
            cout << "Digite o segundo número para dividir: ";
            cin >> num2;

            divisao = num1 / num2;

            cout << num1 << " / " << num2 << " = " << divisao;
            break;

        case '4':
            cout << "Digite o primeiro número para multiplicar: ";
            cin >> num1;
            cout << "Digite o segundo número para multiplicar: ";
            cin >> num2;

            mult = num1 * num2;

            cout << num1 << " * " << num2 << " = " << mult;
            break;
        
        default:
        cout << "Opção inválida!";
    }
    return 0;
}