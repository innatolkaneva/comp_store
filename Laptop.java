import java.util.List;

public class Laptop {
    private int id;
    private String model;
    private String brand;
    private int ram;
    private String os;
    private double inches;
    private double weight;
    private int price;
    
    public Laptop(int id, String brand, String model,  int ram, String os, double inches, double weight, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.os = os;
        this.inches = inches;
        this.weight = weight;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public double getInches() {
        return inches;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "model: '" + model + '\'' +
                ", brand: '" + brand + '\'' +
                ", ram: " + ram +
                ", os: '" + os + '\'' +
                ", inches: " + inches +
                ", weight: " + String.format("%.2f", weight) +
                ", price: " + price + "p." +
                '}';
    }
}
