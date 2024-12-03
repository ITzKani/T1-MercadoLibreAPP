package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Fashion {

    private List<Article> fashionList;

    public Fashion() {
        fashionList = new ArrayList<>();
        fashionList.add(new Article(61, "Perfume Calvin Klein Eternity", "Fragancia floral, duracion prolongada, presentacion de 100ml", "Perfume elegante y atemporal para uso diario o especial", "Moda y Belleza - Perfumeria", "Calvin Klein Store", 1499.99));
        fashionList.add(new Article(62, "Reloj Casio G-Shock", "Resistente al agua, cronometro, alarma diaria", "Reloj deportivo y duradero ideal para cualquier actividad", "Moda y Belleza - Accesorios", "Casio Store", 2299.99));
        fashionList.add(new Article(63, "Paleta de Sombras Urban Decay", "12 tonos neutros, acabado mate y brillante, larga duracion", "Paleta versatil para looks naturales y sofisticados", "Moda y Belleza - Maquillaje", "Urban Decay Store", 999.99));
        fashionList.add(new Article(64, "Bolso Michael Kors Jet Set", "Material sintetico, diseno elegante, compartimentos multiples", "Bolso ideal para llevar todo lo esencial con estilo", "Moda y Belleza - Bolsos", "Michael Kors Store", 2999.99));
        fashionList.add(new Article(65, "Crema Hidratante Neutrogena", "Con acido hialuronico, ligera, no grasa", "Crema hidratante que mantiene la piel suave y radiante", "Moda y Belleza - Cuidado de la Piel", "Neutrogena Store", 399.99));
        fashionList.add(new Article(66, "Tenis Adidas Ultraboost", "Amortiguacion Boost, diseno ligero, colores modernos", "Tenis ideales para correr o uso casual con comodidad", "Moda y Belleza - Calzado", "Adidas Store", 3299.99));
        fashionList.add(new Article(67, "Gafas de Sol Ray-Ban Aviador", "Cristales polarizados, marco de metal, proteccion UV", "Gafas clasicas que combinan estilo y funcionalidad", "Moda y Belleza - Accesorios", "Ray-Ban Store", 2499.99));
        fashionList.add(new Article(68, "Labial Matte MAC", "Acabado mate, larga duracion, colores vibrantes", "Labial perfecto para resaltar tus labios durante todo el dia", "Moda y Belleza - Maquillaje", "MAC Store", 599.99));
        fashionList.add(new Article(69, "Cinturon Levi's Clasico", "Piel autentica, hebilla metalica, diseno atemporal", "Cinturon que complementa cualquier atuendo casual o formal", "Moda y Belleza - Accesorios", "Levi's Store", 699.99));
        fashionList.add(new Article(70, "Camisa Tommy Hilfiger Slim Fit", "100% algodon, corte ajustado, diseno clasico", "Camisa versatil y comoda para eventos casuales o formales", "Moda y Belleza - Ropa", "Tommy Hilfiger Store", 1599.99));
        fashionList.add(new Article(71, "Base de Maquillaje Estee Lauder", "Cobertura completa, larga duracion, efecto natural", "Base ideal para un acabado perfecto todo el dia", "Moda y Belleza - Maquillaje", "Estee Lauder Store", 1299.99));
        fashionList.add(new Article(72, "Zapatillas Nike Air Max", "Tecnologia Air, diseno moderno, comodidad superior", "Zapatillas ideales para un look deportivo y urbano", "Moda y Belleza - Calzado", "Nike Store", 2999.99));
        fashionList.add(new Article(73, "Tratamiento Capilar Olaplex", "Repara y fortalece el cabello, recomendado para cabello danado", "Tratamiento que restaura la salud y el brillo del cabello", "Moda y Belleza - Cuidado del Cabello", "Olaplex Store", 799.99));
        fashionList.add(new Article(74, "Sombrero Fedora Unisex", "Material de fieltro, diseno elegante, talla ajustable", "Sombrero perfecto para protegerte del sol con estilo", "Moda y Belleza - Accesorios", "Fedora Store", 499.99));
        fashionList.add(new Article(75, "Pijama Victoria's Secret", "Seda satinada, diseno comodo, incluye camisa y pantalon", "Pijama elegante y comoda para una noche de descanso", "Moda y Belleza - Ropa", "Victoria's Secret Store", 1299.99));
    }

    public List<Article> getFashionList() {
        return fashionList;
    }
}