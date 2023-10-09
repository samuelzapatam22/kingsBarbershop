package kingsbarbershop;

public class Operador extends Persona implements Citas {
//Constructores
    
    public Operador(String nombre, String apellido, long id, long telefono) {
        super(nombre, apellido, id, telefono);
    }

    public Operador() {
    }
// Metodos Abstractos
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
