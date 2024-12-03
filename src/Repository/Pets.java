package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Pets {

    private List<Article> petsList;

    public Pets() {
        petsList = new ArrayList<>();
        petsList.add(new Article(136, "Comedero Automatico PetSafe", "Capacidad de 5L, programable, facil de limpiar", "Comedero automatico para alimentar a tu mascota a horarios programados", "Accesorios para Mascotas", "PetSafe Store", 2499.99));
        petsList.add(new Article(137, "Rascador para Gatos Catit", "Tamano grande, incluye juguete, diseno estable", "Rascador para gatos ideal para mantener sus unas saludables", "Accesorios para Mascotas", "Catit Oficial", 1299.99));
        petsList.add(new Article(138, "Transportadora Rigida AmazonBasics", "Mediana, resistente, ventilada", "Transportadora ideal para viajes seguros con tu mascota", "Transporte para Mascotas", "AmazonBasics", 899.99));
        petsList.add(new Article(139, "Collar Antipulgas Seresto", "Hasta 8 meses de proteccion, resistente al agua", "Collar antipulgas efectivo para perros de todas las edades", "Cuidado de Mascotas", "Seresto Oficial", 799.99));
        petsList.add(new Article(140, "Fuente de Agua PetKit Eversweet", "1.8L, silenciosa, filtro de carbon", "Fuente de agua para mantener a tu mascota hidratada", "Accesorios para Mascotas", "PetKit Store", 1599.99));
        petsList.add(new Article(141, "Cama Ortopedica para Perros", "Tamano grande, espuma de memoria, funda desmontable", "Cama comoda y duradera para perros de razas grandes", "Muebles para Mascotas", "Petsy Oficial", 1899.99));
        petsList.add(new Article(142, "Cepillo Quitapelos FURminator", "Para perros de pelo corto, diseno ergonomico", "Cepillo que elimina el pelo muerto y reduce el desprendimiento", "Cuidado de Mascotas", "FURminator", 599.99));
        petsList.add(new Article(143, "Kit de Juguetes Kong", "Incluye pelota, cuerda y dispensador de premios", "Juguetes interactivos para mantener a tu perro entretenido", "Juguetes para Mascotas", "Kong Store", 999.99));
        petsList.add(new Article(144, "Jaula para Aves Yaheetech", "De acero, incluye accesorios, diseno espacioso", "Jaula segura y amplia para aves pequenas y medianas", "Muebles para Mascotas", "Yaheetech", 2199.99));
        petsList.add(new Article(145, "Arena Sanitaria para Gatos", "25kg, aglomerante, control de olores", "Arena de alta calidad para mantener limpio el arenero", "Higiene para Mascotas", "PetLovers", 499.99));
        petsList.add(new Article(146, "Abrigo para Perros Frisco", "Resistente al agua, ajustable, varios tamanos", "Abrigo para mantener a tu perro abrigado en climas frios", "Ropa para Mascotas", "Frisco Store", 699.99));
        petsList.add(new Article(147, "Correa Retractil Flexi", "Hasta 5m de longitud, para perros medianos", "Correa retractil duradera y facil de usar", "Accesorios para Mascotas", "Flexi Oficial", 799.99));
        petsList.add(new Article(148, "Snacks para Perros Pedigree", "Ricos en proteina, sabor carne, paquete de 15", "Snacks nutritivos y deliciosos para perros de todas las edades", "Alimento para Mascotas", "Pedigree Store", 299.99));
        petsList.add(new Article(149, "Lampara para Tortugas Zoo Med", "UVB y calor, compatible con varios terrarios", "Lampara ideal para mantener a tus tortugas saludables", "Accesorios para Reptiles", "Zoo Med", 1399.99));
        petsList.add(new Article(150, "Cortauñas para Perros y Gatos", "Mango ergonomico, seguro, facil de usar", "Cortauñas para mantener las garras de tu mascota en buen estado", "Cuidado de Mascotas", "PetCare Tools", 399.99));
    }

    public List<Article> getPetsList() {
        return petsList;
    }
}