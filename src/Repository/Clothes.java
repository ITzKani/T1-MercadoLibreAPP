package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Clothes {

    private List<Article> clothesList;

    public Clothes() {
        clothesList = new ArrayList<>();
        clothesList.add(new Article(31, "Camisa casual", "100% algodon, manga larga", "Camisa ideal para el dia a dia", "Camisas", "Tienda Moda", 299.99));
        clothesList.add(new Article(32, "Pantalon de mezclilla", "Corte regular, color azul", "Pantalon comodo y duradero", "Pantalones", "Denim Store", 499.99));
        clothesList.add(new Article(33, "Vestido floral", "Estampado floral, talla unica", "Vestido fresco para verano", "Vestidos", "Ropa Chic", 399.99));
        clothesList.add(new Article(34, "Chaqueta de cuero", "Cuero sintetico, estilo biker", "Chaqueta resistente para clima frio", "Chaquetas", "Moda Urbana", 899.99));
        clothesList.add(new Article(35, "Sueter de lana", "Lana natural, cuello redondo", "Sueter calido y suave", "Sueteres", "Estilo Invernal", 599.99));
        clothesList.add(new Article(36, "Falda plisada", "Corte midi, color negro", "Falda elegante para cualquier ocasion", "Faldas", "Tienda Glam", 349.99));
        clothesList.add(new Article(37, "Blusa sin mangas", "Tejido ligero, color blanco", "Blusa ideal para dias calurosos", "Blusas", "Estilo Diario", 199.99));
        clothesList.add(new Article(38, "Camiseta estampada", "100% algodon, estampado moderno", "Camiseta para looks casuales", "Camisetas", "Street Wear", 149.99));
        clothesList.add(new Article(39, "Abrigo largo", "Tejido grueso, con bolsillos", "Abrigo elegante para invierno", "Abrigos", "Elegance Store", 1299.99));
        clothesList.add(new Article(40, "Chaleco acolchado", "Relleno ligero, con cremallera", "Chaleco perfecto para actividades al aire libre", "Chalecos", "Outdoor Gear", 699.99));
        clothesList.add(new Article(41, "Pantalones cortos", "Tela ligera, color caqui", "Pantalones cortos ideales para verano", "Shorts", "Beach Style", 249.99));
        clothesList.add(new Article(42, "Leggings deportivos", "Material elastico, color negro", "Leggings para entrenamiento o uso diario", "Leggings", "Fitness Pro", 299.99));
        clothesList.add(new Article(43, "Camisa formal", "Corte slim fit, color blanco", "Camisa elegante para ocasiones formales", "Camisas", "Luxury Wear", 599.99));
        clothesList.add(new Article(44, "Bufanda tejida", "Lana sintetica, color gris", "Bufanda calida y versatil", "Accesorios", "Winter Fashion", 159.99));
        clothesList.add(new Article(45, "Pijama de algodon", "Conjunto de dos piezas, tela suave", "Pijama comoda para un buen descanso", "Pijamas", "Sweet Dreams", 349.99));
    }

    public List<Article> getClothesList() {
        return clothesList;
    }
}
