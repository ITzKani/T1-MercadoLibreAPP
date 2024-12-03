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
                        List<Article> booksList = new ArrayList<>();
                        booksList = booksList.getBooksList();

                        for (Article article : booksList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Moda y belleza
                    case 3: {
                        List<Article> fashionList = new ArrayList<>();
                        fashionList = fashionList.getFashionList();

                        for (Article article : fashionList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Muebles
                    case 4: {
                        List<Article> furnitureList = new ArrayList<>();
                        furnitureList = furnitureList.getFurnitureList();

                        for (Article article : furnitureList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Hogar
                    case 5: {
                        List<Article> homeList = new ArrayList<>();
                        homeList = homeList.getHomeList();

                        for (Article article : homeList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Mascotas
                    case 6: {
                        List<Article> petsList = new ArrayList<>();
                        petsList = petsList.getPetsList();

                        for (Article article : petsList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Deportes
                    case 7: {
                        List<Article> sportsList = new ArrayList<>();
                        sportsList = sportsList.getSportsList();

                        for (Article article : sportsList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Tecnología
                    case 8: {
                        List<Article> technologyList = new ArrayList<>();
                        technologyList = technologyList.getTechnologyList();

                        for (Article article : technologyList) {
                            System.out.println(article);
                        }
                        break;
                    }

                    // * Categoria de Juguetes
                    case 9: {
                        List<Article> toysList = new ArrayList<>();
                        toysList = toysList.getToysList();
                        for (Article article : toysList) {
                            System.out.println(article);
                        }
                    }
                        break;
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
