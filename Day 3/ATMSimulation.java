import java.util.Scanner;
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        int balance = sc.nextInt();

        System.out.println("Choose an option:");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = sc.nextInt();
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient funds. Withdrawal failed.");
                }
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                int depositAmount = sc.nextInt();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and try again.");
                break;
        }

        sc.close();
    }
}
