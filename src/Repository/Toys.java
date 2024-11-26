package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Toys {
    List<Article> articleList9 = new ArrayList<>();
    Article toys1 = new Article(121, "Muñeca Barbie", "Incluye accesorios y ropa", "Muñeca Barbie con vestido rosa y accesorios incluidos", "Juguetes para niñas", "Tiendas de juguetes XYZ", 19.99);
    Article toys2 = new Article(122, "Auto a control remoto", "Velocidad maxima 20 km/h", "Auto deportivo con control remoto y luces LED", "Vehiculos de juguete", "Jugueteria ABC", 25.99);
    Article toys3 = new Article(123, "Set de construccion", "500 piezas multicolor", "Juego de bloques para construir estructuras creativas", "Juegos educativos", "Juguetes Creativos", 29.99);
    Article toys4 = new Article(124, "Peluche de oso", "Suave y lavable", "Peluche de oso gigante color marron", "Peluches", "Tienda Dulces Sueños", 15.99);
    Article toys5 = new Article(125, "Juego de mesa: Ajedrez", "Tablero de madera y piezas incluidas", "Juego de ajedrez clasico para todas las edades", "Juegos de mesa", "Casa de Juegos", 14.99);
    Article toys6 = new Article(126, "Rompecabezas 3D", "Modelo de Torre Eiffel", "Rompecabezas tridimensional de la Torre Eiffel con 300 piezas", "Juegos educativos", "Puzzle World", 18.99);
    Article toys7 = new Article(127, "Drone para niños", "Camara HD y control remoto", "Drone compacto con camara y facil manejo", "Tecnologia infantil", "Tech Toys", 49.99);
    Article toys8 = new Article(128, "Set de cocina infantil", "Incluye 20 piezas", "Juego de cocina con utensilios y alimentos de plastico", "Juegos de rol", "Juguetes Familiares", 22.99);
    Article toys9 = new Article(129, "Figura de accion: Superheroe", "Articulada y con accesorios", "Figura de superheroe articulada de 20 cm", "Figuras de accion", "Heroes y Villanos", 17.99);
    Article toys10 = new Article(130, "Avion de juguete", "Luces y sonidos", "Avion de plastico con efectos de luz y sonido", "Vehiculos de juguete", "Jugueteria ABC", 21.99);
    Article toys11 = new Article(131, "Kit de manualidades", "Incluye tijeras, pegamento y colores", "Set para crear tarjetas y proyectos artisticos", "Arte y manualidades", "Creatividad Sin Limite", 12.99);
    Article toys12 = new Article(132, "Casa de muñecas", "3 niveles con muebles incluidos", "Casa de muñecas de madera con accesorios", "Juguetes para niñas", "Tiendas de juguetes XYZ", 89.99);
    Article toys13 = new Article(133, "Balon de futbol", "Material resistente al agua", "Balon de futbol para niños y niñas", "Juegos al aire libre", "Deportes Junior", 10.99);
    Article toys14 = new Article(134, "Set de dinosaurios", "6 figuras diferentes", "Dinosaurios de plastico realistas para jugar", "Juguetes educativos", "Dino World", 16.99);
    Article toys15 = new Article(135, "Patineta infantil", "Antideslizante y ligera", "Patineta para niños con diseño colorido", "Juegos al aire libre", "Deportes Junior", 34.99);

    public Toys(){
        articleList9.add(toys1);
        articleList9.add(toys2);
        articleList9.add(toys3);
        articleList9.add(toys4);
        articleList9.add(toys5);
        articleList9.add(toys6);
        articleList9.add(toys7);
        articleList9.add(toys8);
        articleList9.add(toys9);
        articleList9.add(toys10);
        articleList9.add(toys11);
        articleList9.add(toys12);
        articleList9.add(toys13);
        articleList9.add(toys14);
        articleList9.add(toys15);
    }
    public List<Article> getArticleList9() {
        return articleList9;
    }
}