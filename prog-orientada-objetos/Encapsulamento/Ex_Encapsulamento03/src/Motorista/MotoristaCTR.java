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
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    public String imprimir(MotoristaDTO motoristaDTO){
        return motoristaDAO.imprimir(motoristaDTO);
    }
}
