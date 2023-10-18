package kingsbarbershop;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Barbero extends Persona implements Serializable {
    
        private static final long serialVersionUID = 1L; //version de serializacion 

    //Atributos
    private String horario;
    GestionDatos crud = new GestionDatos();
    Vista menu = new Vista();
    // Constructores
    public Barbero() {
    }

    

    

    // getters and Setters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Metodos
    public void verHorario(Barbero obj) {
        JOptionPane.showInputDialog(null, "HORARIO\n" + obj.getHorario());
    }

    public void crearBarbero() {
        Barbero barbero = new Barbero();
       
        
        barbero.setNombre(JOptionPane.showInputDialog("Nombre de Barbero: ").toLowerCase());
        barbero.setId(Long.parseLong(JOptionPane.showInputDialog("Identificacion de Barbero: ")));
        barbero.setTelefono(JOptionPane.showInputDialog("Telefono de Barbero: "));
        crud.ingresarPersona(barbero);
        menu.gestionBarberos();
        

    }

}
