package br.com.projeto_2.dao;

import java.sql.*;
import br.com.projeto_2.dto.FornecedorDTO;
import java.text.SimpleDateFormat;

public class FornecedorDAO {

    public FornecedorDAO() {
    }

    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    private ResultSet rs = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null; // inserir alterar excluir

    public boolean inserirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("insert into fornecedor (nome_for, cnpj_for, tel_for, data_cad_for) "
                    + "values (?,?,?,?);");

            pstmt.setString(1, fornecedorDTO.getNome_for());
            pstmt.setString(2, fornecedorDTO.getCnpj_for());
            pstmt.setString(3, fornecedorDTO.getTel_for());
            pstmt.setDate(4, new java.sql.Date(fornecedorDTO.getData_cad_for().getTime()));

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

    public boolean alterarFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConnectDB();
            pstmt = ConexaoDAO.con.prepareStatement("update fornecedor set "
                    + "nome_for = ?, cnpj_for = ?, tel_for = ?, data_cad_for = ? where id_for = ?;");

            pstmt.setString(1, fornecedorDTO.getNome_for());
            pstmt.setString(2, fornecedorDTO.getCnpj_for());
            pstmt.setString(3, fornecedorDTO.getTel_for());
            pstmt.setDate(4, new java.sql.Date(fornecedorDTO.getData_cad_for().getTime()));
            pstmt.setInt(5, fornecedorDTO.getId_for());
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

    public boolean excluirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConnectDB();

            pstmt = ConexaoDAO.con.prepareStatement("delete from fornecedor where id_for = ?;");
            pstmt.setInt(1, fornecedorDTO.getId_for());
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

    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opc) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opc) {
                case 1:
                    comando = "select f.* from fornecedor f "
                            + "where f.nome_for ilike '" + fornecedorDTO.getNome_for() + "%' order by f.nome_for";
                    break;
                case 2:
                    comando = "select f.nome_for, f.cnpj_for, f.tel_for "
                            + "to_char(f.data_cad_for, 'dd/mm/yyyy/') as data_cad_for "
                            + "from fornecedor f "
                            + "where f.id_for = " + fornecedorDTO.getId_for();
                    break;
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }

} //
