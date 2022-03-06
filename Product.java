import java.util.concurrent.ThreadLocalRandom;

public class Product {
    private final int id; // Only allow id to be initialized once
    private String name;
    private double price;

    public Product(String name, double price) {
        // Generate random id
        this.id = ThreadLocalRandom.current().nextInt(0, 999);
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
