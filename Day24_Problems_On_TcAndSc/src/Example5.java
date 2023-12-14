public class Example5 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        printArray(array);
        bubbleSort(array);
        System.out.println("\nSorted Array:");
        printArray(array);
    }
}
// 📘 Explanation:-

//  1. Bubble Sort Algorithm:-
//   - The `bubbleSort` method implements the Bubble Sort algorithm, which compares adjacent
//     elements and swaps them if they are in the wrong order.
//   - This process is repeated for each pair of adjacent elements until the entire array is sorted.

//  2. Quadratic Time Complexity O(n^2):-
//   - Bubble Sort has a time complexity of O(n^2) where  n is the size of the array.
//   - The nested loops iterate over each pair of elements, resulting in a running time
//     proportional to the square of the input size.

//  3. Example Execution:-
//   - The `main` method initializes an array `{64, 34, 25, 12, 22, 11, 90}` and prints
//     the original array.
//   - The array is then sorted using the Bubble Sort algorithm, and the sorted array is printed.

//  4. Key Characteristics:-
//   - The nested loops result in a quadratic growth in running time.
//   - Bubble Sort is not efficient for large datasets due to its O(n^2) time complexity.
