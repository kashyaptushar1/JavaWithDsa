// Question:- Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
//row and column index.
import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == x){
                    System.out.println("Row = " + i);
                    System.out.println("Column = " + j);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}