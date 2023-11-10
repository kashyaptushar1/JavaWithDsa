//Print the first n Natural number , where n is the user input.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i +" ");
        }
    }
}
