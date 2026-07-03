import java.util.Scanner;
public class Currencytodollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Currency");
        int currency = sc.nextInt();
        double dollar = currency / 94.9687;
        System.out.println("Dollar: " + dollar);
        sc.close();
    }
}
