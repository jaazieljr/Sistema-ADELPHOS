package console;

import gui.GUILogin;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConection {

    private static final String SERVER_NAME = "localhost";
    private static final String MY_DATABASE = "adelphos";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "9178J.jr";
    private static final String URL = "jdbc:mysql://" + SERVER_NAME + "/" + MY_DATABASE;

    public static Connection getConexao() {
        try {
            System.out.println("Conectado ao banco com sucesso");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de conexão " + ex);

        }
    }
  public static void main(String[] args) {
        
        JdbcConection.getConexao();
  }
}
