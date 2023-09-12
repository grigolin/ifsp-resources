/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {
    public static void main(String args[]){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRG(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
