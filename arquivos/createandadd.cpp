#include <iostream>
#include <fstream>
using namespace std;

int main(){
    ofstream file;
    file.open("addnames.txt", ios::app); // append
    if (file.is_open()){
        file << "Test 1" << endl;
        file << "Test 2" << endl;
        file << "Test 3" << endl;
    }else{
        cout << "File did not open";
    }
    file.close();
    return 0;
}