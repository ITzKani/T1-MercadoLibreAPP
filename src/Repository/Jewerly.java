package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Jewerly {
    List <Article> jewerlyList = new ArrayList<>();

    Article jewerly1 = new Article(166, "Anillo de plata", "Plata 925, diseño minimalista", "Anillo elegante para cualquier ocasion", "Joyería", "Joyerías La Perla", 750.00);
    Article jewerly2 = new Article(167, "Collar de oro", "Oro 14k, cadena fina", "Collar delicado y sofisticado", "Joyería", "Orfebres de México", 3250.00);
    Article jewerly3 = new Article(168, "Aretes de zirconia", "Zirconia brillante, acabado de oro", "Aretes pequeños ideales para eventos formales", "Joyería", "Joyerías Estrella", 580.00);
    Article jewerly4 = new Article(169, "Pulsera de cuero", "Cuero genuino con detalles metalicos", "Pulsera unisex de estilo moderno", "Joyería", "Artesanos Urbanos", 430.00);
    Article jewerly5 = new Article(170, "Anillo de compromiso", "Oro blanco con zirconia", "Anillo perfecto para la propuesta ideal", "Joyería", "Diamantes Eternos", 4850.00);
    Article jewerly6 = new Article(171, "Reloj de acero inoxidable", "Acero, resistente al agua", "Reloj elegante con diseño moderno", "Joyería", "Joyerías del Tiempo", 2450.00);
    Article jewerly7 = new Article(172, "Collar de perlas", "Perlas naturales, cierre de oro", "Collar clasico para ocasiones especiales", "Joyería", "Perlas del Pacifico", 7890.00);
    Article jewerly8 = new Article(173, "Aretes colgantes", "Oro rosado, zirconia de colores", "Aretes largos para un look sofisticado", "Joyería", "Joyerías Glamour", 1290.00);
    Article jewerly9 = new Article(174, "Pulsera de oro", "Oro amarillo 18k, diseño trenzado", "Pulsera elegante y atemporal", "Joyería", "Joyas del Sol", 9500.00);
    Article jewerly10 = new Article(175, "Anillo con amatista", "Plata con piedra amatista", "Anillo unico con detalles artesanales", "Joyería", "Joyerías Esmeralda", 1150.00);
    Article jewerly11 = new Article(176, "Collar personalizado", "Plata con grabado personalizado", "Ideal para regalos especiales", "Joyería", "Detalles Unicos", 850.00);
    Article jewerly12 = new Article(177, "Anillo doble", "Acero inoxidable, estilo moderno", "Diseño innovador con doble banda", "Joyería", "Diseños Contemporaneos", 620.00);
    Article jewerly13 = new Article(178, "Aretes en forma de hoja", "Plata, diseño inspirado en la naturaleza", "Ligeros y elegantes", "Joyería", "Nature Jewelry", 470.00);
    Article jewerly14 = new Article(179, "Brazalete de piedras naturales", "Cuentas de cuarzo rosa", "Ideal para un look bohemio", "Joyería", "Artesanos del Sur", 390.00);
    Article jewerly15 = new Article(180, "Anillo de acero con zirconia", "Acero inoxidable con zirconia negra", "Moderno y resistente", "Joyería", "Metal & Shine", 720.00);
    

    public Jewerly(){
        jewerlyList.add(jewerly1);
        jewerlyList.add(jewerly2);
        jewerlyList.add(jewerly3);
        jewerlyList.add(jewerly4);
        jewerlyList.add(jewerly5);
        jewerlyList.add(jewerly6);
        jewerlyList.add(jewerly7);
        jewerlyList.add(jewerly8);
        jewerlyList.add(jewerly9);
        jewerlyList.add(jewerly10);
        jewerlyList.add(jewerly11);
        jewerlyList.add(jewerly12);
        jewerlyList.add(jewerly13);
        jewerlyList.add(jewerly14);
        jewerlyList.add(jewerly15);
    }
    public List<Article> getJewerlyList(){
        return jewerlyList;
    }
}