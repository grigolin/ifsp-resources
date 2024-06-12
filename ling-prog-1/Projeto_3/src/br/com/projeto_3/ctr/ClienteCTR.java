package br.com.projeto_3.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.ResultSet;
import br.com.projeto_3.dto.ClienteDTO;
import br.com.projeto_3.dao.ClienteDAO;
import br.com.projeto_3.dao.ConexaoDAO;


public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();

    /**
     * Método construtor da classe
     */
    public ClienteCTR() {
    }
    
    /**
     * Método utilizado para controlar o acesso ao método inserirCliente da
     * classe ClienteAO
     *
     * @param clienteDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String inserirCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente Cadastrado com Sucesso!!!";
            } else {
                return "Cliente NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.		
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Cadastrado";
        }
    }//Fecha o método inserirCliente
    
    
    /**
     * Método utilizado para controlar o acesso ao método alterarCliente da
     * classe ClienteDAO
     *
     * @param clienteDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String alterarCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente Alterado com Sucesso!!!";
            } else {
                return "Cliente NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Alterado!!!";
        }
    }//Fecha o método alterarCliente

    
    /**
     * Método utilizado para controlar o acesso ao método excluirCliente da
     * classe ClienteDAO
     *
     * @param clienteDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (clienteDAO.excluirCliente(clienteDTO)) {
                return "Cliente Excluído com Sucesso!!!";
            } else {
                return "Cliente NÃO Excluído!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Excluído!!!";
        }
    }//Fecha o método excluirCliente

    
    /**
     * Método utilizado para controlar o acesso ao método consultarCliente da
     * classe ClienteDAO
     *
     * @param clienteDTO que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do cliente
     */
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;
        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
    }//Fecha o método consultarCliente
    
    
    /**
     * Método utilizado para fechar o banco de dados
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB
    
}//Fecha classe ClienteCTR
