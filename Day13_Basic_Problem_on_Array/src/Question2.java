// Make an Array (arr) and copy its items in Array (arr2) and print both array
// original Array: {1 2 3 4 5}
import java.util.Scanner;

public class Question2 {
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
        int  arr2[] = arr;// put arr items in arr2.
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
        // original Array: 1 2 9 10 5

        //😱😱😱 ye kiya hua jb hmne arr2 mai change kiya tho arr mai bhi automatically change ho gya.
        // iska mtlb hai ki ye shellow copy hai
        // it means arr2 mai arr ka reference pass hua tha value nhi
        //👀 Ab isme kya change kre ki Deep copy(value pass ho)
        // Go to Question 3

    }
}
