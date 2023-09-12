/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return "O codigo foi: " +
                funcionarioDTO.getCodigo()+
                "\n O telefone foi "+
                funcionarioDTO.getTelefone();
    }
}
