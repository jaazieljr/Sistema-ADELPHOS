
package console;


import gui.GUILogin;


public class Aplication {

    
    public static void main(String[] args) {
        
        GUILogin login = new GUILogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        JdbcConection.getConexao();
    }
    
}
