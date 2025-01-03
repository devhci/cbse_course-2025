package types_of_classes_in_java;// Nested Classes
// Description: Classes declared within another class. Can be static or inner.
// Use Case: Used to logically group classes that are only used by the enclosing class.

public class OuterClass {
    // Static Nested Class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("This is a static nested class.");
        }
    }

    // Inner Class
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class.");
        }
    }

    public static void main(String[] args) {
        // Using static nested class
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.display();

        // Using inner class
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
