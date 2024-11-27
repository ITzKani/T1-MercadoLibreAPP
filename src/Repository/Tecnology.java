package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Tecnology {
    List<Article> articleList8 = new ArrayList<>();
    Article tecnology1 = new Article(106, "Laptop ultraligera", "8GB RAM, 256GB SSD, Intel i5", "Portatil ideal para el trabajo y la universidad", "Computadoras", "TechWorld", 599.99);
    Article tecnology2 = new Article(107, "Auriculares inalambricos", "Bluetooth 5.0, cancelacion de ruido", "Diseno ergonomico con excelente calidad de sonido", "Audio", "SoundPro", 79.99);
    Article tecnology3 = new Article(108, "Smartphone 5G", "128GB almacenamiento, camara 48MP", "Telefono con pantalla AMOLED y bateria de larga duracion", "Telefonos", "MobileHub", 349.99);
    Article tecnology4 = new Article(109, "Reloj inteligente", "Monitoreo de salud, GPS, resistente al agua", "Ideal para seguimiento de actividad fisica", "Wearables", "FitTime", 129.99);
    Article tecnology5 = new Article(110, "Tablet multimedia", "10 pulgadas, 64GB, WiFi", "Perfecta para entretenimiento y tareas escolares", "Tablets", "TechWorld", 199.99);
    Article tecnology6 = new Article(111, "Camara deportiva", "4K UHD, sumergible, WiFi", "Captura cada momento en alta definicion", "Fotografia", "CamZone", 149.99);
    Article tecnology7 = new Article(112, "Consola de videojuegos", "1TB, soporte 4K, mando inalambrico", "Diversion sin limites para toda la familia", "Videojuegos", "GameCentral", 499.99);
    Article tecnology8 = new Article(113, "Monitor gaming", "27 pulgadas, 144Hz, 1ms", "Pantalla de alta resolucion para juegos competitivos", "Accesorios", "VisionTech", 289.99);
    Article tecnology9 = new Article(114, "Teclado mecanico", "RGB, switches personalizables", "Teclado premium para juegos y programacion", "Accesorios", "KeyMasters", 89.99);
    Article tecnology10 = new Article(115, "Cargador inalambrico", "Carga rapida, compatible con Qi", "Cargador compacto y eficiente para dispositivos moviles", "Accesorios", "PowerUp", 29.99);
    Article tecnology11 = new Article(116, "Dron profesional", "Camara 4K, autonomia 30 min", "Explora el mundo desde nuevas perspectivas", "Drones", "SkyView", 799.99);
    Article tecnology12 = new Article(117, "Altavoz inteligente", "Asistente virtual integrado, Bluetooth", "Controla tu hogar inteligente con comandos de voz", "Audio", "SmartSound", 99.99);
    Article tecnology13 = new Article(118, "Disco duro externo", "2TB, USB 3.0, portatil", "Solucion de almacenamiento confiable y compacta", "Almacenamiento", "DataKeep", 69.99);
    Article tecnology14 = new Article(119, "Router WiFi 6", "Dual band, alta velocidad, cobertura amplia", "Conectividad rapida y estable para el hogar", "Redes", "NetSpeed", 149.99);
    Article tecnology15 = new Article(120, "Impresora multifuncion", "Impresion, escaneo, copia, WiFi", "Ideal para uso en oficina o hogar", "Oficina", "PrintMaster", 129.99);

    public Tecnology(){
        articleList8.add(tecnology1);
        articleList8.add(tecnology2);
        articleList8.add(tecnology3);
        articleList8.add(tecnology4);
        articleList8.add(tecnology5);
        articleList8.add(tecnology6);
        articleList8.add(tecnology7);
        articleList8.add(tecnology8);
        articleList8.add(tecnology9);
        articleList8.add(tecnology10);
        articleList8.add(tecnology11);
        articleList8.add(tecnology12);
        articleList8.add(tecnology13);
        articleList8.add(tecnology14);
        articleList8.add(tecnology15);
    }
    public List<Article> getTecnologyList(){
        return articleList8;
    }
}