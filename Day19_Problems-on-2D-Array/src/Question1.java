// Transpose of Matrix
// original Matrix:
// 1 2 3
// 4 5 6
// 7 8 9

// Transpose of Matrix:
// 1 4 7
// 2 5 8
// 3 6 9
import java.util.Scanner;

public class Question1 {
   static void transpose(int mat[][] , int r, int c){
        int tran[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                tran[i][j] = mat[j][i];
            }
        }
        print(tran , r,c);
    }

    static void print(int arr[][],int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
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
        print(mat,3,3);
        System.out.println();
        System.out.println("Transpose of matrix: ");
        transpose(mat,3,3);
    }
}
// pr ye inplace nhi hai, this use extra array to solve the problem
// agle question mai same problem without using extra array.