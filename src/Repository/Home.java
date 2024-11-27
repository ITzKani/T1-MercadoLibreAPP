package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Home {
    List<Article> articleList5 = new ArrayList<>(); // Lista de artículos de la página de inicio
    Article home1 = new Article(61, "Juego de sala moderno", "3 piezas, tapizado de tela, estructura de madera", "Juego de sala comodo y elegante ideal para tu hogar", "Hogar - Muebles", "Muebles Elite", 8999.99);
    Article home2 = new Article(62, "Mesa de comedor rectangular", "Capacidad para 6 personas, madera maciza, acabado natural", "Mesa espaciosa para reuniones familiares o con amigos", "Hogar - Muebles", "DecoCasa", 7499.99);
    Article home3 = new Article(63, "Silla ergonómica para oficina", "Soporte lumbar, altura ajustable, ruedas de nylon", "Silla ideal para largas jornadas de trabajo", "Hogar - Oficina", "OficinaConfort", 2599.99);
    Article home4 = new Article(64, "Colchon matrimonial ortopedico", "Espuma de memoria, soporte firme, tela anti-acaros", "Colchon diseñado para un descanso reparador", "Hogar - Descanso", "Colchones Perfect Dream", 5499.00);
    Article home5 = new Article(65, "Luminaria LED colgante", "Material de aluminio, luz blanca, diseño minimalista", "Luminaria moderna para iluminar cualquier habitacion", "Hogar - Iluminacion", "Luz&Diseno", 2999.99);
    Article home6 = new Article(66, "Cortinas blackout", "Tela de poliester, proteccion UV, color gris", "Cortinas que bloquean la luz para mayor privacidad y confort", "Hogar - Decoracion", "CasaModerna", 1599.99);
    Article home7 = new Article(67, "Espejo decorativo redondo", "Marco de madera, diametro de 80cm, diseño rustico", "Espejo perfecto para salas o recamaras", "Hogar - Decoracion", "DecoHogar", 1999.99);
    Article home8 = new Article(68, "Repisas flotantes de madera", "Set de 3 piezas, acabado natural, capacidad de 10kg", "Repisas funcionales y esteticas para organizar espacios", "Hogar - Organizacion", "HogarPlus", 999.99);
    Article home9 = new Article(69, "Tapete antideslizante", "Material de microfibra, 150x200cm, lavable", "Tapete suave y seguro para uso en salas o recamaras", "Hogar - Alfombras", "Textiles DelHogar", 1299.99);
    Article home10 = new Article(70, "Reloj de pared vintage", "Cuarzo, madera y metal, 40cm de diametro", "Reloj funcional y decorativo para darle estilo a tu hogar", "Hogar - Decoracion", "Tiempo&Estilo", 899.99);
    Article home11 = new Article(71, "Perchero de pie", "Estructura de metal, 8 ganchos, base antideslizante", "Perchero ideal para entradas o recamaras", "Hogar - Organizacion", "OrdenPerfecto", 799.99);
    Article home12 = new Article(72, "Set de vajilla 16 piezas", "Material de ceramica, diseño moderno, apto para microondas", "Vajilla perfecta para cualquier ocasion especial o cotidiana", "Hogar - Cocina", "Vajillas Armonia", 1499.99);
    Article home13 = new Article(73, "Cubrecolchon impermeable", "Material hipoalergenico, ajuste elastico, tamaño king size", "Cubrecolchon que protege y alarga la vida util del colchon", "Hogar - Descanso", "ConfortPleno", 799.99);
    Article home14 = new Article(74, "Humidificador ultrasónico", "Capacidad de 2L, luz nocturna, control de intensidad", "Humidificador que mejora la calidad del aire en tu hogar", "Hogar - Climatizacion", "PureAir", 999.99);
    Article home15 = new Article(75, "Tendedero plegable de acero", "Resistente al oxido, capacidad para 10kg de ropa", "Tendedero funcional para interiores o exteriores", "Hogar - Lavanderia", "EcoHogar", 1199.99);

    public Home(){
        articleList5.add(home1);
        articleList5.add(home2);
        articleList5.add(home3);
        articleList5.add(home4);
        articleList5.add(home5);
        articleList5.add(home6);
        articleList5.add(home7);
        articleList5.add(home8);
        articleList5.add(home9);
        articleList5.add(home10);
        articleList5.add(home11);
        articleList5.add(home12);
        articleList5.add(home13);
        articleList5.add(home14);
        articleList5.add(home15);
    }
    public List<Article> getHomeList() {
        return articleList5;
    }
}