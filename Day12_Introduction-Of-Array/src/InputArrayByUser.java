import java.util.Scanner;

public class InputArrayByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// This is an object of Scanner class
        // And sc is an object of Scanner class (And new keyword is used for memory allocation)
        int arr[] = new int[5];// Here 5 is size of Array.
        // This is how you take a input Array by user.
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element no"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        // for print the Array
        System.out.println("Array input by Tushar/User: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
        //Note: Traversing an array means visiting each element of the array and performing some operation,
        // such as printing its value, calculating a sum, or searching for a specific element.
    }
}
