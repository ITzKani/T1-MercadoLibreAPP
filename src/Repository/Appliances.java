package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Appliances {

    private List<Article> appliancesList;
    
    public Appliances() {
        appliancesList = new ArrayList<>();
        appliancesList.add(new Article(1, "Refrigerador Samsung Inverter","Capacidad de 500L, tecnologia No Frost, eficiencia energetica A++", "Refrigerador con tecnologia de punta que optimiza el consumo energetico.", "Electrodomesticos - Cocina", "Samsung Tienda Oficial", 14999.99));
        appliancesList.add(new Article(2, "Lavadora LG 15kg TurboWash", "15kg de capacidad, ahorro de agua, conectividad Wi-Fi", "Lavadora con motor inverter y funciones inteligentes para un lavado eficiente.", "Electrodomesticos - Lavado", "LG Store", 12999.00));
        appliancesList.add(new Article(3, "Horno de Microondas Panasonic", "30L de capacidad, 10 niveles de potencia, temporizador digital", "Microondas versatil y facil de usar para cualquier cocina.", "Electrodomesticos - Cocina", "Panasonic Oficial", 2899.99));
        appliancesList.add(new Article(4, "Aspiradora Dyson V15 Detect", "Sin cable, deteccion de polvo laser, bateria de larga duracion", "Aspiradora de ultima generacion para limpieza profunda.", "Electrodomesticos - Limpieza", "Dyson Tienda Oficial", 18999.50));
        appliancesList.add(new Article(5, "Cafetera Espresso Nespresso", "Sistema de capsulas, presion de 19 bares, diseño compacto", "Cafetera ideal para disfrutar del cafe perfecto en casa.", "Electrodomesticos - Cocina", "Nespresso Store", 3599.00));
        appliancesList.add(new Article(6,"Televisor Samsung Smart TV 55''" , "4K UHD, HDR10+, Tizen OS", "Televisor con calidad de imagen espectacular y funciones inteligentes.", "Electrodomesticos - Entretenimiento", "Samsung Tienda Oficial", 18999.99));
        appliancesList.add(new Article(7, "Estufa Whirlpool 4 Quemadores", "4 quemadores, horno con encendido electrico, diseno inoxidable", "Estufa eficiente y funcional para uso diario.", "Electrodomesticos - Cocina", "Whirlpool Store", 8499.99));
        appliancesList.add(new Article(8, "Secadora Mabe 20kg", "Capacidad de 20kg, sistema de secado por gas, control digital", "Secadora ideal para grandes cargas de ropa con eficiencia energetica", "Electrodomesticos - Lavado", "Mabe Oficial", 12999.00));
        appliancesList.add(new Article(9, "Licuadora Oster Pro 1200", "1200W de potencia, vaso de vidrio, cuchillas reversibles", "Licuadora potente para preparar batidos, sopas y mas", "Electrodomesticos - Cocina", "Oster Store", 2299.99));
        appliancesList.add(new Article(10, "Aire Acondicionado LG Dual Inverter", "12000 BTU, eficiencia energetica A++, control remoto", "Aire acondicionado silencioso y eficiente para espacios medianos", "Electrodomesticos - Climatizacion", "LG Store", 15999.99));
        appliancesList.add(new Article(11, "Freidora de Aire T-Fal", "4L de capacidad, temporizador digital, sin aceite", "Freidora saludable para preparar comidas crujientes sin grasa", "Electrodomesticos - Cocina", "T-Fal Store", 3999.00));
        appliancesList.add(new Article(12, "Plancha a Vapor Philips", "Potencia de 2400W, golpe de vapor, sistema anti-goteo", "Plancha eficiente para eliminar arrugas rapidamente", "Electrodomesticos - Cuidado Personal", "Philips Oficial", 1499.99));
        appliancesList.add(new Article(13, "Robot Aspirador Xiaomi Mi Robot", "Navegacion laser, control por app, bateria de larga duracion", "Robot aspirador automatico que limpia mientras descansas", "Electrodomesticos - Limpieza", "Xiaomi Store", 8999.99));
        appliancesList.add(new Article(14, "Ventilador de Torre Black+Decker", "3 velocidades, diseno compacto, control remoto", "Ventilador potente y silencioso para cualquier habitacion", "Electrodomesticos - Climatizacion", "Black+Decker Store", 1999.99));
        appliancesList.add(new Article(15, "Batidora de Mano Braun", "1000W de potencia, multiples accesorios, diseno ergonomico", "Batidora de mano versatil para preparar pures, salsas y mas", "Electrodomesticos - Cocina", "Braun Store", 2499.99));
    }

    public List<Article> getAppliancesList() {
        return appliancesList;
    }
}