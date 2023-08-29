/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private int numero;
    private String imprimir="";
    public String Calcular(int numero){
        this.numero = numero;
        for(int i = 1; i <=10; i++){
            this.imprimir = this.imprimir + "\n" +
                    i + " x " +
                    this.numero + " = " + i*this.numero;
        }
        return this.imprimir;
    }
}
