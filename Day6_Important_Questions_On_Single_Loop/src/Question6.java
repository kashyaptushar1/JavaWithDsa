// Multiplication of n number.
// ans = 1*2*3*4....n;
// also work for find the factorial.
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans*i;
        }
        System.out.println("The multiply of n Number is: "+ans);
    }
}
