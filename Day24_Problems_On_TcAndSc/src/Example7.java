public class Example7 {

    // Naive recursive solution for Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci of " + n + ": " + fibonacci(n));
    }
}
// 📘Explanation:-

//  1. Naive Recursive Fibonacci Algorithm:-
//   - The `fibonacci` method calculates the nth Fibonacci number using a naive recursive approach.
//   - It breaks down the problem into two subproblems: computing the (n-1)th and
//     (n-2)th Fibonacci numbers.

//  2. Exponential Time Complexity O(2^n):-
//   - The time complexity of the naive recursive Fibonacci algorithm is exponential.
//   - Each recursive call branches into two additional calls, leading to an exponential
//     growth in the number of recursive calls and the overall running time.

//  3. Example Execution:-
//   - The `main` method computes the 10th Fibonacci number using the naive recursive approach.

//  4. Key Characteristics:-
//   - The number of recursive calls grows exponentially with the input value (n).
//   - This approach becomes inefficient for large values of (n) due to the exponential time complexity.

