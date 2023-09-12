package Encapsulamento;

public class ClienteDAO {
    public String mostrarNomeRG(ClienteDTO clienteDTO){
        return "O nome informado foi " + 
                clienteDTO.getNome() + "\n O RG foi " +
                clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi " + 
                clienteDTO.getNome() + "\n A idade foi " +
                clienteDTO.getIdade();
    }
}
