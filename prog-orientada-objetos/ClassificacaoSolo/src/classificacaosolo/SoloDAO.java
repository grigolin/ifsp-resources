/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificacaosolo;

/**
 *
 * @author Aluno
 */
public class SoloDAO {
    private int agua;
    private String msg;
    
    public String Verificar(SoloDTO soloDTO){
        if(this.agua <= 10){
            this.msg = "rochosa";
       }else if((this.agua > 10) && (agua <=40)){
           this.msg = "firme";
       }else if((this.agua > 40) && (agua <=80)){
           this.msg = "pantanosa";
       }else if(this.agua > 80){
           this.msg = "invalida";
       }
        return this.msg;
    }
}
