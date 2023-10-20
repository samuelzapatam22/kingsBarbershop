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
                List<Persona> listaAdministrador = new ArrayList<>();
                if (archivo.exists()) {
                    listaAdministrador.add(obj);
                    FileOutputStream archivoOut = new FileOutputStream(archivo, true);
                    MyObjectOutputStream out1 = new MyObjectOutputStream(archivoOut);
                    out1.writeObject(listaAdministrador);
                    archivoOut.close();
                    out1.close();
                } else {
                    listaAdministrador.add(obj);
                    FileOutputStream archivoOut1 = new FileOutputStream(archivo, true);
                    ObjectOutputStream out = new ObjectOutputStream(archivoOut1);
                    out.writeObject(listaAdministrador);
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
        try {
            List<Persona> listaAdmins = new ArrayList<>();

            Administrador Admin1 = new Administrador();

            FileInputStream archivoIn = new FileInputStream("Administrador.txt");
            ObjectInputStream in = new ObjectInputStream(archivoIn);
            while (true) {
                try {
                    Admin1 = (Administrador) in.readObject();
                    System.out.println();
                    listaAdmins.add(Admin1);
                } catch (EOFException e) {
                    break;
                }
            }
            archivoIn.close();
            in.close();
            for (Persona admin : listaAdmins) {
                JOptionPane.showMessageDialog(null, "Nombre: " + admin.getNombre() + "\nId: " + admin.getId() + "\nTelefono: " + admin.getTelefono());
            }

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void leerPersona(String nombreArchivo) {
        if (nombreArchivo == "Barberos.txt") {
            try {
                List<Persona> listaBarberos = new ArrayList<>();

                Barbero barber1 = new Barbero();

                FileInputStream archivoIn = new FileInputStream("Barberos.txt");
                ObjectInputStream in = new ObjectInputStream(archivoIn);
                while (true) {
                    try {
                        barber1 = (Barbero) in.readObject();
                        System.out.println();
                        listaBarberos.add(barber1);
                    } catch (EOFException e) {
                        break;
                    }
                }
                archivoIn.close();
                in.close();
                for (Persona barber : listaBarberos) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + barber.getNombre() + "\nId: " + barber.getId() + "\nTelefono: " + barber.getTelefono());
                }

            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            try {
                List<Persona> listaClientes = new ArrayList<>();

                Cliente cliente = new Cliente();

                FileInputStream archivoIn = new FileInputStream("Clientes.txt");
                ObjectInputStream in = new ObjectInputStream(archivoIn);
                while (true) {
                    try {
                       cliente = (Cliente) in.readObject();
                        System.out.println();
                        listaClientes.add(cliente);
                    } catch (EOFException e) {
                        break;
                    }
                }
                archivoIn.close();
                in.close();
                for (Persona admin : listaClientes) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + cliente.getNombre() + "\nId: " + cliente.getId() + "\nTelefono: " + cliente.getTelefono());
                }

            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
