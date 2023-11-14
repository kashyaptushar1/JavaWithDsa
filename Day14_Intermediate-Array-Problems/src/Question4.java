// Find the Second Maximum Value in the Array.
import java.util.Scanner;

public class Question4 {
    static int FindMax(int arr[]) {
        int ans = 0;
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        ans = mx;
        return ans;
    }

    static int SecondMax(int arr[]) {
        int mx = FindMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = FindMax(arr);
        return secondMax;
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

        System.out.println("The Second Max is: " + SecondMax(arr));
    }
}
