// Check if the given Array is sorted or not.
import java.util.Scanner;

public class Question7 {
    static boolean isSorted(int arr[]){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
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
        System.out.println("Array is: "+isSorted(arr));
    }
}
