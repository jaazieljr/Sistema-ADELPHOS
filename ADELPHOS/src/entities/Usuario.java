
package entities;

public class Usuario {
    public boolean validarUsuarios(String usuario, String senha){
        if(usuario.equals("admin") && senha.equals("admin")){
            return true;
        }
        else return false;
    }
}
