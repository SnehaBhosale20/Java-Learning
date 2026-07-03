import java.util.Scanner;
public class Percentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();
        System.out.println("Enter marks of Subject 4: ");
        int s4 = sc.nextInt();
        System.out.println("Enter marks ofSubject 5: ");
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500.0) * 100;
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80 && percentage < 90 ) {
            System.out.println("Grade B");

        } else if (percentage >= 50 && percentage < 80) {
            System.out.println("Grade C");

        } else {
            System.out.println("Failed");
        }
        sc.close();

    }
}
