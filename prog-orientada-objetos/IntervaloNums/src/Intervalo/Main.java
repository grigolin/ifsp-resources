/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intervalo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();
        
        JOptionPane.showMessageDialog(null, intervalo.Mostrar(Integer.parseInt(JOptionPane.showInputDialog("Inicial: ")), Integer.parseInt(JOptionPane.showInputDialog("Final: "))));
    }
    
}
