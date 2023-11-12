// Same code for Print the matrix
// Because matrix is also a 2-D Array
// Number of Element in 2-D Array is (Row*column)
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        // This How to take input 2-D Array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the Element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        // Print 2-D Array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
