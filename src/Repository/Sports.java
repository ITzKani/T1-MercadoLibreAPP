package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Sports {

    private List<Article> sportsList;

    public Sports() {
        sportsList = new ArrayList<>();
        sportsList.add(new Article(151, "Bicicleta de Montana MTB 29\"", "Marco de aluminio, frenos de disco, 21 velocidades", "Bicicleta ideal para senderos y terrenos irregulares", "Deportes - Ciclismo", "BikeStore", 8499.99));
        sportsList.add(new Article(152, "Balon de Futbol Adidas", "Talla 5, costuras termoselladas, certificado FIFA", "Balon de alta calidad para entrenamientos y partidos", "Deportes - Futbol", "Adidas Store", 1299.99));
        sportsList.add(new Article(153, "Pesas Rusas 16kg", "Revestimiento de vinil, base antideslizante", "Pesas ideales para entrenamiento funcional y fuerza", "Deportes - Gimnasio", "Kettlebell Pro", 899.99));
        sportsList.add(new Article(154, "Raqueta de Tenis Wilson", "Material de grafito, peso 300g, encordado de alta tension", "Raqueta profesional para jugadores de nivel intermedio", "Deportes - Tenis", "Wilson Store", 4599.99));
        sportsList.add(new Article(155, "Guantes de Box Everlast", "12oz, fabricacion en cuero sintetico, cierre de velcro", "Guantes resistentes para entrenamiento y combate", "Deportes - Boxeo", "Everlast Store", 1599.99));
        sportsList.add(new Article(156, "Tapete de Yoga Antiderrapante", "6mm de grosor, material TPE, ligero y portable", "Tapete ideal para yoga, pilates y ejercicios en casa", "Deportes - Yoga", "Yoga Essentials", 799.99));
        sportsList.add(new Article(157, "Balon de Baloncesto Spalding", "Talla 7, uso interior/exterior, material de goma duradera", "Balon versatil para entrenamientos y juegos casuales", "Deportes - Baloncesto", "Spalding Official", 1199.99));
        sportsList.add(new Article(158, "Cinta de Correr Electrica", "Motor de 2.5HP, pantalla LCD, velocidad hasta 16km/h", "Cinta de correr plegable para entrenamientos en casa", "Deportes - Fitness", "Fitness Pro", 15999.99));
        sportsList.add(new Article(159, "Set de Mancuernas Ajustables 20kg", "Material de hierro fundido, incluye barras y seguros", "Set completo para entrenamiento de fuerza y musculos", "Deportes - Gimnasio", "GymGear", 1899.99));
        sportsList.add(new Article(160, "Red de Voleibol Portatil", "Altura ajustable, incluye postes y estuche", "Red facil de montar para juegos recreativos y competiciones", "Deportes - Voleibol", "SportsWorld", 2499.99));
        sportsList.add(new Article(161, "Patines en Linea Rollerblade", "Rodamientos ABEC-7, bota ajustable, ruedas de 80mm", "Patines ideales para principiantes y expertos", "Deportes - Patinaje", "RollerStore", 3599.99));
        sportsList.add(new Article(162, "Bolsa de Dormir Coleman", "Resistencia a temperaturas de hasta -5°C, ligera y compacta", "Bolsa de dormir ideal para campamentos y excursiones", "Deportes - Camping", "Coleman Store", 1499.99));
        sportsList.add(new Article(163, "Cuerda para Saltar Pro", "Material de acero recubierto, longitud ajustable", "Cuerda perfecta para ejercicios de cardio y crossfit", "Deportes - Fitness", "JumpFit", 399.99));
        sportsList.add(new Article(164, "Set de Pesca Completo", "Cana telescopica, carrete de spinning, accesorios incluidos", "Set ideal para pesca recreativa y deportiva", "Deportes - Pesca", "FishingPro", 1999.99));
        sportsList.add(new Article(165, "Chaleco Salvavidas Nautico", "Homologado, espuma de flotacion, ajuste de correas", "Chaleco seguro para actividades acuaticas y nauticas", "Deportes - Deportes Acuaticos", "AquaSafe", 1299.99));
    }

    public List<Article> getSportsList() {
        return sportsList;
    }
}