import java.util.Scanner;
public class Bmicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.println("Enter Height in m: ");
        double height = sc.nextDouble();
        double bmi = ( weight / (height * height) );
        System.out.println("BMI: " + bmi);
        sc.close();
    }
}
