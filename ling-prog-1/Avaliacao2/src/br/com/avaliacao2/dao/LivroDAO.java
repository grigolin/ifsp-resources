package br.com.avaliacao2.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;
import br.com.avaliacao2.dto.LivroDTO;
import br.com.avaliacao2.dto.FornecedorDTO;

public class LivroDAO {
    
    /**
     * Método construtor da classe
     */
    public LivroDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
    
    
    public boolean inserirLivro(LivroDTO livroDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Instancia o Statement que sera responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Insert into livro (nome_livro, desc_livro, cod_bar_livro, "
                    + "p_custo_livro, p_venda_livro, id_for) values ( "
                    + "'" + livroDTO.getNome_livro()+ "', "
                    + "'" + livroDTO.getDesc_livro()+ "', "
                    + "'" + livroDTO.getCod_bar_livro()+ "', "
                    + livroDTO.getP_custo_livro()+ ", "
                    + livroDTO.getP_venda_livro()+ ", "
                    + fornecedorDTO.getId_for()+ ") ";
            
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
    }//Fecha o método inserirLivro
    
    
    /**
     * Método utilizado para alterar um objeto livroDTO no banco de dados
     *
     * @param livroDTO, que vem da classe LivroCTR
     * @param fornecedorDTO, que vem da classe FornecedorCTR
     * @return Um boolean
     */
    public boolean alterarLivro(LivroDTO livroDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Update livro set "
                    + "nome_livro = '" + livroDTO.getNome_livro()+ "', "
                    + "desc_livro = '" + livroDTO.getDesc_livro()+ "', "
                    + "cod_bar_livro = '" + livroDTO.getCod_bar_livro()+ "', "
                    + "p_custo_livro = " + livroDTO.getP_custo_livro()+ ", "
                    + "p_venda_livro = " + livroDTO.getP_venda_livro()+ ", "
                    + "id_for = " + fornecedorDTO.getId_for()+ " "
                    + "where id_livro = " + livroDTO.getId_livro();
                       
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
    }//Fecha o método alterarLivro
    
    
    /**
     * Método utilizado para excluir um objeto livroDTO no banco de dados
     *
     * @param livroDTO que vem da classe LivroCTR
     * @return Um boolean
     */
    public boolean excluirLivro(LivroDTO livroDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Instancia o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Delete from livro where id_livro = " 
                             + livroDTO.getId_livro();

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
    }//Fecha o método excluirLivro
    
        
    
    /**
     * Método utilizado para consultar um objeto livroDTO no banco de dados
     *
     * @param livroDTO, que vem da classe LivroCTR
     * @param opcao, que vem da classe LivroCTR
     * @return Um ResultSet com os dados do livro e fornecedor
     */
    public ResultSet consultarLivro(LivroDTO livroDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "Select p.* "+
                              "from livro p "+
                              "where p.nome_livro ilike '" + livroDTO.getNome_livro()+ "%' " +
                              "order by p.nome_livro";    
                break;
                case 2:
                    comando = "Select p. *, f.nome_for, f.id_for "+
                              "from livro p, fornecedor f " +
                              "where p.id_for = f.id_for and " +
                              "p.id_livro = " + livroDTO.getId_livro();
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
    }//Fecha o método consultarLivro
    
}//Fecha classe LivroDAO
