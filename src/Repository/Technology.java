package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Technology {

    private List<Article> technologyList;

    public Technology() {
        technologyList = new ArrayList<>();
        technologyList.add(new Article(166, "Laptop ultraligera", "8GB RAM, 256GB SSD, Intel i5", "Portatil ideal para el trabajo y la universidad", "Computadoras", "TechWorld", 10999.00));
        technologyList.add(new Article(167, "Auriculares inalambricos", "Bluetooth 5.0, cancelacion de ruido", "Diseno ergonomico con excelente calidad de sonido", "Audio", "SoundPro", 1499.00));
        technologyList.add(new Article(168, "Smartphone 5G", "128GB almacenamiento, camara 48MP", "Telefono con pantalla AMOLED y bateria de larga duracion", "Telefonos", "MobileHub", 6499.00));
        technologyList.add(new Article(169, "Reloj inteligente", "Monitoreo de salud, GPS, resistente al agua", "Ideal para seguimiento de actividad fisica", "Wearables", "FitTime", 2499.00));
        technologyList.add(new Article(170, "Tablet multimedia", "10 pulgadas, 64GB, WiFi", "Perfecta para entretenimiento y tareas escolares", "Tablets", "TechWorld", 3699.00));
        technologyList.add(new Article(171, "Camara deportiva", "4K UHD, sumergible, WiFi", "Captura cada momento en alta definicion", "Fotografia", "CamZone", 2799.00));
        technologyList.add(new Article(172, "Consola de videojuegos", "1TB, soporte 4K, mando inalambrico", "Diversion sin limites para toda la familia", "Videojuegos", "GameCentral", 9499.00));
        technologyList.add(new Article(173, "Monitor gaming", "27 pulgadas, 144Hz, 1ms", "Pantalla de alta resolucion para juegos competitivos", "Accesorios", "VisionTech", 5499.00));
        technologyList.add(new Article(174, "Teclado mecanico", "RGB, switches personalizables", "Teclado premium para juegos y programacion", "Accesorios", "KeyMasters", 1699.00));
        technologyList.add(new Article(175, "Cargador inalambrico", "Carga rapida, compatible con Qi", "Cargador compacto y eficiente para dispositivos moviles", "Accesorios", "PowerUp", 549.00));
        technologyList.add(new Article(176, "Dron profesional", "Camara 4K, autonomia 30 min", "Explora el mundo desde nuevas perspectivas", "Drones", "SkyView", 14999.00));
        technologyList.add(new Article(177, "Altavoz inteligente", "Asistente virtual integrado, Bluetooth", "Controla tu hogar inteligente con comandos de voz", "Audio", "SmartSound", 1899.00));
        technologyList.add(new Article(178, "Disco duro externo", "2TB, USB 3.0, portatil", "Solucion de almacenamiento confiable y compacta", "Almacenamiento", "DataKeep", 1299.00));
        technologyList.add(new Article(179, "Router WiFi 6", "Dual band, alta velocidad, cobertura amplia", "Conectividad rapida y estable para el hogar", "Redes", "NetSpeed", 2799.00));
        technologyList.add(new Article(180, "Impresora multifuncion", "Impresion, escaneo, copia, WiFi", "Ideal para uso en oficina o hogar", "Oficina", "PrintMaster", 2499.00));
    }

    public List<Article> getTechnologyList() {
        return technologyList;
    }
}