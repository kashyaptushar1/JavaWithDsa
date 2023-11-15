// Reverse an Array Consisting of integer values.

import java.util.Scanner;

public class Question3 {
    static void reverseArray(int arr1[]){
        int m = arr1.length-1;
        for (int i = m; i >=0 ; i--) {
            System.out.print(arr1[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element of Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        reverseArray(arr);
    }
}
