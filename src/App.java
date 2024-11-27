import Repository.Appliances;

public class App {
    public static void main(String[] args) throws Exception {

        Appliances appliances = new Appliances();
        appliances.getArticleList().forEach(article -> {
            System.out.println(article.getId());
        });
    }
}
    