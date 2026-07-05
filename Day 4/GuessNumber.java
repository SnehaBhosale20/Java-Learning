import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 25;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("Correct! You guessed the number.");
            } else {
                System.out.println("Wrong guess. Try again.");
            }

        } while (guess != secret);

        sc.close();
    }
}
