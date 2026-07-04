import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        if ( income < 300000 ) {
            System.out.println("No tax");
            
        } else if ( 300000 <= income && income <= 600000 ) {
            System.out.println("5% Tax applicable");


        } else if ( 600000 < income && income <= 900000 ) {
            System.out.println("10% Tax is applicable");
        } else {
            System.out.println("20% Tax is applicable");
        }
        sc.close();
    }
}
