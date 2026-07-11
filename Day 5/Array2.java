import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for ( int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        //output
        for (int i = 0; i < numbers.length; i++) {  // size = arrayname.length
            if ( numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
            
            
        }
    }
}
