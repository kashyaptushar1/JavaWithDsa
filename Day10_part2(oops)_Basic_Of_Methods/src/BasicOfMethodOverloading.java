public class BasicOfMethodOverloading {
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a String parameter
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        BasicOfMethodOverloading math = new BasicOfMethodOverloading();
        // BasicOfMethodOverloading class ka object.

        int sum1 = math.add(2, 3);
        int sum2 = math.add(2, 3, 4);
        double sum3 = math.add(2.5, 3.5);

        String result = math.concatenate("Hello", " World");

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Concatenation: " + result);
    }
}

// Notes of Method overloading .

//    Method overloading in Java refers to the ability to define multiple methods in the same class with
//    the same name but different parameter lists. It allows a class to have multiple methods with the same name,
//    but the compiler can distinguish between them based on the number, types, or order of parameters.
//    Method overloading is a form of compile-time polymorphism.
//
//        ### Characteristics of Method Overloading:
//
//        1. **Same Method Name:**
//        - In method overloading, multiple methods have the same name within the same class.
//
//        2. **Different Parameter Lists:**
//        - The methods must have different parameter lists, which can differ in terms of the number, types,
//        or order of parameters.
//
//        3. **Return Type is Not Considered:**
//        - Method overloading can have methods with the same name but different return types. However,
//        the return type alone is not sufficient for overloading.
//
//        4. **Scope:**
//        - Overloaded methods must be defined within the same class.
//
