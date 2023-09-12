/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorista;

/**
 *
 * @author Aluno
 */
public class MotoristaDAO {
    private String msg;
    public String imprimir(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade()>=18){
            this.msg = "Pode dirigir!";
        }
        else{
            this.msg = "Não pode!";
        }
        return this.msg;
    }
}
