package types_of_classes_in_java;// Singleton Class
// Description: Ensures that only one instance of the class exists globally.
// Use Case: Used for managing shared resources like database connections or configurations.

 class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Singleton instance method called.");
    }

//    public static void main(String[] args) {
//        Singleton obj = Singleton.getInstance();
//        obj.display(); // Using the singleton instance
//    }
}


public class SingletonClass {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Both objects are the same instance.");
        }
    }
}
