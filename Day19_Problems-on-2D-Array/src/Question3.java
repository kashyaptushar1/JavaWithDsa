//Given a square matrix, rotate it by 90 degrees in anti clockwise direction. (Medium)
//Input1:
//
//Expected Output:
//
//// Store current cell in temp variable
//// Move values from right to top
//n = 3
//m = 3
//matrix = [[1,2,3],[4,5,6],[7,8,9]]
//
//3 6 9
//2 5 8
//1 4 7

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no of column: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int x = 0; x < r / 2; x++) {
            for (int y = x; y < r - x - 1; y++) {
                int temp = mat[x][y];
                mat[x][y] = mat[y][r - 1 - x];
                mat[y][r - 1 - x] = mat[r - 1 - x][r - 1 - y];
                mat[r - 1 - x][r - 1 - y] = mat[r - 1 - y][x];
                mat[r - 1 - y][x] = temp;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
