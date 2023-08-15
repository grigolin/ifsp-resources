/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        cliente.mostrar(
                JOptionPane.showInputDialog(null, "Informe o nome do cliente: "),
                JOptionPane.showInputDialog(null, "Informe o RG do cliente: ")
        );
    }   
}