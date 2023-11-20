//Given a positive integer n , generate n*n matrix , filled with element
// fron 1 to n^2 in spiral order .
import java.util.Scanner;

public class Question2 {


    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // Move right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Move left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        return matrix;
    }

    // Function to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order no: ");
        int n = sc.nextInt();

        int[][] spiralMatrix = generateSpiralMatrix(n);

        System.out.println("Spiral Matrix of size " + n + " x " + n + ":");
        printMatrix(spiralMatrix);
    }
}
