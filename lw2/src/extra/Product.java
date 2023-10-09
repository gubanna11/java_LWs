package extra;

public class Product {
    private String name;
    private double price;
    private String description;

    public Product(){
        this.name = "";
        this.price = 0;
        this.description = "";
    }

    public Product(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Price: " + price + " Description: " + description;
    }

    public static void main(String[] args) {
        Product product = new Product("name", 25.5, "desc");
        System.out.println(product);
    }
}
