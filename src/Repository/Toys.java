package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Toys {

    private List<Article> toysList;

    public Toys() {
        toysList = new ArrayList<>();
        toysList.add(new Article(181, "Muneca Barbie", "Incluye accesorios y ropa", "Muneca Barbie con vestido rosa y accesorios incluidos", "Juguetes para ninas", "Tiendas de juguetes XYZ", 399.99));
        toysList.add(new Article(182, "Auto a control remoto", "Velocidad maxima 20 km/h", "Auto deportivo con control remoto y luces LED", "Vehiculos de juguete", "Jugueteria ABC", 519.99));
        toysList.add(new Article(183, "Set de construccion", "500 piezas multicolor", "Juego de bloques para construir estructuras creativas", "Juegos educativos", "Juguetes Creativos", 599.99));
        toysList.add(new Article(184, "Peluche de oso", "Suave y lavable", "Peluche de oso gigante color marron", "Peluches", "Tienda Dulces Suenos", 319.99));
        toysList.add(new Article(185, "Juego de mesa: Ajedrez", "Tablero de madera y piezas incluidas", "Juego de ajedrez clasico para todas las edades", "Juegos de mesa", "Casa de Juegos", 289.99));
        toysList.add(new Article(186, "Rompecabezas 3D", "Modelo de Torre Eiffel", "Rompecabezas tridimensional de la Torre Eiffel con 300 piezas", "Juegos educativos", "Puzzle World", 369.99));
        toysList.add(new Article(187, "Drone para ninos", "Camara HD y control remoto", "Drone compacto con camara y facil manejo", "Tecnologia infantil", "Tech Toys", 999.99));
        toysList.add(new Article(188, "Set de cocina infantil", "Incluye 20 piezas", "Juego de cocina con utensilios y alimentos de plastico", "Juegos de rol", "Juguetes Familiares", 459.99));
        toysList.add(new Article(189, "Figura de accion: Superheroe", "Articulada y con accesorios", "Figura de superheroe articulada de 20 cm", "Figuras de accion", "Heroes y Villanos", 349.99));
        toysList.add(new Article(190, "Avion de juguete", "Luces y sonidos", "Avion de plastico con efectos de luz y sonido", "Vehiculos de juguete", "Jugueteria ABC", 439.99));
        toysList.add(new Article(191, "Kit de manualidades", "Incluye tijeras, pegamento y colores", "Set para crear tarjetas y proyectos artisticos", "Arte y manualidades", "Creatividad Sin Limite", 259.99));
        toysList.add(new Article(192, "Casa de munecas", "3 niveles con muebles incluidos", "Casa de munecas de madera con accesorios", "Juguetes para ninas", "Tiendas de juguetes XYZ", 1799.99));
        toysList.add(new Article(193, "Balon de futbol", "Material resistente al agua", "Balon de futbol para ninos y ninas", "Juegos al aire libre", "Deportes Junior", 219.99));
        toysList.add(new Article(194, "Set de dinosaurios", "6 figuras diferentes", "Dinosaurios de plastico realistas para jugar", "Juguetes educativos", "Dino World", 339.99));
        toysList.add(new Article(195, "Patineta infantil", "Antideslizante y ligera", "Patineta para ninos con diseno colorido", "Juegos al aire libre", "Deportes Junior", 699.99));
    }

    public List<Article> getToysList() {
        return toysList;
    }
}