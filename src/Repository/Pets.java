package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Pets {
    List<Article> articleList6 = new ArrayList<>();
    Article pets1 = new Article(76, "Comedero Automatico PetSafe", "Capacidad de 5L, programable, facil de limpiar", "Comedero automatico para alimentar a tu mascota a horarios programados", "Accesorios para Mascotas", "PetSafe Store", 2499.99);
    Article pets2 = new Article(77, "Rascador para Gatos Catit", "Tamaño grande, incluye juguete, diseño estable", "Rascador para gatos ideal para mantener sus uñas saludables", "Accesorios para Mascotas", "Catit Oficial", 1299.99);
    Article pets3 = new Article(78, "Transportadora Rigida AmazonBasics", "Mediana, resistente, ventilada", "Transportadora ideal para viajes seguros con tu mascota", "Transporte para Mascotas", "AmazonBasics", 899.99);
    Article pets4 = new Article(79, "Collar Antipulgas Seresto", "Hasta 8 meses de proteccion, resistente al agua", "Collar antipulgas efectivo para perros de todas las edades", "Cuidado de Mascotas", "Seresto Oficial", 799.99);
    Article pets5 = new Article(80, "Fuente de Agua PetKit Eversweet", "1.8L, silenciosa, filtro de carbon", "Fuente de agua para mantener a tu mascota hidratada", "Accesorios para Mascotas", "PetKit Store", 1599.99);
    Article pets6 = new Article(81, "Cama Ortopedica para Perros", "Tamaño grande, espuma de memoria, funda desmontable", "Cama comoda y duradera para perros de razas grandes", "Muebles para Mascotas", "Petsy Oficial", 1899.99);
    Article pets7 = new Article(82, "Cepillo Quitapelos FURminator", "Para perros de pelo corto, diseño ergonomico", "Cepillo que elimina el pelo muerto y reduce el desprendimiento", "Cuidado de Mascotas", "FURminator", 599.99);
    Article pets8 = new Article(83, "Kit de Juguetes Kong", "Incluye pelota, cuerda y dispensador de premios", "Juguetes interactivos para mantener a tu perro entretenido", "Juguetes para Mascotas", "Kong Store", 999.99);
    Article pets9 = new Article(84, "Jaula para Aves Yaheetech", "De acero, incluye accesorios, diseño espacioso", "Jaula segura y amplia para aves pequeñas y medianas", "Muebles para Mascotas", "Yaheetech", 2199.99);
    Article pets10 = new Article(85, "Arena Sanitaria para Gatos", "25kg, aglomerante, control de olores", "Arena de alta calidad para mantener limpio el arenero", "Higiene para Mascotas", "PetLovers", 499.99);
    Article pets11 = new Article(86, "Abrigo para Perros Frisco", "Resistente al agua, ajustable, varios tamaños", "Abrigo para mantener a tu perro abrigado en climas frios", "Ropa para Mascotas", "Frisco Store", 699.99);
    Article pets12 = new Article(87, "Correa Retractil Flexi", "Hasta 5m de longitud, para perros medianos", "Correa retractil duradera y facil de usar", "Accesorios para Mascotas", "Flexi Oficial", 799.99);
    Article pets13 = new Article(88, "Snacks para Perros Pedigree", "Ricos en proteina, sabor carne, paquete de 15", "Snacks nutritivos y deliciosos para perros de todas las edades", "Alimento para Mascotas", "Pedigree Store", 299.99);
    Article pets14 = new Article(89, "Lampara para Tortugas Zoo Med", "UVB y calor, compatible con varios terrarios", "Lampara ideal para mantener a tus tortugas saludables", "Accesorios para Reptiles", "Zoo Med", 1399.99);
    Article pets15 = new Article(90, "Cortauñas para Perros y Gatos", "Mango ergonomico, seguro, facil de usar", "Cortauñas para mantener las garras de tu mascota en buen estado", "Cuidado de Mascotas", "PetCare Tools", 399.99);

    public Pets(){
        articleList6.add(pets1);
        articleList6.add(pets2);
        articleList6.add(pets3);
        articleList6.add(pets4);
        articleList6.add(pets5);
        articleList6.add(pets6);
        articleList6.add(pets7);
        articleList6.add(pets8);
        articleList6.add(pets9);
        articleList6.add(pets10);
        articleList6.add(pets11);
        articleList6.add(pets12);
        articleList6.add(pets13);
        articleList6.add(pets14);
        articleList6.add(pets15);
    }
    public List<Article> getPetsList(){
        return articleList6;
    }
}