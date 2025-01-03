package Inheritance;
// Demonstrating Inheritance in Java
// This program shows how a subclass inherits methods from a superclass.

class Animal {
    // Method to represent generic animal behavior
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Method specific to the Inheritance.Dog class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the subclass and calling inherited and specific methods
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Subclass-specific method
    }
}
