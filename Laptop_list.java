import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Laptop_list {
    public static List <Laptop> laptopCreate(){
        String [] brands = {"Asus", "Lenovo", "MSI", "Huawei", "LG"};
        String [] models = {"104A", "201S", "123Y", "295G", "234F"};
        int [] rams = {2, 4, 6, 8, 12, 16, 24, 32, 64};
        String [] oses = {"Windows10", "Windows12", "без ос", "Linux"};
        double [] inches = {12.6, 10.1, 14.0, 13.6, 14.2, 15.0, 15.6};
        List <Laptop> laptops = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 30; i++) {
            int id = i;
            String brand = brands[rd.nextInt(models.length)];
            String model = models[rd.nextInt(models.length)];
            int ram = rams[rd.nextInt(rams.length)];
            String os = oses[rd.nextInt(oses.length)];
            double inch = inches[rd.nextInt(inches.length)];
            double weight = rd.nextDouble(1.2, 3.9);
            int price = rd.nextInt(35000, 110000);
            laptops.add(new Laptop(id, brand, model, ram, os, inch, weight, price));
            }
        return laptops;
        }

    }
