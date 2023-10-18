
package kingsbarbershop;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Cliente extends Persona implements Serializable {

    private static final long serialVersionUID = 1L; //version de serializacion 
    
    GestionDatos crud = new GestionDatos();
    Vista menu = new Vista();

    

    

    public Cliente() {
    }
    public void crearCliente(){
        Cliente cliente = new Cliente();
        cliente.setNombre(JOptionPane.showInputDialog("Nombre de Cliente: ").toLowerCase());
        cliente.setId(Long.parseLong(JOptionPane.showInputDialog("Identificacion de Cliente: ")));
        cliente.setTelefono(JOptionPane.showInputDialog("Telefono de Cliente: "));
        crud.ingresarPersona(cliente);
        menu.gestionClientes();
    }
    public void editarCliente(){
        
    }
    public void borrarCliente(){
        
    }

    
}
