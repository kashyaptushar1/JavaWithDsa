// Given an integer array 'a' , return the prefix sum / running sum .
// Example: Array:- 1 2 3 4 5
// Prefix Sum: 1 3 6 10 15
import java.util.Scanner;

public class Question1 {
    static void PrefixSum(int arr[]){
        int n = arr.length;
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] + arr[i];
        }
        print(pre);
    }

    static void print(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The original Array: ");
        print(arr);
        System.out.println();
        System.out.println("Prefix Sum Array: ");
        PrefixSum(arr);
    }
}
// In this Solution of this Problem we use Extra Array.
// What if the condition is not to use extra Array(mtlb inplace hona chiye)
