public class BasicOfWrapperClass {
    public static void main(String[] args) {
        int a = 5; // a is a primitive data type.

        // Autoboxing: Convert primitive int to Integer object
        Integer objInt = Integer.valueOf(a);

        // Print the Integer object
        System.out.println(objInt);

        // Unboxing: Convert Integer object to primitive int
        int unwrap = objInt.intValue();

        // Check if the variable is of type Integer
        if (objInt instanceof Integer) {
            System.out.println("The object is an Integer");
        }
        // This is how to check the type of .
    }
}
