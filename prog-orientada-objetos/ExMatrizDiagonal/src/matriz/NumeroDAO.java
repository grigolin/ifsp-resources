/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    String r = "";
    public String mostrarMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        for(int linha=0; linha < 3; linha++){
            for(int coluna=0; coluna < 3; coluna++){
                if(linha== coluna){
                    this.r += n[linha][coluna];
                } else { r += "     "; }
            }
            this.r += "\n";
        }
        return this.r;
    }
}
