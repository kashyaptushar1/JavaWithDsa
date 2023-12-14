public class Example4 {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = new int[mid];
            System.arraycopy(arr, 0, left, 0, mid);

            int[] right = new int[arr.length - mid];
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {10, 4, 2, 8, 7, 1, 6, 3, 5, 9};

        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }
}




// 📘 Time Complexity Explanation:-

//  1. Merge Sort Algorithm:-
//   - The `mergeSort` method recursively divides the array into two halves until each subarray
//     contains a single element.
//   - The `merge` method merges two sorted subarrays into a single sorted array.

//  2. Time Complexity O(nlogn):-
//   - Merge Sort has a time complexity of O(n log n) where n is the size of the array.
//   - The time complexity arises from the logarithmic factor due to the recursive division
//     of the array and the linear factor from merging the subarrays.

//  3. Example Execution:**
//   - The `main` method initializes an array `{10, 4, 2, 8, 7, 1, 6, 3, 5, 9}` and prints
//     the original array.
//   - The array is then sorted using the Merge Sort algorithm, and the sorted array is printed.

//  4. Key Characteristics:**
//   - Merge Sort exhibits a divide-and-conquer strategy, dividing the problem into smaller
//     subproblems and combining their solutions.
//   - The logarithmic factor comes from the recursive division of the array.

