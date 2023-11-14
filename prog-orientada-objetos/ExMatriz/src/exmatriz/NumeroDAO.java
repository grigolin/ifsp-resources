/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exmatriz;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    String r = "";
    public String mostrarMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        for(int linha=0; linha <2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                this.r += n[linha][coluna] + " ";
            }
            this.r += "\n";
        }
        return this.r;
    }
}
