/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoex;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    
    public String mostrarInfo(ClienteDTO clienteDTO){
        return "O nome " + clienteDTO.getNome() + 
                "\n O rg " + clienteDTO.getRg() +
                verifica(clienteDTO.getIdade()) + 
                verifica(clienteDTO.getAltura());
    }
    
    private String verifica(int idade){
        if(idade >= 18){
            return "Maior de 18, pode entrar";
        }
        else{
            return "Menor de 18, nao pode! ";
        }
    }
    
    private String verifica(double altura){
        if(altura >= 1.5){
            return "Maior que 1.5, pode entrar";
        }
        else{
            return "Menor q 1.5, nao pode! ";
        }
    }
}
