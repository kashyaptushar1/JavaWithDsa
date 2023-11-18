// Addition of Two matrix.
import java.util.Scanner;

public class Question1 {
    static void addPrint(int arr1[][] , int arr2[][], int r, int c){
    int ans[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of Both matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of First Matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the column of First matrix: ");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter the Element for matrix one: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the row of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the column of second matrix: ");
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter the Element for matrix one: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        if(r1!=r2){
            System.out.println("Addition is not possible");
            return;
        }
        else {
            addPrint(arr1,arr2,r1,c2);
        }
    }
}
