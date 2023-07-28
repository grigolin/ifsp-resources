#include <iostream>
using namespace std;

int main(){
	float p1[15];
	float p2[15];
	float media[15];
	for(int i = 0; i<15; i++){
	cout << "Nota P1 do aluno " << i+1 << endl;
	cin >> p1[i];
	cout << "Nota P2 do aluno " << i+1 << endl;
	cin >> p2[i];
}
	for(int i = 0; i<15; i++){
	media[i] = (p1[i] + p2[i]) / 2;
}
	cout << "Situação dos alunos: " << endl;

	for(int i = 0; i < 15; i++){
	cout << "Aluno " << i+1 << " P1: " << p1[i] << " P2: " << p2[i] << endl;
	cout << "Media " << media[i] << endl;
	if (media[i] >= 6 ){
	cout << "Aprovado!" << endl;
	}
	else{
	cout << "Reprovado." << endl;
}
}
	return 0;
}
