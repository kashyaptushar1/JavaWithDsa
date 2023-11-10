//Print the HollowPattern like
// * * * * * *
// *         *
// *         *
// *         *
// * * * * * *
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i==0 || i==r-1 || j==0|| j==c-1){
                    System.out.print("*");
                }
               else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
