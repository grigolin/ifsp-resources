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
public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    public String Verificar(SoloDTO soloDTO){
        return soloDAO.Verificar(soloDTO);
    }
}
