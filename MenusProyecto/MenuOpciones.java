import java.util.Scanner;

public class MenuOpciones {
    private Scanner scanner;

    public MenuOpciones() {
        scanner = new Scanner(System.in);
    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("----- Menu Opciones -----");
            System.out.println("1.- Mi Perfil");
            System.out.println("2.- Mi Cartera");
            System.out.println("3.- Mis Compras");
            System.out.println("4.- Configuración");
            System.out.println("0.- Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del menú de opciones...");
                    break;
                case 1:
                    miPerfil();
                    break;
                case 2:
                    miCartera();
                    break;
                case 3:
                    misCompras();
                    break;
                case 4:
                    configuracion();
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        } while (opcion != 0);
    }

    public void miPerfil() {
        System.out.println("Mostrando perfil...");
        // Lógica para mostrar el perfil del usuario
    }

    public void miCartera() {
        System.out.println("Mostrando cartera...");
        // Lógica para mostrar la cartera del usuario
    }

    public void misCompras() {
        System.out.println("Mostrando compras...");
        // Lógica para mostrar las compras del usuario
    }

    public void configuracion() {
        System.out.println("Mostrando configuración...");
        // Lógica para mostrar la configuración del usuario
    }
}
