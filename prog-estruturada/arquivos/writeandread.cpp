#include <iostream>
#include <fstream>
using namespace std;
int main () {
    string line;
    fstream file;
    file.open("names.txt", ios::out | ios::app); // using ios::out because of fstream
    if(file.is_open()){                          // (supports both but needs to be specified)
        file << "Test 1" << endl;
        file << "Test 2" << endl;
        file.close();

        file.open("names.txt", ios::in);
        while(! file.eof()){
            getline(file, line);
            cout << line << endl;
        }
        file.close();
    }else{
        cout << "File didn't open";
    }
 return 0;
}