package types_of_classes_in_java;// Anonymous Class
// Description: A class without a name, usually used for short-lived purposes.
// Use Case: Used for event handling or passing behavior directly without creating a separate class.

public class AnonymousClassExample {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class in action!");
            }
        };
        task.run(); // Using the anonymous class
    }
}
