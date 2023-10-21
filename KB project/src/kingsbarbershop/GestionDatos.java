package kingsbarbershop;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;

public class GestionDatos {

    File archivo;

    public GestionDatos() {
    }

    public void ingresarAdmin(Administrador obj) {

        try {
            archivo = new File("Administrador.txt");
            if (archivo.exists()) {
                System.out.println("Ya existe");
            } else {
                FileOutputStream archivoOut = new FileOutputStream(archivo);
                ObjectOutputStream out = new ObjectOutputStream(archivoOut);
                out.writeObject(obj);
                archivoOut.close();
                out.close();

            }
        } catch (Exception e) {
        }
    }

    public void ingresarPersona(Persona obj, String nombreArchivo) {

        try {
            archivo = new File(nombreArchivo);

            if (archivo.exists()) {
                MyObjectOutputStream out;
                try (FileOutputStream archivoSalida = new FileOutputStream(archivo, true)) {
                    out = new MyObjectOutputStream(archivoSalida);
                    out.writeObject(obj);
                }
                out.close();
                JOptionPane.showMessageDialog(null, "GUARDADO CON EXITO!!");
            } else {
                FileOutputStream archivoSalida1 = new FileOutputStream(archivo, true);
                ObjectOutputStream out1 = new ObjectOutputStream(archivoSalida1);
                out1.writeObject(obj);
                JOptionPane.showMessageDialog(null, "GUARDADO CON EXITO!!");
                archivoSalida1.close();
                out1.close();
                
            }
        } catch (Exception e) {
        }

    }

    public void leerPersona(String nombreArchivo)  {

        List<Persona> listaPersona = new ArrayList<>();
         Persona persona1= new Persona();
        try {
            FileInputStream archivoIn = new FileInputStream(nombreArchivo);
            ObjectInputStream in = new ObjectInputStream(archivoIn);
            System.out.println("vamos bien");
            while (true) {
                try {
                    System.out.println("entrooooo");
                    persona1 =(Persona) in.readObject();
                    listaPersona.add(persona1);
                    System.out.println("leyo");

                } catch (EOFException e) {
                    break;
                }
            }
            archivoIn.close();
            in.close();
            for (Persona person : listaPersona) {
                JOptionPane.showMessageDialog(null, "Nombre: " + person.getNombre() + "\nId: " + person.getId() + "\nTelefono: " + person.getTelefono());
            }

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

    }

}
