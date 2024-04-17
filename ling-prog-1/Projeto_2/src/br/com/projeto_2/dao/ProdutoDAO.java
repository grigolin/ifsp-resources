package br.com.projeto_2.dao;

import java.sql.*;
import br.com.projeto_2.dto.FornecedorDTO;
import br.com.projeto_2.dto.ProdutoDTO;

public class ProdutoDAO {

    public ProdutoDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;

    public boolean inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("insert into produto (nome_prod, desc_prod, cod_bar_prod, p_custo_prod, "
                    + "p_venda_prod, id_for) "
                    + "values (?,?,?,?,?,?);");

            pstmt.setString(1, produtoDTO.getNome_prod());
            pstmt.setString(2, produtoDTO.getDesc_prod());
            pstmt.setString(3, produtoDTO.getCod_bar_prod());
            pstmt.setDouble(4, produtoDTO.getP_custo_prod());
            pstmt.setDouble(5, produtoDTO.getP_venda_prod());
            pstmt.setInt(6, fornecedorDTO.getId_for());

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
    
    public boolean alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConnectDB();
            pstmt = ConexaoDAO.con.prepareStatement("update produto set (nome_prod = ?, desc_prod = ?, cod_bar_prod = ?, p_custo_prod = ?, "
                    + "p_venda_prod = ?, id_for  = ? )"
                    + "where id_prod = ?;");

            pstmt.setString(1, produtoDTO.getNome_prod());
            pstmt.setString(2, produtoDTO.getDesc_prod());
            pstmt.setString(3, produtoDTO.getCod_bar_prod());
            pstmt.setDouble(4, produtoDTO.getP_custo_prod());
            pstmt.setDouble(5, produtoDTO.getP_venda_prod());
            pstmt.setInt(6, fornecedorDTO.getId_for());
            pstmt.setDouble(7, produtoDTO.getId_prod());
            
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
    
    public boolean excluirProduto(ProdutoDTO produtoDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("delete from produto where id_prod = ?;");
            pstmt.setInt(1, produtoDTO.getId_prod());
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
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opc) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opc) {
                case 1:
                    comando = "select p.* from produto p "
                            + "where p.nome_prod ilike '" + produtoDTO.getNome_prod()+ "%' order by p.nome_prod";
                    break;
                case 2:
                    comando = "select p. *, f.nome_for, f.id_for "
                            + "from produto p, fornecedor f "
                            + "where p.id_for = f.id_for and " 
                            + "p.id_prod = " + produtoDTO.getId_prod();
                    break;
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
}//
