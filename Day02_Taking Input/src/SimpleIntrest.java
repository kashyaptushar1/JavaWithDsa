//This is program to calculate simple intrest
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        int p = sc.nextInt();
        System.out.println("Enter the rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        double simple = (p*r*t)/100;
        System.out.println("The simpleIntrest is: " +simple);
    }
}
