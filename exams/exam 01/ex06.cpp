#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    int num;
    cout << "Numero a ser apresentado a tabuada: " << endl;
    cin >> num;
    if (num >= 1 && num <= 9){
        cout << "Tabuada do " << num << endl;
        cout << "****************" << endl;
        for(int i = 1; i <= 10; i ++){
            cout << i << " x " << num << " = " << (num*i) << endl;
        }
        cout << "****************" << endl;
    }else{
        cout << "Numero invalido!" << endl;
    }
    return 0;
}

