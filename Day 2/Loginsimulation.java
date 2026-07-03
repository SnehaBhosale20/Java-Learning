import java.util.Scanner;
public class Loginsimulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username = "Swami";
        String password = "1234";
        System.out.println("Enter username: ");
        String user = sc.next();
        System.out.println("Enter password: ");
        String pass = sc.next();
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful");

        } else {
            System.out.println("Login Failed");
        }
        sc.close();

    }
}