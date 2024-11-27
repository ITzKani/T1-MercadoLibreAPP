package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Sports {
    List<Article> articleList7 = new ArrayList<>();
    Article sports1 = new Article(91, "Bicicleta de Montaña MTB 29\"", "Marco de aluminio, frenos de disco, 21 velocidades", "Bicicleta ideal para senderos y terrenos irregulares", "Deportes - Ciclismo", "BikeStore", 8499.99);
    Article sports2 = new Article(92, "Balon de Futbol Adidas", "Talla 5, costuras termoselladas, certificado FIFA", "Balon de alta calidad para entrenamientos y partidos", "Deportes - Futbol", "Adidas Store", 1299.99);
    Article sports3 = new Article(93, "Pesas Rusas 16kg", "Revestimiento de vinil, base antideslizante", "Pesas ideales para entrenamiento funcional y fuerza", "Deportes - Gimnasio", "Kettlebell Pro", 899.99);
    Article sports4 = new Article(94, "Raqueta de Tenis Wilson", "Material de grafito, peso 300g, encordado de alta tension", "Raqueta profesional para jugadores de nivel intermedio", "Deportes - Tenis", "Wilson Store", 4599.99);
    Article sports5 = new Article(95, "Guantes de Box Everlast", "12oz, fabricacion en cuero sintetico, cierre de velcro", "Guantes resistentes para entrenamiento y combate", "Deportes - Boxeo", "Everlast Store", 1599.99);
    Article sports6 = new Article(96, "Tapete de Yoga Antiderrapante", "6mm de grosor, material TPE, ligero y portable", "Tapete ideal para yoga, pilates y ejercicios en casa", "Deportes - Yoga", "Yoga Essentials", 799.99);
    Article sports7 = new Article(97, "Balon de Baloncesto Spalding", "Talla 7, uso interior/exterior, material de goma duradera", "Balon versatil para entrenamientos y juegos casuales", "Deportes - Baloncesto", "Spalding Official", 1199.99);
    Article sports8 = new Article(98, "Cinta de Correr Electrica", "Motor de 2.5HP, pantalla LCD, velocidad hasta 16km/h", "Cinta de correr plegable para entrenamientos en casa", "Deportes - Fitness", "Fitness Pro", 15999.99);
    Article sports9 = new Article(99, "Set de Mancuernas Ajustables 20kg", "Material de hierro fundido, incluye barras y seguros", "Set completo para entrenamiento de fuerza y musculos", "Deportes - Gimnasio", "GymGear", 1899.99);
    Article sports10 = new Article(100, "Red de Voleibol Portatil", "Altura ajustable, incluye postes y estuche", "Red facil de montar para juegos recreativos y competiciones", "Deportes - Voleibol", "SportsWorld", 2499.99);
    Article sports11 = new Article(101, "Patines en Linea Rollerblade", "Rodamientos ABEC-7, bota ajustable, ruedas de 80mm", "Patines ideales para principiantes y expertos", "Deportes - Patinaje", "RollerStore", 3599.99);
    Article sports12 = new Article(102, "Bolsa de Dormir Coleman", "Resistencia a temperaturas de hasta -5°C, ligera y compacta", "Bolsa de dormir ideal para campamentos y excursiones", "Deportes - Camping", "Coleman Store", 1499.99);
    Article sports13 = new Article(103, "Cuerda para Saltar Pro", "Material de acero recubierto, longitud ajustable", "Cuerda perfecta para ejercicios de cardio y crossfit", "Deportes - Fitness", "JumpFit", 399.99);
    Article sports14 = new Article(104, "Set de Pesca Completo", "Caña telescopica, carrete de spinning, accesorios incluidos", "Set ideal para pesca recreativa y deportiva", "Deportes - Pesca", "FishingPro", 1999.99);
    Article sports15 = new Article(105, "Chaleco Salvavidas Nautico", "Homologado, espuma de flotacion, ajuste de correas", "Chaleco seguro para actividades acuaticas y nauticas", "Deportes - Deportes Acuaticos", "AquaSafe", 1299.99);

    public Sports(){
        articleList7.add(sports1);
        articleList7.add(sports2);
        articleList7.add(sports3);
        articleList7.add(sports4);
        articleList7.add(sports5);
        articleList7.add(sports6);
        articleList7.add(sports7);
        articleList7.add(sports8);
        articleList7.add(sports9);
        articleList7.add(sports10);
        articleList7.add(sports11);
        articleList7.add(sports12);
        articleList7.add(sports13);
        articleList7.add(sports14);
        articleList7.add(sports15);
    }
    public List<Article> getSportsList(){
        return articleList7;
    }
}