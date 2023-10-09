
package kingsbarbershop;
import java.util.Scanner;

public class KingsBarbershop {

    public static void main(String[] args) {
    //Instancias
     Barbero barbero = new Barbero();
     Cliente cliente = new Cliente();
     Servicios menu = new Servicios();
     //Metodos para crear 
     barbero.crearPersona();
     cliente.crearPersona();
     //Metodos para mostrar servicios
     menu.servicios();
    }
    
}
