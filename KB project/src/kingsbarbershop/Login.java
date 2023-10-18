
package kingsbarbershop;

import java.util.HashMap;

public class Login extends CuentaDeUsuario {

    public Login() {
    }

    public Login(String usuario, Long contraseña) {
        super(usuario, contraseña);
    }
    public void sesionAdmin(){
        //si no encuentra sesion admin vuelve al menu 1
        GestionDatos crud1 = new GestionDatos();
        crud1.leerAdmin();
        
        // al encontrarlo va a el menu admin
       // Vista login = new Vista();
        //login.menuAdmin();
    }
    public void sesionOperador(){
        // si no encuentra operador muestra que debe ser registrado por el admin y vuelve al menu 1
        // al encontrarlo va a el menu operador
        Vista login = new Vista();
        login.menuOperadores();
    }
    public void validarUsuario(Persona obj){
            HashMap<Integer,String> mapaCuentas = new HashMap<>();
            int i = 0;
           mapaCuentas.put( i++, obj.getNombre());
    }
    
    
    
            
}
