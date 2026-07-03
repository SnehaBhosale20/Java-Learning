import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter Time in years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        double totalAmount = principal + simpleInterest;
        System.out.println("Total Amount: " + totalAmount);
        sc.close();
    }
}
