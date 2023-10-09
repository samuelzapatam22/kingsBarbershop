
package kingsbarbershop;
//Libreria para el Joption


import javax.swing.JOptionPane;

public class Persona  {
    //Atributos
    private String nombre, apellido;
    private long id,telefono;
    
    //Constructores
    public Persona() {
        
    }

    public Persona(String nombre, String apellido, long id, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    //Metodos
    public void crearPersona(){  
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su Apellido: ");
        id = Long.parseLong(JOptionPane.showInputDialog("Ingrese su Identifiacion: "));
        telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese su Telefono: "));

    }
    public void mostrarPersona(){
               JOptionPane.showInputDialog(null,"\nNombre: "+nombre+" "+apellido+"\n"+"Id:"+id+"\nTelefono: "+telefono+"\n");
    }
   
    
    
    
    
    
    
}
