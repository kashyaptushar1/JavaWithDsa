public class Example6 {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
        int[][] result = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nResultant Matrix (A * B):");
        printMatrix(result);
    }
}
//📘 Explanation:-

//  1. Naive Matrix Multiplication Algorithm:-
//   - The `multiplyMatrices` method implements the Naive Matrix Multiplication algorithm using
//     three nested loops.
//   - It computes the product of two matrices, `matrixA` and `matrixB`, and stores the result
//     in a new matrix.

//  2. Cubic Time Complexity O(n^3):-
//   - The time complexity of Naive Matrix Multiplication is cubic, as it involves three
//     nested loops iterating over the elements of the matrices.
//   - The running time grows proportionally to the cube of the size of the matrices.

//  3. Example Execution:-
//   - The `main` method initializes two matrices, `matrixA` and `matrixB`, and prints them.
//   - The matrices are multiplied using the Naive Matrix Multiplication algorithm, and the
//     resultant matrix is printed.

//  4. Key Characteristics:-
//   - The cubic time complexity is evident from the three nested loops, each iterating over
//     the rows and columns of the matrices.

