//Q1. Given a matrix arr[][] of integers, print the prefix sum matrix for it.
//Input:
//n = 3
//m = 3
//[[1,2,3],[4,5,6],[7,8,9]]
//Expected Output:
//[[1,3,6],[5,13,25],[12,33,67]]
//Explanation:
//Prefix sum matrix for any cell can be calculated by the sum of its value, prefix sum of upper cell, prefix sum
//of left cell.
//For the first row and column, we calculate it by prefix sum of its value, and the cell before,
// for row the left cell,
//and for column, the upper cell.
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[i][j];
                if(i == 0 && j == 0){
                    continue;
                }else if(i == 0){
                    arr[i][j] += arr[i][j-1];
                }else if(j == 0){
                    arr[i][j] += arr[i-1][j];
                }else{
                    arr[i][j] += arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}