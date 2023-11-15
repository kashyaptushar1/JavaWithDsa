// Rotate The given Array 'a' by k steps, where k is non-negative ,
// Note: K can be greater than n as well.
// Array: 1 2 3 4 5
// k = 1
// Answer: 5 1 2 3 4
import java.util.Scanner;

class Array {
    static int[] rotationArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;


        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }


        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Array obj = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Element no" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        int ans[] = obj.rotationArray(arr, k);


        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
