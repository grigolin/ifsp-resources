/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        int num[] = new int[5];
        
        for(int cont = 0; cont < num.length; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n para posicao " + cont));
        }
        
        numeroDTO.setN(num);
        
        JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
    }
    
}
