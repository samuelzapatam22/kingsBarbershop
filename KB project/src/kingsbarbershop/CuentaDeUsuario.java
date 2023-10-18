
package kingsbarbershop;

import java.io.Serializable;

public class CuentaDeUsuario  implements Serializable {
    
     //Atributos
    private String usuario;
    private Long contraseña;
    private static final long serialVersionUID = 1L; //version de serializacion 

    
    
    GestionDatos crud = new GestionDatos();
    Vista menu = new Vista();
    
    

    public CuentaDeUsuario() {
    }

    public CuentaDeUsuario(String usuario, Long contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getContraseña() {
        return contraseña;
    }

    public void setContraseña(Long contraseña) {
        this.contraseña = contraseña;
    }
    public void crearCuenta(Persona obj){
        CuentaDeUsuario cuenta = new CuentaDeUsuario();
        cuenta.setUsuario(obj.getNombre());
        cuenta.setContraseña(obj.getId());
        

    }
}
