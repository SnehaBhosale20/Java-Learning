import java.util.Scanner;
public class Tempconverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: " + "C");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit +"F");
        sc.close();


    }

}
