

#include <cstdlib>
#include <iostream>
#include "cCalculo.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cCalculo obj;
    obj.ReceberDados();
    std::cout << obj.Calcular();
    return 0;
}

