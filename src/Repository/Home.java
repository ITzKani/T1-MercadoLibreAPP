package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Article;

public class Home {

    private List<Article> homeList;

    public Home() {
        homeList = new ArrayList<>();
        homeList.add(new Article(91, "Juego de sala moderno", "3 piezas, tapizado de tela, estructura de madera", "Juego de sala comodo y elegante ideal para tu hogar", "Hogar - Muebles", "Muebles Elite", 8999.99));
        homeList.add(new Article(92, "Mesa de comedor rectangular", "Capacidad para 6 personas, madera maciza, acabado natural", "Mesa espaciosa para reuniones familiares o con amigos", "Hogar - Muebles", "DecoCasa", 7499.99));
        homeList.add(new Article(93, "Silla ergonomica para oficina", "Soporte lumbar, altura ajustable, ruedas de nylon", "Silla ideal para largas jornadas de trabajo", "Hogar - Oficina", "OficinaConfort", 2599.99));
        homeList.add(new Article(94, "Colchon matrimonial ortopedico", "Espuma de memoria, soporte firme, tela anti-acaros", "Colchon disenado para un descanso reparador", "Hogar - Descanso", "Colchones Perfect Dream", 5499.00));
        homeList.add(new Article(95, "Luminaria LED colgante", "Material de aluminio, luz blanca, diseno minimalista", "Luminaria moderna para iluminar cualquier habitacion", "Hogar - Iluminacion", "Luz&Diseno", 2999.99));
        homeList.add(new Article(96, "Cortinas blackout", "Tela de poliester, proteccion UV, color gris", "Cortinas que bloquean la luz para mayor privacidad y confort", "Hogar - Decoracion", "CasaModerna", 1599.99));
        homeList.add(new Article(97, "Espejo decorativo redondo", "Marco de madera, diametro de 80cm, diseno rustico", "Espejo perfecto para salas o recamaras", "Hogar - Decoracion", "DecoHogar", 1999.99));
        homeList.add(new Article(98, "Repisas flotantes de madera", "Set de 3 piezas, acabado natural, capacidad de 10kg", "Repisas funcionales y esteticas para organizar espacios", "Hogar - Organizacion", "HogarPlus", 999.99));
        homeList.add(new Article(99, "Tapete antideslizante", "Material de microfibra, 150x200cm, lavable", "Tapete suave y seguro para uso en salas o recamaras", "Hogar - Alfombras", "Textiles DelHogar", 1299.99));
        homeList.add(new Article(100, "Reloj de pared vintage", "Cuarzo, madera y metal, 40cm de diametro", "Reloj funcional y decorativo para darle estilo a tu hogar", "Hogar - Decoracion", "Tiempo&Estilo", 899.99));
        homeList.add(new Article(101, "Perchero de pie", "Estructura de metal, 8 ganchos, base antideslizante", "Perchero ideal para entradas o recamaras", "Hogar - Organizacion", "OrdenPerfecto", 799.99));
        homeList.add(new Article(102, "Set de vajilla 16 piezas", "Material de ceramica, diseno moderno, apto para microondas", "Vajilla perfecta para cualquier ocasion especial o cotidiana", "Hogar - Cocina", "Vajillas Armonia", 1499.99));
        homeList.add(new Article(103, "Cubrecolchon impermeable", "Material hipoalergenico, ajuste elastico, tamano king size", "Cubrecolchon que protege y alarga la vida util del colchon", "Hogar - Descanso", "ConfortPleno", 799.99));
        homeList.add(new Article(104, "Humidificador ultrasonico", "Capacidad de 2L, luz nocturna, control de intensidad", "Humidificador que mejora la calidad del aire en tu hogar", "Hogar - Climatizacion", "PureAir", 999.99));
        homeList.add(new Article(105, "Tendedero plegable de acero", "Resistente al oxido, capacidad para 10kg de ropa", "Tendedero funcional para interiores o exteriores", "Hogar - Lavanderia", "EcoHogar", 1199.99));
    }
    public List<Article> getHomeList() {
        return homeList;
    }
}