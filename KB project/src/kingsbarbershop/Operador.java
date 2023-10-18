package kingsbarbershop;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Operador extends Persona implements Serializable {

    private static final long serialVersionUID = 1L; //version de serializacion 
    GestionDatos crud = new GestionDatos();
    Vista menu = new Vista();
    private String usuario;
//Constructores
    public Operador() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    

    public void crearOperador() {
        Operador operador = new Operador();
        operador.setNombre(JOptionPane.showInputDialog("Nombre de Operador: ").toLowerCase());
        operador.setId(Long.parseLong(JOptionPane.showInputDialog("Identificacion de Operador: ")));
        operador.setTelefono(JOptionPane.showInputDialog("Telefono de Operador: "));
        operador.setUsuario(JOptionPane.showInputDialog("Usuario nuevo : ").toLowerCase());
        crud.ingresarPersona(operador);
        menu.gestionOperadores();
        
    }

    public void editarOperador() {

    }

    public void borrarOperador() {

    }

}
