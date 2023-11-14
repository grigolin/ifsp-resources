/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exmatriz;

/**
 *
 * @author Aluno
 */
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String mostrarMatriz(NumeroDTO numeroDTO){
        return numeroDAO.mostrarMatriz(numeroDTO);
    }
}
