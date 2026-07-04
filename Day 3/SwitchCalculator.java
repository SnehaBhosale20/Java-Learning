import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        switch(operation) { 
            case '+':
                System.out.println("Sum: " +(a+b));
                break;
            case '-':
                System.out.println("Difference: " +(a-b));
                break;
            case '*':
                System.out.println("Product: " +(a*b));
                break;
            case '/':
                System.out.println("Quotient: " +(a/b));
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
