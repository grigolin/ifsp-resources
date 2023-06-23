#include <iostream>
using namespace std;

int main(){
    int num1[10], num2[10];
    for (int i = 0; i < 10; i++)
    {
        cout << "Digite o numero " << i+1 << " do vetor 1" << endl;
        cin >> num1[i];
    }
    cout << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << "Digite o numero " << i+1 << " do vetor 2" << endl;
        cin >> num2[i];
    }
    cout << endl;
    cout << "Os valores digitados no vetor 1 são: ";
    for (int i = 0; i < 10; i++)
    {
        cout << num1[i] << " - ";
    }
    cout << endl;
    cout << "Os valores digitados no vetor 2 são: ";
    for (int i = 0; i < 10; i++)
    {
        cout << num2[i] << " - ";
    }

    cout << endl;
    cout << "O resultado da multiplicação é: ";
    for (int i = 0; i < 10; i++)
    {
        cout << num1[i] * num2[i] << " - ";
    }
    

    return 0;
}