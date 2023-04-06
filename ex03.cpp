#include <iostream>
#include <string>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main()
{
    double celsius, fahrenheit;
    
    cout << "Graus em Fahrenheit: ";
    cin >> fahrenheit;
    celsius = (fahrenheit - 32) * 5/9;
    cout << fahrenheit << " graus em fahrenheit corresponde a " << setprecision(3) << celsius << " graus em celsius.";
    
    return 0;
}