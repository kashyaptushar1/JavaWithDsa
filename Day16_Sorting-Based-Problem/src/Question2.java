// Rohit👶: Hey Tushar, I have a task. I need to sort an array that consists only of 0s and 1s
// using the two-pointer approach. Can you guide me on this?

//Tushar👨‍💻: Certainly, Rohit! With the two-pointer approach, we can maintain two pointers, usually called
// 'left' and 'right.' The idea is to swap 0s to the left and 1s to the right. As we iterate through
// the array, we move the pointers accordingly. Do you follow so far?

//Rohit👶: Yes, I get the concept. How do we implement it?

//Tushar👨‍💻: Great! Let's initialize 'left' to the beginning of the array and 'right' to the end.
// We'll move 'left' towards the right until we find a 1, and 'right' towards the left until we find a 0.
// When we find them, we swap them. We repeat this process until 'left' is greater than or equal to right.

//Rohit👶: Got it. Can you show me how to write the code for this?
//Tushar👨‍💻: yes, here is code👇
import java.util.Scanner;

public class Question2 {
    static void swap(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int arr[]){
        int n = arr.length;
        int left = 0,  right = n-1;
        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0) left++ ;
            if (arr[right] == 1) right-- ;
        }


    }
    static  void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element: ");
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
