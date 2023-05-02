#include <iostream>
using namespace std;

int main(){
    float raio, area, perimetro;
    const float pi = 3.14;

    cout << "Raio do circulo: ";
    cin >> raio;
    
    perimetro = 2*pi*raio;
    area = pi*(raio*raio);

    cout << "O perimetro é de: " << perimetro << "\n";
    cout << "A area é de: " << area << "\n";

    return 0;
}