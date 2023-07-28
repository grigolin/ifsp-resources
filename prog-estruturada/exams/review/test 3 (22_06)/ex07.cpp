#include <iostream>
using namespace std;

int main()
{
	int mat[6][6];
	int i, j;
	for (i = 0; i < 6; i++)
	{
		for (j = 0; j < 6; j++)
		{
			cout << "Valor para posição " << i + 1 << ", " << j + 1 << " : ";
			cin >> mat[i][j];
		}
		cout << "\n";
	}

	cout << "Os valores da matriz são: " << endl;
	for (i = 0; i < 6; i++)
	{
		for (j = 0; j < 6; j++)
		{
			cout << mat[i][j] << "\t";
		}
		cout << "\n";
	}

	cout << "Os valores da diagonal secundaria são: \n";
	for (i = 0; i < 6; i++)
	{
		for (j = 0; j < 6; j++)
		{
			if (i == 5 - j)
			{
				cout << mat[i][j] << "\t";
			}
			else
			{
				cout << "   ";
			}
		}
		cout << "\n";
	}

	return 0;
}
