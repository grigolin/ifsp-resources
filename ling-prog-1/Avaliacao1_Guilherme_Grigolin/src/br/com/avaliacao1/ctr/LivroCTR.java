package br.com.avaliacao1.ctr;

import java.sql.ResultSet;
import br.com.avaliacao1.dto.LivroDTO;
import br.com.avaliacao1.dao.ConexaoDAO;
import br.com.avaliacao1.dao.LivroDAO;

public class LivroCTR {

    LivroDAO livroDAO = new LivroDAO();

    public LivroCTR() {
    }

    public String inserirLivro(LivroDTO livroDTO) {
        try {
            if (livroDAO.inserirLivro(livroDTO)) {
                return "livro cadastrado com sucesso! ";
            } else {
                return "livro não cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "livro não cadastrado";
        }
    }

    public ResultSet consultarLivro(LivroDTO livroDTO, int opc) {
        ResultSet rs = livroDAO.consultarLivro(livroDTO, opc);
        return rs;
    }

    public String alterarLivro(LivroDTO livroDTO) {
        try {
            if (livroDAO.alterarLivro(livroDTO)) {
                return "livro alterado com sucesso! ";
            } else {
                return "livro não alterado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "livro não alterado";
        }
    }

    public String excluirLivro(LivroDTO livroDTO) {
        try {
            if (livroDAO.excluirLivro(livroDTO)) {
                return "livro excluido com sucesso! ";
            } else {
                return "livro não excluido";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "livro não excluido";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
