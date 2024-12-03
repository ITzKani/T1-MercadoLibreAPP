package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class ConsolesAndAccessories {

    private List<Article> consolesandaccessoriesList;

    public ConsolesAndAccessories() {
        consolesandaccessoriesList = new ArrayList<>();
        consolesandaccessoriesList.add(new Article(46, "Xbox Series X", "1TB SSD, 4K UHD, 120FPS", "Consola de videojuegos de ultima generacion con graficos impresionantes", "Consolas", "Microsoft", 14999.99));
        consolesandaccessoriesList.add(new Article(47, "PlayStation 5", "825GB SSD, Ray Tracing, DualSense", "Disfruta de una experiencia inmersiva con juegos de proxima generacion", "Consolas", "Sony", 13999.99));
        consolesandaccessoriesList.add(new Article(48, "Nintendo Switch OLED", "Pantalla OLED, 64GB de almacenamiento", "Consola portatil con graficos mejorados y pantalla vibrante", "Consolas", "Nintendo", 8999.99));
        consolesandaccessoriesList.add(new Article(49, "Xbox Series S", "512GB SSD, 1440p, 120FPS", "Consola compacta con gran potencia para juegos digitales", "Consolas", "Microsoft", 7999.99));
        consolesandaccessoriesList.add(new Article(50, "PlayStation 5 Digital Edition", "825GB SSD, Sin lector de discos", "La experiencia de PS5 en formato digital", "Consolas", "Sony", 12499.99));
        consolesandaccessoriesList.add(new Article(51, "Control Xbox Elite Series 2", "Botones personalizables, bateria recargable", "Control premium para jugadores exigentes", "Accesorios", "Microsoft", 4999.99));
        consolesandaccessoriesList.add(new Article(52, "DualSense PS5", "Retroalimentacion haptica, gatillos adaptativos", "Control innovador para mejorar la inmersion en los juegos", "Accesorios", "Sony", 1799.99));
        consolesandaccessoriesList.add(new Article(53, "Nintendo Switch Pro Controller", "Ergonomia mejorada, bateria de larga duracion", "Control comodo para largas sesiones de juego", "Accesorios", "Nintendo", 1999.99));
        consolesandaccessoriesList.add(new Article(54, "Auriculares Xbox Wireless", "Sonido envolvente, conexion Bluetooth", "Disfruta de un sonido inmersivo en tus juegos", "Accesorios", "Microsoft", 2799.99));
        consolesandaccessoriesList.add(new Article(55, "Headset Pulse 3D PS5", "Audio 3D, diseño comodo", "Sumergente en tus juegos con audio espacial", "Accesorios", "Sony", 2499.99));
        consolesandaccessoriesList.add(new Article(56, "Estuche para Nintendo Switch", "Proteccion rigida, compartimentos", "Lleva tu consola y accesorios con seguridad", "Accesorios", "Nintendo", 799.99));
        consolesandaccessoriesList.add(new Article(57, "Cargador DualSense PS5", "Carga dos controles al mismo tiempo", "Mantén tus controles listos para jugar", "Accesorios", "Sony", 899.99));
        consolesandaccessoriesList.add(new Article(58, "Tarjeta MicroSD 256GB", "Alta velocidad, compatible con Nintendo Switch", "Amplia el almacenamiento de tu consola", "Accesorios", "SanDisk", 1499.99));
        consolesandaccessoriesList.add(new Article(59, "Base de carga Xbox", "Carga rapida, diseño compacto", "Carga tu control Xbox de forma eficiente", "Accesorios", "Microsoft", 999.99));
        consolesandaccessoriesList.add(new Article(60, "Volante Logitech G29", "Compatible con PS5 y PS4, pedalera incluida", "Simula una experiencia de conduccion realista", "Accesorios", "Logitech", 6999.99));
    }

    public List<Article> getConsolesAndAccesoriesList() {
        return consolesandaccessoriesList;
    }
}