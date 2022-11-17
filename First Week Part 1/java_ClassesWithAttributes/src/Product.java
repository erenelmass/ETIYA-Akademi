public class Product {

    public Product(int id, String name, String description, double price, String kod, int stock){
        System.out.println("Yapıcı Blok");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.kod = kod;
        this.stock = stock;
    }
    public Product(){

    }
    // attribute | field
    private int  id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}
