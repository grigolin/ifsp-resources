#include <iostream>
using namespace std;

int main()
{
	int mat[4][5];
    float mat2[4][5];
	int i, j;
	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 5; j++)
		{
			cout << "Valor para posição " << i + 1 << ", " << j + 1 << " : ";
			cin >> mat[i][j];
            mat2[i][j] = mat[i][j];
		}
		cout << "\n";
	}

	cout << "Os valores da matriz são: " << endl;
	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 5; j++)
		{
			cout << mat[i][j] << "\t";
		}
		cout << "\n";
	}

	cout << "Os valores resultantes: \n";
	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 5; j++)
		{
			cout << mat2[i][j] / 2 << "\t";
		}
		cout << "\n";
	}

	return 0;
}
