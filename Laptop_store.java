import java.util.*;

public class Laptop_store {
    List<Laptop> store;
    Scanner sc;
    Map<String, Object> filters;

    public Laptop_store() {
        store = new ArrayList<>(Laptop_list.laptopCreate());
    }

    public void getAll() {
        for (Laptop laptop : store) {
            System.out.println(laptop);
            System.out.println("-".repeat(80));

        }
    }

    public void filter(){
        sc = new Scanner(System.in);
        filters = new HashMap<>();
        List <Laptop> filteredList;
        String answer;
        do {
            System.out.println("Выбери фильтр");
            System.out.println("1 - Бренд\n 2 - ОС\n 3 - Ram\n 4 - Диагональ\n 5 - " +
                    "Вес\n 6 - Цена\n 7 - Сбросить все фильтры\n 0 -Выход\n");
            answer = sc.next();
            switch (answer){
                case ("1"):
                    System.out.println("ВЫбери бренд: \"Asus\", \"Lenovo\", \"MSI\", \"Huawei\", \"LG\"");
                    filters.put("brand", sc.next());
                    break;
                case ("2"):
                System.out.println("ВЫбери OS: \"Windows10\", \"Windows12\", \"без ос\", \"Linux\"");
                filters.put("os", sc.next());
                break;
                case ("3"):
                System.out.println("Выбери минимальный Ram 2, 4, 6, 8, 12, 16, 24, 32, 64");
                filters.put("ram", sc.nextInt());
                break;
                case ("4"):
                System.out.println("Выбери минимальную диагональ: 12.6, 10.1, 14.0, 13.6, 14.2, 15.0, 15.6");
                filters.put("inches", sc.nextDouble());
                break;
                case ("5"):
                System.out.println("ВЫбери максимальный вес");
                filters.put("weight", sc.nextDouble());
                break;
                case ("6"):
                System.out.println("ВЫбери максимальную цену");
                filters.put("price", sc.nextInt());
                break;
                case ("7"):
                getAll();
                filters = new HashMap<>();
                break;
            }
            filteredList = getFilterLaptop(store);
            System.out.println("Осталось " + filteredList.size() + " подходящих моделей");
            for (Laptop laptop : filteredList) {
                System.out.println(laptop);
                System.out.println('-'*80);

            }
        }
        while (!"0".equals(answer));
    }
    public List <Laptop> getFilterLaptop(List<Laptop> store) {

        Set <Integer> filterOfLaptop = new HashSet<>();
        for (Laptop laptop : store) {
            if(filters.containsKey("brand") && !(laptop.getBrand().equals(filters.get("brand")))){
                filterOfLaptop.add(laptop.getId());
            }
            if(filters.containsKey("os") && !(laptop.getOs().equals(filters.get("os")))){
                filterOfLaptop.add(laptop.getId());
            }
            if(filters.containsKey("ram") && laptop.getRam() < (int)filters.get("ram")){
                filterOfLaptop.add(laptop.getId());
            }
            if(filters.containsKey("inches") && laptop.getInches() < (double)filters.get("inches")){
                filterOfLaptop.add(laptop.getId());
            }
            if(filters.containsKey("weight") && laptop.getWeight() > (double)filters.get("weight")){
                filterOfLaptop.add(laptop.getId());
            }
            if(filters.containsKey("price") && laptop.getPrice() > (int)filters.get("price")){
                filterOfLaptop.add(laptop.getId());
            }
        }
    List <Laptop> filteredLaptop = new ArrayList<>();
        for (Laptop laptop : store) {
            if (!filterOfLaptop.contains(laptop.getId())){
                filteredLaptop.add(laptop);
            }

        }
        return filteredLaptop;
    }
}