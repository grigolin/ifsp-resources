/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    public String mostrarNomeRG(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome() + "e RG: " + clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome() + "e idade: " + clienteDTO.getIdade();
    }
}
