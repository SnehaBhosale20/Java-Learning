import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (pizza, burger, sandwich, coffee): ");
        String choice = sc.nextLine();
        switch (choice) {
           case "pizza":
                System.out.println("You have selected pizza. Price: $10");
                break;
            case "burger":
                System.out.println("You have selected burger. Price: $5");
                break;
            case "sandwich":
                System.out.println("You have selected sandwich. Price: $7");
                break;
            case "coffee":
                System.out.println("You have selected coffee. Price: $3");
                break;
            default:
                System.out.println("Invalid choice. Please select from the menu.");
        }
    }
}
