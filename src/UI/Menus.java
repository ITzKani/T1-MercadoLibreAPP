package UI;

import Service.UserService;
import java.util.Scanner;

public class Menus {
    UserService userService = new UserService();

    // * Método para mostrar el menú de inicio de sesión
    public void shieldITz() {
        boolean activate;
        do {
            activate = showMenu();
        } while (activate == false);
    }
    
    public boolean showMenu() {
        Scanner scanner = new Scanner(System.in);
        byte opt;

        try {
            
            // * Menu de inicio de sesión
            System.out.println("Mercado Libre");
            System.out.println("-------------------------");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");
            System.out.println("-------------------------");
            System.out.print("Seleccione una opción: ");
            opt = scanner.nextByte();
    
            switch (opt) {
                case 0: {
                    System.out.println("Gracias por usar Mercado Libre :)");
                    return true;
                }
    
                case 1: {
                    userService.authentication();
                    menuPrincipal();
                    break;
                }
    
                case 2: {
                    break;
                }

                default: {
                    System.out.println("Error: Elige una opción válida.");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: Elige una opción válida.");
            return false;
        }
        return false;
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        byte opt;

        do {
            System.out.println("Mercado Libre");
            System.out.println("-------------------------");
            System.out.println("1. Articulos principales");
            System.out.println("2. Buscar articulos");
            System.out.println("3. Categorias");
            System.out.println("4. Configuración");
            System.out.println("5. Vender");
            System.out.println("0. Cerrar sesión");
            System.out.println("-------------------------");
            System.out.print("Seleccione una opción: ");
            opt = scanner.nextByte();
        } while (opt != 0);
    }
}
