import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {
    private List<Usuario> usuarios;
    private Scanner scanner;

    public Registro() {
        usuarios = new ArrayList<>();
        scanner = new Scanner(System.in);
        // Añadir usuarios predefinidos
        usuarios.add(new Usuario(1, "ITz", "Dagan", "Vega", "daganjv13@gmail.com", "root", 563023501));
        usuarios.add(new Usuario(2, "PacmanXDdeoz", "Carlos", "Vazquez", "carlosangel2710@hotmail.com", "pa55word", 553854005));
        usuarios.add(new Usuario(3, "Mangel", "Miguel", "Amado", "Miguelag@gmail.com", "amado55", 557811154));
        usuarios.add(new Usuario(4, "ihatebruno", "Bruno", "Villegas", "brunogaelav2004@gmail.com", "hola1224", 553795599));
        usuarios.add(new Usuario(5, "AntonioIvann", "Antonio", "Reyes", "rantonioivann@gmail.com", "juanwick", 551263178));
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void registrarUsuario() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.print("Ingrese su número de teléfono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        int id = usuarios.size() + 1; // Generar un nuevo ID para el usuario
        Usuario nuevoUsuario = new Usuario(id, nombreUsuario, nombre, apellido, email, contraseña, telefono);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado exitosamente.");
    }
}
