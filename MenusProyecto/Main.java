import java.util.List;
import java.util.Scanner;

public class Main {
    private static Registro registro = new Registro();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("----- MercadoLibre -----");
            System.out.println("0.- Salir");
            System.out.println("1.- Iniciar Sesión");
            System.out.println("2.- Registrarse");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    registro.registrarUsuario();
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void iniciarSesion() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        List<Usuario> usuarios = registro.getUsuarios();
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido " + nombreUsuario + "!");
                encontrado = true;
                mostrarMenuInicio();
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nombre de usuario o contraseña incorrectos. Inténtalo de nuevo.");
        }
    }

    public static void mostrarMenuInicio() {
        int opcion;
        do {
            System.out.println("----- Menu Inicio -----");
            System.out.println("1.- Productos Principales");
            System.out.println("2.- Buscador de Productos");
            System.out.println("3.- Categorías");
            System.out.println("4.- Opciones");
            System.out.println("0.- Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del menú de inicio...");
                    break;
                case 1:
                    productosPrincipales();
                    break;
                case 2:
                    buscadorDeProductos();
                    break;
                case 3:
                    categorias();
                    break;
                case 4:
                    mostrarMenuOpciones();
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void productosPrincipales() {
        System.out.println("Mostrando productos principales...");
        // Lógica para mostrar productos principales
    }

    public static void buscadorDeProductos() {
        System.out.println("Buscando productos...");
        // Lógica para buscar productos
    }

    public static void categorias() {
        System.out.println("Mostrando categorías...");
        // Lógica para mostrar categorías
    }

    public static void mostrarMenuOpciones() {
        MenuOpciones menuOpciones = new MenuOpciones();
        menuOpciones.mostrar();
    }
}
