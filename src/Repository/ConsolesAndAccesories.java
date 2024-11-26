package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class ConsolesAndAccesories {
    List<Article> consolesList = new ArrayList<>();

    Article consoles1 = new Article(151, "Xbox Series X", "1TB SSD, 4K UHD, 120FPS", "Consola de videojuegos de última generación con gráficos impresionantes", "Consolas", "Microsoft", 14999.99);
    Article consoles2 = new Article(152, "PlayStation 5", "825GB SSD, Ray Tracing, DualSense", "Disfruta de una experiencia inmersiva con juegos de próxima generación", "Consolas", "Sony", 13999.99);
    Article consoles3 = new Article(153, "Nintendo Switch OLED", "Pantalla OLED, 64GB de almacenamiento", "Consola portátil con gráficos mejorados y pantalla vibrante", "Consolas", "Nintendo", 8999.99);
    Article consoles4 = new Article(154, "Xbox Series S", "512GB SSD, 1440p, 120FPS", "Consola compacta con gran potencia para juegos digitales", "Consolas", "Microsoft", 7999.99);
    Article consoles5 = new Article(155, "PlayStation 5 Digital Edition", "825GB SSD, Sin lector de discos", "La experiencia de PS5 en formato digital", "Consolas", "Sony", 12499.99);
    Article consoles6 = new Article(156, "Control Xbox Elite Series 2", "Botones personalizables, batería recargable", "Control premium para jugadores exigentes", "Accesorios", "Microsoft", 4999.99);
    Article consoles7 = new Article(157, "DualSense PS5", "Retroalimentación háptica, gatillos adaptativos", "Control innovador para mejorar la inmersión en los juegos", "Accesorios", "Sony", 1799.99);
    Article consoles8 = new Article(158, "Nintendo Switch Pro Controller", "Ergonomía mejorada, batería de larga duración", "Control cómodo para largas sesiones de juego", "Accesorios", "Nintendo", 1999.99);
    Article consoles9 = new Article(159, "Auriculares Xbox Wireless", "Sonido envolvente, conexión Bluetooth", "Disfruta de un sonido inmersivo en tus juegos", "Accesorios", "Microsoft", 2799.99);
    Article consoles10 = new Article(160, "Headset Pulse 3D PS5", "Audio 3D, diseño cómodo", "Sumérgete en tus juegos con audio espacial", "Accesorios", "Sony", 2499.99);
    Article consoles11 = new Article(161, "Estuche para Nintendo Switch", "Protección rígida, compartimentos", "Lleva tu consola y accesorios con seguridad", "Accesorios", "Nintendo", 799.99);
    Article consoles12 = new Article(162, "Cargador DualSense PS5", "Carga dos controles al mismo tiempo", "Mantén tus controles listos para jugar", "Accesorios", "Sony", 899.99);
    Article consoles13 = new Article(163, "Tarjeta MicroSD 256GB", "Alta velocidad, compatible con Nintendo Switch", "Amplía el almacenamiento de tu consola", "Accesorios", "SanDisk", 1499.99);
    Article consoles14 = new Article(164, "Base de carga Xbox", "Carga rápida, diseño compacto", "Carga tu control Xbox de forma eficiente", "Accesorios", "Microsoft", 999.99);
    Article consoles15 = new Article(165, "Volante Logitech G29", "Compatible con PS5 y PS4, pedalera incluida", "Simula una experiencia de conducción realista", "Accesorios", "Logitech", 6999.99);    

    public ConsolesAndAccesories() {
        consolesList.add(consoles1);
        consolesList.add(consoles2);
        consolesList.add(consoles3);
        consolesList.add(consoles4);
        consolesList.add(consoles5);
        consolesList.add(consoles6);
        consolesList.add(consoles7);
        consolesList.add(consoles8);
        consolesList.add(consoles9);
        consolesList.add(consoles10);
        consolesList.add(consoles11);
        consolesList.add(consoles12);
        consolesList.add(consoles13);
        consolesList.add(consoles14);
        consolesList.add(consoles15);
    }
    public List<Article> getConsolesList() {
        return consolesList;
    }
}