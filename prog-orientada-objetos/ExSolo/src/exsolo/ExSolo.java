/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsolo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ExSolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solo solo = new Solo();
        JOptionPane.showMessageDialog(null, "Classificacao: " +
                solo.Classificar(Integer.parseInt(JOptionPane.showInputDialog("Pontos: ")))
                );
    }
    
}
