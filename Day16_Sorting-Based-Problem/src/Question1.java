// Sort an Array Consisting of only 0s and 1s.
import java.util.Scanner;

public class Question1 {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[]){
        int n = arr.length;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                zeros++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i<zeros){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Sorted Array: ");
        sort(arr);
        printArray(arr);

    }
}
