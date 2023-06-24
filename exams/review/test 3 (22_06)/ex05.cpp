#include <iostream>
using namespace std;

int main(){
	int arr[10] = {10,9,8,7,6,5,4,3,2,1};
	cout << "Valores do vetor: " << endl;
	for(int i = 0; i<10; i++){
	cout << arr[i] << " - ";
}
	cout << "\nValores invertidos: " << endl;
	for(int i = 9; i>=0; i--){
	cout << arr[i] << " - ";
}
	return 0;
}
