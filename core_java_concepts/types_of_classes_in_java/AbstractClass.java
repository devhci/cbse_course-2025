package types_of_classes_in_java;// Abstract Class
// Description: A class that contains abstract methods to be implemented by subclasses and may include concrete methods.
// Use Case: Preferred when shared functionality exists, but subclasses need to define specific behaviors.

public abstract class AbstractClass {
    public abstract void abstractMethod();

    public void concreteMethod() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

class SubClass extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in subclass.");
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.concreteMethod(); // Using the concrete method from the abstract class
        obj.abstractMethod(); // Using the implemented abstract method
    }
}
