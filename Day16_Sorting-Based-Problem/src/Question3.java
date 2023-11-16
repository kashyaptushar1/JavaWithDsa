// Given an Array of integers "arr" , Move all the even integers at the beginning of the array
// followed by all the odd integers . The relative order of odd or even integers does not matter.
// Return any array that satisfies the condition.
import java.util.Scanner;

public class Question3 {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println();
        System.out.print("Sorted Array: ");
        sort(arr);
        printArray(arr);
    }
}
