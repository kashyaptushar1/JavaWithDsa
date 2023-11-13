// Make Array arr and copy its items in arr2 and print both Array
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("First Array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        int arr2[] = arr;// put arr items in arr2.
        System.out.print("Copy Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        // This is not a right wat to copy an Array.
        // problem aage pta chal gaegi.


    }
}
