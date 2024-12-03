package Service;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Service.GeneralService;

import Model.User;

public class UserService {

    GeneralService generalService = new GeneralService();

    // * Constructor vacio
    public UserService() {
    }

    // * Categorias de articulos
    private String[] categorys = { "Tecnología", "Hogar", "Deportes", "Moda", "Juguetes", "Electrodomésticos",
            "Muebles", "Libros", "Mascotas",
            "Otros (Consolas de videojuegos y accesorios,videojuegos,musica,ropa,joyeria)" };

    // * Lista general de usuarios
    List<User> userList = new ArrayList<>();
    User admin = new User(1, "ITz", "Dagan", "Vega", "daganjv13@gmail.com", "root", 563023501);
    User admin2 = new User(2, "PacmanXDdeoz", "Carlos", "Vazquez", "carlosangel2710@hotmail.com", "pa55word", 553854005);
    User admin3 = new User(3, "Mangel", "Miguel", "Amado", "Miguelag@gmail.com", "amado55", 557811154);
    User admin4 = new User(4, "ihatebruno", "Bruno", "Villegas", "brunogaelav2004@gmail.com", "hola1224", 553795599);
    User admin5 = new User(5, "AntonioIvann", "Antonio", "Reyes", "rantonioivann@gmail.com", "juanwick", 551263178);

    public void test() {
        userList.add(admin);
        userList.add(admin2);
        userList.add(admin3);
        userList.add(admin4);
        userList.add(admin5);
    }

    int index;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        test(); // Cargar usuarios en la lista
    
        boolean loginFailed = false; // Controla el mensaje de error
    
