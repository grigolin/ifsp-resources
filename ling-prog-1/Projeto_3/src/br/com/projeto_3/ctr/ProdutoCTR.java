package br.com.projeto_3.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.ResultSet;
import br.com.projeto_3.dto.FornecedorDTO;
import br.com.projeto_3.dto.ProdutoDTO;
import br.com.projeto_3.dao.ProdutoDAO;
import br.com.projeto_3.dao.ConexaoDAO;

public class ProdutoCTR {
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    
    /**
     * Método construtor da classe
     */
    public ProdutoCTR() {
    }

    
    
    /**
     * Método utilizado para controlar o acesso ao método inserirProduto da
     * classe ProdutoDAO
     * @param produtoDTO, que vem da classe sa página (VIEW)
     * @param fornecedorDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)) {
                return "Produto Cadastrado com Sucesso!!!";
            } else {
                return "Produto NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.		
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto NÃO Cadastrado";
        }
    }//Fecha o método inserirProduto
    
    
    /**
     * Método utilizado para controlar o acesso ao método alterarProduto da
     * classe ProdutoDAO
     * @param produtoDTO, que vem da classe da página (VIEW)
     * @param fornecedorDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)) {
                return "Produto Alterado com Sucesso!!!";
            } else {
                return "Produto NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto NÃO Alterado!!!";
        }
    }//Fecha o método alterarProduto

    
    /**
     * Método utilizado para controlar o acesso ao método excluirProduto da
     * classe ProdutoDAO
     * @param produtoDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirProduto(ProdutoDTO produtoDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto Excluído com Sucesso!!!";
            } else {
                return "Produto NÃO Excluído!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto NÃO Excluído!!!";
        }
    }//Fecha o método excluirProduto

    
    /**
     * Método utilizado para controlar o acesso ao método consultarProduto da
     * classe ProdutoDAO
     * @param produtoDTO que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do produto e fornecedor
     */
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;
        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        return rs;
    }//Fecha o método consultarProduto
    
    
    /**
     * Método utilizado para fechar o banco de dados
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB
    
    
}//Fecha classe ProdutoCTR
