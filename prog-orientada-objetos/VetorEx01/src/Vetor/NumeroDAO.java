/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetor;

/**
 *
 * @author Aluno
 */
public class NumeroDAO {
    private String resposta = "";
    public String verificarPosicao(NumeroDTO numeroDTO){
        int n[] = numeroDTO.getN();
        for(int cont = 0; cont < n.length; cont++){
            if(cont % 2 == 0){
                this.resposta += n[cont] + "\n";
            }
        }
        return this.resposta;
    }
}
