package types_of_classes_in_java;// Concrete Class
// Description: A standard class that provides a full implementation of its methods.
// Use Case: Used when a fully implemented class is required for direct use, such as a utility class.

public class ConcreteClass {
    public void displayMessage() {
        System.out.println("This is a concrete class.");
    }

    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.displayMessage(); // Using the concrete class
    }
}
