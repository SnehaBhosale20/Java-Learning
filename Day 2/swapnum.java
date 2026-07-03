import java.util.Scanner;
public class swapnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt(); 
        System.out.println("Before swaping: a = " + a + ", b = " +b);
        System .out.println("After swaping a = " + b + " b = " + a);
        sc.close();
    }
}
