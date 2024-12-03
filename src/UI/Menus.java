package UI;

import Service.UserService;
import Service.GeneralService;
import java.util.Scanner;
import UI.MenuPerfil;
import UI.MenuCategorias;

public class Menus {
    UserService userService = new UserService();
    GeneralService generalService = new GeneralService();
    MenuPerfil menuPerfil = new MenuPerfil();
    MenuCategorias menuCategorias = new MenuCategorias();

    // * Método para mostrar el menú de inicio de sesión
    public void showLogin() {
        Scanner scanner = new Scanner(System.in);
        byte opt;
        boolean tryAgain = false; // * Iniciar como falso, solo cambia si hay error de entrada

        while (true) { // * Un bucle infinito para seguir mostrando el menú
            generalService.cleanScreen(); // * Limpiar la pantalla al principio de cada ciclo

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
                opt = scanner.nextByte(); // * Intentar leer la opción del usuario
                tryAgain = false; // * Restablecer tryAgain si la entrada es válida

                switch (opt) {
                    case 0:
                        // * Salir
                        generalService.cleanScreen();
                        System.out.println("Gracias por usar Mercado Libre...⛟");
                        return; // * Terminar el programa

                    case 1:
                        // * Iniciar sesión
                        userService.login();
                        generalService.showLoadingTruck(); // * Mostrar la animación de carga
                        generalService.cleanScreen(); // * Limpiar la pantalla después de cargar
                        showPrincipalMenu(); // * Mostrar el menú principal
                        break; // * Asegurarse de salir del switch después de ejecutar esta opción

                    case 2:
                        // * Registrarse
                        generalService.cleanScreen();
                        userService.addUser();
                        generalService.showLoadingTruck(); // * Mostrar la animación de carga
                        generalService.cleanScreen(); // * Limpiar la pantalla después de cargar
                        showPrincipalMenu(); // * Mostrar el menú principal
                        break; // * Asegurarse de salir del switch después de ejecutar esta opción

                    default:
                        // Opción inválida
                        tryAgain = true; // Marcar como error si la opción no es válida
                        break; // Salir del switch para evitar seguir ejecutando casos incorrectos
                }

            } catch (Exception e) {
                // Error en la entrada, limpiar el buffer y seguir en el bucle
                scanner.nextLine(); // Limpiar el buffer de entrada para evitar un bucle infinito
                tryAgain = true; // Marcar como error si hay excepción en la entrada
            }
        }
    }

    public void showPrincipalMenu() {
        Scanner scanner = new Scanner(System.in);
        byte opt;
        boolean tryAgain = false;

        while (true) { // Bucle principal para el menú
            generalService.cleanScreen(); // Limpiar la pantalla al principio de cada ciclo

            // * Menu principal
            System.out.println("████████████████████████████████");
            System.out.println("     ⛟   Mercado Libre");
            System.out.println("");
            System.out.println("       ✪ Mi perfil ✪");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("⊞ 2. Home ⊞   ☰ 3. Categorías ☰");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("    ✒ 4. Buscar artículos ✒");
            System.out.println("");
            System.out.println("✱ 5. Vender ✱");
            System.out.println("⚿ 0. Cerrar sesión ⚿");
            System.out.println("████████████████████████████████");
            System.out.println("   ☑  Selecciona una opción");

            if (tryAgain) {
                System.out.println("☒ Error: Elige una opción válida.");
            } else {
                System.out.println("");
            }

            System.out.print("▶   ");

            try {
                opt = scanner.nextByte();
                tryAgain = false; // Reinicia el estado de error

                switch (opt) {
                    case 0: {
                        generalService.cleanScreen();
                        System.out.println("Cerrando sesión...");
                        generalService.showLoadingTruck();
                        return; // Salir del menú principal
                    }

                    case 2: {
                        generalService.cleanScreen();
                        System.out.println("Cargando Home...");
                        // generalService.showHome();
                        break;
                    }
                    case 3: {
                        generalService.cleanScreen();
                        menuCategorias.showCategorias();
                        break;
                    }
                    case 4: {
                        generalService.cleanScreen();
                        System.out.println("Buscando artículos...");
                        // generalService.searchItems();
                        break;
                    }
                    case 5: {
                        generalService.cleanScreen();
                        System.out.println("");
                        break;
                    }
                    default: {
                        tryAgain = true;
                        break;
                    }
                }
            } catch (Exception e) {
                scanner.nextLine(); // Limpia el buffer del escáner
                tryAgain = true;
            }
        }
    }
}
