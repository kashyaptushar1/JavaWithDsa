// Print number in Reverse order counting n to 1.
// 5 , 4 , 3 , 2 , 1
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i +" ");
        }
    }
}
