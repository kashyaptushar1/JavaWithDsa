// Print the sum of n natural number where n is user input.
// Time complexity O(n), Which is linear.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("The sum is: " +sum);
    }
}
