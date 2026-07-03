import java.util.Scanner;
public class squarecube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        float a = sc.nextFloat();
        float square = a * a;
        float cube = a * a * a;
        System.out.println("Square: " +square);
        System.out.println("Cube: " +cube);
        sc.close();
    }
}
