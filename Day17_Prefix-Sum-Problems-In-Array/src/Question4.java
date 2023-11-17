// Check if we can Partition the Array into two SubArray with equal sum. More formally,
// Check that the prefix sum of a part of the array is equal to the suffix sum of rest of the Array.
// Example: Array:- 5 3 2 6 3 1
// Part1:- 5 3 2 , Sum is 10
// part2:= 6 3 1 , sum is 10
// return true
import java.util.Scanner;
class array{
     boolean canPartition(int arr[]) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array obj2 = new Array();
        array obj = new array();
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        boolean canPart = obj.canPartition(arr);
        if (canPart){
            System.out.println("Can be partition in two arr");
        }
        else{
            System.out.println("can not partition");
        }
        obj2.makePrefixSumArray(arr);
        obj.printArray(arr);
    }
}
