import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of student: ");
        float percentage = sc.nextFloat();
        System.out.println("Enter the age of student: ");
        int age = sc.nextInt();
        if (percentage>=75 && age>=18) {
            System.out.println("Student is eligible for admission: ");


        } else {
            System.out.println("Student is not eligible for admission");
        }
        sc.close();
    }
}
