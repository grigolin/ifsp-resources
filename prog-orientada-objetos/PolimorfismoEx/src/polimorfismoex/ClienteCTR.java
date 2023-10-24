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
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public String mostrarInfo(ClienteDTO clienteDTO){
        return clienteDAO.mostrarInfo(clienteDTO);
    }
}
