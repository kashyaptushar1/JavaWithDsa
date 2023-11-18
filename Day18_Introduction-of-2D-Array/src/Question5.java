//Q4. Given a 2D array for n rows and m columns, reverse each row.
//Input:
//n = 3
//m = 3
//arr[][] = {{1, 2, 3}, {6, 7, 8}, {9, 10, 11}}
//Expected Output:
//{{3, 2, 1}, {8, 7, 6}, {11, 10, 9}}
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the 2d array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = m-1;
            while(a < b){
                int temp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = temp;
                a++;
                b--;
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