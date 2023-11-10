//Sum of n Natural no ,
// Time complexity O(1) , Which means constant.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("The sum is: " +sum);

    }
}
