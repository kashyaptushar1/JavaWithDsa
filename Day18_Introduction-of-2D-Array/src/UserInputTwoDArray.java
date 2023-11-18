import java.util.Scanner;

public class UserInputTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r = sc.nextInt();
        System.out.print("Enter the column: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];// Declare 2-D Array.
        // How To Take user input of 2D Array.👇
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Element: ");// This line run r*c times
                arr[i][j] = sc.nextInt();
            }
        }
        // Now we have 2-D Array
        // How to print this 2-d Array in Matrix form.👇
        System.out.println("Your Array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
