package Service;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class UserService {

    // * Lista general de usuarios
    List<User> userList = new ArrayList<>();

    // * Categorias de articulos
    private String[] categorys = { "Tecnología", "Hogar", "Deportes", "Moda", "Juguetes", "Electrodomésticos",
            "Muebles", "Libros", "Mascotas", "Otros" };

    public void addAdminUser() {
        User admin = new User(1, "ITz", "Dagan", "Vega", "daganjv13@gmail.com", "root", 563023501);
        User admin2 = new User(2, "PacmanXDdeoz","Carlos", "Vazquez", "carlosangel2710@hotmail.com","pa55word", 553854005);
        User admin3 = new User(3, "Mangel", "Miguel", "Amado", "Miguelag@gmail.com", "amado55", 557811154);
        User admin4 = new User(4,"ihatebruno","Bruno","Villegas","brunogaelav2004@gmail.com", "hola1224", 553795599);

        userList.add(admin);
        userList.add(admin2);
        userList.add(admin3);
        userList.add(admin4);
    }


    public boolean login() {
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

    
}
