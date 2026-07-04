import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "Sneha";
        String correctPassword = "1234";
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter your username: ");
            String username = sc.nextLine();
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect username or password. You have " + attempts + " attempts left.");
                } else {
                    System.out.println("You have exceeded the maximum number of attempts. Please try again later.");
                }
            }
        }
        sc.close();
    }
}
