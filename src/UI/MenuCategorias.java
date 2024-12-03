package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Article;
import Service.GeneralService;
import Repository.Appliances;
import Repository.Books;
import Repository.Fashion;
import Repository.Furniture;
import Repository.Home;
import Repository.Pets;
import Repository.Sports;
import Repository.Technology;
import Repository.Toys;

public class MenuCategorias {

    GeneralService generalService = new GeneralService();

    Appliances appliances = new Appliances();
    Books books = new Books();
    Fashion fashion = new Fashion();
    Furniture furniture = new Furniture();
    Home home = new Home();
    Pets pets = new Pets();
    Sports sports = new Sports();
    Technology technology = new Technology();
    Toys toys = new Toys();
    
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
                        List<Article> appliancesList = new ArrayList<>(appliances.getAppliancesList());
                        for (Article appliance : appliancesList) {
                            System.out.println(appliance);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Libros
                    case 2: {
                        List<Article> booksList = new ArrayList<>(books.getBooksList());

                        for (Article book : booksList) {
                            System.out.println(book);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Moda y belleza
                    case 3: {
                        List<Article> fashionList = new ArrayList<>(fashion.getFashionList());

                        for (Article fashion : fashionList) {
                            System.out.println(fashion);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Muebles
                    case 4: {
                        List<Article> furnitureList = new ArrayList<>(furniture.getFurnitureList());

                        for (Article furniture : furnitureList) {
                            System.out.println(furniture);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Hogar
                    case 5: {
                        List<Article> homeList = new ArrayList<>(home.getHomeList());

                        for (Article home : homeList) {
                            System.out.println(home);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Mascotas
                    case 6: {
                        List<Article> petsList = new ArrayList<>(pets.getPetsList());

                        for (Article pet : petsList) {
                            System.out.println(pet);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Deportes
                    case 7: {
                        List<Article> sportsList = new ArrayList<>(sports.getSportsList());

                        for (Article sport : sportsList) {
                            System.out.println(sport);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Tecnología
                    case 8: {
                        List<Article> technologyList = new ArrayList<>(technology.getTechnologyList());

                        for (Article tech : technologyList) {
                            System.out.println(tech);
                        }
                        generalService.back();
                        break;
                    }

                    // * Categoria de Juguetes
                    case 9: {
                        List<Article> toysList = new ArrayList<>(toys.getToysList());

                        for (Article toy : toysList) {
                            System.out.println(toy);
                        }
                        generalService.back();
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
