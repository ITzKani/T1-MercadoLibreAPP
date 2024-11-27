package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Clothes {
    List<Article> clothesList = new ArrayList<>();
    
    Article clothes1 = new Article(136, "Camisa casual", "100% algodon, manga larga", "Camisa ideal para el dia a dia", "Camisas", "Tienda Moda", 29.99);
    Article clothes2 = new Article(137, "Pantalon de mezclilla", "Corte regular, color azul", "Pantalon comodo y duradero", "Pantalones", "Denim Store", 49.99);
    Article clothes3 = new Article(138, "Vestido floral", "Estampado floral, talla unica", "Vestido fresco para verano", "Vestidos", "Ropa Chic", 39.99);
    Article clothes4 = new Article(139, "Chaqueta de cuero", "Cuero sintetico, estilo biker", "Chaqueta resistente para clima frio", "Chaquetas", "Moda Urbana", 89.99);
    Article clothes5 = new Article(140, "Sueter de lana", "Lana natural, cuello redondo", "Sueter calido y suave", "Sueteres", "Estilo Invernal", 59.99);
    Article clothes6 = new Article(141, "Falda plisada", "Corte midi, color negro", "Falda elegante para cualquier ocasion", "Faldas", "Tienda Glam", 34.99);
    Article clothes7 = new Article(142, "Blusa sin mangas", "Tejido ligero, color blanco", "Blusa ideal para dias calurosos", "Blusas", "Estilo Diario", 19.99);
    Article clothes8 = new Article(143, "Camiseta estampada", "100% algodon, estampado moderno", "Camiseta para looks casuales", "Camisetas", "Street Wear", 14.99);
    Article clothes9 = new Article(144, "Abrigo largo", "Tejido grueso, con bolsillos", "Abrigo elegante para invierno", "Abrigos", "Elegance Store", 129.99);
    Article clothes10 = new Article(145, "Chaleco acolchado", "Relleno ligero, con cremallera", "Chaleco perfecto para actividades al aire libre", "Chalecos", "Outdoor Gear", 69.99);
    Article clothes11 = new Article(146, "Pantalones cortos", "Tela ligera, color caqui", "Pantalones cortos ideales para verano", "Shorts", "Beach Style", 24.99);
    Article clothes12 = new Article(147, "Leggings deportivos", "Material elastico, color negro", "Leggings para entrenamiento o uso diario", "Leggings", "Fitness Pro", 29.99);
    Article clothes13 = new Article(148, "Camisa formal", "Corte slim fit, color blanco", "Camisa elegante para ocasiones formales", "Camisas", "Luxury Wear", 59.99);
    Article clothes14 = new Article(149, "Bufanda tejida", "Lana sintetica, color gris", "Bufanda calida y versatil", "Accesorios", "Winter Fashion", 15.99);
    Article clothes15 = new Article(150, "Pijama de algodon", "Conjunto de dos piezas, tela suave", "Pijama comoda para un buen descanso", "Pijamas", "Sweet Dreams", 34.99);
    

    public Clothes() {
        clothesList.add(clothes1);
        clothesList.add(clothes2);
        clothesList.add(clothes3);
        clothesList.add(clothes4);
        clothesList.add(clothes5);
        clothesList.add(clothes6);
        clothesList.add(clothes7);
        clothesList.add(clothes8);
        clothesList.add(clothes9);
        clothesList.add(clothes10);
        clothesList.add(clothes11);
        clothesList.add(clothes12);
        clothesList.add(clothes13);
        clothesList.add(clothes14);
        clothesList.add(clothes15);
    }
    public List<Article> getClothesList() {
        return clothesList;
    }
}