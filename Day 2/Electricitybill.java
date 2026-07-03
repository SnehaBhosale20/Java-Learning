import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        int bill = units * 8;
        System.out.println("Electricity bill: " + bill);
        sc.close();
    }
}
