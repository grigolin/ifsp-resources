/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsolo;

/**
 *
 * @author Aluno
 */
public class Solo {

    private int pontos;
    private String result;

    public String Classificar(int pontos) {
        this.pontos = pontos;
        if (this.pontos <= 10) {
            result = "Rochosa";
        }else{
            if((this.pontos > 10) && (this.pontos <= 40)){
                result = "Firme";
            }else{
                if((this.pontos > 40) && (this.pontos <= 80)){
                    result = "Pantanosa";
                }else{
                    result = "Quant invalidade";
                }
            }
        }
        return this.result;
    }
}
