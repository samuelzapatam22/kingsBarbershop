
package kingsbarbershop;

public class Administrador extends Persona implements Citas {
//Constructores
    
    public Administrador(String nombre, String apellido, long id, long telefono) {
        super(nombre, apellido, id, telefono);
    }

    public Administrador() {
    }
//Metodos Abstractos
    
    @Override
    public void agendarCita() {
    }

    @Override
    public void eliminarCita() {
    }

    @Override
    public void visualizarCita() {
    }
    
}
