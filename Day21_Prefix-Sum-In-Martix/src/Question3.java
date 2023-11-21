//Write a user defined function upper() which takes an integer square matrix as an input and its size N and prints
//the upper half of the matrix.
//
//•
//Input:
//N=4
//arr[][]=[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
//Expected Output:
//1 2 3 4
//  6 7 8
//    11 12
//       16
import java.util.Scanner;
public class Question3 {
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
                if(j >= i){
                    System.out.print(mat[i][j] + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}