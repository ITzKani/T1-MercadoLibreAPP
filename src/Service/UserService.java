package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.User;

public class UserService {

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


    public boolean login() {
        userList.add(admin);
        userList.add(admin2);
        userList.add(admin3);
        userList.add(admin4);
        userList.add(admin5);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        for (User user : userList) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Bienvenido " + user.getUserName());
                return true;
            }

        }
            System.out.println("Usuario o contraseña incorrectos");
            return false;
        

    }

    // * Creamos la funcion "register"
    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String userName = scanner.nextLine();

        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                System.out.println("El nombre de usuario ya está en uso.");
                return;
            }
        }

        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Apellido: ");
        String lastName = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String email = scanner.nextLine();

        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                System.out.println("El correo electrónico ya está en uso.");
                return;
            }
        }

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();
        System.out.print("Número de teléfono: ");
        int phoneNum = Integer.parseInt(scanner.nextLine());

        long newId = userList.size() + 1;
        User newUser = new User(newId, userName, name, lastName, email, password, phoneNum);
        userList.add(newUser);

        System.out.println("Usuario registrado exitosamente. Bienvenido, " + userName + "!");
    }

    public void authentication() {
        boolean authentication;
        do {
            authentication = login();
        } while (authentication == false);
    }
}
