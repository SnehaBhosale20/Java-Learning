import java.util.Scanner;
public class Currentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr current year: ");
        int currentYear = sc.nextInt();
        System.out.println("Enter Birth Year: ");
        int birthYear = sc.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Current Age: "+age +" years");
        sc.close();
    }
}
