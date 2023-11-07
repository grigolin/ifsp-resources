/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetor;

/**
 *
 * @author Aluno
 */
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String verificarPosicao(NumeroDTO numeroDTO){
        return numeroDAO.verificarPosicao(numeroDTO);
    }
}
