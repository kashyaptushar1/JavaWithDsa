// Solution of problem of Question 2
// And how to make Deep copy.
import java.util.Scanner;

public class Question3 {
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
        int  arr2[] = arr.clone();// For make Deep copy.
        arr2[2] = 9;
        arr2[3] = 10;
        System.out.print("Copy Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // output:
        // original Array: 1 2 3 4 5
        // copy Array: 1 2 9 10 5
        // original Array: 1 2 3 4 5
        // problem solved to add this line.
        //int  arr2[] = arr; => int  arr2[] = arr.clone();
        // .clone() is used to make deep copy


    }
}
