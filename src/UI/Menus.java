package UI;

import Service.UserService;
import Service.GeneralService;
import java.util.Scanner;

public class Menus {
    UserService userService = new UserService();
    GeneralService generalService = new GeneralService();

    // * Método para mostrar el menú de inicio de sesión
    public void showLogin() {
        Scanner scanner = new Scanner(System.in);
        byte opt;
        boolean tryAgain = false;  // * Iniciar como falso, solo cambia si hay error de entrada
    
        while (true) {  // * Un bucle infinito para seguir mostrando el menú
            generalService.cleanScreen();  // * Limpiar la pantalla al principio de cada ciclo
    
            // * Menú de inicio de sesión
            System.out.println("████████████████████████████████");
            System.out.println("     ⛟   Mercado Libre");
            System.out.println("");
            System.out.println("◼︎ 1. Iniciar sesión ◼︎");
            System.out.println("◼︎ 2. Registrarse ◼︎");
            System.out.println("◼︎ 0. Salir ◼︎");
            System.out.println("");
            System.out.println("████████████████████████████████");
            System.out.println("   ☑  Selecciona una opción");
    
            if (tryAgain) {
                System.out.println("☒ Error: Elige una opción válida.");
            }

            System.out.print("▶   ");
    
            try {
                opt = scanner.nextByte();  // * Intentar leer la opción del usuario
                tryAgain = false;  // * Restablecer tryAgain si la entrada es válida
    
                switch (opt) {
                    case 0:
                        // * Salir
                        generalService.cleanScreen();
                        System.out.println("Gracias por usar Mercado Libre...⛟");
                        return;  // * Terminar el programa
    
                    case 1:
                        // * Iniciar sesión
                        userService.login();
                        generalService.showLoadingTruck();  // * Mostrar la animación de carga
                        generalService.cleanScreen();  // * Limpiar la pantalla después de cargar
                        showPrincipalMenu();  // * Mostrar el menú principal
                        break;  // * Asegurarse de salir del switch después de ejecutar esta opción
    
                    case 2:
                        // * Registrarse
                        generalService.cleanScreen();
                        userService.addUser();
                        generalService.showLoadingTruck();  // * Mostrar la animación de carga
                        generalService.cleanScreen();  // * Limpiar la pantalla después de cargar
                        showPrincipalMenu();  // * Mostrar el menú principal
                        break;  // * Asegurarse de salir del switch después de ejecutar esta opción
    
                    default:
                        // Opción inválida
                        tryAgain = true;  // Marcar como error si la opción no es válida
                        break;  // Salir del switch para evitar seguir ejecutando casos incorrectos
                }
    
            } catch (Exception e) {
                // Error en la entrada, limpiar el buffer y seguir en el bucle
                scanner.nextLine();  // Limpiar el buffer de entrada para evitar un bucle infinito
                tryAgain = true;  // Marcar como error si hay excepción en la entrada
            }
        }
    }

    public void showPrincipalMenu() {
        Scanner scanner = new Scanner(System.in);
        byte opt;
        boolean tryAgain = false;

        while (true) {  // Bucle principal para el menú
            generalService.cleanScreen();  // Limpiar la pantalla al principio de cada ciclo

            // * Menu principal
            System.out.println("████████████████████████████████");
            System.out.println("     ⛟   Mercado Libre");
            System.out.println("");
            System.out.println("       ✪ 1. Mi perfil ✪");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("⊞ 2. Home ⊞   ☰ 3. Categorías ☰");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("    ✒ 4. Buscar artículos ✒");
            System.out.println("");
            System.out.println("✱ 5. Configuración ✱");
            System.out.println("⚿ 0. Cerrar sesión ⚿");
            System.out.println("████████████████████████████████");
            System.out.println("   ☑  Selecciona una opción");
    
            if (tryAgain) {
                System.out.println("☒ Error: Elige una opción válida.");
            }

            else {
                System.out.println("");
            }

            System.out.print("▶   ");

            try {
                opt = scanner.nextByte();
                
                switch (opt) {
                    case 0: {
                        generalService.cleanScreen();
                        System.out.println("Cerrando sesión...");
                        generalService.showLoadingTruck();
                        showLogin();  // Redirigir al inicio de sesión
                        return;  // Salir del menú principal
                    }
    
                    case 1: {
                        System.out.println("Redirigiendo a Home...");
                        break;
                    }
    
                    case 2: {
                        System.out.println("Mostrando Categorías...");
                        break;
                    }
                    case 3: {
                        System.out.println("Buscando artículos...");
                        break;
                    }
    
                    case 4: {
                        System.out.println("Configurando...");
                        break;
                    }
    
                    default: {
                        System.out.println("Error: Elige una opción válida.");
                        break;
                    }
                }
            } catch (Exception e) {
                scanner.nextLine();
                tryAgain = true;
            }
        }
    }
         
    public boolean categorias() {
        Scanner scanner = new Scanner(System.in);
        byte opt;

        do {

            // * Menu de inicio de sesión
            System.out.println("Mercado Libre");
            System.out.println("-------------------------");
            System.out.println("1. Electrodomésticos");
            System.out.println("2. Libros");
            System.out.println("3. Moda y belleza");
            System.out.println("4. Muebles");
            System.out.println("5. Hogas");
            System.out.println("6. Mascotas");
            System.out.println("7. Deportes");
            System.out.println("8. Tecnología");
            System.out.println("9. Juguetes");
            System.out.println("0. Regresar");
            System.out.println("-------------------------");
            System.out.print("Seleccione una opción: ");
            opt = scanner.nextByte();

            switch (opt) {
                case 0: {

                    break;
                }

                case 1: {
                    break;
                }

                case 2: {

                    break;
                }
                case 3: {
                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {

                    break;
                }
                case 8: {

                    break;
                }
                case 9: {

                    break;
                }

                default: {
                    System.out.println("Error: Elige una opción válida.");
                    break;
                }
            }

        } while (opt != 0);
        return false;
    }
}
