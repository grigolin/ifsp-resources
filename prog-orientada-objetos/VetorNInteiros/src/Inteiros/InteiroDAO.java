/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inteiros;

/**
 *
 * @author Aluno
 */
public class InteiroDAO {
    private String r = "";
    public String Ordenar(InteiroDTO inteiroDTO){
        int n[] = inteiroDTO.getN();
        for(int cont = n.length - 1; cont >=0; cont--){
            r += n[cont] + "\n";
        }
        return this.r;
    }
}
