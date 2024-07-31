package br.com.avaliacao2.ctr;


import java.sql.ResultSet;
import br.com.avaliacao2.dto.FornecedorDTO;
import br.com.avaliacao2.dto.LivroDTO;
import br.com.avaliacao2.dao.LivroDAO;
import br.com.avaliacao2.dao.ConexaoDAO;

public class LivroCTR {
    
    LivroDAO livroDAO = new LivroDAO();
    
    
    public LivroCTR() {
    }

    
    
    public String inserirLivro(LivroDTO livroDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (livroDAO.inserirLivro(livroDTO, fornecedorDTO)) {
                return "Livro Cadastrado com Sucesso!!!";
            } else {
                return "Livro NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.		
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Livro NÃO Cadastrado";
        }
    }//Fecha o método inserirLivro
    
    
    /**
     * Método utilizado para controlar o acesso ao método alterarLivro da
     * classe LivroDAO
     * @param livroDTO, que vem da classe da página (VIEW)
     * @param fornecedorDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String alterarLivro(LivroDTO livroDTO, FornecedorDTO fornecedorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (livroDAO.alterarLivro(livroDTO, fornecedorDTO)) {
                return "Livro Alterado com Sucesso!!!";
            } else {
                return "Livro NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Livro NÃO Alterado!!!";
        }
    }//Fecha o método alterarLivro

    
    /**
     * Método utilizado para controlar o acesso ao método excluirLivro da
     * classe LivroDAO
     * @param livroDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirLivro(LivroDTO livroDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (livroDAO.excluirLivro(livroDTO)) {
                return "Livro Excluído com Sucesso!!!";
            } else {
                return "Livro NÃO Excluído!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no 
          //console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Livro NÃO Excluído!!!";
        }
    }//Fecha o método excluirLivro

    
    /**
     * Método utilizado para controlar o acesso ao método consultarLivro da
     * classe LivroDAO
     * @param livroDTO que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do livro e fornecedor
     */
    public ResultSet consultarLivro(LivroDTO livroDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;
        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = livroDAO.consultarLivro(livroDTO, opcao);
        return rs;
    }//Fecha o método consultarLivro
    
    
    /**
     * Método utilizado para fechar o banco de dados
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB
    
    
}//Fecha classe LivroCTR
