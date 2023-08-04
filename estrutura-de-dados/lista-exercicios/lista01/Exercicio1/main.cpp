
#include <cstdlib>

#include "cPlano.h"
#include <iostream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cPlano obj;
    obj.ReceberPontos();
    std::cout << obj.Calcular();
    
    return 0;
}

