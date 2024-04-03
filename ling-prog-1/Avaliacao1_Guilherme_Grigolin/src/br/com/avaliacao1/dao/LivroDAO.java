package br.com.avaliacao1.dao;

import java.sql.*;
import br.com.avaliacao1.dto.LivroDTO;

public class LivroDAO {

    private ResultSet rs = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;

    public boolean inserirLivro(LivroDTO livroDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("insert into livro (cod_livro, nome, editora, autor, idioma, descricao, preco) "
                    + "values (?,?,?,?,?,?,?);");

            pstmt.setString(1, livroDTO.getCod_livro());
            pstmt.setString(2, livroDTO.getNome());
            pstmt.setString(3, livroDTO.getEditora());
            pstmt.setString(4, livroDTO.getAutor());
            pstmt.setString(5, livroDTO.getIdioma());
            pstmt.setString(6, livroDTO.getDescricao());
            pstmt.setFloat(7, livroDTO.getPreco());
            pstmt.execute();
            ConexaoDAO.con.commit();
            pstmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarLivro(LivroDTO livroDTO, int opc) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opc) {
                case 1:
                    comando = "select l.* from livro l where l.nome ilike '" + livroDTO.getNome() + "%' order by l.nome";
                    break;
                case 2:
                    comando = "select l.* from livro l where l.id_livro = " + livroDTO.getId_livro();
                    break;
                case 3:
                    comando = "select l.id_livro, l.nome from livro l";
                    break;
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }

    public boolean alterarLivro(LivroDTO livroDTO) {
        try {
            ConexaoDAO.ConnectDB();
            pstmt = ConexaoDAO.con.prepareStatement("update livro set "
                    + "nome = ?, editora = ?, autor = ?, idioma = ?, descricao = ?, preco = ? where cod_livro = ?;");

            
            pstmt.setString(1, livroDTO.getNome());
            pstmt.setString(2, livroDTO.getEditora());
            pstmt.setString(3, livroDTO.getAutor());
            pstmt.setString(4, livroDTO.getIdioma());
            pstmt.setString(5, livroDTO.getDescricao());
            pstmt.setFloat(6, livroDTO.getPreco());
            pstmt.setString(7, livroDTO.getCod_livro());
            pstmt.execute();
            ConexaoDAO.con.commit();
            pstmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirLivro(LivroDTO livroDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("delete from livro where id_livro = ?;");
            pstmt.setInt(1, livroDTO.getId_livro());
            pstmt.execute();
            ConexaoDAO.con.commit();
            pstmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
