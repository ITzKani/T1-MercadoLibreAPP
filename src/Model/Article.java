package Model;

public class Article {

    // * Atributos
    private long id;
    private String title, characteristics, description, category, seller;
    private double price;

    // * Constructor vacío
    public Article() {
    }

    // * Constructor
    public Article(long id, String title, String characteristics, String description, String category, String seller, double price) {
        this.id = id;
        this.title = title;
        this.characteristics = characteristics;
        this.description = description;
        this.category = category;
        this.seller = seller;
        this.price = price;
    }
    
    // * Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
