/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import Pessoa.*;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome() + "e idade: " + clienteDTO.getIdade() + " rg: " + clienteDTO.getRg();
    }
    
    public String verificarCNH(ClienteDTO clienteDTO){
        int idade = clienteDTO.getIdade();
        String msg;
        if(idade >=  18){
            msg = " pode ";
        }
        else{
            msg = " nao pode ";
        }
        return clienteDTO.getNome() + msg + "ter CNH!!!";
    }
}
