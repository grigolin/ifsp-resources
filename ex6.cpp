#include <iostream>
using namespace std;

int main()
{
    int num;

    cout << "Escolha seu time: (Digite o número correspondente)\n";
    cout << "1 - Corinthians\n";
    cout << "2 - São Paulo\n";
    cout << "3 - Santos\n";
    cout << "4 - Palmeiras\n";
    cin >> num;

    switch (num)
    {
    case 1:
        cout << "Melhor time.\n";
        break;

    case 2:
        cout << "Nunca será corinthians\n";
        break;

    case 3:
        cout << "Pelé revelou\n";
        break;

    case 4:
        cout << "Não ganham em semana santa\n";
        break;
    }
    return 0;
}