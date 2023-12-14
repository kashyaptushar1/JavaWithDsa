public class Example8 {
    public static int evaluatePolynomial(int[] coefficients, int x) {
        int result = 0;
        int powerOfX = 1;
        for (int coefficient : coefficients) {
            result += coefficient * powerOfX;
            powerOfX *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        // Example polynomial: P(x) = 2x^3 + 3x^2 + 5x + 7
        int[] coefficients = {7, 5, 3, 2};
        int x = 2;

        int result = evaluatePolynomial(coefficients, x);

        System.out.println("Result of P(" + x + "): " + result);
    }
}
// 📘 Explanation:-

//  1. Polynomial Evaluation Algorithm:-
//   - The `evaluatePolynomial` method computes the value of a polynomial given its coefficients
//     and an input value (x).
//   - It uses a loop to iterate through the coefficients, accumulating the result based on
//     the powers of (x).

//  2. Polynomial Time Complexity O(n^k):-
//   - The time complexity of polynomial evaluation is polynomial, specifically O(n^k), where (n)
//     is the degree of the polynomial and (k) is a constant.

//  3. Example Execution:-
//   - The `main` method evaluates the polynomial (P(x) = 7 + 5x + 3x^2 + 2x^3) for (x = 2).

//  4. Key Characteristics:-
//   - The running time of the algorithm grows polynomially with the degree of the polynomial.
//   - The loop iterates through the coefficients, and the power of (x) is raised linearly.
