/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {
 
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        int num[][] = new int[3][3];
        
        for(int linha=0; linha <3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe n da linha" + linha + " coluna "+ coluna));
            }
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostrarMatriz(numeroDTO));
    }
    
}
