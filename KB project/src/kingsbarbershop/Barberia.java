
package kingsbarbershop;

import java.math.BigInteger;

public class Barberia {
     private String nombre,telefono;
    private long id;
    BigInteger tel;

    public Barberia() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        tel = new BigInteger(telefono);
    }
    
}
