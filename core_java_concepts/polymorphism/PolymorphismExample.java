package polymorphism;
// Demonstrating Polymorphism in Java
// This example shows runtime polymorphism using method overriding.

class Shape {
    // Generic method to draw a shape
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    // Overriding the draw method for polymorphism.Circle
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Using a parent class reference to call the overridden method
        Shape shape = new Circle();
        shape.draw(); // Calls the polymorphism.Circle's draw method
    }
}
