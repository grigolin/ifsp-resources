/*
Faça um programa em C++ que peça o nome de uma pessoa, a quantidade de
quilômetros que ela andou de bicicleta e o tempo gasto em minutos para percorrer essa
distância. Mostre na tela uma mensagem como:
“Olá Mário, você percorreu 30 km em 65 minutos, sua velocidade média foi: 27.7.
*/

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