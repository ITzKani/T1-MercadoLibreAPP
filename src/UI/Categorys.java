package UI;
import Service.Function;
import Service.Others;
import java.util.Scanner;

public class Categorys {
    public void mostrarCategorias() {
        Scanner sc = new Scanner(System.in);
        Function opc = new Function();

        System.out.println("Selecciona una categoria:");
        System.out.println("1. Tecnologia");
        System.out.println("2. Hogar");
        System.out.println("3. Deportes");
        System.out.println("4. Moda");
        System.out.println("5. Juguetes");
        System.out.println("6. Electrodomesticos");
        System.out.println("7. Muebles");
        System.out.println("8. Libros");
        System.out.println("9. Mascotas");
        System.out.println("10. Otros");

        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                opc.getTechnologyList();
                break;
            case 2:
                opc.getHomeList();
                break;
            case 3:
                opc.getSportsList();
                break;
            case 4:
                opc.getFashionList();
                break;
            case 5:
                opc.getToysList();
                break;
            case 6:
                opc.getAppliancesList();
                break;
            case 7:
                opc.getFurnitureList();
                break;
            case 8:
                opc.getBooksList();
                break;
            case 9:
                opc.getPetsList();
                break;
            case 10:
                getSubcategories(sc, opc);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public void getSubcategories(Scanner sca, Function opt) {
        System.out.println("Selecciona una subcategoria:");
        System.out.println("1. Consolas de videojuegos y accesorios");
        System.out.println("2. Videojuegos");
        System.out.println("3. Musica");
        System.out.println("4. Ropa");
        System.out.println("5. Joyeria");

        int subOption = sca.nextInt();

        Others others = new Others();

        switch(subOption) {
            case 1:
                others.getConsolesAndAccessoriesList();
                break;
            case 2:
                others.getVideogamesList();
                break;
            case 3:
                others.getMusicList();
                break;
            case 4:
                others.getClothesList();
                break;
            case 5:
                others.getJewelryList();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
