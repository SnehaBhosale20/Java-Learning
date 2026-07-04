import java.util.Scanner;
public class LoanEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter your CIBIL Score: ");
        int cibil = sc.nextInt();
        if ( age >= 21 && salary >= 30000 && cibil >= 750) {
            System.out.println("You are eligible for a loan");
        } else {
            System.out.println("You are not eligible for a loan");
        }
        sc.close();
    }
}
