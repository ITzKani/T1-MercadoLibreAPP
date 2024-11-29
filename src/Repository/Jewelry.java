package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Jewelry {

    private List<Article> jewelryList;

    public Jewelry() {
        jewelryList = new ArrayList<>();
        jewelryList.add(new Article(106, "Anillo de plata", "Plata 925, diseno minimalista", "Anillo elegante para cualquier ocasion", "Joyeria", "Joyeria La Perla", 750.00));
        jewelryList.add(new Article(107, "Collar de oro", "Oro 14k, cadena fina", "Collar delicado y sofisticado", "Joyeria", "Orfebres de Mexico", 3250.00));
        jewelryList.add(new Article(108, "Aretes de zirconia", "Zirconia brillante, acabado de oro", "Aretes pequenos ideales para eventos formales", "Joyeria", "Joyeria Estrella", 580.00));
        jewelryList.add(new Article(109, "Pulsera de cuero", "Cuero genuino con detalles metalicos", "Pulsera unisex de estilo moderno", "Joyeria", "Artesanos Urbanos", 430.00));
        jewelryList.add(new Article(110, "Anillo de compromiso", "Oro blanco con zirconia", "Anillo perfecto para la propuesta ideal", "Joyeria", "Diamantes Eternos", 4850.00));
        jewelryList.add(new Article(111, "Reloj de acero inoxidable", "Acero, resistente al agua", "Reloj elegante con diseno moderno", "Joyeria", "Joyeria del Tiempo", 2450.00));
        jewelryList.add(new Article(112, "Collar de perlas", "Perlas naturales, cierre de oro", "Collar clasico para ocasiones especiales", "Joyeria", "Perlas del Pacifico", 7890.00));
        jewelryList.add(new Article(113, "Aretes colgantes", "Oro rosado, zirconia de colores", "Aretes largos para un look sofisticado", "Joyeria", "Joyeria Glamour", 1290.00));
        jewelryList.add(new Article(114, "Pulsera de oro", "Oro amarillo 18k, diseno trenzado", "Pulsera elegante y atemporal", "Joyeria", "Joyas del Sol", 9500.00));
        jewelryList.add(new Article(115, "Anillo con amatista", "Plata con piedra amatista", "Anillo unico con detalles artesanales", "Joyeria", "Joyeria Esmeralda", 1150.00));
        jewelryList.add(new Article(116, "Collar personalizado", "Plata con grabado personalizado", "Ideal para regalos especiales", "Joyeria", "Detalles Unicos", 850.00));
        jewelryList.add(new Article(117, "Anillo doble", "Acero inoxidable, estilo moderno", "Diseno innovador con doble banda", "Joyeria", "Disenos Contemporaneos", 620.00));
        jewelryList.add(new Article(118, "Aretes en forma de hoja", "Plata, diseno inspirado en la naturaleza", "Ligeros y elegantes", "Joyeria", "Nature Jewelry", 470.00));
        jewelryList.add(new Article(119, "Brazalete de piedras naturales", "Cuentas de cuarzo rosa", "Ideal para un look bohemio", "Joyeria", "Artesanos del Sur", 390.00));
        jewelryList.add(new Article(120, "Anillo de acero con zirconia", "Acero inoxidable con zirconia negra", "Moderno y resistente", "Joyeria", "Metal & Shine", 720.00));
    }

    public List<Article> getJewelryList() {
        return jewelryList;
    }
}