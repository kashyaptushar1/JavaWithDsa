// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract void draw();

    // Concrete method
    void resize() {
        System.out.println("Resizing the shape");
    }
}

// Concrete subclass extending the abstract class
class Circle extends Shape {
    // Implementation of the abstract method

    void draw() {
        System.out.println("Drawing a circle");
    }

    // Additional method in the subclass
    void fillColor() {
        System.out.println("Filling the circle with color");
    }
}

public class AbstractAndConcrete {
    public static void main(String[] args) {
        // Creating an object of the concrete subclass
        Circle myCircle = new Circle();

        // Calling methods from the abstract class
        myCircle.draw();    // Implemented in Circle
        myCircle.resize();  // Inherited from Shape

        // Calling the additional method from the subclass
        myCircle.fillColor();
    }
}
