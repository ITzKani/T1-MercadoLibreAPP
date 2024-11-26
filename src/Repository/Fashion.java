package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Fashion {
    List<Article> articleList3 = new ArrayList<>();
    Article fashion1 = new Article(31, "Perfume Calvin Klein Eternity", "Fragancia floral, duracion prolongada, presentacion de 100ml", "Perfume elegante y atemporal para uso diario o especial", "Moda y Belleza - Perfumeria", "Calvin Klein Store", 1499.99);
    Article fashion2 = new Article(32, "Reloj Casio G-Shock", "Resistente al agua, cronometro, alarma diaria", "Reloj deportivo y duradero ideal para cualquier actividad", "Moda y Belleza - Accesorios", "Casio Store", 2299.99);
    Article fashion3 = new Article(33, "Paleta de Sombras Urban Decay", "12 tonos neutros, acabado mate y brillante, larga duracion", "Paleta versatil para looks naturales y sofisticados", "Moda y Belleza - Maquillaje", "Urban Decay Store", 999.99);
    Article fashion4 = new Article(34, "Bolso Michael Kors Jet Set", "Material sintetico, diseno elegante, compartimentos multiples", "Bolso ideal para llevar todo lo esencial con estilo", "Moda y Belleza - Bolsos", "Michael Kors Store", 2999.99);
    Article fashion5 = new Article(35, "Crema Hidratante Neutrogena", "Con acido hialuronico, ligera, no grasa", "Crema hidratante que mantiene la piel suave y radiante", "Moda y Belleza - Cuidado de la Piel", "Neutrogena Store", 399.99);
    Article fashion6 = new Article(36, "Tenis Adidas Ultraboost", "Amortiguacion Boost, diseno ligero, colores modernos", "Tenis ideales para correr o uso casual con comodidad", "Moda y Belleza - Calzado", "Adidas Store", 3299.99);
    Article fashion7 = new Article(37, "Gafas de Sol Ray-Ban Aviador", "Cristales polarizados, marco de metal, proteccion UV", "Gafas clasicas que combinan estilo y funcionalidad", "Moda y Belleza - Accesorios", "Ray-Ban Store", 2499.99);
    Article fashion8 = new Article(38, "Labial Matte MAC", "Acabado mate, larga duracion, colores vibrantes", "Labial perfecto para resaltar tus labios durante todo el dia", "Moda y Belleza - Maquillaje", "MAC Store", 599.99);
    Article fashion9 = new Article(39, "Cinturon Levi's Clasico", "Piel autentica, hebilla metalica, diseno atemporal", "Cinturon que complementa cualquier atuendo casual o formal", "Moda y Belleza - Accesorios", "Levi's Store", 699.99);
    Article fashion10 = new Article(40, "Camisa Tommy Hilfiger Slim Fit", "100% algodon, corte ajustado, diseno clasico", "Camisa versatil y comoda para eventos casuales o formales", "Moda y Belleza - Ropa", "Tommy Hilfiger Store", 1599.99);
    Article fashion11 = new Article(41, "Base de Maquillaje Estee Lauder", "Cobertura completa, larga duracion, efecto natural", "Base ideal para un acabado perfecto todo el dia", "Moda y Belleza - Maquillaje", "Estee Lauder Store", 1299.99);
    Article fashion12 = new Article(42, "Zapatillas Nike Air Max", "Tecnologia Air, diseno moderno, comodidad superior", "Zapatillas ideales para un look deportivo y urbano", "Moda y Belleza - Calzado", "Nike Store", 2999.99);
    Article fashion13 = new Article(43, "Tratamiento Capilar Olaplex", "Repara y fortalece el cabello, recomendado para cabello dañado", "Tratamiento que restaura la salud y el brillo del cabello", "Moda y Belleza - Cuidado del Cabello", "Olaplex Store", 799.99);
    Article fashion14 = new Article(44, "Sombrero Fedora Unisex", "Material de fieltro, diseno elegante, talla ajustable", "Sombrero perfecto para protegerte del sol con estilo", "Moda y Belleza - Accesorios", "Fedora Store", 499.99);
    Article fashion15 = new Article(45, "Pijama Victoria's Secret", "Seda satinada, diseno comodo, incluye camisa y pantalon", "Pijama elegante y comoda para una noche de descanso", "Moda y Belleza - Ropa", "Victoria's Secret Store", 1299.99);

    public Fashion(){
        articleList3.add(fashion1);
        articleList3.add(fashion2);
        articleList3.add(fashion3);
        articleList3.add(fashion4);
        articleList3.add(fashion5);
        articleList3.add(fashion6);
        articleList3.add(fashion7);
        articleList3.add(fashion8);
        articleList3.add(fashion9);
        articleList3.add(fashion10);
        articleList3.add(fashion11);
        articleList3.add(fashion12);
        articleList3.add(fashion13);
        articleList3.add(fashion14);
        articleList3.add(fashion15);
    }
    public List<Article> getFashionList() {
        return articleList3;
    }
}