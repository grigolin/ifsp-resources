package br.com.projeto_3.ctr;

import java.sql.ResultSet;
import br.com.projeto_3.dto.ClienteDTO;
import br.com.projeto_3.dao.ClienteDAO;
import br.com.projeto_3.dao.ConexaoDAO;

public class ClienteCTR {

    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteCTR() {
    }

    public String inserirCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente cadastrado com sucesso! ";
            } else {
                return "Cliente não cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente não cadastrado";
        }
    }

    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        ResultSet rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
    }

    public String alterarCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente alterado com sucesso! ";
            } else {
                return "Cliente não alterado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente não alterado";
        }
    }

    public String excluirCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.excluirCliente(clienteDTO)) {
                return "Cliente excluido com sucesso! ";
            } else {
                return "Cliente não excluido";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente não excluido";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
