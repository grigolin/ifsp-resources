package br.com.projeto_3.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;

/**
 * Essa classe contém os métodos para abrir e fechar o banco de dados
 */
public class ConexaoDAO {

    //Criando um atributo do tipo Connection que servira para guardar a conexao 
    //com o banco de dados
    public static Connection con = null;

    /**
     * Método construtor da classe
     *
     * @param Não recebe nenhum parametro
     */
    public ConexaoDAO() {
    }

    /**
     * Método que abre a conexão com o banco de dados é do tipo static para que
     * não seja necessário instanciar um objeto da classe, chamando os metodos
     * de forma direta.Ex: classe.nome_do_metodo
     */
    public static void ConnectDB() {
        try {
            //Dados para conectar com o banco de dados Postgres
            String dsn = "projeto_3"; //nome do banco de dados(igual ao criado no Postgres)
            String user = "postgres"; //nome do usuario utilizado para se conectar
            String senha = "postdba"; //senha do usuario acima informado

            DriverManager.registerDriver(new org.postgresql.Driver());

            String url = "jdbc:postgresql://localhost:5432/" + dsn;

            con = DriverManager.getConnection(url, user, senha);

            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("erro ao abrir o banco");
            }
        }//fecha o try
        //Caso ocorra problemas para abrir o banco de dados é emitido a mensagem no console.
        catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }//fecha o catch
    }//Fecha o método ConectDB

    /**
     * Método que fecha a conexão com o banco de dados é do tipo static para que
     * não seja necessário instanciar um objeto da classe, chamando os metodos
     * de forma direta.Ex: classe.nome_do_metodo
     */
    public static void CloseDB() {
        try {
            con.close();
        }//fecha o try
        //Caso ocorra problemas para fechar o banco de dados é emitido a mensagem no console.
        catch (Exception e) {
            System.out.println("Problema ao fechar a base de dados! "
                    + e.getMessage());
        }//fecha o catch
    }//Fecha o método CloseDB

}//Fecha a Classe ConexaoDAO
