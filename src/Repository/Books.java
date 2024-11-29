package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Books {

    private List<Article> booksList;

    public Books() {
    booksList = new ArrayList<>();
    booksList.add(new Article(16, "Cien anos de soledad", "Novela epica, narrativa magica, ambientada en Macondo", "Historia de la familia Buendia escrita por Gabriel Garcia Marquez", "Ficcion - Literatura", "Editorial Sudamericana", 299.99));
    booksList.add(new Article(17, "Don Quijote de la Mancha", "Clasico universal, narrativa satirica, aventuras de caballeria", "Obra maestra de Miguel de Cervantes Saavedra", "Ficcion - Clasicos", "Editorial Planeta", 249.99));
    booksList.add(new Article(18, "El Principito", "Filosofia para ninos, ilustraciones originales, narrativa poetica", "Una historia sobre la importancia de la amistad y los valores humanos", "Ficcion - Infantil", "Editorial Salamandra", 199.99));
    booksList.add(new Article(19, "Rayuela", "Novela interactiva, estructura no lineal, narrativa innovadora", "Obra maestra de Julio Cortazar que explora el existencialismo", "Ficcion - Literatura", "Editorial Alfaguara", 349.99));
    booksList.add(new Article(20, "1984", "Distopia politica, vigilancia extrema, control totalitario", "Novela de George Orwell que advierte sobre los peligros del autoritarismo", "Ficcion - Ciencia Ficcion", "Penguin Random House", 269.99));
    booksList.add(new Article(21, "Fahrenheit 451", "Distopia literaria, quema de libros, censura cultural", "Historia de Ray Bradbury sobre la importancia de la libertad intelectual", "Ficcion - Ciencia Ficcion", "Simon & Schuster", 299.99));
    booksList.add(new Article(22, "Los juegos del hambre", "Ficcion distopica, supervivencia juvenil, lucha contra el poder", "Primera entrega de la saga escrita por Suzanne Collins", "Ficcion - Juvenil", "Editorial Molino", 229.99));
    booksList.add(new Article(23, "Orgullo y prejuicio", "Romance clasico, critica social, personajes memorables", "Novela de Jane Austen sobre el amor y las primeras impresiones", "Ficcion - Clasicos", "Editorial Alba", 199.99));
    booksList.add(new Article(24, "La sombra del viento", "Misterio literario, novela historica, ambientada en Barcelona", "Obra de Carlos Ruiz Zafon que inicia la saga del Cementerio de los Libros Olvidados", "Ficcion - Misterio", "Editorial Planeta", 299.99));
    booksList.add(new Article(25, "Harry Potter y la piedra filosofal", "Ficcion magica, escuela de magia, aventuras fantasticas", "Primer libro de la saga creada por J.K. Rowling", "Ficcion - Fantasia", "Editorial Salamandra", 349.99));
    booksList.add(new Article(26, "El codigo Da Vinci", "Misterio, enigmas religiosos, thriller de investigacion", "Exito de ventas de Dan Brown que mezcla arte y conspiraciones", "Ficcion - Thriller", "Editorial Planeta", 279.99));
    booksList.add(new Article(27, "El hombre en busca de sentido", "Psicologia existencial, resiliencia humana, experiencia en campos de concentracion", "Relato de Viktor Frankl sobre la busqueda del proposito en medio del sufrimiento", "No Ficcion - Psicologia", "Editorial Herder", 249.99));
    booksList.add(new Article(28, "Sapiens: De animales a dioses", "Historia de la humanidad, evolucion cultural, analisis cientifico", "Obra de Yuval Noah Harari sobre el impacto del Homo sapiens en el mundo", "No Ficcion - Historia", "Editorial Debate", 399.99));
    booksList.add(new Article(29, "El poder del ahora", "Espiritualidad, mindfulness, vivir el presente", "Libro de Eckhart Tolle sobre la importancia de la conciencia plena", "No Ficcion - Autoayuda", "Editorial Gaia", 219.99));
    booksList.add(new Article(30, "El arte de la guerra", "Estrategia militar, filosofia, aplicacion en negocios", "Texto clasico de Sun Tzu sobre la estrategia y el liderazgo", "No Ficcion - Estrategia", "Editorial Obelisco", 179.99));
    }

    public List<Article> getBooksList() {
        return booksList;
    }
}