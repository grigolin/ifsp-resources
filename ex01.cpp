#include <iostream>
#include <string>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main()
{
  string nome;
  double minutos, velomedia;
  int kms;
  
  cout << "Qual seu nome? ";
  getline (cin, nome);
  cout << "Quantos km andou de bicicleta? ";
  cin >> kms;
  cout << "Em quantos minutos? ";
  cin >> minutos;
  velomedia = kms / (minutos / 60);
  cout << "Ola " << nome <<", voce percorreu " << kms << " km em " << minutos << " minutos, sua velocidade media foi: " << setprecision(4) << velomedia <<"!\n";
  return 0;
}