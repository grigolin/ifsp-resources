/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CondJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Media media = new Media();
        JOptionPane.showMessageDialog(null, "A situaçao do aluno é "+
                media.Calcular(Double.parseDouble(JOptionPane.showInputDialog("Nota 1:")), Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"))
                ));
    }
    
}
