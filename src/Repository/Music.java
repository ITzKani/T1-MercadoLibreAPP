package Repository;
import java.util.ArrayList;
import java.util.List;
import Model.Article;

public class Music {
    List <Article> musicList = new ArrayList<>();

    Article music1 = new Article(181, "Guitarra Acustica Yamaha", "Cuerdas de acero, madera de alta calidad", "Guitarra ideal para principiantes y profesionales", "Instrumentos Musicales", "Musica Total", 3999.00);
    Article music2 = new Article(182, "Piano Digital Casio", "88 teclas, conectividad MIDI", "Piano compacto con sonidos de alta calidad", "Instrumentos Musicales", "Melodias Plus", 8999.00);
    Article music3 = new Article(183, "Bateria Electronica Roland", "5 pads, conectividad Bluetooth", "Ideal para practicar en casa sin ruido", "Instrumentos Musicales", "Drum Studio", 16999.00);
    Article music4 = new Article(184, "Microfono Condensador Samson", "Alta sensibilidad, conector USB", "Perfecto para grabaciones y streaming", "Accesorios de Musica", "Audio Pro", 2499.00);
    Article music5 = new Article(185, "Teclado MIDI AKAI", "32 teclas, pads iluminados", "Herramienta ideal para compositores y DJs", "Accesorios de Musica", "Studio Beats", 3399.00);
    Article music6 = new Article(186, "Amplificador Fender Mustang", "20W, conectividad Bluetooth", "Amplificador versatil con efectos integrados", "Accesorios de Musica", "Musica Express", 5999.00);
    Article music7 = new Article(187, "Violin 4/4 Cremona", "Cuerpo de arce, cuerdas de alta tension", "Perfecto para estudiantes y musicos avanzados", "Instrumentos Musicales", "Armonias Clasicas", 5199.00);
    Article music8 = new Article(188, "Bajo Electrico Ibanez", "4 cuerdas, pastillas activas", "Sonido potente y versatil para todos los estilos", "Instrumentos Musicales", "Bass Center", 7999.00);
    Article music9 = new Article(189, "Flauta Yamaha YFL", "Construccion de niquel plateado", "Excelente calidad de sonido y durabilidad", "Instrumentos Musicales", "Musica de Viento", 10499.00);
    Article music10 = new Article(190, "Ukelele Soprano Kala", "Madera de caoba, cuerdas de nylon", "Instrumento portatil y facil de tocar", "Instrumentos Musicales", "Tonos y Melodias", 1699.00);
    Article music11 = new Article(191, "Guitarra Electrica Epiphone", "Cuerpo solido, pastillas humbucker", "Sonido clasico para rock y blues", "Instrumentos Musicales", "Ritmo Rock", 9999.00);
    Article music12 = new Article(192, "Trompeta Yamaha", "Acabado lacado, boquilla incluida", "Sonido claro y potente para cualquier nivel", "Instrumentos Musicales", "Brass Music", 12499.00);
    Article music13 = new Article(193, "Pedal de Efectos Boss", "Distorsion, reverb y delay", "Crea sonidos unicos con facilidad", "Accesorios de Musica", "FX Pro", 2499.00);
    Article music14 = new Article(194, "Cajon Flamenco Meinl", "Madera de abedul, ajuste de graves", "Instrumento de percusion versatil y compacto", "Instrumentos Musicales", "Ritmos Latinos", 3299.00);
    Article music15 = new Article(195, "Auriculares de Estudio Audio-Technica", "Sonido profesional, diseno cerrado", "Ideales para produccion musical y grabaciones", "Accesorios de Musica", "Sonido Perfecto", 4599.00);
    
    public Music(){
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        musicList.add(music4);
        musicList.add(music5);
        musicList.add(music6);
        musicList.add(music7);
        musicList.add(music8);
        musicList.add(music9);
        musicList.add(music10);
        musicList.add(music11);
        musicList.add(music12);
        musicList.add(music13);
        musicList.add(music14);
        musicList.add(music15);

    }
    public List<Article> getMusicList(){
        return musicList;
    }
}