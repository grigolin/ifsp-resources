package br.com.avaliacao2.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;
import br.com.avaliacao2.dto.ClienteDTO;

public class ClienteDAO {
    
    /**
     * Método construtor da classe
     */
    public ClienteDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
    
    /**
     * Método utilizado para inserir um objeto clienteDTO no banco de dados
     *
     * @param clienteDTO, que vem da classe ClienteCTR
     * @return Um boolean
     */
    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Instancia o Statement que sera responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Insert into cliente (nome_cli, logradouro_cli, numero_cli, "
                    + "bairro_cli, cidade_cli, estado_cli, cep_cli, cpf_cli, rg_cli) values ( "
                    + "'" + clienteDTO.getNome_cli() + "', "
                    + "'" + clienteDTO.getLogradouro_cli()+ "', "
                    + clienteDTO.getNumero_cli()+ ", "
                    + "'" + clienteDTO.getBairro_cli()+ "', "
                    + "'" + clienteDTO.getCidade_cli()+ "', "
                    + "'" + clienteDTO.getEstado_cli()+ "', "
                    + "'" + clienteDTO.getCep_cli()+ "', "
                    + "'" + clienteDTO.getCpf_cli()+ "', "
                    + "'" + clienteDTO.getRg_cli()+ "') ";
            
            System.out.println(comando);            
//Executa o comando SQL no banco de Dados
            stmt.execute(comando.toUpperCase());
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirCliente
    
    
    /**
     * Método utilizado para alterar um objeto clienteDTO no banco de dados
     *
     * @param clienteDTO, que vem da classe ClienteCTR
     * @return Um boolean
     */
    public boolean alterarCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Update cliente set "
                    + "nome_cli = '" + clienteDTO.getNome_cli()+ "', "
                    + "logradouro_cli = '" + clienteDTO.getLogradouro_cli()+ "', "
                    + "numero_cli = " + clienteDTO.getNumero_cli()+ ", "
                    + "bairro_cli = '" + clienteDTO.getBairro_cli()+ "', "
                    + "cidade_cli = '" + clienteDTO.getCidade_cli()+ "', "
                    + "estado_cli = '" + clienteDTO.getEstado_cli()+ "', "
                    + "cep_cli = '" + clienteDTO.getCep_cli()+ "', "
                    + "cpf_cli = '" + clienteDTO.getCpf_cli()+ "', "
                    + "rg_cli = '" + clienteDTO.getRg_cli()+ "' "
                    + "where id_cli = " + clienteDTO.getId_cli();
                       
            //Executa o comando SQL no banco de Dados
            stmt.execute(comando.toUpperCase());
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem 
          //no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método alterarCliente
    
    
    /**
     * Método utilizado para excluir um objeto clienteDTO no banco de dados
     *
     * @param clienteDTO que vem da classe ClienteCTR
     * @return Um boolean
     */
    public boolean excluirCliente(ClienteDTO clienteDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Instancia o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Delete from cliente where id_cli = " 
                             + clienteDTO.getId_cli();

            //Executa o comando SQL no banco de Dados
            stmt.execute(comando);
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método excluirCliente
    
        
    
    /**
     * Método utilizado para consultar um objeto clienteDTO no banco de dados
     *
     * @param clienteDTO, que vem da classe ClienteCTR
     * @param opcao, que vem da classe ClienteCTR
     * @return Um ResultSet com os dados do cliente
     */
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "Select c.* "+
                              "from cliente c "+
                              "where nome_cli like '" + clienteDTO.getNome_cli()+ "%' " +
                              "order by c.nome_cli";    
                break;
                case 2:
                    comando = "Select c.* "+
                              "from cliente c " +
                              "where c.id_cli = " + clienteDTO.getId_cli();
                break;
                case 3:
                    comando = "Select c.id_cli, c.nome_cli "+
                              "from cliente c ";
                break;
                
            }
            //Executa o comando SQL no banco de Dados
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }//Fecha o método consultarCliente
    
}//Fecha classe ClienteDAO
