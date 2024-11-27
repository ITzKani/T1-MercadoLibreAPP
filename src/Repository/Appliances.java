package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Appliances {
    List<Article> articleList = new ArrayList<>();
    Article appliance1 = new Article(1, "Refrigerador Samsung Inverter","Capacidad de 500L, tecnologia No Frost, eficiencia energetica A++", "Refrigerador con tecnologia de punta que optimiza el consumo energetico.", "Electrodomesticos - Cocina", "Samsung Tienda Oficial", 14999.99);
    Article appliance2 = new Article(2, "Lavadora LG 15kg TurboWash", "15kg de capacidad, ahorro de agua, conectividad Wi-Fi", "Lavadora con motor inverter y funciones inteligentes para un lavado eficiente.", "Electrodomesticos - Lavado", "LG Store", 12999.00);
    Article appliance3 = new Article(3, "Horno de Microondas Panasonic", "30L de capacidad, 10 niveles de potencia, temporizador digital", "Microondas versatil y facil de usar para cualquier cocina.", "Electrodomesticos - Cocina", "Panasonic Oficial", 2899.99);
    Article appliance4 = new Article(4, "Aspiradora Dyson V15 Detect", "Sin cable, deteccion de polvo laser, bateria de larga duracion", "Aspiradora de ultima generacion para limpieza profunda.", "Electrodomesticos - Limpieza", "Dyson Tienda Oficial", 18999.50);
    Article appliance5 = new Article(5, "Cafetera Espresso Nespresso", "Sistema de capsulas, presion de 19 bares, diseño compacto", "Cafetera ideal para disfrutar del cafe perfecto en casa.", "Electrodomesticos - Cocina", "Nespresso Store", 3599.00);
    Article appliance6 = new Article(6,"Televisor Samsung Smart TV 55''" , "4K UHD, HDR10+, Tizen OS", "Televisor con calidad de imagen espectacular y funciones inteligentes.", "Electrodomesticos - Entretenimiento", "Samsung Tienda Oficial", 18999.99);
    Article appliance7 = new Article(7, "Estufa Whirlpool 4 Quemadores", "4 quemadores, horno con encendido electrico, diseño inoxidable", "Estufa eficiente y funcional para uso diario.", "Electrodomesticos - Cocina", "Whirlpool Store", 8499.99);
    Article appliance8 = new Article(8, "Secadora Mabe 20kg", "Capacidad de 20kg, sistema de secado por gas, control digital", "Secadora ideal para grandes cargas de ropa con eficiencia energetica", "Electrodomesticos - Lavado", "Mabe Oficial", 12999.00);
    Article appliance9 = new Article(9, "Licuadora Oster Pro 1200", "1200W de potencia, vaso de vidrio, cuchillas reversibles", "Licuadora potente para preparar batidos, sopas y mas", "Electrodomesticos - Cocina", "Oster Store", 2299.99);
    Article appliance10 = new Article(10, "Aire Acondicionado LG Dual Inverter", "12000 BTU, eficiencia energetica A++, control remoto", "Aire acondicionado silencioso y eficiente para espacios medianos", "Electrodomesticos - Climatizacion", "LG Store", 15999.99);
    Article appliance11 = new Article(11, "Freidora de Aire T-Fal", "4L de capacidad, temporizador digital, sin aceite", "Freidora saludable para preparar comidas crujientes sin grasa", "Electrodomesticos - Cocina", "T-Fal Store", 3999.00);
    Article appliance12 = new Article(12, "Plancha a Vapor Philips", "Potencia de 2400W, golpe de vapor, sistema anti-goteo", "Plancha eficiente para eliminar arrugas rapidamente", "Electrodomesticos - Cuidado Personal", "Philips Oficial", 1499.99);
    Article appliance13 = new Article(13, "Robot Aspirador Xiaomi Mi Robot", "Navegacion laser, control por app, bateria de larga duracion", "Robot aspirador automatico que limpia mientras descansas", "Electrodomesticos - Limpieza", "Xiaomi Store", 8999.99);
    Article appliance14 = new Article(14, "Ventilador de Torre Black+Decker", "3 velocidades, diseno compacto, control remoto", "Ventilador potente y silencioso para cualquier habitacion", "Electrodomesticos - Climatizacion", "Black+Decker Store", 1999.99);
    Article appliance15 = new Article(15, "Batidora de Mano Braun", "1000W de potencia, multiples accesorios, diseno ergonomico", "Batidora de mano versatil para preparar pures, salsas y mas", "Electrodomesticos - Cocina", "Braun Store", 2499.99);
    
    public Appliances(){
        articleList.add(appliance1);
        articleList.add(appliance2);
        articleList.add(appliance3);
        articleList.add(appliance4);
        articleList.add(appliance5);
        articleList.add(appliance6);
        articleList.add(appliance7);
        articleList.add(appliance8);
        articleList.add(appliance9);
        articleList.add(appliance10);
        articleList.add(appliance11);
        articleList.add(appliance12);
        articleList.add(appliance13);
        articleList.add(appliance14);
        articleList.add(appliance15);
    }
}