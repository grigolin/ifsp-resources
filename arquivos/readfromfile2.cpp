#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;
int main()
{
    string text;
    ifstream file("FORfile.txt"); // read mode, therefore file needs to exist 
    if(file.is_open()){
        while(!file.eof()){ // endofline
            getline(file, text);
            cout << text << endl;
        }
        file.close();
    }else{
        cout << "File didn't open";
    }
    return 0;
}