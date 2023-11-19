// Transpose of Matrix without using Extra Array .
import java.util.Scanner;

public class Question2 {
    static int[][] transpose(int mat2[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = mat2[i][j];
                mat2[i][j] = mat2[j][i];
                mat2[j][i] = temp;
            }
        }
        return mat2;
    }

    static void print(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        print(mat, 3, 3);
        System.out.println();

        transpose(mat, 3, 3);

        System.out.println("Transpose of matrix: ");
        print(mat, 3, 3);
    }
}
