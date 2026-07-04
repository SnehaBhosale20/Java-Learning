import java.util.Scanner;
public class CollegeAdmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();
        System.out.println("Enter Entrance Exam Marks: ");
        int marks = sc.nextInt();
        if ( percentage >= 60 && marks >= 70) {
            System.out.println("You are eligible for admission");
        } else {
            System.out.println("You are not eligible for admission");
        }
        sc.close();
    }
}