public class Example3 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {10, 4, 2, 8, 7, 1, 6, 3, 5, 9};
        int targetElement = 6;

        int index = linearSearch(array, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
//📘 Time Complexity Explanation:-

// 1. Linear Search Algorithm:-
//  - The `linearSearch` method uses a `for` loop to iterate through each element in
//    the array sequentially until the target element is found or the end of the array is reached.

// 2. Linear Time Complexity O(n):-
//  - The time complexity of Linear Search is linear, as the number of iterations in the
//    loop is directly proportional to the size of the input array (`arr.length`).

// 3. Example Execution:-
//  - In the `main` method, an array `{10, 4, 2, 8, 7, 1, 6, 3, 5, 9}` is used, and the target
//    element is `6`.
//  - The Linear Search algorithm checks each element sequentially and returns the index of
//    the target element if found.

// 4. Key Characteristics:-
//  - The running time grows linearly with the size of the input array.
//  - The worst-case scenario is when the target element is at the end of the array or not present,
//    requiring checking all elements.

