package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Article;
import Service.GeneralService;
import Repository.Appliances;

public class MenuCategorias {

    GeneralService generalService = new GeneralService();

    Appliances appliances = new Appliances();
    
    public void showCategorias() {
        Scanner scanner = new Scanner(System.in);
        byte opt;
        boolean tryAgain = false;

        while (true) {

            System.out.println("████████████████████████████████");
            System.out.println("     ⛟   Categorias");
            System.out.println("");
            System.out.println("1. Electrodomésticos");
            System.out.println("2. Libros");
            System.out.println("3. Moda y belleza");
            System.out.println("4. Muebles");
            System.out.println("5. Hogar");
            System.out.println("6. Mascotas");
            System.out.println("7. Deportes");
            System.out.println("8. Tecnología");
            System.out.println("9. Juguetes       0. Regresar");
            System.out.println("");
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

                switch (opt) {
                    case 0: {
                        generalService.cleanScreen();
                        System.out.println("Regresando...");
                        generalService.showLoadingTruck();
                        return;
                    }

                    // * Categoria de Electrodomesticos
                    case 1: {
                        List<Article> appliancesList = new ArrayList<>();
                        appliancesList = appliances.getAppliancesList();

                        for (Article article : appliancesList) {
                            System.out.println(article);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Libros
                    case 2: {
                        break;
                    }

                    // * Categoria de Moda y belleza
                    case 3: {
                        break;
                    }

                    default:
                    scanner.nextLine();
                    tryAgain = true;
                        break;
                }

            } catch (Exception e) {
                scanner.nextLine();
                tryAgain = true;
            }
        }
    }
}
