package kingsbarbershop;


import javax.swing.JOptionPane;

public class Vista extends Persona {

    private int opcion;
    Frame ventana = new Frame();
    

    public Vista() {
    }

    public Vista(int opcion) {
        this.opcion = opcion;
    }
//Menu inicial

    public void menu1() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, "BIENVENIDO!!!!\n\n1. Iniciar Sesion  \n2. Salir\n", "KINGS BARBERSHOP", JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
                iniciarSesion();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                menu1();
        }
    }
//Menu inicio de sesion

    public void iniciarSesion() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, "\n\n1. Administrador\n2. Recepcion\n3. Salir", "INICIO DE SESION", JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
                Login loginA = new Login();
                loginA.sesionAdmin();
                break;
            case 2:
                Login loginO = new Login();
                loginO.sesionOperador();
                break;
            case 3:

                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                iniciarSesion();

        }
    }

    public void registrar() {
        //JTextfield
        CuentaDeUsuario registro = new CuentaDeUsuario();
        registro.crearCuenta();
    }

    public void menuAdmin() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, "1. Gestion Operadores  \n2. Gestion Barberos\n3. Salir", "ADMINISTRADOR", JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
                gestionOperadores();
                break;
            case 2:
                gestionBarberos();
                break;
            case 3:
                menuSalida();
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                menuAdmin();
        }
    }

    public void menuOperadores() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, "1. Gestion Barberos  \n2. Gestion Clientes\n3. Gestion de Citas\n4. Salir", "OPERADOR", JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
                gestionBarberos();
                break;
            case 2:
                gestionClientes();
                break;
            case 3:
                gestionCitas();

                break;
            case 4:
                menuSalida();
                System.exit(0);

                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                menuOperadores();
        }
    }

    public void menuSalida() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, "1. Cerrar Sesion  \n2. Salir\n", "SALIDA", JOptionPane.WARNING_MESSAGE));
        switch (opcion) {
            case 1:
                iniciarSesion();
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, "MUCHAS GRACIAS!!!", " SALIENDO...", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                menuSalida();
        }
    }

    public void gestionBarberos() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, " 1. Crear Barbero  \n2. Editar Barbero\n3. Eliminar Barbero\n4. Salir", "BARBEROS", JOptionPane.INFORMATION_MESSAGE));
        Barbero barbero = new Barbero();
        switch (opcion) {
            case 1:

                barbero.crearBarbero();
                break;
            case 2:
                barbero.crearBarbero();
                break;
            case 3:
                barbero.crearBarbero();
                break;
            case 4:
                menuSalida();
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                gestionBarberos();
        }
    }

    public void gestionOperadores() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, " 1. Crear Operador  \n2. Editar Operador\n3. Eliminar Operador\n4. Salir", "OPERADORES", JOptionPane.INFORMATION_MESSAGE));
        Operador operador = new Operador();
        switch (opcion) {
            case 1:

                operador.crearOperador();
                break;
            case 2:

                operador.editarOperador();
                break;
            case 3:

                operador.borrarOperador();
                break;
            case 4:
                menuSalida();
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                gestionOperadores();
        }

    }

    public void gestionClientes() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, " 1. Crear Cliente  \n2. Editar Cliente\n3. Eliminar Cliente\n4. Salir", "CLIENTES", JOptionPane.INFORMATION_MESSAGE));
        Cliente cliente = new Cliente();
        switch (opcion) {
            case 1:

                cliente.crearCliente();
                break;
            case 2:

                cliente.editarCliente();
                break;
            case 3:

                cliente.borrarCliente();
                break;
            case 4:
                menuSalida();
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                gestionClientes();
        }
    }

    public void gestionCitas() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(ventana, " 1. Crear Cita \n2. Editar Cita\n3. Eliminar Cita\n4. Salir", "CITAS", JOptionPane.INFORMATION_MESSAGE));
        Citas cita = new Citas();
        switch (opcion) {
            case 1:
                cita.crearCita();
                break;
            case 2:
                cita.editarCita();
                break;
            case 3:
                cita.borrarCita();
                break;
            case 4:
                menuSalida();
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(ventana, "OPCION INCORRECTA", " ", JOptionPane.ERROR_MESSAGE);
                gestionCitas();
        }
    }
}
