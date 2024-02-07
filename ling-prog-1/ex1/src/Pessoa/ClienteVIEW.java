/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        
            clienteDTO.setNome(JOptionPane.showInputDialog("Nome: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade:")));
            clienteDTO.setRg(JOptionPane.showInputDialog("rg:"));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRG(clienteDTO));
            
        
    }
    
}
