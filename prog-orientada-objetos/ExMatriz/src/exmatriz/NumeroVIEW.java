/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmatriz;

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
        int num[][] = new int[2][3];
        
        for(int linha=0; linha <2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe n da linha" + linha + " coluna "+ coluna));
            }
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostrarMatriz(numeroDTO));
    }
}
