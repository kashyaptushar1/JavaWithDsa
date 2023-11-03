//Logical operators are used to perform logical operations on boolean values.

public class LogicalOperator {

    public static void main(String[] args) {
        // Logical AND (&&)
        boolean a = true;
        boolean b = false;
        boolean resultAND = a && b;
        System.out.println("a && b: " + resultAND); // false

        // Logical OR (||)
        boolean x = true;
        boolean y = false;
        boolean resultOR = x || y;
        System.out.println("x || y: " + resultOR); // true

        // Logical NOT (!)
        boolean value = true;
        boolean negatedValue = !value;
        System.out.println("!value: " + negatedValue); //false
    }
}
