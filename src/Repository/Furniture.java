package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Furniture {
    List<Article> articleList4 = new ArrayList<>();
    Article forniture1 = new Article(46, "Sofa Modular Gris", "Diseno modular, tela resistente, estructura de madera", "Sofa versatil y elegante para cualquier sala", "Muebles - Sala", "Muebles Elite", 8499.99);
    Article forniture2 = new Article(47, "Mesa de Centro de Madera", "Madera de pino, acabado mate, patas de acero", "Mesa funcional y decorativa para salas modernas", "Muebles - Sala", "Casa Moderna", 3499.00);
    Article forniture3 = new Article(48, "Comedor de 6 Sillas", "Mesa rectangular de vidrio templado, sillas tapizadas", "Comedor elegante para reuniones familiares", "Muebles - Comedor", "Hogar y Estilo", 12499.99);
    Article forniture4 = new Article(49, "Cama Queen Size", "Cabecera acolchada, madera maciza, estructura resistente", "Cama comoda y de alta durabilidad", "Muebles - Dormitorio", "Descanso Plus", 10999.99);
    Article forniture5 = new Article(50, "Escritorio Minimalista", "Madera MDF, 2 cajones, estilo compacto", "Escritorio ideal para espacios pequenos", "Muebles - Oficina", "Oficina Pro", 4599.00);
    Article forniture6 = new Article(51, "Estanteria Moderna", "5 niveles, madera industrial, acabado rustico", "Estanteria practica y decorativa para libros y adornos", "Muebles - Almacenamiento", "Rustico Chic", 3299.99);
    Article forniture7 = new Article(52, "Silla Giratoria de Oficina", "Acolchado ergonomico, altura ajustable, base de aluminio", "Silla comoda y profesional para largas jornadas", "Muebles - Oficina", "Comfort Office", 4299.00);
    Article forniture8 = new Article(53, "Armario de Puertas Correderas", "Madera laminada, rieles metalicos, espejos incluidos", "Armario espacioso y moderno para ropa y accesorios", "Muebles - Dormitorio", "Hogar Perfecto", 8799.99);
    Article forniture9 = new Article(54, "Mesa Lateral de Marmol", "Marmol blanco, base de acero dorado, estilo moderno", "Mesa de acento elegante para cualquier habitacion", "Muebles - Sala", "Deco Class", 3999.99);
    Article forniture10 = new Article(55, "Banco de Barra Industrial", "Asiento de madera, estructura de acero, altura ajustable", "Banco funcional para barras y cocinas", "Muebles - Cocina", "Urban Style", 2599.99);
    Article forniture11 = new Article(56, "Tocador con Espejo", "Madera MDF, 4 cajones, espejo con luz LED", "Tocador funcional para maquillaje y organizacion", "Muebles - Dormitorio", "Muebles Femeninos", 5799.99);
    Article forniture12 = new Article(57, "Librero Esquinero", "5 niveles, madera laminada, diseno compacto", "Librero perfecto para maximizar espacios", "Muebles - Almacenamiento", "Decoraciones Compactas", 2999.99);
    Article forniture13 = new Article(58, "Sillon Reclinable", "Tapizado en piel sintetica, mecanismo reclinable manual", "Sillon comodo para descanso y entretenimiento", "Muebles - Sala", "Relax Home", 10999.99);
    Article forniture14 = new Article(59, "Cuna Convertible", "Madera natural, barandas ajustables, diseno evolutivo", "Cuna segura y funcional para bebes en crecimiento", "Muebles - Infantiles", "Bebe Seguro", 7499.00);
    Article forniture15 = new Article(60, "Banqueta Tapizada", "Asiento acolchado, patas de madera, estilo vintage", "Banqueta ideal para entradas o pies de cama", "Muebles - Decoracion", "Hogar Retro", 3299.99);
    

    public Furniture(){
        articleList4.add(forniture1);
        articleList4.add(forniture2);
        articleList4.add(forniture3);
        articleList4.add(forniture4);
        articleList4.add(forniture5);
        articleList4.add(forniture6);
        articleList4.add(forniture7);
        articleList4.add(forniture8);
        articleList4.add(forniture9);
        articleList4.add(forniture10);
        articleList4.add(forniture11);
        articleList4.add(forniture12);
        articleList4.add(forniture13);
        articleList4.add(forniture14);
        articleList4.add(forniture15);
    }
    public List<Article> getFornitureList() {
        return articleList4;
    }
}