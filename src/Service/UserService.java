package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.User;

public class UserService {

    // * Categorias de articulos
    private String[] categorys = { "Tecnología", "Hogar", "Deportes", "Moda", "Juguetes", "Electrodomésticos",
            "Muebles", "Libros", "Mascotas", "Otros" };

    // * Lista general de usuarios
    List<User> userList = new ArrayList<>();
    User admin = new User(1, "ITz", "Dagan", "Vega", "daganjv13@gmail.com", "root", 563023501);
    

    public boolean login() {
        userList.add(admin);
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

            else {
                System.out.println("Usuario o contraseña incorrectos");
                return false;
            }
        }
        return false;
    }

    public void authentication() {
        boolean authentication;
        do {
            authentication = login();
        } while (authentication == false);
    }
}
