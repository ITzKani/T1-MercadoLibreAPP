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
            "Muebles", "Libros", "Mascotas", "Otros (Consolas de videojuegos y accesorios,videojuegos,musica,ropa,joyeria)" };

    // * Lista general de usuarios
    List<User> userList = new ArrayList<>();
    User admin = new User(1, "ITz", "Dagan", "Vega", "daganjv13@gmail.com", "root", 563023501);
    User admin2 = new User(2, "PacmanXDdeoz","Carlos", "Vazquez", "carlosangel2710@hotmail.com","pa55word", 553854005);
    User admin3 = new User(3, "Mangel", "Miguel", "Amado", "Miguelag@gmail.com", "amado55", 557811154);
    User admin4 = new User(4,"ihatebruno","Bruno","Villegas","brunogaelav2004@gmail.com", "hola1224", 553795599);
    User admin5 = new User(5,"AntonioIvann","Antonio","Reyes","rantonioivann@gmail.com", "juanwick", 551263178);

    public void test() {
        userList.add(admin);
        userList.add(admin2);
        userList.add(admin3);
        userList.add(admin4);
        userList.add(admin5);
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        test();
    
        while (true) {
            System.out.print("Nombre de usuario: ");
            String username = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();
    
            User matchedUser = userList.stream().filter(user -> user.getUserName().equals(username) && user.getPassword().equals(password)).findFirst().orElse(null);
    
            if (matchedUser != null) {

                generalService.cleanScreen();
                System.out.println("Bienvenido " + matchedUser.getUserName());
                break; 
            } else {
                System.out.println("☒ Usuario o contraseña incorrectos. Inténtalo de nuevo.");
            }
        }
    }
    
    
    // * Creamos la funcion "register"

    public boolean addUser() {
        test();
        Scanner scanner = new Scanner(System.in);
        User newUser = new User();
    
        System.out.println("Registro de usuario");
    
        // * Validar el nombre de usuario
        while (true) {
            System.out.print("Nombre de usuario: ");
            String userName = scanner.nextLine();
    
            if (userList.stream().anyMatch(user -> user.getUserName().equals(userName))) {
                System.out.println("☒ El nombre de usuario ya existe, intenta con otro.");
            } else {
                newUser.setUserName(userName);
                break;
            }
        }
    
        // * Pedir el nombre
        System.out.print("Nombre: ");
        newUser.setName(scanner.nextLine());
    
        // * Pedir el apellido
        System.out.print("Apellido: ");
        newUser.setLastName(scanner.nextLine());
    
        // * Pedir el número de teléfono
        while (true) {
            try {
                System.out.print("Número de teléfono: ");
                newUser.setPhoneNum(scanner.nextInt());
                scanner.nextLine(); // Limpiar buffer
                break;
            } catch (Exception e) {
                System.out.println("☒ Ingresa un número de teléfono válido.");
                scanner.nextLine(); // Limpiar buffer en caso de error
            }
        }
    
        // * Pedir el correo electrónico
        while (true) {
            System.out.print("Correo electrónico: ");
            String email = scanner.nextLine();
            if (isValidEmail(email)) {
                newUser.setEmail(email);
                break;
            } else {
                System.out.println("☒ Ingresa un correo electrónico válido.");
            }
        }
    
        // * Pedir la contraseña
        System.out.print("Contraseña: ");
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
