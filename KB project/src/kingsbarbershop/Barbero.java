
package kingsbarbershop;

import javax.swing.JOptionPane;

public class Barbero extends Persona implements Citas {
    //Atributos
    private String horario;
    // Constructores
    public Barbero() {
    }

    public Barbero(String horario, String nombre, String apellido, long id, long telefono) {
        super(nombre, apellido, id, telefono);
        this.horario = horario;
    }
 // getters and Setters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    //Metodos
    public void verHorario(Barbero obj){
        JOptionPane.showInputDialog(null, "HORARIO\n"+obj.getHorario());
    }
//Metodos abstractos
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
