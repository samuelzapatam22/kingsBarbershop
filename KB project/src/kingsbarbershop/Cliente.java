
package kingsbarbershop;

public class Cliente extends Persona implements Citas{
//Constructores
    public Cliente(String nombre, String apellido, long id, long telefono) {
        super(nombre, apellido, id, telefono);
    }

    public Cliente() {
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
