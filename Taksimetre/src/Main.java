import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kilometer, startPrice = 10;

        float price = 2.2f, cost;

        System.out.print("Gidilecek mesafeyi giriniz => ");
        kilometer = scan.nextInt();

        cost = kilometer * price + startPrice;

        cost = (cost > 20) ? cost : 20f;

        System.out.println("Ücret => " + cost);

    }
}
