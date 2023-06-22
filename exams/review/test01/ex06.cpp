#include <iostream>
using namespace std;

int main(){
    int num;
    cout << "Numero para ser apresentado a tabuada: ";
    cin >> num;
    cout << "Tabuada do " << num << endl;
    for(int i = 1; i < 11; i++){
        cout << i << " x " << num << " = " << i*num << endl;
    }
    return 0;
}