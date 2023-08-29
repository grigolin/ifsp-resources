/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intervalo;

/**
 *
 * @author Aluno
 */
public class Intervalo {
    private int inicial, nFinal;
    private String texto="";
    public String Mostrar(int inicial, int nFinal){
        for(int i = inicial; i <= nFinal; i++){
            this.texto = this.texto + i + "\n";
        }
        return this.texto;
    }
}
