import java.util.Scanner;
public class Areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: "+area);
        sc.close();
    }
}

