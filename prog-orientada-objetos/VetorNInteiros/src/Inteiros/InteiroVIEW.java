/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inteiros;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class InteiroVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InteiroDTO inteiroDTO = new InteiroDTO();
        InteiroCTR inteiroCTR = new InteiroCTR();
        int num[] = new int[20];
        
        for(int cont = 0; cont < num.length; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n para posicao " + cont));
        }
        
        inteiroDTO.setN(num);
        
        JOptionPane.showMessageDialog(null, inteiroCTR.Imprimir(inteiroDTO));
    }
    
}
