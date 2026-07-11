import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Calculate main diagonal sum
        for (int i = 0; i < n; i++) {
            sum = sum + matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);

        sc.close();
    }
}