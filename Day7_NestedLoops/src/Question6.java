// Draw the pattern.
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for (int i = r; i >= 1 ; i--) {
            for (int j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
