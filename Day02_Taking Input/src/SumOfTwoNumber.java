//Sum of two number by taking user input.
import java.util.Scanner;
// we can also add ( import java.util.*; )

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int a = sc.nextInt();
        System.out.println("Enter the no: ");
        int b = sc.nextInt();
        System.out.println("The sum is : " +(a+b));

    }
}
