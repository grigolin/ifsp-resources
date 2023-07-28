#include <iostream>
using namespace std;
int main(){
	int mat[4][4];
	int i, j;
	for(i = 0; i<4; i++){
		for(j=0;j<4; j++){
			cout << "Numero para posição " << i+1 << ", " << j+1 << ": ";
			cin >> mat[i][j];
		}
		cout << "\n";

	}
	for(i = 0; i < 4; i++){
		for(j=0; j<4; j++){
			cout << mat[i][j] << "\t";
		}
		cout << endl;
	}

	return 0;
}
