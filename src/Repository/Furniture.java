package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Furniture {

    private List<Article> furnitureList;

    public Furniture() {
        furnitureList = new ArrayList<>();
        furnitureList.add(new Article(76, "Sofa Modular Gris", "Diseno modular, tela resistente, estructura de madera", "Sofa versatil y elegante para cualquier sala", "Muebles - Sala", "Muebles Elite", 8499.99));
        furnitureList.add(new Article(77, "Mesa de Centro de Madera", "Madera de pino, acabado mate, patas de acero", "Mesa funcional y decorativa para salas modernas", "Muebles - Sala", "Casa Moderna", 3499.00));
        furnitureList.add(new Article(78, "Comedor de 6 Sillas", "Mesa rectangular de vidrio templado, sillas tapizadas", "Comedor elegante para reuniones familiares", "Muebles - Comedor", "Hogar y Estilo", 12499.99));
        furnitureList.add(new Article(79, "Cama Queen Size", "Cabecera acolchada, madera maciza, estructura resistente", "Cama comoda y de alta durabilidad", "Muebles - Dormitorio", "Descanso Plus", 10999.99));
        furnitureList.add(new Article(80, "Escritorio Minimalista", "Madera MDF, 2 cajones, estilo compacto", "Escritorio ideal para espacios pequenos", "Muebles - Oficina", "Oficina Pro", 4599.00));
        furnitureList.add(new Article(81, "Estanteria Moderna", "5 niveles, madera industrial, acabado rustico", "Estanteria practica y decorativa para libros y adornos", "Muebles - Almacenamiento", "Rustico Chic", 3299.99));
        furnitureList.add(new Article(82, "Silla Giratoria de Oficina", "Acolchado ergonomico, altura ajustable, base de aluminio", "Silla comoda y profesional para largas jornadas", "Muebles - Oficina", "Comfort Office", 4299.00));
        furnitureList.add(new Article(83, "Armario de Puertas Correderas", "Madera laminada, rieles metalicos, espejos incluidos", "Armario espacioso y moderno para ropa y accesorios", "Muebles - Dormitorio", "Hogar Perfecto", 8799.99));
        furnitureList.add(new Article(84, "Mesa Lateral de Marmol", "Marmol blanco, base de acero dorado, estilo moderno", "Mesa de acento elegante para cualquier habitacion", "Muebles - Sala", "Deco Class", 3999.99));
        furnitureList.add(new Article(85, "Banco de Barra Industrial", "Asiento de madera, estructura de acero, altura ajustable", "Banco funcional para barras y cocinas", "Muebles - Cocina", "Urban Style", 2599.99));
        furnitureList.add(new Article(86, "Tocador con Espejo", "Madera MDF, 4 cajones, espejo con luz LED", "Tocador funcional para maquillaje y organizacion", "Muebles - Dormitorio", "Muebles Femeninos", 5799.99));
        furnitureList.add(new Article(87, "Librero Esquinero", "5 niveles, madera laminada, diseno compacto", "Librero perfecto para maximizar espacios", "Muebles - Almacenamiento", "Decoraciones Compactas", 2999.99));
        furnitureList.add(new Article(88, "Sillon Reclinable", "Tapizado en piel sintetica, mecanismo reclinable manual", "Sillon comodo para descanso y entretenimiento", "Muebles - Sala", "Relax Home", 10999.99));
        furnitureList.add(new Article(89, "Cuna Convertible", "Madera natural, barandas ajustables, diseno evolutivo", "Cuna segura y funcional para bebes en crecimiento", "Muebles - Infantiles", "Bebe Seguro", 7499.00));
        furnitureList.add(new Article(90, "Banqueta Tapizada", "Asiento acolchado, patas de madera, estilo vintage", "Banqueta ideal para entradas o pies de cama", "Muebles - Decoracion", "Hogar Retro", 3299.99));
    }

    public List<Article> getFurnitureList() {
        return furnitureList;
    }
}