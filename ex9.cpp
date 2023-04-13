#include <iostream>
using namespace std;

int main()
{
    int num = 1;
    int escolha = 0;

    while (num != 0)
    {
        cout << "DIgite um número: \n";
        cin >> num;
        escolha++;
    }
    cout << "A quantidade de números digitados foi: " << escolha - 1;
    return 0;
}