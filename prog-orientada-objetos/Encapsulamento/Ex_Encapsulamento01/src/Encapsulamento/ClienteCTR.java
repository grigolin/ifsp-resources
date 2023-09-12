package Encapsulamento;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostrarNomeRG(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeRG(clienteDTO);
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
}
