package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Videogames {
    List<Article> videogamesList = new ArrayList<>();

    Article videogame1 = new Article(196, "The Legend of Zelda: Tears of the Kingdom", "Aventura, exploracion, mundo abierto", "Juego de mundo abierto en el reino de Hyrule.", "Aventura", "Amazon Mexico", 1699);
    Article videogame2 = new Article(197, "Call of Duty: Modern Warfare II", "FPS, accion, multijugador", "Juego de disparos con campana y multijugador.", "Accion", "Gameplanet", 1299);
    Article videogame3 = new Article(198, "God of War: Ragnarok", "Accion, aventura, narrativa", "Continua la historia de Kratos y Atreus en la mitologia nordica.", "Aventura", "Amazon Mexico", 1499);
    Article videogame4 = new Article(199, "Super Mario Odyssey", "Plataformas, exploracion, aventura", "Mario explora reinos unicos en busca de Power Moons.", "Plataformas", "Coppel", 1299);
    Article videogame5 = new Article(200, "FIFA 23", "Deportes, futbol, multijugador", "Ultima entrega de FIFA con mejoras en jugabilidad y graficos.", "Deportes", "Liverpool", 999);
    Article videogame6 = new Article(201, "Elden Ring", "RPG, accion, mundo abierto", "Juego de rol en un mundo abierto creado por Hidetaka Miyazaki y George R. R. Martin.", "RPG", "Sanborns", 1599);
    Article videogame7 = new Article(202, "Minecraft", "Construccion, creatividad, aventura", "Juego de sandbox con posibilidades infinitas.", "Aventura", "Amazon Mexico", 399);
    Article videogame8 = new Article(203, "Hogwarts Legacy", "Aventura, RPG, exploracion", "Explora el mundo magico como estudiante de Hogwarts.", "Aventura", "Best Buy Mexico", 1399);
    Article videogame9 = new Article(204, "Resident Evil 4 Remake", "Terror, accion, supervivencia", "Remake del clasico juego de terror con graficos y jugabilidad actualizados.", "Terror", "Amazon Mexico", 1499);
    Article videogame10 = new Article(205, "Pokemon Scarlet", "RPG, aventura, coleccion", "Juego de rol con nuevos Pokemon en una region inspirada en Espana.", "RPG", "Gameplanet", 1399);
    Article videogame11 = new Article(206, "Mario Kart 8 Deluxe", "Carreras, multijugador, diversion", "Juego de carreras con los personajes clasicos de Nintendo.", "Carreras", "Amazon Mexico", 1199);
    Article videogame12 = new Article(207, "Assassin's Creed Valhalla", "Accion, aventura, RPG", "Juego ambientado en la era vikinga con exploracion y combate.", "Accion", "Sanborns", 1299);
    Article videogame13 = new Article(208, "Street Fighter 6", "Lucha, accion, multijugador", "Juego de peleas con graficos mejorados y nuevos personajes.", "Lucha", "Coppel", 1399);
    Article videogame14 = new Article(209, "Splatoon 3", "Accion, disparos, multijugador", "Juego de disparos colorido y competitivo.", "Accion", "Liverpool", 1399);
    Article videogame15 = new Article(210, "Diablo IV", "RPG, accion, cooperativo", "Juego de rol y accion en un mundo oscuro y gotico.", "RPG", "Amazon Mexico", 1599);
    
    
    public Videogames(){
        videogamesList.add(videogame1);
        videogamesList.add(videogame2);
        videogamesList.add(videogame3);
        videogamesList.add(videogame4);
        videogamesList.add(videogame5);
        videogamesList.add(videogame6);
        videogamesList.add(videogame7);
        videogamesList.add(videogame8);
        videogamesList.add(videogame9);
        videogamesList.add(videogame10);
        videogamesList.add(videogame11);
        videogamesList.add(videogame12);
        videogamesList.add(videogame13);
        videogamesList.add(videogame14);
        videogamesList.add(videogame15);
    }
    public List<Article> getVideogamesList(){
        return videogamesList;
    }
}