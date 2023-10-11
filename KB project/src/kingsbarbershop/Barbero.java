
package kingsbarbershop;

import javax.swing.JOptionPane;

public class Barbero extends Persona  {
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
    public void crearBarbero(){
        
    }

}
