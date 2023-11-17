// Question1 Without using Extra Array(Memory).

import java.util.Scanner;

public class Question2 {
    static void  PrefixSum(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
    }
    static void Print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The original Array: ");
        Print(arr);
        System.out.println();
        System.out.println("The prefix sum of Array: ");
        PrefixSum(arr);
        Print(arr);
    }
}
