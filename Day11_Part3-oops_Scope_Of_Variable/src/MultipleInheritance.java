// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Implementation of methodA");
    }
    public void methodB() {
        System.out.println("Implementation of methodB");
    }

    // Additional method in MyClass
    void myMethod() {
        System.out.println("Additional method in MyClass");
    }
}

public class MultipleInheritance {
    // Multiple Inheritance also Know as Interface
    // Kyuki java Multiple Inheritance ko (Directly)support nhi krti
    // lekin Interface ki help se support kr leti hai.

    public static void main(String[] args) {
        // MyClass class ka object
        MyClass myObject = new MyClass();

        // Calling methods from interfaces
        myObject.methodA();
        myObject.methodB();

        // Calling additional method from MyClass
        myObject.myMethod();
    }
}
