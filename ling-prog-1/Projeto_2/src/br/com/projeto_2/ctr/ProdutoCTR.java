package br.com.projeto_2.ctr;

import java.sql.ResultSet;
import br.com.projeto_2.dto.FornecedorDTO;
import br.com.projeto_2.dao.ConexaoDAO;
import br.com.projeto_2.dao.ProdutoDAO;
import br.com.projeto_2.dto.ProdutoDTO;

public class ProdutoCTR {

    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoCTR() {
    }

    public String inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            if (produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)) {
                return "Produto cadastrado com sucesso! ";
            } else {
                return "Produto não cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não cadastrado";
        }
    }

    public String alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            if (produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)) {
                return "Produto alterado com sucesso! ";
            } else {
                return "Produto não alterado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não alterado";
        }
    }

    public String excluirProduto(ProdutoDTO produtoDTO) {
        try {
            if (produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto excluido com sucesso! ";
            } else {
                return "Produto não excluido";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não excluido";
        }
    }

    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opc) {
        ResultSet rs = produtoDAO.consultarProduto(produtoDTO, opc);
        return rs;
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
