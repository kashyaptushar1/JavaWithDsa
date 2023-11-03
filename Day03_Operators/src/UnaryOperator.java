//Unary operators in Java are operators that perform operations on a single operand (a single value).
public class UnaryOperator {
    public static void main(String[] args) {
        // Unary Plus and Minus
        int x = 5;
        int y = +x; // Unary Plus, y is now 5
        int z = -x; // Unary Minus, z is now -5

        System.out.println("Unary Plus: " + y);
        System.out.println("Unary Minus: " + z);

        // Increment and Decrement
        int a = 10;
        int b = a++; // Post-increment, b is 10, a is 11 after this line
        int c = 5;
        int d = --c; // Pre-decrement, d is 4, c is 4 after this line

        System.out.println("Post-increment: a = " + a + ", b = " + b);
        System.out.println("Pre-decrement: c = " + c + ", d = " + d);

        // Logical NOT
        boolean isTrue = true;
        boolean isFalse = !isTrue; // Logical NOT, isFalse is false

        System.out.println("Logical NOT: " + isFalse);

        // Bitwise NOT
        int num = 5; // Binary: 00000101
        int complement = ~num; // Binary: 11111010, Decimal: -6

        System.out.println("Bitwise NOT: " + complement);

        // Type Cast Operator
        double doubleValue = 5.67;
        int intValue = (int) doubleValue; // Type Cast, intValue is 5 (truncating decimal)

        System.out.println("Type Cast: " + intValue);
    }
}
