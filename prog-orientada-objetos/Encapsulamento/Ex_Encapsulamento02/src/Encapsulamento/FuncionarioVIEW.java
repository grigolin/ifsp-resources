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
public class FuncionarioVIEW {
    public static void main(String[] args) {
        try {
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe seu telefone: "));
            funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe seu código: ")));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.imprimir(funcionarioDTO));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema"+ e.getMessage());
        }
    }
}
