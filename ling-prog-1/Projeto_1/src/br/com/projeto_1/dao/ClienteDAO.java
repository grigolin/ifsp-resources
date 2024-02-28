package br.com.projeto_1.dao;

import java.sql.*;
import br.com.projeto_1.dto.ClienteDTO;

public class ClienteDAO {

    public ClienteDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            ConexaoDAO.ConnectDB();
        }
        stmt = ConexaoDAO.con.createStatement();
        
        String sql = "insert into cliente (nome_cli, logradouro_cli, numero_cli, bairro_cli, cidade_cli, estado_cli, cep_cli, cpf_cli, rg_cli) values ( "
                + "'" + clienteDTO.getNome_cli() + "', "
                + "'" + clienteDTO.getLogradouro_cli()+ "', "
                + "'" + clienteDTO.getNumero_cli()+ "', "
                + "'" + clienteDTO.getBairro_cli()+ "', "
                + "'" + clienteDTO.getBairro_cli()+ "', "
                + "'" + clienteDTO.getCidade_cli()+ "', "
                + "'" + clienteDTO.getEstado_cli()+ "', "
                + "'" + clienteDTO.getCep_cli()+ "', "
                + "'" + clienteDTO.getCpf_cli()+ "', "
                + "'" + clienteDTO.getRg_cli()+ "', ";
    }
} // 
