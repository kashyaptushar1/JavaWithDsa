//Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix should also be
//sorted row and column wise.
//Input:
//n = 2
//m = 2
//arr = [1,2,3,4]
//Expected Output:
//[[1,2],[3,4]]
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array you want to convert to: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m*n];
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of 1D array: ");
        for(int i = 0; i < m*n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = arr[idx];
                idx++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}