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

    public void ingresarPersona(Persona obj) {
        if (obj instanceof Administrador) {
            try {
                archivo = new File("Administrador.txt");
                if (archivo.exists()) {
                    FileOutputStream archivoOut = new FileOutputStream(archivo, true);
                    MyObjectOutputStream out1 = new MyObjectOutputStream(archivoOut);
                    out1.writeObject(obj);
                    archivoOut.close();
                    out1.close();
                } else {
                    FileOutputStream archivoOut1 = new FileOutputStream(archivo, true);
                    ObjectOutputStream out = new ObjectOutputStream(archivoOut1);
                    out.writeObject(obj);
                    archivoOut1.close();
                    out.close();

                }
            } catch (Exception e) {
            }
        }
        if (obj instanceof Barbero) {

            try {
                archivo = new File("Barberos.txt");
                if (archivo.exists()) {
                    FileOutputStream archivoOut = new FileOutputStream(archivo, true);
                    MyObjectOutputStream out1 = new MyObjectOutputStream(archivoOut);
                    out1.writeObject(obj);
                    archivoOut.close();
                    out1.close();
                } else {
                    FileOutputStream archivoOut1 = new FileOutputStream(archivo, true);
                    ObjectOutputStream out = new ObjectOutputStream(archivoOut1);
                    out.writeObject(obj);
                    archivoOut1.close();
                    out.close();

                }
            } catch (Exception e) {
            }
        }
        if (obj instanceof Cliente) {
            try {
                archivo = new File("Clientes.txt");
                if (archivo.exists()) {
                    FileOutputStream archivoOut = new FileOutputStream(archivo, true);
                    MyObjectOutputStream out1 = new MyObjectOutputStream(archivoOut);
                    out1.writeObject(obj);
                    archivoOut.close();
                    out1.close();
                } else {
                    FileOutputStream archivoOut1 = new FileOutputStream(archivo, true);
                    ObjectOutputStream out = new ObjectOutputStream(archivoOut1);
                    out.writeObject(obj);
                    archivoOut1.close();
                    out.close();

                }
            } catch (Exception e) {
            }

        }
    }
    
    public void leerAdmin() {
        try{
        List<Administrador> listaAdmins= new ArrayList<>();
        
        Administrador Admin1 = new Administrador();
        
            FileInputStream archivoIn = new FileInputStream("Administrador.txt");
            ObjectInputStream in = new ObjectInputStream(archivoIn);
            while(true){
                try{
                    Admin1 = (Administrador) in.readObject();
                    System.out.println();
                    listaAdmins.add(Admin1);
                }catch(EOFException e){
                    break;
                }
            }
            archivoIn.close();
            in.close();
            for (Administrador admin : listaAdmins){
                JOptionPane.showMessageDialog(null, "Nombre: "+admin.getNombre()+"\nId: "+admin.getId()+"\nTelefono: "+admin.getTelefono());
            }
                
        }catch(Exception ex){
            ex.printStackTrace(System.out);
        }
        
    }
}

