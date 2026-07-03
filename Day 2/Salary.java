import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicsalary = sc.nextDouble();
        double hra = basicsalary * 0.2;  //hra 20% of basic salary
        System.out.println("Hra is: "+hra);
        double da = basicsalary * 0.10;  //da 10% of basic salary
        System.out.println("DA is: "+da);
        double grosssalary = basicsalary + hra + da;
        System.out.println("Gross Salary is: "+grosssalary);
        sc.close();
    }
}
