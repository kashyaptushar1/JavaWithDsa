// Given Ary array of integers of size n. Answer q queries where you need to print the sum of values
// in a given range of indices from 1 to r( both included ).
// Note:- The value of 1 and r in queries follow 1-based indexing.

import java.util.Scanner;
  class Array{
     public int[] makePrefixSumArray(int arr[]){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    int getSumInRange(int pref[], int left, int right){
        if (left == 0){
            return pref[right];
        }
        else{
            return pref[right] - pref[left-1];
        }
    }
    void arrayPrint(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array obj = new Array();
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        int pref[] = obj.makePrefixSumArray(arr);
        System.out.println("Prefix Array: ");
        obj.arrayPrint(pref);

        System.out.print("Enter the no of Queries: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the range(Left and Right)1-Based: ");
            int left = sc.nextInt();
            int right = sc.nextInt();
            int sum = obj.getSumInRange(pref,left-1,right-1);
            System.out.println("Sum in Range: "+sum);
        }
    }
}

// Ho skta hai ki ye wala hard lge pr aage tho or hard hai😊
// Keep level up.