        while (true) {
            generalService.cleanScreen();
    
            // Dibujar la pantalla de inicio de sesión
            System.out.println("████████████████████████████████");
            System.out.println("    ⛟   Mercado Libre");
            System.out.println("         ᴵⁿⁱᶜⁱᵃ ˢᵉˢⁱᵒⁿ");
            System.out.println("");
            System.out.println("☻ Usuario ▶");
            System.out.println("⚿ Contraseña ▶");
            System.out.println("");
            System.out.println("");
            System.out.println("████████████████████████████████");
            System.out.println("    ☑  Ingresa tu usuario");
    
            if (loginFailed) {
                System.out.println("☒ Usuario o contraseña incorrectos.");
            } else {
                System.out.println("");
            }
    
            System.out.print("▶   ");
            String username = scanner.nextLine(); // Leer el usuario
    
            generalService.cleanScreen();
    
            // Dibujar la pantalla para la contraseña
            System.out.println("████████████████████████████████");
            System.out.println("    ⛟   Mercado Libre");
            System.out.println("         ᴵⁿⁱᶜⁱᵃ ˢᵉˢⁱᵒⁿ");
            System.out.println("");
            System.out.println("☻ Usuario ▶  " + username);
            System.out.println("⚿ Contraseña ▶ ");
            System.out.println("");
            System.out.println("");
            System.out.println("████████████████████████████████");
            System.out.println("   ☑  Ingresa tu contraseña");
            System.out.println("");
            System.out.print("▶   ");
            String password = scanner.nextLine(); // Leer la contraseña
    
            // Crear un objeto temporal con las credenciales
            User tempUser = new User(0, username, null, null, null, password, 0);
    
            // Buscar usuario coincidente
            User matchedUser = userList.stream()
                    .filter(user -> user.getUserName().equals(username) && user.getPassword().equals(password))
                    .findFirst()
                    .orElse(null);
    
            if (matchedUser != null) {
                // Login exitoso
                index = userList.indexOf(matchedUser); // Obtener índice del usuario
    
                generalService.cleanScreen();
                System.out.println("Bienvenido " + matchedUser.getUserName());
                System.out.println("Tu índice en el sistema es: " + index);
                break; // Salir del bucle
            } else {
                // Login fallido
                loginFailed = true; // Activar mensaje de error
            }
        }
    }
    

    // * Creamos la funcion "register"

    public boolean addUser() {
        test();
        Scanner scanner = new Scanner(System.in);
        User newUser = new User();

        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶");
        System.out.println("◼︎ Nombre ▶");
        System.out.println("◼︎ Apellido ▶");
        System.out.println("◼︎ Celular ▶ ");
        System.out.println("◼︎ Correo ▶ ");
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu usuario");
        System.out.println("");

        // * Validar el nombre de usuario
        while (true) {
            System.out.print("▶   ");
            String userName = scanner.nextLine();

            if (userList.stream().anyMatch(user -> user.getUserName().equals(userName))) {
                generalService.cleanScreen();
                System.out.println("████████████████████████████████");
                System.out.println("            Registro");
                System.out.println("");
                System.out.println("◼︎ Usuario ▶");
                System.out.println("◼︎ Nombre ▶");
                System.out.println("◼︎ Apellido ▶");
                System.out.println("◼︎ Celular ▶ ");
                System.out.println("◼︎ Correo ▶ ");
                System.out.println("◼︎ Contraseña ▶ ");
                System.out.println("");
                System.out.println("████████████████████████████████");
                System.out.println("    ☑  Ingresa tu usuario");
                System.out.println("☒ El nombre de usuario ya existe.");
            } else {
                newUser.setUserName(userName);
                break;
            }
        }

        generalService.cleanScreen();
        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶ " + newUser.getUserName());
        System.out.println("◼︎ Nombre ▶");
        System.out.println("◼︎ Apellido ▶");
        System.out.println("◼︎ Celular ▶ ");
        System.out.println("◼︎ Correo ▶ ");
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu nombre");
        System.out.println("");

        // * Pedir el nombre
        System.out.print("▶   ");
        newUser.setName(scanner.nextLine());

        generalService.cleanScreen();
        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
        System.out.println("◼︎ Nombre ▶  " + newUser.getName());
        System.out.println("◼︎ Apellido ▶  ");
        System.out.println("◼︎ Celular ▶  ");
        System.out.println("◼︎ Correo ▶  ");
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu apellido");
        System.out.println("");

        // * Pedir el apellido
        System.out.print("▶   ");
        newUser.setLastName(scanner.nextLine());

        generalService.cleanScreen();
        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
        System.out.println("◼︎ Nombre ▶  " + newUser.getName());
        System.out.println("◼︎ Apellido ▶  " + newUser.getLastName());
        System.out.println("◼︎ Celular ▶  ");
        System.out.println("◼︎ Correo ▶  ");
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu celular");
        System.out.println("");

        // * Pedir el número de teléfono
        while (true) {
            try {
                System.out.print("▶   ");
                newUser.setPhoneNum(scanner.nextInt());
                scanner.nextLine(); // Limpiar buffer
                break;
            } catch (Exception e) {
                generalService.cleanScreen();
                System.out.println("████████████████████████████████");
                System.out.println("            Registro");
                System.out.println("");
                System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
                System.out.println("◼︎ Nombre ▶  " + newUser.getName());
                System.out.println("◼︎ Apellido ▶  " + newUser.getLastName());
                System.out.println("◼︎ Celular ▶  ");
                System.out.println("◼︎ Correo ▶  ");
                System.out.println("◼︎ Contraseña ▶ ");
                System.out.println("");
                System.out.println("████████████████████████████████");
                System.out.println("    ☑  Ingresa tu celular");
                System.out.println("☒ Ingresa un número de celular válido.");
                scanner.nextLine(); // Limpiar buffer en caso de error
            }
        }

        generalService.cleanScreen();
        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
        System.out.println("◼︎ Nombre ▶  " + newUser.getName());
        System.out.println("◼︎ Apellido ▶  " + newUser.getLastName());
        System.out.println("◼︎ Celular ▶  " + newUser.getPhoneNum());
        System.out.println("◼︎ Correo ▶  ");
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu correo");
        System.out.println("");

        // * Pedir el correo electrónico
        while (true) {
            System.out.print("▶   ");
            String email = scanner.nextLine();
            if (isValidEmail(email)) {
                newUser.setEmail(email);
                break;
            } else {
                generalService.cleanScreen();
                System.out.println("████████████████████████████████");
                System.out.println("            Registro");
                System.out.println("");
                System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
                System.out.println("◼︎ Nombre ▶  " + newUser.getName());
                System.out.println("◼︎ Apellido ▶  " + newUser.getLastName());
                System.out.println("◼︎ Celular ▶  " + newUser.getPhoneNum());
                System.out.println("◼︎ Correo ▶  ");
                System.out.println("◼︎ Contraseña ▶ ");
                System.out.println("");
                System.out.println("████████████████████████████████");
                System.out.println("    ☑  Ingresa tu correo");
                System.out.println("☒ Ingresa un correo electrónico válido.");
            }
        }

        generalService.cleanScreen();
        System.out.println("████████████████████████████████");
        System.out.println("            Registro");
        System.out.println("");
        System.out.println("◼︎ Usuario ▶  " + newUser.getUserName());
        System.out.println("◼︎ Nombre ▶  " + newUser.getName());
        System.out.println("◼︎ Apellido ▶  " + newUser.getLastName());
        System.out.println("◼︎ Celular ▶  " + newUser.getPhoneNum());
        System.out.println("◼︎ Correo ▶  " + newUser.getEmail());
        System.out.println("◼︎ Contraseña ▶ ");
        System.out.println("");
        System.out.println("████████████████████████████████");
        System.out.println("    ☑  Ingresa tu contraseña");

        // * Pedir la contraseña
        System.out.print("▶   ");
        newUser.setPassword(scanner.nextLine());

        // * Agregar usuario a la lista
        userList.add(newUser);
        System.out.println("✔ Usuario registrado exitosamente.");
        return true;
    }

    // * Método de validación de correo electrónico
    private boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }


}
