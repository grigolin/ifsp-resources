/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inteiros;

/**
 *
 * @author Aluno
 */
public class InteiroCTR {
    InteiroDAO inteiroDAO = new InteiroDAO();
    public String Imprimir(InteiroDTO inteiroDTO){
        return inteiroDAO.Ordenar(inteiroDTO);
    }
    
}
