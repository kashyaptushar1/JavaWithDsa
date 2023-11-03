//Assignment operators are used to assign values to variables.
public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 5; // x is now 15
        System.out.println("x after addition: " + x);

        int y = 20;
        y -= 7; // y is now 13
        System.out.println("y after subtraction: " + y);

        int z = 6;
        z *= 4; // z is now 24
        System.out.println("z after multiplication: " + z);

        int a = 15;
        a /= 3; // a is now 5
        System.out.println("a after division: " + a);

        int b = 17;
        b %= 5; // b is now 2
        System.out.println("b after modulus: " + b);
    }
}
