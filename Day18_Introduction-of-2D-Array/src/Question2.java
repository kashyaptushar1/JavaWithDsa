// Multiply of two matrix
import java.util.Scanner;

public class Question2 {
   static void print(int arr[][], int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
     static void multiply(int mat1[][] , int mat2[][] , int r1, int r2, int c2){
        int c1 = r2;
        int ans[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += mat1[i][k] *mat2[k][j];
                }
            }
        }
        print(ans,r1,c2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Row in first matrix: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the no of column of first matrix: ");
        int c1 = sc.nextInt();
        System.out.println("Enter the no of row in second matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the no of column in second matrix: ");
        int c2 = sc.nextInt();
        int mat1[][] = new int[r1][c1];
        int mat2[][] = new int[r2][c2];
        System.out.println("Enter the Element for matrix one: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter the element: ");
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Element for matrix two: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Enter the element: ");
                mat2[i][j] = sc.nextInt();
            }
        }
        if (c1!=r2){
            System.err.println("Multiplication is not possible");
            // System.err.print se ☝ ye line read color se aaegi jo bdiya lgti hai
            return;
        }
        else {
            multiply(mat1,mat2,r1,r2,c2);
        }
    }
}
