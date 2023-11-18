import java.util.Scanner;

public class TwoDArrayByMethod {
//    method to print array.
    static void print(int arr[][], int r , int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = {{1,1,1},{2,2,2}};
        print(arr,3,3);
        System.out.println();
        print(arr1,2,3);
    }
}
