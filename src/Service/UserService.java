package Service;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class UserService {

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
    public boolean login() {
        test();
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
    
    public void authentication() {
        boolean authentication;
        do {
            authentication = login();
        } while (authentication == false);
    }
    
    // * Creamos la funcion "register"
    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public boolean addUser() {
        test();
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        try {
            System.out.println("Registro de usuario");
            System.out.print("Nombre de usuario: ");
            String userName = scanner.nextLine();
            
            for(User u : userList){
                if(u.getUserName().equals(userName)){
                    System.out.println("El nombre de usuario ya existe, intenta con otro.");
                    return false;
                }
            }
            System.out.print("Nombre: ");
            user.setName(scanner.nextLine());
    
            System.out.print("Apellido: ");
            user.setLastName(scanner.nextLine());
    
            System.out.print("Numero de telefono: ");
            user.setPhoneNum(scanner.nextInt());
    
            System.out.print("Correo electronico: ");
            user.setEmail(scanner.next());
    
            System.out.print("Contraseña: ");
            user.setPassword(scanner.next());


            return true;
        } catch (Exception e) {
            System.out.println("Error: Estas poniendo datos invalidos.");
            return false;
        }
    }

    public void register() {
        boolean register;
        do {
            register = addUser();
        } while (register == false);
    }

}
