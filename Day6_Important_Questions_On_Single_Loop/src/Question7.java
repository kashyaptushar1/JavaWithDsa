// Given 2 number a and b. find  a raise to the power b.
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("a^b is: "+ans);
    }
}
