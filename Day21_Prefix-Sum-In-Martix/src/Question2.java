// A square matrix is said to be an perfect Matrix if both of the following conditions hold:
//a) All the elements in the diagonals of the matrix are non-zero integers.
//b) All other elements except the diagonal elements are 0.
//Given a 2D integer array grid of size n*n representing a square matrix, return true if the grid is a
// perfect matrix.
//Otherwise, return false.
//Input:
//n = 4
//arr[] = [[1,0,0,1],[0,2,1,0],[0,1,2,0],[3,0,0,1]]
//Expected Output:
//true
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i+j == n-1){
                    if(mat[i][j] == 0){
                        System.out.println("false");
                        return;
                    }
                }else{
                    if(mat[i][j] != 0){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        System.out.println("true");
    }
}