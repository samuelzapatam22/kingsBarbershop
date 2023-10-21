package kingsbarbershop;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable {

    private static final long serialVersionUID = 1L; //version de serializacion 

//Constructores

    

    
    

    public Administrador() {
    }
    public void crearAdmin(){
    GestionDatos crud = new GestionDatos();
    Administrador user = new Administrador();
    user.setNombre("codigoc13");
    user.setId(1013457214);
    user.setTelefono("3128906454");
    crud.ingresarAdmin(user);
    try{
            crud.leerPersona("Administrador.txt");

    }catch(Exception e){
        
    }
    
    }
}
