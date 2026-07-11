import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        //Input 1st Matrix
        System.out.println("Enter the elements of 1st matrix: ");
        for (int i = 0; i < rows; i++) {
            for( int j =  0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        //Input 2nd Matrix
        System.out.println("Enter elements for 2nd matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        //Add Matrices
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //Display of matrix
        System.out.println("Sum of Matrices: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
