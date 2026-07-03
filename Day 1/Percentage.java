import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Marks: ");
        System.out.println("Obtained Marks: ");
        int totalMarks = sc.nextInt();
        int obtainedMarks = sc.nextInt();
        double percentage = 100.0*obtainedMarks/totalMarks;
        System.out.print("Percentage: "+percentage + "%");
        sc.close();
    }
    
}
