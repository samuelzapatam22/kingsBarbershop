
package kingsbarbershop;

public class Login extends CuentaDeUsuario {

    public Login() {
    }

    public Login(String usuario, Long contraseña) {
        super(usuario, contraseña);
    }
    public void sesionAdmin(){
        //si no encuentra sesion admin vuelve al menu 1
        
        // al encontrarlo va a el menu admin
        Vista login = new Vista();
        login.menuAdmin();
    }
    public void sesionOperador(){
        // si no encuentra operador muestra que debe ser registrado por el admin y vuelve al menu 1
        // al encontrarlo va a el menu operador
        Vista login = new Vista();
        login.menuOperadores();
    }
}
