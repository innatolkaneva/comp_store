import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Laptop_store store1 = new Laptop_store();
        Scanner sc = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Добро пожаловать в наш магазин");
            System.out.println("У нас большой ассортимент\n 1 - посмотреть весь ассортимент \n 2 - отфильтровать");
            answer = sc.next();
            if("1".equals(answer)){
               store1.getAll();
            }
            else if("2".equals(answer)){
                store1.filter();
            }
            else{
                System.out.println("Такой команды нет");
            }
        }
        while (!"0".equals(answer));
        }
    }
