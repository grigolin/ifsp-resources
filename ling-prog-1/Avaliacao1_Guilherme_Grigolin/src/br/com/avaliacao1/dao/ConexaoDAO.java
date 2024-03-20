package br.com.avaliacao1.dao;

import java.sql.*;

public class ConexaoDAO {

    public static Connection con = null;

    public ConexaoDAO() {

    }

    public static void ConnectDB() {
        try {
            String dsn = "avaliacao_1";
            String user = "postgres";
            String senha = "postdba";
            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5433/" + dsn;
            con = DriverManager.getConnection(url, user, senha);
            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("erro ao abrir banco");
            }
        } catch (Exception e) {
            System.out.println("Problema ao abrir base de dados "
                    + e.getMessage());
        }
    }

    public static void CloseDB() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Problema ao fechar db"
                    + e.getMessage());
        }
    }
}
