// Same question like Question3 but this time you rotate clockwise.
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][c - 1 - j];
                mat[i][c - 1 - j] = temp;
            }
        }
        System.out.println("Rotate Matrix (90 degrees clockwise):");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
