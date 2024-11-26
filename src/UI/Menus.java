package UI;

import Service.UserService;
import java.util.Scanner;
import Repository.Appliances;
import Repository.Books;
import Repository.Fashion;
import Repository.Furniture;
import Repository.Home;
import Repository.Pets;
import Repository.Sports;
import Repository.Technology;
import Repository.Toys;

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
                    userService.register();
                    menuPrincipal();
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
        byte opt;}

        do{
            
            // * Menu de inicio de sesión
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
    
            switch (opt) {
                case 0: {
                    System.out.println("Gracias por usar Mercado Libre :)");
                    return true;
                }
    
                case 1: {
                    
                    break;
                }
    
                case 2: {
                    
                    break;
                }
                case 3: {
                    categorias();                    
                    break;
                }

                default: {
                    System.out.println("Error: Elige una opción válida.");
                    break;
                }
            }

        } while(opt != 0);

       public void categorias() {
        Scanner scanner = new Scanner(System.in);
        byte opt;}

        do{
            
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
                    menuPrincipal();
                    break;
                }
    
                case 1: {
                    Repository.Appliances();
                    Electrodomesticos();
                    break;
                }
    
                case 2: {
                    
                    break;
                }
                case 3: {
                    Repository.                    
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

        } while(opt != 0);
        return false;   
    }
}
