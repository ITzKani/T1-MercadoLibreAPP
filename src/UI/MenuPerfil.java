package UI;

import java.util.Scanner;

import Model.User;
import Service.GeneralService;
import Service.UserService;

public class MenuPerfil {

    public void showProfile() {

        GeneralService generalService = new GeneralService();
        Scanner scanner = new Scanner(System.in);
        int opt;
        boolean tryAgain = false;
        while (true) {
            generalService.cleanScreen();
            
            System.out.println("████████████████████████████████");
            System.out.println("       ⛟   Mi perfil");
            System.out.println("");
            System.out.println("       ✪ 1. Mis datos ✪");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("⊞ 2. Mis compras ⊞   ☰ 3. Tarjetas ☰");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("    ✒ 4. Dirección ✒");
            System.out.println("");
            System.out.println("⚿ 0. Regresar ⚿");
            System.out.println("████████████████████████████████");
            System.out.println("   ☑  Selecciona una opción");

            if (tryAgain) {
                System.out.println("☒ Error: Elige una opción válida.");
            } else {
                System.out.println("");
            }

            System.out.print("▶   ");

            try {
                opt = scanner.nextInt();
                tryAgain = false;  // Reinicia el estado de error
                switch (opt) {
                    case 0: {
                        generalService.cleanScreen();
                        System.out.println("Regresando...");
                        generalService.showLoadingTruck();
                        break;
                    }

                    default:
                        break;
                }
            } catch (Exception e) {
                scanner.nextLine();
                tryAgain = true;
            }
            
        }
    }
}