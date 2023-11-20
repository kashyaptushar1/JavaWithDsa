// Given an r*c matrix "mat", return all elements of the matrix in spiral order .
import java.util.Scanner;

public class Question1 {

    // Method to print the spiral order of a matrix
    static void printSpiralOrder(int[][] matrix) {
        int rows = matrix.length;// This is in-build method to find the row no
        int cols = matrix[0].length;// This is in-build method to find the column no

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order of Matrix:");
        printSpiralOrder(mat);
    }
}
