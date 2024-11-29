package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Music {

    private List<Article> musicList;

    public Music() {
        musicList = new ArrayList<>();
        musicList.add(new Article(121, "Guitarra Acustica Yamaha", "Cuerdas de acero, madera de alta calidad", "Guitarra ideal para principiantes y profesionales", "Instrumentos Musicales", "Musica Total", 3999.00));
        musicList.add(new Article(122, "Piano Digital Casio", "88 teclas, conectividad MIDI", "Piano compacto con sonidos de alta calidad", "Instrumentos Musicales", "Melodias Plus", 8999.00));
        musicList.add(new Article(123, "Bateria Electronica Roland", "5 pads, conectividad Bluetooth", "Ideal para practicar en casa sin ruido", "Instrumentos Musicales", "Drum Studio", 16999.00));
        musicList.add(new Article(124, "Microfono Condensador Samson", "Alta sensibilidad, conector USB", "Perfecto para grabaciones y streaming", "Accesorios de Musica", "Audio Pro", 2499.00));
        musicList.add(new Article(125, "Teclado MIDI AKAI", "32 teclas, pads iluminados", "Herramienta ideal para compositores y DJs", "Accesorios de Musica", "Studio Beats", 3399.00));
        musicList.add(new Article(126, "Amplificador Fender Mustang", "20W, conectividad Bluetooth", "Amplificador versatil con efectos integrados", "Accesorios de Musica", "Musica Express", 5999.00));
        musicList.add(new Article(127, "Violin 4/4 Cremona", "Cuerpo de arce, cuerdas de alta tension", "Perfecto para estudiantes y musicos avanzados", "Instrumentos Musicales", "Armonias Clasicas", 5199.00));
        musicList.add(new Article(128, "Bajo Electrico Ibanez", "4 cuerdas, pastillas activas", "Sonido potente y versatil para todos los estilos", "Instrumentos Musicales", "Bass Center", 7999.00));
        musicList.add(new Article(129, "Flauta Yamaha YFL", "Construccion de niquel plateado", "Excelente calidad de sonido y durabilidad", "Instrumentos Musicales", "Musica de Viento", 10499.00));
        musicList.add(new Article(130, "Ukelele Soprano Kala", "Madera de caoba, cuerdas de nylon", "Instrumento portatil y facil de tocar", "Instrumentos Musicales", "Tonos y Melodias", 1699.00));
        musicList.add(new Article(131, "Guitarra Electrica Epiphone", "Cuerpo solido, pastillas humbucker", "Sonido clasico para rock y blues", "Instrumentos Musicales", "Ritmo Rock", 9999.00));
        musicList.add(new Article(132, "Trompeta Yamaha", "Acabado lacado, boquilla incluida", "Sonido claro y potente para cualquier nivel", "Instrumentos Musicales", "Brass Music", 12499.00));
        musicList.add(new Article(133, "Pedal de Efectos Boss", "Distorsion, reverb y delay", "Crea sonidos unicos con facilidad", "Accesorios de Musica", "FX Pro", 2499.00));
        musicList.add(new Article(134, "Cajon Flamenco Meinl", "Madera de abedul, ajuste de graves", "Instrumento de percusion versatil y compacto", "Instrumentos Musicales", "Ritmos Latinos", 3299.00));
        musicList.add(new Article(135, "Auriculares de Estudio Audio-Technica", "Sonido profesional, diseno cerrado", "Ideales para produccion musical y grabaciones", "Accesorios de Musica", "Sonido Perfecto", 4599.00));
    }

    public List<Article> getMusicList() {
        return musicList;
    }
}