#include <iostream>
#include <fstream>
using namespace std;
int main(){
    ofstream file;
    file.open("FORfile.txt");
    if(file.is_open()){
        for(int i = 1; i <=10; i++){
            file << "Adding number " << i << endl;
        }
    }else{
        cout << "File didn't open";
    }
    file.close();
    return 0;
}
