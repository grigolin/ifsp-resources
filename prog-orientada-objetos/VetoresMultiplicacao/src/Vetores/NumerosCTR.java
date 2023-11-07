/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

/**
 *
 * @author Aluno
 */
public class NumerosCTR {
    NumerosDAO numerosDAO = new NumerosDAO();
    
    public String Imprimir(NumerosDTO numerosDTO){
        return numerosDAO.Imprimir(numerosDTO);
    }
}
