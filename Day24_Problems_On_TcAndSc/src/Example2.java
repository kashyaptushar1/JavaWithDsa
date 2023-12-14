public class Example2 {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
//📘Time Complexity Explanation:-

// 1. Binary Search Algorithm:-
//  - The `binarySearch` method implements the Binary Search algorithm, a logarithmic
//    time complexity algorithm.
//  - In each iteration of the while loop, the search space is effectively halved, which
//    results in a logarithmic growth rate.

// 2. Logarithmic Time Complexity O(log n):-
//  - The time complexity of Binary Search is logarithmic with respect to the size of the
//    input array (`arr`).
//  - The while loop continues until the search space is reduced to zero or the target element
//    is found.

// 3. Example Execution:-
//  - In the `main` method, a sorted array `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}` is used,
//    and the target element is `6`.
//  - The Binary Search efficiently finds the index of the target element with O(log n)
//    time complexity.

// 4. Key Characteristics:-
//  - The number of iterations in the `while` loop is determined by the logarithm of the size
//    of the input array.
//  - The search space is repeatedly divided, making the algorithm efficient for large datasets.

