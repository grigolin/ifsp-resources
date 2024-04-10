/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_2.ctr;

import java.sql.ResultSet;
import br.com.projeto_2.dto.FornecedorDTO;
import br.com.projeto_2.dao.ConexaoDAO;
import br.com.projeto_2.dao.FornecedorDAO;

/**
 *
 * @author Aluno
 */
public class FornecedorCTR {

    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public FornecedorCTR() {

    }
    
    public String inserirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)) {
                return "Fornecedor cadastrado com sucesso! ";
            } else {
                return "Fornecedor não cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não cadastrado";
        }
    }
    
    public String alterarFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.alterarFornecedor(fornecedorDTO)) {
                return "Fornecedor alterado com sucesso! ";
            } else {
                return "Fornecedor não alterado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não alterado";
        }
    }
    
    public String excluirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)) {
                return "Fornecedor excluido com sucesso! ";
            } else {
                return "Fornecedor não excluido";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não excluido";
        }
    }
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opc) {
        ResultSet rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opc);
        return rs;
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
