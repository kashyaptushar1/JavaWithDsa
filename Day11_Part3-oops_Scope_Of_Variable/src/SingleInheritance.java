// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog myDog = new Dog();

        // Accessing methods from the superclass
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal

        // Accessing method from the subclass
        myDog.bark();   // Defined in Dog class
    }
}
