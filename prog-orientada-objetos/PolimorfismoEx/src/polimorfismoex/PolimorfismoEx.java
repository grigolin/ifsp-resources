/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoex;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PolimorfismoEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();

        clienteDTO.setNome(JOptionPane.showInputDialog("PESO: "));
        clienteDTO.setRg(JOptionPane.showInputDialog("RG: "));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade: ")));
        clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("altura: ")));
        
        JOptionPane.showMessageDialog(null, clienteCTR.mostrarInfo(clienteDTO));
    }

}
